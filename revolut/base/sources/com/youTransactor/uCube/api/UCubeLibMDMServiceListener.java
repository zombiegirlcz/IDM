package com.youTransactor.uCube.api;

import com.youTransactor.uCube.mdm.ServiceState;

/* JADX INFO: loaded from: classes17.dex */
public interface UCubeLibMDMServiceListener {
    void onFinish(boolean z, Object... objArr);

    void onProgress(ServiceState serviceState);
}
