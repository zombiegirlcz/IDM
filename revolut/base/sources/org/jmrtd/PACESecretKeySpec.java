package org.jmrtd;

import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class PACESecretKeySpec extends SecretKeySpec implements AccessKeySpec {
    private static final long serialVersionUID = -5181060361947453857L;
    private byte keyReference;

    public PACESecretKeySpec(byte[] bArr, int i, int i2, String str, byte b4) {
        super(bArr, i, i2, str);
        this.keyReference = b4;
    }

    @Override // javax.crypto.spec.SecretKeySpec
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return super.equals(obj2) && getClass() == obj2.getClass() && this.keyReference == ((PACESecretKeySpec) obj2).keyReference;
    }

    @Override // org.jmrtd.AccessKeySpec
    public byte[] getKey() {
        return super.getEncoded();
    }

    public byte getKeyReference() {
        return this.keyReference;
    }

    @Override // javax.crypto.spec.SecretKeySpec
    public int hashCode() {
        return (super.hashCode() * 31) + this.keyReference;
    }

    public PACESecretKeySpec(byte[] bArr, String str, byte b4) {
        super(bArr, str);
        this.keyReference = b4;
    }
}
