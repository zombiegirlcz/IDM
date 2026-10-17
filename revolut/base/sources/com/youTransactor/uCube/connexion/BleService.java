package com.youTransactor.uCube.connexion;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.youTransactor.uCube.api.UCubeAPI;
import defpackage.h1;
import defpackage.j1;
import defpackage.m;
import defpackage.t1;
import java.util.concurrent.LinkedBlockingDeque;
import k0.b;
import o6.a;

/* JADX INFO: loaded from: classes17.dex */
public class BleService extends Service {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothAdapter f107565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothGatt f107566b;
    public String d;
    public BluetoothGattCharacteristic f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BluetoothGattCharacteristic f107568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BluetoothGattCharacteristic f107569h;
    public boolean k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107567c = 0;
    public boolean e = true;
    public final Handler i = new Handler(Looper.myLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedBlockingDeque f107570j = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f107571l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j1 f107572m = new j1(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f107573n = new h1(this);

    public final boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        if (this.f107566b == null) {
            t1.b("ERROR: Gatt is 'null'", new Exception[0]);
            return false;
        }
        if (bluetoothGattCharacteristic == null) {
            t1.b("ERROR: Characteristic is 'null'", new Exception[0]);
            return false;
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(m.f201028c);
        if (descriptor != null) {
            byte[] bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            if (!this.f107566b.setCharacteristicNotification(descriptor.getCharacteristic(), true)) {
                t1.b("ERROR: setCharacteristicNotification failed for descriptor: " + descriptor.getUuid(), new Exception[0]);
            }
            descriptor.setValue(bArr);
            if (this.f107566b.writeDescriptor(descriptor)) {
                return true;
            }
            t1.b("ERROR: writeDescriptor failed for descriptor: " + descriptor.getUuid(), new Exception[0]);
            return false;
        }
        String string = bluetoothGattCharacteristic.getUuid().toString();
        string.getClass();
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
        t1.b("ERROR: Could not get CCC descriptor for characteristic ".concat(str), new Exception[0]);
        return false;
    }

    public final boolean b() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f107565a = defaultAdapter;
        if (defaultAdapter != null) {
            return true;
        }
        t1.b("Unable to obtain a BluetoothAdapter.", new Exception[0]);
        return false;
    }

    public final boolean c() {
        BluetoothGatt bluetoothGatt = this.f107566b;
        if (bluetoothGatt == null) {
            t1.a("bluetooth gatt null");
            return false;
        }
        try {
            return ((BluetoothManager) UCubeAPI.getContext().getSystemService("bluetooth")).getConnectionState(bluetoothGatt.getDevice(), 7) == 2;
        } catch (UnsupportedOperationException e) {
            t1.b("isGattConnect() Failed with exception :", e);
            return false;
        }
    }

    public final void d() {
        synchronized (this.f107571l) {
            try {
                if (this.k) {
                    return;
                }
                if (this.f107570j.size() > 0) {
                    Runnable runnable = (Runnable) this.f107570j.peek();
                    synchronized (this.f107571l) {
                        this.k = true;
                    }
                    this.i.post(new a(runnable, 5));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f107572m;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        t1.a("clearing command queue & Close Gatt");
        this.f107570j.clear();
        BluetoothGatt bluetoothGatt = this.f107566b;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
            this.f107566b = null;
        }
        synchronized (this.f107571l) {
            this.k = false;
        }
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_CLOSED"));
        return super.onUnbind(intent);
    }

    public final boolean b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f107566b == null) {
            t1.b("Read failed, Gatt is 'null'", new Exception[0]);
            return false;
        }
        if (bluetoothGattCharacteristic == null) {
            t1.b("Read Failed: Characteristic is 'null'", new Exception[0]);
            return false;
        }
        if ((bluetoothGattCharacteristic.getProperties() & 2) == 0) {
            t1.b("ERROR: Characteristic cannot be read", new Exception[0]);
            return false;
        }
        if (this.f107566b.readCharacteristic(bluetoothGattCharacteristic)) {
            return true;
        }
        t1.b("ERROR: read Battery level Characteristic failed", new Exception[0]);
        return false;
    }

    public final void b(byte[] bArr) {
        if (this.f107566b == null) {
            sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_WRITE_ERROR"));
            a();
            return;
        }
        this.f107568g.setValue(bArr);
        if (this.f107566b.writeCharacteristic(this.f107568g)) {
            return;
        }
        t1.b("ERROR: write TX Characteristic FAILED", new Exception[0]);
        sendBroadcast(new Intent("com.youtransactor.ucube.le.ACTION_GATT_WRITE_ERROR"));
        a();
    }

    public final boolean a(byte[] bArr) {
        if (this.f107566b == null) {
            t1.b("Gatt write data failed, Gatt is 'null'", new Exception[0]);
            return false;
        }
        if (this.f107568g == null) {
            t1.b("ERROR: Characteristic is 'null', ignoring write request", new Exception[0]);
            return false;
        }
        boolean zAdd = this.f107570j.add(new b(this, bArr, 29));
        if (zAdd) {
            d();
            return zAdd;
        }
        t1.b("ERROR: Could not enqueue write characteristic command", new Exception[0]);
        return zAdd;
    }

    public static /* synthetic */ void a(Runnable runnable) {
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e) {
                t1.b("ERROR: Command exception ", e);
            }
        }
    }

    public final void a() {
        synchronized (this.f107571l) {
            this.k = false;
        }
        this.f107570j.poll();
        d();
    }
}
