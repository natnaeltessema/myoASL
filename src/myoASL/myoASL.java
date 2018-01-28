//package com.thalmic.myo;
package myoASL;

import java.util.DeviceListener;



public class myoASL implements DeviceListener {  
    
	
	public static void main(String[] args) {
      Hub hub = new Hub("com.example.HelloMyo");
      Myo myo = hub.waitForMyo(10000);
      
      
      
      
      
      hub.addListener(new AbstractDeviceListener()) {
          @Override
          public void onPose(Myo myo, long timestamp, Pose pose) {
              System.out.println(String.format("Myo switched to pose %s.", pose.toString()));
          }
      }
      while (true) {
          hub.run(1000 / 20);
      }
    }
    
    
    
    
    public void onPair(Myo myo, long timestamp, FirmwareVersion firmwareVersion);

	public void onUnpair(Myo myo, long timestamp);

	public void onConnect(Myo myo, long timestamp, FirmwareVersion firmwareVersion);

	public void onDisconnect(Myo myo, long timestamp);

	public void onArmSync(Myo myo, long timestamp, Arm arm, XDirection xDirection, float rotation, WarmupState warmupState);

	public void onArmUnsync(Myo myo, long timestamp);

	public void onUnlock(Myo myo, long timestamp);

	public void onLock(Myo myo, long timestamp);

	public void onPose(Myo myo, long timestamp, Pose pose);

	public void onOrientationData(Myo myo, long timestamp, Quaternion rotation);

	public void onAccelerometerData(Myo myo, long timestamp, Vector3 accel);

	public void onGyroscopeData(Myo myo, long timestamp, Vector3 gyro);

	public void onRssi(Myo myo, long timestamp, int rssi);

	public void onBatteryLevelReceived(Myo myo, long timestamp, int level);

	public void onEmgData(Myo myo, long timestamp, byte[] emg);

	public void onWarmupCompleted(Myo myo, long timestamp, WarmupResult warmupResult);
    
    
    
    
    
    
    
    
    
    
    
}