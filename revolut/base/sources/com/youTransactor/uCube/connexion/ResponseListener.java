package com.youTransactor.uCube.connexion;

/* JADX INFO: loaded from: classes17.dex */
public interface ResponseListener {
    void onError(byte[] bArr);

    void onStart(byte[] bArr);

    void onSuccess(byte[] bArr);
}
