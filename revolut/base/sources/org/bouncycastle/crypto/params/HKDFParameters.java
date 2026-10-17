package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class HKDFParameters implements DerivationParameters {

    /* JADX INFO: renamed from: ikm, reason: collision with root package name */
    private final byte[] f228517ikm;
    private final byte[] info;
    private final byte[] salt;
    private final boolean skipExtract;

    private HKDFParameters(byte[] bArr, boolean z, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            throw new IllegalArgumentException("IKM (input keying material) should not be null");
        }
        this.f228517ikm = Arrays.clone(bArr);
        this.skipExtract = z;
        if (bArr2 == null || bArr2.length == 0) {
            this.salt = null;
        } else {
            this.salt = Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.info = new byte[0];
        } else {
            this.info = Arrays.clone(bArr3);
        }
    }

    public static HKDFParameters defaultParameters(byte[] bArr) {
        return new HKDFParameters(bArr, false, null, null);
    }

    public static HKDFParameters skipExtractParameters(byte[] bArr, byte[] bArr2) {
        return new HKDFParameters(bArr, true, null, bArr2);
    }

    public byte[] getIKM() {
        return Arrays.clone(this.f228517ikm);
    }

    public byte[] getInfo() {
        return Arrays.clone(this.info);
    }

    public byte[] getSalt() {
        return Arrays.clone(this.salt);
    }

    public boolean skipExtract() {
        return this.skipExtract;
    }

    public HKDFParameters(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(bArr, false, bArr2, bArr3);
    }
}
