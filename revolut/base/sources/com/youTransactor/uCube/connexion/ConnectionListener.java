package com.youTransactor.uCube.connexion;

/* JADX INFO: loaded from: classes17.dex */
public interface ConnectionListener {
    void onConnectionCancelled();

    void onConnectionFailed(ConnectionStatus connectionStatus, int i);

    void onConnectionSuccess();
}
