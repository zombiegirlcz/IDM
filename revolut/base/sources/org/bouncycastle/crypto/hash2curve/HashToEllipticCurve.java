package org.bouncycastle.crypto.hash2curve;

import java.math.BigInteger;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.hash2curve.data.AffineXY;
import org.bouncycastle.crypto.hash2curve.impl.Elligator2MapToCurve;
import org.bouncycastle.crypto.hash2curve.impl.MontgomeryCurveProcessor;
import org.bouncycastle.crypto.hash2curve.impl.NistCurveProcessor;
import org.bouncycastle.crypto.hash2curve.impl.SimplifiedShallueVanDeWoestijneMapToCurve;
import org.bouncycastle.crypto.hash2curve.impl.XmdMessageExpansion;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.djb.Curve25519;
import org.bouncycastle.math.ec.custom.sec.SecP256R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP384R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Curve;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class HashToEllipticCurve {
    protected final CurveProcessor curveProcessor;
    protected final HashToField hashToField;
    protected final MapToCurve mapToCurve;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.hash2curve.HashToEllipticCurve$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$hash2curve$HashToCurveProfile;

        static {
            int[] iArr = new int[HashToCurveProfile.values().length];
            $SwitchMap$org$bouncycastle$crypto$hash2curve$HashToCurveProfile = iArr;
            try {
                iArr[HashToCurveProfile.P256_XMD_SHA_256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$hash2curve$HashToCurveProfile[HashToCurveProfile.P384_XMD_SHA_384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$hash2curve$HashToCurveProfile[HashToCurveProfile.P521_XMD_SHA_512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$hash2curve$HashToCurveProfile[HashToCurveProfile.CURVE25519W_XMD_SHA_512_ELL2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public HashToEllipticCurve(HashToField hashToField, MapToCurve mapToCurve, CurveProcessor curveProcessor) {
        this.curveProcessor = curveProcessor;
        this.hashToField = hashToField;
        this.mapToCurve = mapToCurve;
    }

    public static HashToEllipticCurve getInstance(HashToCurveProfile hashToCurveProfile, String str) {
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(str);
        int i = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$hash2curve$HashToCurveProfile[hashToCurveProfile.ordinal()];
        if (i == 1) {
            SecP256R1Curve secP256R1Curve = new SecP256R1Curve();
            return new HashToEllipticCurve(new HashToField(uTF8ByteArray, secP256R1Curve, new XmdMessageExpansion(new SHA256Digest(), hashToCurveProfile.getK()), hashToCurveProfile.getL()), new SimplifiedShallueVanDeWoestijneMapToCurve(secP256R1Curve, hashToCurveProfile.getZ()), new NistCurveProcessor());
        }
        if (i == 2) {
            SecP384R1Curve secP384R1Curve = new SecP384R1Curve();
            return new HashToEllipticCurve(new HashToField(uTF8ByteArray, secP384R1Curve, new XmdMessageExpansion(new SHA384Digest(), hashToCurveProfile.getK()), hashToCurveProfile.getL()), new SimplifiedShallueVanDeWoestijneMapToCurve(secP384R1Curve, hashToCurveProfile.getZ()), new NistCurveProcessor());
        }
        if (i == 3) {
            SecP521R1Curve secP521R1Curve = new SecP521R1Curve();
            return new HashToEllipticCurve(new HashToField(uTF8ByteArray, secP521R1Curve, new XmdMessageExpansion(new SHA512Digest(), hashToCurveProfile.getK()), hashToCurveProfile.getL()), new SimplifiedShallueVanDeWoestijneMapToCurve(secP521R1Curve, hashToCurveProfile.getZ()), new NistCurveProcessor());
        }
        if (i == 4) {
            Curve25519 curve25519 = new Curve25519();
            return new HashToEllipticCurve(new HashToField(uTF8ByteArray, curve25519, new XmdMessageExpansion(new SHA512Digest(), hashToCurveProfile.getK()), hashToCurveProfile.getL()), new Elligator2MapToCurve(curve25519, hashToCurveProfile.getZ(), BigInteger.valueOf(hashToCurveProfile.getmJ().intValue()), BigInteger.valueOf(hashToCurveProfile.getmK().intValue())), new MontgomeryCurveProcessor(curve25519, hashToCurveProfile.getmJ().intValue(), hashToCurveProfile.getmK().intValue(), hashToCurveProfile.getH()));
        }
        throw new IllegalArgumentException("Unsupported profile: " + hashToCurveProfile);
    }

    public ECPoint encodeToCurve(byte[] bArr) {
        return this.curveProcessor.clearCofactor(this.mapToCurve.process(this.hashToField.process(bArr, 1)[0][0]));
    }

    public AffineXY getAffineXY(ECPoint eCPoint) {
        return this.curveProcessor.mapToAffineXY(eCPoint);
    }

    public ECPoint hashToCurve(byte[] bArr) {
        BigInteger[][] bigIntegerArrProcess = this.hashToField.process(bArr, 2);
        return this.curveProcessor.clearCofactor(this.curveProcessor.add(this.mapToCurve.process(bigIntegerArrProcess[0][0]), this.mapToCurve.process(bigIntegerArrProcess[1][0])));
    }
}
