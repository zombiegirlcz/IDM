package com.youTransactor.uCube.connexion;

import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes17.dex */
public interface IConnexionManager {
    boolean cancelConnection();

    void close();

    void connect(int i, int i2, ConnectionListener connectionListener);

    void connect(ConnectionListener connectionListener);

    void disconnect(DisconnectListener disconnectListener);

    Integer getBatteryLevel();

    UCubeDevice getDevice();

    List<UCubeDevice> getPairedUCubes(String str);

    List<UCubeDevice> getPairedUCubes(Pattern pattern);

    boolean isConnected();

    void registerBatteryLevelChangeListener(BatteryLevelListener batteryLevelListener);

    void registerConnectionStateListener(ConnectionStateChangeListener connectionStateChangeListener);

    void registerDisconnectListener(DisconnectListener disconnectListener);

    void registerResponseListener(ResponseListener responseListener);

    void send(byte[] bArr, SendCommandListener sendCommandListener);

    void setDevice(UCubeDevice uCubeDevice);

    void startScan(String str, ScanListener scanListener);

    void startScan(Pattern pattern, ScanListener scanListener);

    void stopScan();
}
