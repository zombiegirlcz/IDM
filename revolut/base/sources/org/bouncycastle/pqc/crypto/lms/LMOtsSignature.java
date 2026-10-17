package org.bouncycastle.pqc.crypto.lms;

import a0.d;
import ehe.n;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes14.dex */
class LMOtsSignature implements Encodable {
    private final byte[] C;
    private final LMOtsParameters type;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final byte[] f228823y;

    public LMOtsSignature(LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        this.type = lMOtsParameters;
        this.C = bArr;
        this.f228823y = bArr2;
    }

    public static LMOtsSignature getInstance(Object obj2) throws Throwable {
        if (obj2 instanceof LMOtsSignature) {
            return (LMOtsSignature) obj2;
        }
        if (obj2 instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj2;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[parametersForType.getN() * parametersForType.getP()];
            dataInputStream.readFully(bArr2);
            return new LMOtsSignature(parametersForType, bArr, bArr2);
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
                LMOtsSignature lMOtsSignature = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMOtsSignature;
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
        LMOtsSignature lMOtsSignature = (LMOtsSignature) obj2;
        LMOtsParameters lMOtsParameters = this.type;
        if (lMOtsParameters == null ? lMOtsSignature.type != null : !lMOtsParameters.equals(lMOtsSignature.type)) {
            return false;
        }
        if (Arrays.equals(this.C, lMOtsSignature.C)) {
            return Arrays.equals(this.f228823y, lMOtsSignature.f228823y);
        }
        return false;
    }

    public byte[] getC() {
        return this.C;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.type.getType()).bytes(this.C).bytes(this.f228823y).build();
    }

    public LMOtsParameters getType() {
        return this.type;
    }

    public byte[] getY() {
        return this.f228823y;
    }

    public int hashCode() {
        LMOtsParameters lMOtsParameters = this.type;
        return Arrays.hashCode(this.f228823y) + n.b((lMOtsParameters != null ? lMOtsParameters.hashCode() : 0) * 31, 31, this.C);
    }
}
