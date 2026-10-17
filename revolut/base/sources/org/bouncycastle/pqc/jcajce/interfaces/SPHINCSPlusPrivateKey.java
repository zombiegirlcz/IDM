package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public interface SPHINCSPlusPrivateKey extends PrivateKey, SPHINCSPlusKey {
    SPHINCSPlusPublicKey getPublicKey();
}
