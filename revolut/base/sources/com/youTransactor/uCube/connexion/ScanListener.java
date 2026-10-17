package com.youTransactor.uCube.connexion;

import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface ScanListener {
    void onDeviceDiscovered(UCubeDevice uCubeDevice);

    void onError(ScanError scanError);

    void onScanComplete(List<UCubeDevice> list);
}
