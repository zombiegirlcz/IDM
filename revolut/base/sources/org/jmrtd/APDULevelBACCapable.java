package org.jmrtd;

import javax.crypto.SecretKey;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes14.dex */
public interface APDULevelBACCapable {
    byte[] sendGetChallenge() throws CardServiceException;

    byte[] sendMutualAuth(byte[] bArr, byte[] bArr2, byte[] bArr3, SecretKey secretKey, SecretKey secretKey2) throws CardServiceException;
}
