package org.jmrtd.protocol;

import ehe.n;
import java.io.Serializable;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PACEMappingResult implements Serializable {
    private static final long serialVersionUID = 2773111318950631118L;
    private transient AlgorithmParameterSpec ephemeralParameters;
    private byte[] piccNonce;
    private transient AlgorithmParameterSpec staticParameters;

    public PACEMappingResult(AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec2) {
        this.staticParameters = algorithmParameterSpec;
        this.ephemeralParameters = algorithmParameterSpec2;
        this.piccNonce = null;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.piccNonce = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        PACEMappingResult pACEMappingResult = (PACEMappingResult) obj2;
        AlgorithmParameterSpec algorithmParameterSpec = this.ephemeralParameters;
        if (algorithmParameterSpec == null) {
            if (pACEMappingResult.ephemeralParameters != null) {
                return false;
            }
        } else if (!algorithmParameterSpec.equals(pACEMappingResult.ephemeralParameters)) {
            return false;
        }
        if (!Arrays.equals(this.piccNonce, pACEMappingResult.piccNonce)) {
            return false;
        }
        AlgorithmParameterSpec algorithmParameterSpec2 = this.staticParameters;
        if (algorithmParameterSpec2 == null) {
            if (pACEMappingResult.staticParameters != null) {
                return false;
            }
        } else if (!algorithmParameterSpec2.equals(pACEMappingResult.staticParameters)) {
            return false;
        }
        return true;
    }

    public AlgorithmParameterSpec getEphemeralParameters() {
        return this.ephemeralParameters;
    }

    public byte[] getPICCNonce() {
        return this.piccNonce;
    }

    public AlgorithmParameterSpec getStaticParameters() {
        return this.staticParameters;
    }

    public int hashCode() {
        AlgorithmParameterSpec algorithmParameterSpec = this.ephemeralParameters;
        int iB = n.b(((algorithmParameterSpec == null ? 0 : algorithmParameterSpec.hashCode()) + 31) * 31, 31, this.piccNonce);
        AlgorithmParameterSpec algorithmParameterSpec2 = this.staticParameters;
        return iB + (algorithmParameterSpec2 != null ? algorithmParameterSpec2.hashCode() : 0);
    }
}
