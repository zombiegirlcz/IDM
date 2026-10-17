package org.bouncycastle.pqc.crypto.lms;

import a0.d;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes14.dex */
class HSSSignature implements Encodable {
    private final int lMinus1;
    private final LMSSignature signature;
    private final LMSSignedPubKey[] signedPubKey;

    public HSSSignature(int i, LMSSignedPubKey[] lMSSignedPubKeyArr, LMSSignature lMSSignature) {
        this.lMinus1 = i;
        this.signedPubKey = lMSSignedPubKeyArr;
        this.signature = lMSSignature;
    }

    public static HSSSignature getInstance(Object obj2, int i) throws IOException {
        if (obj2 instanceof HSSSignature) {
            return (HSSSignature) obj2;
        }
        if (obj2 instanceof DataInputStream) {
            int i2 = ((DataInputStream) obj2).readInt();
            if (i2 != i - 1) {
                throw new IllegalStateException("nspk exceeded maxNspk");
            }
            LMSSignedPubKey[] lMSSignedPubKeyArr = new LMSSignedPubKey[i2];
            if (i2 != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    lMSSignedPubKeyArr[i3] = new LMSSignedPubKey(LMSSignature.getInstance(obj2), LMSPublicKeyParameters.getInstance(obj2));
                }
            }
            return new HSSSignature(i2, lMSSignedPubKeyArr, LMSSignature.getInstance(obj2));
        }
        if (!(obj2 instanceof byte[])) {
            if (obj2 instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj2), i);
            }
            throw new IllegalArgumentException(d.m(obj2, "cannot parse "));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj2));
            try {
                HSSSignature hSSSignature = getInstance(dataInputStream2, i);
                dataInputStream2.close();
                return hSSSignature;
            } catch (Throwable th10) {
                th = th10;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
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
        if (obj2 != null && getClass() == obj2.getClass()) {
            HSSSignature hSSSignature = (HSSSignature) obj2;
            if (this.lMinus1 == hSSSignature.lMinus1 && Arrays.areEqual(this.signedPubKey, hSSSignature.signedPubKey) && Objects.areEqual(this.signature, hSSSignature.signature)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        Composer composerCompose = Composer.compose();
        composerCompose.u32str(this.lMinus1);
        LMSSignedPubKey[] lMSSignedPubKeyArr = this.signedPubKey;
        if (lMSSignedPubKeyArr != null) {
            for (LMSSignedPubKey lMSSignedPubKey : lMSSignedPubKeyArr) {
                composerCompose.bytes(lMSSignedPubKey);
            }
        }
        composerCompose.bytes(this.signature);
        return composerCompose.build();
    }

    public LMSSignature getSignature() {
        return this.signature;
    }

    public LMSSignedPubKey[] getSignedPubKey() {
        return this.signedPubKey;
    }

    public int getlMinus1() {
        return this.lMinus1;
    }

    public int hashCode() {
        return Objects.hashCode(this.signature) + (((this.lMinus1 * 31) + Arrays.hashCode(this.signedPubKey)) * 31);
    }
}
