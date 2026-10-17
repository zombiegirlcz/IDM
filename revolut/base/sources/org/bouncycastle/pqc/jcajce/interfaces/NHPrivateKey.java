package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* JADX INFO: loaded from: classes14.dex */
public interface NHPrivateKey extends NHKey, PrivateKey {
    short[] getSecretData();
}
