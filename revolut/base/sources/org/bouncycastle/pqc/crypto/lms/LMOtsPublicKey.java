package org.bouncycastle.pqc.crypto.lms;

import a0.d;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes14.dex */
class LMOtsPublicKey implements Encodable {
    private final byte[] I;
    private final byte[] K;
    private final LMOtsParameters parameter;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f228822q;

    public LMOtsPublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.I = bArr;
        this.f228822q = i;
        this.K = bArr2;
    }

    public static LMOtsPublicKey getInstance(Object obj2) throws Exception {
        if (obj2 instanceof LMOtsPublicKey) {
            return (LMOtsPublicKey) obj2;
        }
        if (obj2 instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj2;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i = dataInputStream.readInt();
            byte[] bArr2 = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr2);
            return new LMOtsPublicKey(parametersForType, bArr, i, bArr2);
        }
        if (!(obj2 instanceof byte[])) {
            if (obj2 instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj2));
            }
            throw new IllegalArgumentException(d.m(obj2, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj2));
            try {
                LMOtsPublicKey lMOtsPublicKey = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsPublicKey;
            } catch (Throwable th10) {
                th = th10;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
        }
    }

    public LMSContext createOtsContext(LMOtsSignature lMOtsSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.I, digest);
        LmsUtils.u32str(this.f228822q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMOtsSignature.getC(), digest);
        return new LMSContext(this, lMOtsSignature, digest);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && getClass() == obj2.getClass()) {
            LMOtsPublicKey lMOtsPublicKey = (LMOtsPublicKey) obj2;
            if (this.f228822q == lMOtsPublicKey.f228822q && Objects.areEqual(this.parameter, lMOtsPublicKey.parameter) && Arrays.areEqual(this.I, lMOtsPublicKey.I) && Arrays.areEqual(this.K, lMOtsPublicKey.K)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.parameter.getType()).bytes(this.I).u32str(this.f228822q).bytes(this.K).build();
    }

    public byte[] getI() {
        return this.I;
    }

    public byte[] getK() {
        return this.K;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f228822q;
    }

    public int hashCode() {
        return Arrays.hashCode(this.K) + ((Arrays.hashCode(this.I) + ((Objects.hashCode(this.parameter) + (this.f228822q * 31)) * 31)) * 31);
    }

    public LMSContext createOtsContext(LMSSignature lMSSignature) {
        Digest digest = DigestUtil.getDigest(this.parameter);
        LmsUtils.byteArray(this.I, digest);
        LmsUtils.u32str(this.f228822q, digest);
        LmsUtils.u16str((short) -32383, digest);
        LmsUtils.byteArray(lMSSignature.getOtsSignature().getC(), digest);
        return new LMSContext(this, lMSSignature, digest);
    }
}
