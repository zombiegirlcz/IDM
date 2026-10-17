package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ch.qos.logback.core.util.a;
import com.google.android.material.color.utilities.g;
import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.connexion.BatteryLevelListener;
import com.youTransactor.uCube.connexion.BleService;
import com.youTransactor.uCube.connexion.ConnectionListener;
import com.youTransactor.uCube.connexion.ConnectionState;
import com.youTransactor.uCube.connexion.ConnectionStateChangeListener;
import com.youTransactor.uCube.connexion.ConnectionStatus;
import com.youTransactor.uCube.connexion.DisconnectListener;
import com.youTransactor.uCube.connexion.IConnexionManager;
import com.youTransactor.uCube.connexion.ResponseListener;
import com.youTransactor.uCube.connexion.SVPPRestartListener;
import com.youTransactor.uCube.connexion.ScanListener;
import com.youTransactor.uCube.connexion.SendCommandListener;
import com.youTransactor.uCube.connexion.UCubeDevice;
import com.youTransactor.uCube.log.LogManager;
import eam.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import jji.e;
import sz5.f;

/* JADX INFO: loaded from: classes21.dex */
public final class v0 implements IConnexionManager {
    public BleService A;
    public final ExecutorService B;
    public SVPPRestartListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Timer f284689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UCubeDevice f284690b;
    public SendCommandListener e;
    public ResponseListener f;
    public BatteryLevelListener i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BluetoothAdapter f284694j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f284695l;
    public Integer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinkedList f284703w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f284691c = new HashSet();
    public final HashSet d = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f284692g = new HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet f284693h = new HashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f284696m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f284697n = new Object();
    public boolean o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f284698p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f284699q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f284700r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f284701s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f284702t = new Object();
    public int G = 1;
    public ConnectionState u = ConnectionState.DISCONNECTED;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f284704x = new byte[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f284705y = false;
    public boolean z = false;
    public final i0 D = new i0(this, 0);
    public final j0 E = new j0(this, 0);
    public final j0 F = new j0(this, 1);

    public v0() {
        this.k = null;
        if (UCubeAPI.getContext() == null) {
            throw new NullPointerException("Error: context is null, initialize UCubeAPI first");
        }
        e eVar = new e();
        eVar.f174962a = false;
        this.k = eVar;
        Context context = UCubeAPI.getContext();
        t1.a("start Listen to bluetooth state changed");
        if (((Context) eVar.f174964c) == null && ((v0) eVar.f174963b) == null && ((b) eVar.d) == null) {
            eVar.f174964c = context.getApplicationContext();
            eVar.f174963b = this;
            eVar.d = new b(eVar, 3);
            try {
                if (!eVar.f174962a) {
                    context.getApplicationContext().registerReceiver((b) eVar.d, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
                    eVar.f174962a = true;
                }
            } catch (IllegalArgumentException e) {
                t1.b(a.q(e, new StringBuilder("Error to register Bluetooth state change receiver : ")), new Exception[0]);
            }
        } else {
            t1.b("already registered call stop listen before calling start listen", new Exception[0]);
        }
        if (UCubeAPI.getContext().getSystemService("bluetooth") == null) {
            throw new IllegalStateException("Bluetooth not supported !");
        }
        BluetoothManager bluetoothManager = (BluetoothManager) UCubeAPI.getContext().getSystemService("bluetooth");
        if (bluetoothManager.getAdapter() == null) {
            throw new IllegalStateException("Bluetooth not supported !");
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f284694j = adapter;
        this.f284695l = new f(UCubeAPI.getContext(), adapter);
        this.B = Executors.newSingleThreadExecutor();
    }

    public static void d(v0 v0Var) {
        t1.a("on BLE Service unbind");
        synchronized (v0Var.f284700r) {
            v0Var.f284699q = false;
        }
        v0Var.b(ConnectionState.DISCONNECTED);
        v0Var.c(ConnectionStatus.ERROR_DEVICE_DISCONNECT);
        synchronized (v0Var.f284702t) {
            v0Var.f284701s = false;
        }
        HashSet<DisconnectListener> hashSet = new HashSet(v0Var.d);
        synchronized (v0Var.d) {
            v0Var.d.clear();
        }
        for (DisconnectListener disconnectListener : hashSet) {
            if (disconnectListener != null) {
                disconnectListener.onDisconnect(true);
            }
        }
        for (DisconnectListener disconnectListener2 : v0Var.f284693h) {
            if (disconnectListener2 != null) {
                disconnectListener2.onDisconnect(true);
            }
        }
    }

    public final void a() {
        int i;
        String str;
        synchronized (this.f284698p) {
            try {
                boolean zConnect = false;
                if (!this.o) {
                    t1.b("Connection loop: no connection running", new Exception[0]);
                    return;
                }
                int i2 = this.G;
                if (i2 != 1) {
                    i = 3;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            i = 5;
                            if (i2 != 4) {
                                i = i2 != 5 ? 7 : 6;
                            }
                        } else {
                            i = 4;
                        }
                    }
                } else {
                    i = 2;
                }
                this.G = i;
                switch (i) {
                    case 1:
                        str = "IDLE";
                        break;
                    case 2:
                        str = "BIND_BLE_SERVICE";
                        break;
                    case 3:
                        str = "REGISTER_GATT_UPDATE_RECEIVER";
                        break;
                    case 4:
                        str = "BIND_DEVICE";
                        break;
                    case 5:
                        str = "CONNECT";
                        break;
                    case 6:
                        str = "DISCOVER_SERVICES";
                        break;
                    case 7:
                        str = "END";
                        break;
                    default:
                        throw null;
                }
                t1.a("Connection loop: step: ".concat(str));
                int i3 = this.G;
                if (i3 == 0) {
                    throw null;
                }
                switch (i3 - 1) {
                    case 0:
                        a();
                        return;
                    case 1:
                        Context context = UCubeAPI.getContext();
                        synchronized (this.f284697n) {
                            try {
                                if (this.f284696m || this.A != null) {
                                    e(true);
                                } else {
                                    t1.a("Bind BLE service");
                                    UCubeAPI.getContext().bindService(new Intent(context, (Class<?>) BleService.class), this.D, 1);
                                }
                            } finally {
                            }
                            break;
                        }
                        return;
                    case 2:
                        System.out.println("registerGattUpdateReceiver");
                        if (this.z) {
                            i();
                            return;
                        }
                        try {
                            t1.a("register GATT Actions receiver");
                            Context context2 = UCubeAPI.getContext();
                            j0 j0Var = this.F;
                            UUID uuid = m.f201026a;
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_STATE_CONNECTED");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_CONNECTED");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_CONNECTION_ERROR");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_DISCONNECTED");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_DEVICE_GET_STUCK");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_CLOSED");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_WRITE_DONE");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_WRITE_ERROR");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_RX_RECEIVED");
                            intentFilter.addAction("com.youtransactor.ucube.le.ACTION_GATT_BATTERY_LEVEL_RECEIVED");
                            context2.registerReceiver(j0Var, intentFilter, 2);
                            this.z = true;
                            i();
                            return;
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                            c(ConnectionStatus.ERROR_TO_REGISTER_RECEIVER);
                            return;
                        }
                    case 3:
                        BluetoothDevice remoteDevice = this.f284694j.getRemoteDevice(this.f284690b.getAddress());
                        if (remoteDevice == null) {
                            t1.b("Connection loop: Unable to obtain Bluetooth device.", new Exception[0]);
                            c(ConnectionStatus.ERROR_GET_REMOTE_DEVICE);
                            return;
                        }
                        if (remoteDevice.getBondState() != 12) {
                            t1.a("Connection loop: wait to bound event");
                            System.out.println("registerBondStateAction");
                            try {
                                if (!this.f284705y) {
                                    Context context3 = UCubeAPI.getContext();
                                    j0 j0Var2 = this.E;
                                    UUID uuid2 = m.f201026a;
                                    IntentFilter intentFilter2 = new IntentFilter();
                                    intentFilter2.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
                                    context3.registerReceiver(j0Var2, intentFilter2, 2);
                                    this.f284705y = true;
                                }
                            } catch (IllegalArgumentException e2) {
                                e2.printStackTrace();
                                c(ConnectionStatus.ERROR_TO_REGISTER_RECEIVER);
                            }
                            break;
                        }
                        a();
                        return;
                    case 4:
                        BleService bleService = this.A;
                        if (bleService == null) {
                            c(ConnectionStatus.ERROR_TO_BIND_SERVICE);
                            return;
                        }
                        String address = this.f284690b.getAddress();
                        if (bleService.f107565a != null && address != null) {
                            bleService.e = true;
                            if (!address.equals(bleService.d) || bleService.f107566b == null) {
                                BluetoothDevice remoteDevice2 = bleService.f107565a.getRemoteDevice(address);
                                if (remoteDevice2 != null) {
                                    BluetoothGatt bluetoothGattConnectGatt = remoteDevice2.connectGatt(bleService, false, bleService.f107573n);
                                    bleService.f107566b = bluetoothGattConnectGatt;
                                    if (bluetoothGattConnectGatt == null) {
                                        t1.b("Error: connect GATT return 'null'", new Exception[0]);
                                    } else {
                                        t1.a("Trying to create a new connection.");
                                        bleService.d = address;
                                        zConnect = true;
                                    }
                                } else if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.CONNEXION.getCode()) {
                                    LogManager.w("[CONNECTION]", "Device not found.  Unable to connect.");
                                }
                            } else {
                                t1.a("Trying to use an existing mBluetoothGatt for connection.");
                                zConnect = bleService.f107566b.connect();
                            }
                        } else if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.CONNEXION.getCode()) {
                            LogManager.w("[CONNECTION]", "BluetoothAdapter not initialized or unspecified address.");
                        }
                        if (zConnect) {
                            return;
                        }
                        c(ConnectionStatus.ERROR_CONNECTION_FAILED);
                        return;
                    case 5:
                        BleService bleService2 = this.A;
                        if (bleService2 == null) {
                            c(ConnectionStatus.ERROR_TO_BIND_SERVICE);
                            return;
                        }
                        BluetoothGatt bluetoothGatt = bleService2.f107566b;
                        if (bluetoothGatt == null) {
                            t1.b("ERROR to discover services: Gatt is 'null'", new Exception[0]);
                        } else {
                            bluetoothGatt.requestConnectionPriority(1);
                            zConnect = bleService2.f107566b.discoverServices();
                        }
                        if (zConnect) {
                            return;
                        }
                        c(ConnectionStatus.ERROR_DISCOVER_SERVICES);
                        return;
                    case 6:
                        t1.a("Connection end with Success");
                        synchronized (this.f284698p) {
                            try {
                                if (this.o) {
                                    this.G = 7;
                                    this.o = false;
                                    b(ConnectionState.CONNECTED);
                                    HashSet<ConnectionListener> hashSet = new HashSet(this.f284691c);
                                    this.f284691c.clear();
                                    for (ConnectionListener connectionListener : hashSet) {
                                        if (connectionListener != null) {
                                            connectionListener.onConnectionSuccess();
                                        }
                                    }
                                    return;
                                }
                                return;
                            } finally {
                            }
                        }
                    default:
                        return;
                }
            } finally {
            }
        }
    }

    public final void b(ConnectionState connectionState) {
        t1.a("Connection state: " + connectionState);
        this.u = connectionState;
        for (ConnectionStateChangeListener connectionStateChangeListener : this.f284692g) {
            if (connectionStateChangeListener != null) {
                connectionStateChangeListener.onConnectionStateChange(connectionState);
            }
        }
    }

    public final void c(ConnectionStatus connectionStatus) {
        synchronized (this.f284698p) {
            try {
                if (this.o) {
                    this.G = 7;
                    this.o = false;
                    t1.b("BLE Connection fails with status : " + connectionStatus.name(), new Exception[0]);
                    disconnect(new p0(this, connectionStatus, 0));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final synchronized boolean cancelConnection() {
        String str;
        if (isConnected()) {
            t1.b("Cancel connection failed, Already connected", new Exception[0]);
            return false;
        }
        synchronized (this.f284698p) {
            if (this.o && this.u == ConnectionState.CONNECTING) {
                if (!this.f284694j.isEnabled()) {
                    t1.b("Cancel connection failed, Bluetooth disabled", new Exception[0]);
                    return false;
                }
                if (this.f284690b == null) {
                    t1.b("Cancel connection failed, No device selected", new Exception[0]);
                    return false;
                }
                switch (this.G) {
                    case 1:
                        str = "IDLE";
                        break;
                    case 2:
                        str = "BIND_BLE_SERVICE";
                        break;
                    case 3:
                        str = "REGISTER_GATT_UPDATE_RECEIVER";
                        break;
                    case 4:
                        str = "BIND_DEVICE";
                        break;
                    case 5:
                        str = "CONNECT";
                        break;
                    case 6:
                        str = "DISCOVER_SERVICES";
                        break;
                    case 7:
                        str = "END";
                        break;
                    default:
                        str = "null";
                        break;
                }
                t1.a("cancel current connection at step: ".concat(str));
                c(ConnectionStatus.CANCELLED);
                return true;
            }
            t1.b("Cancel connection failed, No connection on progress", new Exception[0]);
            return false;
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void close() {
        if (UCubeAPI.getContext() == null) {
            throw new NullPointerException("Close() Error: context is null, initialize UCubeAPI first");
        }
        ExecutorService executorService = this.B;
        if (!executorService.isShutdown()) {
            executorService.shutdown();
        }
        this.f284693h.clear();
        this.f284692g.clear();
        this.i = null;
        e eVar = this.k;
        eVar.getClass();
        t1.a("stopListen");
        b bVar = (b) eVar.d;
        if (bVar != null && ((v0) eVar.f174963b) != null) {
            try {
                if (eVar.f174962a) {
                    ((Context) eVar.f174964c).unregisterReceiver(bVar);
                    eVar.f174962a = false;
                }
            } catch (IllegalArgumentException e) {
                t1.b(a.q(e, new StringBuilder("Error to unregister Bluetooth state change receiver : ")), new Exception[0]);
            }
            eVar.f174963b = null;
            eVar.f174964c = null;
            eVar.d = null;
        }
        j();
        f();
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final synchronized void connect(ConnectionListener connectionListener) {
        synchronized (this.f284700r) {
            try {
                if (this.f284699q) {
                    t1.b("Disconnection process running", new Exception[0]);
                    if (connectionListener != null) {
                        connectionListener.onConnectionFailed(ConnectionStatus.ERROR_DISCONNECTION_RUNNING, -1);
                    }
                    return;
                }
                synchronized (this.f284698p) {
                    try {
                        if (this.f284690b == null) {
                            t1.b("Device is 'null'", new Exception[0]);
                            if (connectionListener != null) {
                                connectionListener.onConnectionFailed(ConnectionStatus.ERROR_NO_SELECTED_DEVICE, -1);
                            }
                            return;
                        }
                        if (!this.f284694j.isEnabled()) {
                            t1.b("Bluetooth disabled", new Exception[0]);
                            if (connectionListener != null) {
                                connectionListener.onConnectionFailed(ConnectionStatus.ERROR_BT_DISABLED, -1);
                            }
                            return;
                        }
                        if (isConnected()) {
                            t1.a("Already connected");
                            if (connectionListener != null) {
                                connectionListener.onConnectionSuccess();
                            }
                        } else {
                            if (this.o) {
                                t1.a("Connection is running");
                                if (connectionListener != null) {
                                    this.f284691c.add(connectionListener);
                                }
                                return;
                            }
                            t1.a("Connect to " + this.f284690b.getName());
                            if (connectionListener != null) {
                                this.f284691c.add(connectionListener);
                            }
                            b(ConnectionState.CONNECTING);
                            this.G = 1;
                            this.o = true;
                            a();
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final synchronized void disconnect(DisconnectListener disconnectListener) {
        if (!h()) {
            t1.a("Already disconnected");
            if (disconnectListener != null) {
                disconnectListener.onDisconnect(true);
                return;
            }
            return;
        }
        synchronized (this.d) {
            if (disconnectListener != null) {
                try {
                    this.d.add(disconnectListener);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        synchronized (this.f284698p) {
            if (this.o && cancelConnection()) {
                t1.a("Connection is running");
                return;
            }
            synchronized (this.f284700r) {
                if (this.f284699q) {
                    t1.a("disconnection running");
                    return;
                }
                this.f284699q = true;
                t1.a("disconnection request");
                b(ConnectionState.DISCONNECTING);
                f();
            }
        }
    }

    public final void e(boolean z) {
        t1.a("LE Service bound");
        if (!z) {
            c(ConnectionStatus.ERROR_TO_BIND_SERVICE);
        } else if (this.G == 2) {
            a();
        }
    }

    public final void f() {
        synchronized (this.f284697n) {
            try {
                if (this.f284696m) {
                    t1.a("unbind BLE service");
                    UCubeAPI.getContext().unbindService(this.D);
                    this.f284696m = false;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void g(boolean z) {
        if (!z) {
            t1.b("Error to write data on TxRx characteristic", new Exception[0]);
            synchronized (this.f284702t) {
                this.f284701s = false;
            }
            SendCommandListener sendCommandListener = this.e;
            if (sendCommandListener != null) {
                sendCommandListener.onError();
                return;
            }
            return;
        }
        LinkedList linkedList = this.f284703w;
        if (linkedList == null) {
            synchronized (this.f284702t) {
                this.f284701s = false;
            }
            SendCommandListener sendCommandListener2 = this.e;
            if (sendCommandListener2 != null) {
                sendCommandListener2.onDataSent();
                return;
            }
            return;
        }
        linkedList.poll();
        if (!this.f284703w.isEmpty()) {
            if (this.A.a((byte[]) this.f284703w.peek())) {
                return;
            }
            g(false);
            return;
        }
        synchronized (this.f284702t) {
            this.f284701s = false;
        }
        SendCommandListener sendCommandListener3 = this.e;
        if (sendCommandListener3 != null) {
            sendCommandListener3.onDataSent();
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final Integer getBatteryLevel() {
        return this.v;
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final UCubeDevice getDevice() {
        return this.f284690b;
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final List getPairedUCubes(String str) {
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter bluetoothAdapter = this.f284694j;
        int i = 0;
        if (!bluetoothAdapter.isEnabled()) {
            t1.b("Error! bluetooth disabled", new Exception[0]);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(bluetoothAdapter.getBondedDevices());
        int size = arrayList2.size();
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) obj2;
            if (str == null || bluetoothDevice.getName().toLowerCase().contains(str.toLowerCase())) {
                arrayList.add(new UCubeDevice(bluetoothDevice.getName(), bluetoothDevice.getAddress()));
            }
        }
        Collections.sort(arrayList, new g(6));
        return arrayList;
    }

    public final boolean h() {
        if (!this.f284694j.isEnabled()) {
            t1.b("Error! bluetooth disabled", new Exception[0]);
            return false;
        }
        if (this.f284690b == null) {
            t1.a("No selection device did before");
            return false;
        }
        if (!this.f284696m) {
            t1.a("No connection did before, ble service not bound");
            return false;
        }
        BleService bleService = this.A;
        if (bleService != null) {
            return bleService.c();
        }
        t1.a("bluetooth gatt null");
        return false;
    }

    public final void i() {
        synchronized (this.f284698p) {
            try {
                if (!this.o) {
                    t1.b("GATT Action received: No connection is running", new Exception[0]);
                }
                if (this.G == 3) {
                    a();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final boolean isConnected() {
        return h() && this.u == ConnectionState.CONNECTED;
    }

    public final void j() {
        try {
            if (this.z) {
                t1.a("unregister GATT Actions receiver");
                UCubeAPI.getContext().unregisterReceiver(this.F);
                this.z = false;
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void registerBatteryLevelChangeListener(BatteryLevelListener batteryLevelListener) {
        if (batteryLevelListener != null) {
            this.i = batteryLevelListener;
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void registerConnectionStateListener(ConnectionStateChangeListener connectionStateChangeListener) {
        if (connectionStateChangeListener != null) {
            this.f284692g.add(connectionStateChangeListener);
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void registerDisconnectListener(DisconnectListener disconnectListener) {
        synchronized (this.f284693h) {
            if (disconnectListener != null) {
                try {
                    this.f284693h.add(disconnectListener);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void registerResponseListener(ResponseListener responseListener) {
        if (responseListener != null) {
            this.f = responseListener;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x009e A[Catch: all -> 0x003d, TryCatch #2 {, blocks: (B:4:0x0007, B:5:0x0009, B:18:0x0024, B:21:0x0029, B:23:0x002f, B:25:0x0038, B:30:0x0040, B:31:0x0042, B:45:0x005e, B:47:0x0078, B:48:0x007a, B:49:0x0081, B:51:0x0084, B:57:0x0090, B:58:0x0093, B:61:0x00be, B:59:0x009e, B:60:0x00b2, B:62:0x00c1, B:63:0x00d6, B:65:0x00dc, B:76:0x0116, B:78:0x011e, B:69:0x00f0, B:71:0x00fa, B:73:0x00fe, B:74:0x0100, B:75:0x010a, B:82:0x0124, B:84:0x0127, B:90:0x012f, B:32:0x0043, B:34:0x0047, B:36:0x0050, B:39:0x0057, B:43:0x005b, B:44:0x005d, B:6:0x000a, B:8:0x000f, B:10:0x0018, B:13:0x001e, B:16:0x0021), top: B:95:0x0007, inners: #0, #1 }] */
    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void send(byte[] r7, com.youTransactor.uCube.connexion.SendCommandListener r8) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v0.send(byte[], com.youTransactor.uCube.connexion.SendCommandListener):void");
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void setDevice(UCubeDevice uCubeDevice) {
        this.f284695l.N();
        UCubeDevice uCubeDevice2 = this.f284690b;
        if (uCubeDevice2 == null) {
            this.f284690b = uCubeDevice;
        } else if (uCubeDevice2.equals(uCubeDevice)) {
            return;
        } else {
            disconnect(new p0(this, uCubeDevice, 1));
        }
        t1.a("Set device Name: " + uCubeDevice.getName() + " Address: " + uCubeDevice.getAddress());
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void startScan(String str, ScanListener scanListener) {
        this.f284695l.J(str, scanListener);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void stopScan() {
        this.f284695l.N();
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void startScan(Pattern pattern, ScanListener scanListener) {
        this.f284695l.K(pattern, scanListener);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final List getPairedUCubes(Pattern pattern) {
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter bluetoothAdapter = this.f284694j;
        int i = 0;
        if (!bluetoothAdapter.isEnabled()) {
            t1.b("Error! bluetooth disabled", new Exception[0]);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(bluetoothAdapter.getBondedDevices());
        int size = arrayList2.size();
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            BluetoothDevice bluetoothDevice = (BluetoothDevice) obj2;
            if (pattern == null || pattern.matcher(bluetoothDevice.getName()).matches()) {
                arrayList.add(new UCubeDevice(bluetoothDevice.getName(), bluetoothDevice.getAddress()));
            }
        }
        Collections.sort(arrayList, new g(7));
        return arrayList;
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public final void connect(int i, int i2, ConnectionListener connectionListener) {
        connect(connectionListener);
    }
}
