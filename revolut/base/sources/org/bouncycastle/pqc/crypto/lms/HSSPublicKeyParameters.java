package org.bouncycastle.pqc.crypto.lms;

import a0.d;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import okl.m;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes14.dex */
public class HSSPublicKeyParameters extends LMSKeyParameters implements LMSContextBasedVerifier {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f228816l;
    private final LMSPublicKeyParameters lmsPublicKey;

    public HSSPublicKeyParameters(int i, LMSPublicKeyParameters lMSPublicKeyParameters) {
        super(false);
        if (lMSPublicKeyParameters == null) {
            throw new NullPointerException("lmsPublicKey");
        }
        this.f228816l = i;
        this.lmsPublicKey = lMSPublicKeyParameters;
    }

    public static HSSPublicKeyParameters getInstance(Object obj2) throws Throwable {
        if (obj2 instanceof HSSPublicKeyParameters) {
            return (HSSPublicKeyParameters) obj2;
        }
        if (obj2 instanceof DataInputStream) {
            return new HSSPublicKeyParameters(((DataInputStream) obj2).readInt(), LMSPublicKeyParameters.getInstance(obj2));
        }
        if (!(obj2 instanceof byte[])) {
            if (obj2 instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj2));
            }
            throw new IllegalArgumentException(d.m(obj2, "cannot parse "));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj2));
            try {
                HSSPublicKeyParameters hSSPublicKeyParameters = getInstance(dataInputStream2);
                dataInputStream2.close();
                return hSSPublicKeyParameters;
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
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) obj2;
        if (this.f228816l != hSSPublicKeyParameters.f228816l) {
            return false;
        }
        return this.lmsPublicKey.equals(hSSPublicKeyParameters.lmsPublicKey);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public LMSContext generateLMSContext(byte[] bArr) {
        try {
            HSSSignature hSSSignature = HSSSignature.getInstance(bArr, getL());
            LMSSignedPubKey[] signedPubKey = hSSSignature.getSignedPubKey();
            return (signedPubKey.length != 0 ? signedPubKey[signedPubKey.length - 1].getPublicKey() : getLMSPublicKey()).generateOtsContext(hSSSignature.getSignature()).withSignedPublicKeys(signedPubKey);
        } catch (IOException e) {
            throw new IllegalStateException(m.f(e, new StringBuilder("cannot parse signature: ")));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f228816l).bytes(this.lmsPublicKey.getEncoded()).build();
    }

    public int getL() {
        return this.f228816l;
    }

    public LMSPublicKeyParameters getLMSPublicKey() {
        return this.lmsPublicKey;
    }

    public int hashCode() {
        return this.lmsPublicKey.hashCode() + (this.f228816l * 31);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier
    public boolean verify(LMSContext lMSContext) {
        LMSSignedPubKey[] signedPubKeys = lMSContext.getSignedPubKeys();
        boolean zVerifySignature = true;
        if (signedPubKeys.length != getL() - 1) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKey = getLMSPublicKey();
        for (int i = 0; i < signedPubKeys.length; i++) {
            zVerifySignature &= LMS.verifySignature(lMSPublicKey, signedPubKeys[i].getSignature(), signedPubKeys[i].getPublicKey().toByteArray());
            lMSPublicKey = signedPubKeys[i].getPublicKey();
        }
        return lMSPublicKey.verify(lMSContext) & zVerifySignature;
    }
}
