package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import org.bouncycastle.crypto.params.HKDFParameters;

/* JADX INFO: loaded from: classes14.dex */
public class HKDFParameterSpec implements KeySpec, AlgorithmParameterSpec {
    private final HKDFParameters hkdfParameters;
    private final int outputLength;

    public HKDFParameterSpec(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.hkdfParameters = new HKDFParameters(bArr, bArr2, bArr3);
        this.outputLength = i;
    }

    public byte[] getIKM() {
        return this.hkdfParameters.getIKM();
    }

    public byte[] getInfo() {
        return this.hkdfParameters.getInfo();
    }

    public int getOutputLength() {
        return this.outputLength;
    }

    public byte[] getSalt() {
        return this.hkdfParameters.getSalt();
    }

    public boolean skipExtract() {
        return this.hkdfParameters.skipExtract();
    }
}
