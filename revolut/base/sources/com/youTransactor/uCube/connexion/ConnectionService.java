package com.youTransactor.uCube.connexion;

import android.bluetooth.BluetoothManager;
import android.os.Handler;
import android.os.Looper;
import com.youTransactor.uCube.api.UCubeAPI;
import defpackage.h;
import defpackage.t1;
import defpackage.v0;
import java.util.List;
import java.util.regex.Pattern;
import o6.a;

/* JADX INFO: loaded from: classes17.dex */
public class ConnectionService implements IConnexionManager {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConnectionService f107574h = new ConnectionService();
    public ConnectionListener e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v0 f107578g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f107575a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f107576b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107577c = 3;
    public int d = 15000;
    public final Handler f = new Handler(Looper.getMainLooper());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConnectionManagerType {
        public static final ConnectionManagerType BLE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ ConnectionManagerType[] f107579a;

        static {
            ConnectionManagerType connectionManagerType = new ConnectionManagerType();
            BLE = connectionManagerType;
            f107579a = new ConnectionManagerType[]{connectionManagerType};
        }

        public static ConnectionManagerType valueOf(String str) {
            return (ConnectionManagerType) Enum.valueOf(ConnectionManagerType.class, str);
        }

        public static ConnectionManagerType[] values() {
            return (ConnectionManagerType[]) f107579a.clone();
        }
    }

    public static ConnectionService getInstance() {
        return f107574h;
    }

    public final /* synthetic */ void a() {
        if (this.f107578g.isConnected()) {
            return;
        }
        t1.b("Connection timeout !", new Exception[0]);
        this.f107575a = true;
        if (this.f107578g.cancelConnection()) {
            return;
        }
        this.f107575a = false;
    }

    public final void b() {
        t1.a("Connection try: " + this.f107576b);
        Handler handler = this.f;
        a aVar = new a(this, 6);
        if (UCubeAPI.getContext().getSystemService("bluetooth") == null) {
            throw new IllegalStateException("Bluetooth not supported !");
        }
        BluetoothManager bluetoothManager = (BluetoothManager) UCubeAPI.getContext().getSystemService("bluetooth");
        if (bluetoothManager.getAdapter() == null) {
            throw new IllegalStateException("Bluetooth not supported !");
        }
        handler.postDelayed(aVar, bluetoothManager.getAdapter().getRemoteDevice(this.f107578g.f284690b.getAddress()).getBondState() != 12 ? this.d + 30000 : this.d);
        this.f107578g.connect(new h(this, 0));
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public boolean cancelConnection() {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return false;
        }
        return v0Var.cancelConnection();
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void close() {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.close();
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void connect(ConnectionListener connectionListener) {
        if (this.f107578g == null) {
            return;
        }
        this.e = connectionListener;
        b();
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void disconnect(DisconnectListener disconnectListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.disconnect(disconnectListener);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public Integer getBatteryLevel() {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return null;
        }
        return v0Var.v;
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public UCubeDevice getDevice() {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return null;
        }
        return v0Var.f284690b;
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public List<UCubeDevice> getPairedUCubes(String str) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return null;
        }
        return v0Var.getPairedUCubes(str);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public boolean isConnected() {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return false;
        }
        return v0Var.isConnected();
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void registerBatteryLevelChangeListener(BatteryLevelListener batteryLevelListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null || batteryLevelListener == null) {
            return;
        }
        v0Var.i = batteryLevelListener;
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void registerConnectionStateListener(ConnectionStateChangeListener connectionStateChangeListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null || connectionStateChangeListener == null) {
            return;
        }
        v0Var.f284692g.add(connectionStateChangeListener);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void registerDisconnectListener(DisconnectListener disconnectListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.registerDisconnectListener(disconnectListener);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void registerResponseListener(ResponseListener responseListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null || responseListener == null) {
            return;
        }
        v0Var.f = responseListener;
    }

    public void registerSVPPRestartListener(SVPPRestartListener sVPPRestartListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.C = sVPPRestartListener;
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void send(byte[] bArr, SendCommandListener sendCommandListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.send(bArr, sendCommandListener);
    }

    public void setConnectionManagerType(ConnectionManagerType connectionManagerType) {
        t1.a("Set Connection Manager type: " + connectionManagerType.name());
        if (this.f107578g != null) {
            if (connectionManagerType != ConnectionManagerType.BLE) {
                throw new IllegalArgumentException("Unknown connection manager type");
            }
        } else {
            if (connectionManagerType != ConnectionManagerType.BLE) {
                throw new IllegalArgumentException("Unknown connection manager type");
            }
            this.f107578g = new v0();
        }
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void setDevice(UCubeDevice uCubeDevice) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.setDevice(uCubeDevice);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void startScan(String str, ScanListener scanListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.f284695l.J(str, scanListener);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void stopScan() {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.f284695l.N();
    }

    public void unregisterSVPPRestartListener() {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.C = null;
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public List<UCubeDevice> getPairedUCubes(Pattern pattern) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return null;
        }
        return v0Var.getPairedUCubes(pattern);
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void connect(int i, int i2, ConnectionListener connectionListener) {
        if (this.f107578g == null) {
            return;
        }
        t1.a("connection: tries count: " + i2 + " connection timeout: " + i + " MilliSecond");
        this.f107577c = i2;
        this.d = i;
        this.e = connectionListener;
        b();
    }

    @Override // com.youTransactor.uCube.connexion.IConnexionManager
    public void startScan(Pattern pattern, ScanListener scanListener) {
        v0 v0Var = this.f107578g;
        if (v0Var == null) {
            return;
        }
        v0Var.f284695l.K(pattern, scanListener);
    }

    public final void a(ConnectionStatus connectionStatus, int i) {
        t1.b("ConnectionService connection failed, status: " + connectionStatus, new Exception[0]);
        this.f.removeCallbacksAndMessages(null);
        int i2 = this.f107576b;
        if (i2 < this.f107577c && (connectionStatus == ConnectionStatus.ERROR_TIMEOUT || connectionStatus == ConnectionStatus.ERROR_TO_BIND_SERVICE || connectionStatus == ConnectionStatus.ERROR_CONNECTION_FAILED || connectionStatus == ConnectionStatus.ERROR_TO_REGISTER_RECEIVER || connectionStatus == ConnectionStatus.ERROR_DISCOVER_SERVICES || connectionStatus == ConnectionStatus.ERROR_ENABLE_CHARACTERISTIC_NOTIFICATION || connectionStatus == ConnectionStatus.ERROR_DEVICE_DISCONNECT || connectionStatus == ConnectionStatus.ERROR_READ_BATTERY_LEVEL)) {
            this.f107576b = i2 + 1;
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b();
            return;
        }
        this.f107576b = 1;
        this.e.onConnectionFailed(connectionStatus, i);
    }
}
