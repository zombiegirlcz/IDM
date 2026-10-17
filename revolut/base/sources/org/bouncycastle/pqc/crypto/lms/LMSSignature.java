package org.bouncycastle.pqc.crypto.lms;

import a0.d;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes14.dex */
class LMSSignature implements Encodable {
    private final LMOtsSignature otsSignature;
    private final LMSigParameters parameter;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f228825q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final byte[][] f228826y;

    public LMSSignature(int i, LMOtsSignature lMOtsSignature, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.f228825q = i;
        this.otsSignature = lMOtsSignature;
        this.parameter = lMSigParameters;
        this.f228826y = bArr;
    }

    public static LMSSignature getInstance(Object obj2) throws Throwable {
        if (obj2 instanceof LMSSignature) {
            return (LMSSignature) obj2;
        }
        if (obj2 instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj2;
            int i = dataInputStream.readInt();
            LMOtsSignature lMOtsSignature = LMOtsSignature.getInstance(obj2);
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            int h2 = parametersForType.getH();
            byte[][] bArr = new byte[h2][];
            for (int i2 = 0; i2 < h2; i2++) {
                byte[] bArr2 = new byte[parametersForType.getM()];
                bArr[i2] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new LMSSignature(i, lMOtsSignature, parametersForType, bArr);
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
                LMSSignature lMSSignature = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSSignature;
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

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        LMSSignature lMSSignature = (LMSSignature) obj2;
        if (this.f228825q != lMSSignature.f228825q) {
            return false;
        }
        LMOtsSignature lMOtsSignature = this.otsSignature;
        if (lMOtsSignature == null ? lMSSignature.otsSignature != null : !lMOtsSignature.equals(lMSSignature.otsSignature)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameter;
        if (lMSigParameters == null ? lMSSignature.parameter == null : lMSigParameters.equals(lMSSignature.parameter)) {
            return Arrays.deepEquals(this.f228826y, lMSSignature.f228826y);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f228825q).bytes(this.otsSignature.getEncoded()).u32str(this.parameter.getType()).bytes(this.f228826y).build();
    }

    public LMOtsSignature getOtsSignature() {
        return this.otsSignature;
    }

    public LMSigParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f228825q;
    }

    public byte[][] getY() {
        return this.f228826y;
    }

    public int hashCode() {
        int i = this.f228825q * 31;
        LMOtsSignature lMOtsSignature = this.otsSignature;
        int iHashCode = (i + (lMOtsSignature != null ? lMOtsSignature.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.parameter;
        return Arrays.deepHashCode(this.f228826y) + ((iHashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31);
    }
}
