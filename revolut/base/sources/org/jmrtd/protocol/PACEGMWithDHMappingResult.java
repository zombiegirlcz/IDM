package org.jmrtd.protocol;

import java.security.KeyPair;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class PACEGMWithDHMappingResult extends PACEGMMappingResult {
    private static final long serialVersionUID = -2829641255641406199L;
    private byte[] sharedSecret;

    public PACEGMWithDHMappingResult(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, PublicKey publicKey, KeyPair keyPair, byte[] bArr2, AlgorithmParameterSpec algorithmParameterSpec2) {
        super(algorithmParameterSpec, bArr, publicKey, keyPair, algorithmParameterSpec2);
        this.sharedSecret = bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length);
    }

    @Override // org.jmrtd.protocol.PACEGMMappingResult, org.jmrtd.protocol.PACEMappingResult
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (super.equals(obj2) && getClass() == obj2.getClass()) {
            return Arrays.equals(this.sharedSecret, ((PACEGMWithDHMappingResult) obj2).sharedSecret);
        }
        return false;
    }

    public byte[] getSharedSecret() {
        byte[] bArr = this.sharedSecret;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Override // org.jmrtd.protocol.PACEGMMappingResult, org.jmrtd.protocol.PACEMappingResult
    public int hashCode() {
        return Arrays.hashCode(this.sharedSecret) + (super.hashCode() * 31);
    }
}
