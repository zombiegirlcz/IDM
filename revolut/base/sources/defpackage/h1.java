package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.connexion.BleService;
import com.youTransactor.uCube.log.LogManager;
import mif.e0;

/* JADX INFO: loaded from: classes21.dex */
public final class h1 extends BluetoothGattCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BleService f148437a;

    public h1(BleService bleService) {
        this.f148437a = bleService;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            t1.b("Characteristic is 'null'", new Exception[0]);
        }
        if (bluetoothGattCharacteristic.getValue() == null || bluetoothGattCharacteristic.getValue().length == 0) {
            t1.b("Characteristic value is 'empty' ignore", new Exception[0]);
            return;
        }
        String string = bluetoothGattCharacteristic.getUuid().toString();
        string.getClass();
        byte b4 = -1;
        switch (string.hashCode()) {
            case -892660755:
                if (string.equals("00002a19-0000-1000-8000-00805f9b34fb")) {
                    b4 = 0;
                }
                break;
            case -526627681:
                if (string.equals("d1f4c2d0-f8c2-4565-9349-e0312effd1ee")) {
                    b4 = 1;
                }
                break;
            case 1772437931:
                if (string.equals("d329a8cb-b872-4c13-971b-72bca85ef0cd")) {
                    b4 = 2;
                }
                break;
        }
        BleService bleService = this.f148437a;
        switch (b4) {
            case 0:
                int iIntValue = bluetoothGattCharacteristic.getIntValue(17, 0).intValue();
                int i = BleService.o;
                Intent intent = new Intent("com.youtransactor.ucube.le.ACTION_GATT_BATTERY_LEVEL_RECEIVED");
                intent.putExtra("BatteryLevel", iIntValue);
                bleService.sendBroadcast(intent);
                break;
            case 1:
                byte[] value = bluetoothGattCharacteristic.getValue();
                int i2 = BleService.o;
                Intent intent2 = new Intent("com.youtransactor.ucube.le.ACTION_GATT_RX_RECEIVED");
                intent2.putExtra("RX", value);
                bleService.sendBroadcast(intent2);
                break;
            case 2:
                byte b5 = bluetoothGattCharacteristic.getValue()[0];
                int i3 = BleService.o;
                switch (b5) {
                    case 48:
                        t1.a("Notification HState 0x30");
                        bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_DEVICE_GET_STUCK"));
                        break;
                    case 49:
                    case 50:
                    case 52:
                        t1.a("Read HState " + Tools.bytesToHex(new byte[]{b5}));
                        break;
                    case 51:
                    default:
                        t1.b("HState UNKNOWN", new Exception[0]);
                        break;
                }
                break;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (bluetoothGattCharacteristic == null) {
            t1.b("onCharacteristicRead ERROR characteristic is 'null'", new Exception[0]);
        }
        BleService bleService = this.f148437a;
        if (i != 0 || bluetoothGattCharacteristic.getValue() == null || bluetoothGattCharacteristic.getValue().length == 0) {
            t1.b("onCharacteristicRead ERROR: Or Status error, Or value is 'empty'", new Exception[0]);
            int i2 = BleService.o;
            bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
            return;
        }
        String string = bluetoothGattCharacteristic.getUuid().toString();
        string.getClass();
        if (string.equals("00002a19-0000-1000-8000-00805f9b34fb")) {
            int iIntValue = bluetoothGattCharacteristic.getIntValue(17, 0).intValue();
            if (!bleService.a(bleService.f)) {
                bleService.f107567c = 2;
                bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTED"));
            }
            Intent intent = new Intent("com.youtransactor.ucube.le.ACTION_GATT_BATTERY_LEVEL_RECEIVED");
            intent.putExtra("BatteryLevel", iIntValue);
            bleService.sendBroadcast(intent);
            return;
        }
        if (string.equals("d329a8cb-b872-4c13-971b-72bca85ef0cd")) {
            byte b4 = bluetoothGattCharacteristic.getValue()[0];
            int i3 = BleService.o;
            switch (b4) {
                case 48:
                    if (!bleService.b(bleService.f)) {
                        bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
                    }
                    break;
                case 49:
                case 50:
                case 52:
                    t1.a("Read HState " + Tools.bytesToHex(new byte[]{b4}));
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bleService.f107569h;
                    if ((bluetoothGattCharacteristic2 == null || !bleService.b(bluetoothGattCharacteristic2)) && !bleService.a(bleService.f)) {
                        if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.CONNEXION.getCode()) {
                            LogManager.w("[CONNECTION]", "Enable notification HState failed");
                        }
                        bleService.f107567c = 2;
                        bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTED"));
                    }
                    break;
                case 51:
                default:
                    t1.b("HState UNKNOWN", new Exception[0]);
                    bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
                    break;
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        int i2 = BleService.o;
        BleService bleService = this.f148437a;
        bleService.a();
        if (m.f201027b.equals(bluetoothGattCharacteristic.getUuid())) {
            if (i == 0) {
                bleService.getClass();
                bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_WRITE_DONE"));
            } else {
                bleService.getClass();
                bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_WRITE_ERROR"));
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        StringBuilder sb6 = new StringBuilder("on connection state changed: ");
        sb6.append(i2 == 0 ? "Disconnected" : Integer.valueOf(i2));
        sb6.append(" status: ");
        sb6.append(e0.b(i));
        t1.a(sb6.toString());
        BleService bleService = this.f148437a;
        if (i2 == 0) {
            bleService.f107567c = 0;
            bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_DISCONNECTED"));
        } else if (i2 == 2) {
            if (bleService.f107567c == 2) {
                if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.CONNEXION.getCode()) {
                    LogManager.w("[CONNECTION]", "Warning : Current state connected and received newState CONNECTED");
                }
            } else {
                if (bleService.f107566b == null) {
                    bleService.f107566b = bluetoothGatt;
                }
                bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_STATE_CONNECTED"));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        String str;
        StringBuilder sb6 = new StringBuilder("descriptor write for ");
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        int i2 = BleService.o;
        String string = characteristic.getUuid().toString();
        string.getClass();
        byte b4 = 1;
        switch (string) {
            case "00002a19-0000-1000-8000-00805f9b34fb":
                str = "Battery level";
                break;
            case "d1f4c2d0-f8c2-4565-9349-e0312effd1ee":
                str = "TxRx";
                break;
            case "d329a8cb-b872-4c13-971b-72bca85ef0cd":
                str = "HState";
                break;
            default:
                str = "unknown";
                break;
        }
        sb6.append(str);
        sb6.append(" with status ");
        sb6.append(e0.b(i));
        t1.a(sb6.toString());
        String string2 = bluetoothGattDescriptor.getCharacteristic().getUuid().toString();
        string2.getClass();
        switch (string2.hashCode()) {
            case -892660755:
                b4 = !string2.equals("00002a19-0000-1000-8000-00805f9b34fb") ? (byte) -1 : (byte) 0;
                break;
            case -526627681:
                if (!string2.equals("d1f4c2d0-f8c2-4565-9349-e0312effd1ee")) {
                    b4 = -1;
                }
                break;
            case 1772437931:
                b4 = !string2.equals("d329a8cb-b872-4c13-971b-72bca85ef0cd") ? (byte) -1 : (byte) 2;
                break;
            default:
                b4 = -1;
                break;
        }
        BleService bleService = this.f148437a;
        switch (b4) {
            case 0:
                if (!bleService.b(bleService.f)) {
                    bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
                }
                break;
            case 1:
                if (i != 0) {
                    bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
                } else {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = bleService.f107569h;
                    if ((bluetoothGattCharacteristic == null || !bleService.a(bluetoothGattCharacteristic)) && !bleService.b(bleService.f)) {
                        bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
                    }
                }
                break;
            case 2:
                bleService.f107567c = 2;
                bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTED"));
                break;
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        t1.a("on service discovered status :" + e0.b(i));
        BleService bleService = this.f148437a;
        if (i != 0) {
            int i2 = BleService.o;
            bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
            return;
        }
        for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
            if (m.f201026a.equals(bluetoothGattService.getUuid())) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                    String string = bluetoothGattCharacteristic.getUuid().toString();
                    string.getClass();
                    if (string.equals("d1f4c2d0-f8c2-4565-9349-e0312effd1ee")) {
                        bleService.f107568g = bluetoothGattCharacteristic;
                    } else if (string.equals("d329a8cb-b872-4c13-971b-72bca85ef0cd")) {
                        bleService.f = bluetoothGattCharacteristic;
                    }
                }
            }
            if (m.d.equals(bluetoothGattService.getUuid()) && bleService.e) {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic2 : bluetoothGattService.getCharacteristics()) {
                    if ("00002a19-0000-1000-8000-00805f9b34fb".equals(bluetoothGattCharacteristic2.getUuid().toString())) {
                        bleService.f107569h = bluetoothGattCharacteristic2;
                    }
                }
            }
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic3 = bleService.f107568g;
        if (bluetoothGattCharacteristic3 == null || bleService.f == null) {
            bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
        } else {
            if (bleService.a(bluetoothGattCharacteristic3)) {
                return;
            }
            bleService.sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR"));
        }
    }
}
