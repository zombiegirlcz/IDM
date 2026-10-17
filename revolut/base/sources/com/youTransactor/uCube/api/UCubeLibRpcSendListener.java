package com.youTransactor.uCube.api;

import com.youTransactor.uCube.rpc.RPCCommandStatus;

/* JADX INFO: loaded from: classes17.dex */
public interface UCubeLibRpcSendListener {
    void onFinish(boolean z, byte[] bArr);

    void onProgress(RPCCommandStatus rPCCommandStatus);
}
