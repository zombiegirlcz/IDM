package org.bouncycastle.crypto.threshold;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class ShamirSplitSecretShare implements SecretShare {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f228577r;
    private final byte[] secretShare;

    public ShamirSplitSecretShare(byte[] bArr) {
        this.secretShare = Arrays.clone(bArr);
        this.f228577r = 1;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Arrays.clone(this.secretShare);
    }

    public ShamirSplitSecretShare(byte[] bArr, int i) {
        this.secretShare = Arrays.clone(bArr);
        this.f228577r = i;
    }
}
