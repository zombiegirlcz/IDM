package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes14.dex */
public interface SkippingCipher {
    long getPosition();

    long seekTo(long j2);

    long skip(long j2);
}
