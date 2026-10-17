package org.bouncycastle.pqc.crypto.lms;

/* JADX INFO: loaded from: classes14.dex */
public interface LMSContextBasedVerifier {
    LMSContext generateLMSContext(byte[] bArr);

    boolean verify(LMSContext lMSContext);
}
