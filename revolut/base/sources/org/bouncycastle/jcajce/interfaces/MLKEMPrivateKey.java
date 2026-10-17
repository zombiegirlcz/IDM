package org.bouncycastle.jcajce.interfaces;

import java.security.PrivateKey;

/* JADX INFO: loaded from: classes14.dex */
public interface MLKEMPrivateKey extends PrivateKey, MLKEMKey {
    byte[] getPrivateData();

    MLKEMPrivateKey getPrivateKey(boolean z);

    MLKEMPublicKey getPublicKey();

    byte[] getSeed();
}
