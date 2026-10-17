package org.bouncycastle.math.ec.rfc8032;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.base.Ascii;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.youTransactor.uCube.rpc.Constants;
import java.security.SecureRandom;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Integers;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Ed448 {
    private static final int COORD_INTS = 14;
    private static final int C_d = 39081;
    private static final int POINT_BYTES = 57;
    private static final int PRECOMP_BLOCKS = 5;
    private static final int PRECOMP_MASK = 15;
    private static final int PRECOMP_POINTS = 16;
    private static final int PRECOMP_RANGE = 450;
    private static final int PRECOMP_SPACING = 18;
    private static final int PRECOMP_TEETH = 5;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    private static final int SCALAR_BYTES = 57;
    private static final int SCALAR_INTS = 14;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final int WNAF_WIDTH_225 = 5;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM4_PREFIX = {83, 105, 103, 69, ISOFileInfo.FMD_BYTE, ISO7816.INS_DECREASE_STAMPED, ISO7816.INS_DECREASE_STAMPED, 56};
    private static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] B_x = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] B_y = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final int[] B225_x = {110141154, 30892124, 160820362, 264558960, 217232225, 47722141, 19029845, 8326902, 183409749, 170134547, 90340180, 222600478, 61097333, 7431335, 198491505, 102372861};
    private static final int[] B225_y = {221945828, 50763449, 132637478, 109250759, 216053960, 61612587, 50649998, 138339097, 98949899, 248139835, 186410297, 126520782, 47339196, 78164062, 198835543, 169622712};
    private static final Object PRECOMP_LOCK = new Object();
    private static PointAffine[] PRECOMP_BASE_WNAF = null;
    private static PointAffine[] PRECOMP_BASE225_WNAF = null;
    private static int[] PRECOMP_BASE_COMB = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static class F extends X448Field {
        private F() {
        }
    }

    public static class PointAffine {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int[] f228728x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int[] f228729y;

        private PointAffine() {
            this.f228728x = X448Field.create();
            this.f228729y = X448Field.create();
        }
    }

    public static class PointProjective {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int[] f228730x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int[] f228731y;
        int[] z;

        private PointProjective() {
            this.f228730x = X448Field.create();
            this.f228731y = X448Field.create();
            this.z = X448Field.create();
        }
    }

    public static class PointTemp {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int[] f228732r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        int[] f228733r1;
        int[] r2;
        int[] r3;
        int[] r4;

        /* JADX INFO: renamed from: r5, reason: collision with root package name */
        int[] f228734r5;

        /* JADX INFO: renamed from: r6, reason: collision with root package name */
        int[] f228735r6;

        /* JADX INFO: renamed from: r7, reason: collision with root package name */
        int[] f228736r7;

        private PointTemp() {
            this.f228732r0 = X448Field.create();
            this.f228733r1 = X448Field.create();
            this.r2 = X448Field.create();
            this.r3 = X448Field.create();
            this.r4 = X448Field.create();
            this.f228734r5 = X448Field.create();
            this.f228735r6 = X448Field.create();
            this.f228736r7 = X448Field.create();
        }
    }

    public static final class PublicPoint {
        final int[] data;

        public PublicPoint(int[] iArr) {
            this.data = iArr;
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        Scalar448.decode(bArr, iArr);
        int[] iArr2 = new int[14];
        Scalar448.decode(bArr2, iArr2);
        int[] iArr3 = new int[14];
        Scalar448.decode(bArr3, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        Codec.encode32(iArr, 0, 28, bArr4, 0);
        return Scalar448.reduce912(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(PointAffine pointAffine) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        X448Field.sqr(pointAffine.f228728x, iArrCreate2);
        X448Field.sqr(pointAffine.f228729y, iArrCreate3);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate, C_d, iArrCreate);
        X448Field.subOne(iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.normalize(iArrCreate3);
        return X448Field.isZero(iArrCreate) & (~X448Field.isZero(iArrCreate3));
    }

    private static boolean checkPointFullVar(byte[] bArr) {
        if ((bArr[56] & Ascii.DEL) != 0) {
            return false;
        }
        int iDecode32 = Codec.decode32(bArr, 52);
        int i = P[13] ^ iDecode32;
        for (int i2 = 12; i2 > 0; i2--) {
            int iDecode322 = Codec.decode32(bArr, i2 * 4);
            if (i == 0 && Integers.compareUnsigned(iDecode322, P[i2]) > 0) {
                return false;
            }
            iDecode32 |= iDecode322;
            i |= iDecode322 ^ P[i2];
        }
        int iDecode323 = Codec.decode32(bArr, 0);
        if (iDecode32 != 0 || Integers.compareUnsigned(iDecode323, 1) > 0) {
            return i != 0 || Integers.compareUnsigned(iDecode323, P[0] - 1) < 0;
        }
        return false;
    }

    private static boolean checkPointOrderVar(PointAffine pointAffine) {
        PointProjective pointProjective = new PointProjective();
        scalarMultOrderVar(pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((bArr[56] & Ascii.DEL) != 0) {
            return false;
        }
        if (Codec.decode32(bArr, 52) != P[13]) {
            return true;
        }
        Codec.decode32(bArr, 0, new int[14], 0, 14);
        return !Nat.gte(14, r3, r2);
    }

    private static byte[] copy(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static Xof createPrehash() {
        return createXof();
    }

    private static Xof createXof() {
        return new SHAKEDigest(256);
    }

    private static boolean decodePointVar(byte[] bArr, boolean z, PointAffine pointAffine) {
        int i = (bArr[56] & 128) >>> 7;
        X448Field.decode448(bArr, pointAffine.f228729y);
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        X448Field.sqr(pointAffine.f228729y, iArrCreate);
        X448Field.mul(iArrCreate, C_d, iArrCreate2);
        X448Field.negate(iArrCreate, iArrCreate);
        X448Field.addOne(iArrCreate);
        X448Field.addOne(iArrCreate2);
        if (!X448Field.sqrtRatioVar(iArrCreate, iArrCreate2, pointAffine.f228728x)) {
            return false;
        }
        X448Field.normalize(pointAffine.f228728x);
        if (i == 1 && X448Field.isZeroVar(pointAffine.f228728x)) {
            return false;
        }
        int[] iArr = pointAffine.f228728x;
        if (z ^ (i != (iArr[0] & 1))) {
            X448Field.negate(iArr, iArr);
            X448Field.normalize(pointAffine.f228728x);
        }
        return true;
    }

    private static void dom4(Xof xof2, byte b4, byte[] bArr) {
        byte[] bArr2 = DOM4_PREFIX;
        int length = bArr2.length;
        int i = length + 2;
        int length2 = bArr.length + i;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b4;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i, bArr.length);
        xof2.update(bArr3, 0, length2);
    }

    private static void encodePoint(PointAffine pointAffine, byte[] bArr, int i) {
        X448Field.encode(pointAffine.f228729y, bArr, i);
        bArr[i + 56] = (byte) ((pointAffine.f228728x[0] & 1) << 7);
    }

    public static void encodePublicPoint(PublicPoint publicPoint, byte[] bArr, int i) {
        X448Field.encode(publicPoint.data, 16, bArr, i);
        bArr[i + 56] = (byte) ((publicPoint.data[0] & 1) << 7);
    }

    private static int encodeResult(PointProjective pointProjective, byte[] bArr, int i) {
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointProjective, pointAffine);
        int iCheckPoint = checkPoint(pointAffine);
        encodePoint(pointAffine, bArr, i);
        return iCheckPoint;
    }

    private static PublicPoint exportPoint(PointAffine pointAffine) {
        int[] iArr = new int[32];
        X448Field.copy(pointAffine.f228728x, 0, iArr, 0);
        X448Field.copy(pointAffine.f228729y, 0, iArr, 16);
        return new PublicPoint(iArr);
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length != 57) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
    }

    public static PublicPoint generatePublicKey(byte[] bArr, int i) {
        Xof xofCreateXof = createXof();
        byte[] bArr2 = new byte[114];
        xofCreateXof.update(bArr, i, 57);
        xofCreateXof.doFinal(bArr2, 0, 114);
        byte[] bArr3 = new byte[57];
        pruneScalar(bArr2, 0, bArr3);
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr3, pointProjective);
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointProjective, pointAffine);
        if (checkPoint(pointAffine) != 0) {
            return exportPoint(pointAffine);
        }
        throw new IllegalStateException();
    }

    private static int getWindow4(int[] iArr, int i) {
        return (iArr[i >>> 3] >>> ((i & 7) << 2)) & 15;
    }

    private static void implSign(Xof xof2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b4, byte[] bArr5, int i2, int i3, byte[] bArr6, int i5) {
        dom4(xof2, b4, bArr4);
        xof2.update(bArr, 57, 57);
        xof2.update(bArr5, i2, i3);
        xof2.doFinal(bArr, 0, bArr.length);
        byte[] bArrReduce912 = Scalar448.reduce912(bArr);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArrReduce912, bArr7, 0);
        dom4(xof2, b4, bArr4);
        xof2.update(bArr7, 0, 57);
        xof2.update(bArr3, i, 57);
        xof2.update(bArr5, i2, i3);
        xof2.doFinal(bArr, 0, bArr.length);
        byte[] bArrCalculateS = calculateS(bArrReduce912, Scalar448.reduce912(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i5, 57);
        System.arraycopy(bArrCalculateS, 0, bArr6, i5 + 57, 57);
    }

    private static boolean implVerify(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, byte b4, byte[] bArr3, int i2, int i3) {
        if (!checkContextVar(bArr2)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrCopy = copy(bArr, i, 57);
        byte[] bArrCopy2 = copy(bArr, i + 57, 57);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!Scalar448.checkVar(bArrCopy2, iArr)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        X448Field.negate(publicPoint.data, pointAffine2.f228728x);
        X448Field.copy(publicPoint.data, 16, pointAffine2.f228729y, 0);
        byte[] bArr4 = new byte[57];
        encodePublicPoint(publicPoint, bArr4, 0);
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(xofCreateXof, b4, bArr2);
        xofCreateXof.update(bArrCopy, 0, 57);
        xofCreateXof.update(bArr4, 0, 57);
        xofCreateXof.update(bArr3, i2, i3);
        xofCreateXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        Scalar448.decode(Scalar448.reduce912(bArr5), iArr2);
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        if (!Scalar448.reduceBasisVar(iArr2, iArr3, iArr4)) {
            throw new IllegalStateException();
        }
        Scalar448.multiply225Var(iArr, iArr4, iArr);
        PointProjective pointProjective = new PointProjective();
        scalarMultStraus225Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }

    private static void invertZs(PointProjective[] pointProjectiveArr) {
        int length = pointProjectiveArr.length;
        int[] iArrCreateTable = X448Field.createTable(length);
        int[] iArrCreate = X448Field.create();
        X448Field.copy(pointProjectiveArr[0].z, 0, iArrCreate, 0);
        X448Field.copy(iArrCreate, 0, iArrCreateTable, 0);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= length) {
                break;
            }
            X448Field.mul(iArrCreate, pointProjectiveArr[i2].z, iArrCreate);
            X448Field.copy(iArrCreate, 0, iArrCreateTable, i2 * 16);
            i = i2;
        }
        X448Field.invVar(iArrCreate, iArrCreate);
        int[] iArrCreate2 = X448Field.create();
        while (i > 0) {
            int i3 = i - 1;
            X448Field.copy(iArrCreateTable, i3 * 16, iArrCreate2, 0);
            X448Field.mul(iArrCreate2, iArrCreate, iArrCreate2);
            X448Field.mul(iArrCreate, pointProjectiveArr[i].z, iArrCreate);
            X448Field.copy(iArrCreate2, 0, pointProjectiveArr[i].z, 0);
            i = i3;
        }
        X448Field.copy(iArrCreate, 0, pointProjectiveArr[0].z, 0);
    }

    private static void normalizeToAffine(PointProjective pointProjective, PointAffine pointAffine) {
        X448Field.inv(pointProjective.z, pointAffine.f228729y);
        X448Field.mul(pointAffine.f228729y, pointProjective.f228730x, pointAffine.f228728x);
        int[] iArr = pointAffine.f228729y;
        X448Field.mul(iArr, pointProjective.f228731y, iArr);
        X448Field.normalize(pointAffine.f228728x);
        X448Field.normalize(pointAffine.f228729y);
    }

    private static boolean normalizeToNeutralElementVar(PointProjective pointProjective) {
        X448Field.normalize(pointProjective.f228730x);
        X448Field.normalize(pointProjective.f228731y);
        X448Field.normalize(pointProjective.z);
        return X448Field.isZeroVar(pointProjective.f228730x) && !X448Field.isZeroVar(pointProjective.f228731y) && X448Field.areEqualVar(pointProjective.f228731y, pointProjective.z);
    }

    private static void pointAdd(PointAffine pointAffine, PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr = pointTemp.f228733r1;
        int[] iArr2 = pointTemp.r2;
        int[] iArr3 = pointTemp.r3;
        int[] iArr4 = pointTemp.r4;
        int[] iArr5 = pointTemp.f228734r5;
        int[] iArr6 = pointTemp.f228735r6;
        int[] iArr7 = pointTemp.f228736r7;
        X448Field.sqr(pointProjective.z, iArr);
        X448Field.mul(pointAffine.f228728x, pointProjective.f228730x, iArr2);
        X448Field.mul(pointAffine.f228729y, pointProjective.f228731y, iArr3);
        X448Field.mul(iArr2, iArr3, iArr4);
        X448Field.mul(iArr4, C_d, iArr4);
        X448Field.add(iArr, iArr4, iArr5);
        X448Field.sub(iArr, iArr4, iArr6);
        X448Field.add(pointAffine.f228729y, pointAffine.f228728x, iArr7);
        X448Field.add(pointProjective.f228731y, pointProjective.f228730x, iArr4);
        X448Field.mul(iArr7, iArr4, iArr7);
        X448Field.add(iArr3, iArr2, iArr);
        X448Field.sub(iArr3, iArr2, iArr4);
        X448Field.carry(iArr);
        X448Field.sub(iArr7, iArr, iArr7);
        X448Field.mul(iArr7, pointProjective.z, iArr7);
        X448Field.mul(iArr4, pointProjective.z, iArr4);
        X448Field.mul(iArr5, iArr7, pointProjective.f228730x);
        X448Field.mul(iArr4, iArr6, pointProjective.f228731y);
        X448Field.mul(iArr5, iArr6, pointProjective.z);
    }

    private static void pointAddVar(boolean z, PointAffine pointAffine, PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = pointTemp.f228733r1;
        int[] iArr6 = pointTemp.r2;
        int[] iArr7 = pointTemp.r3;
        int[] iArr8 = pointTemp.r4;
        int[] iArr9 = pointTemp.f228734r5;
        int[] iArr10 = pointTemp.f228735r6;
        int[] iArr11 = pointTemp.f228736r7;
        if (z) {
            X448Field.sub(pointAffine.f228729y, pointAffine.f228728x, iArr11);
            iArr2 = iArr5;
            iArr = iArr8;
            iArr4 = iArr9;
            iArr3 = iArr10;
        } else {
            X448Field.add(pointAffine.f228729y, pointAffine.f228728x, iArr11);
            iArr = iArr5;
            iArr2 = iArr8;
            iArr3 = iArr9;
            iArr4 = iArr10;
        }
        X448Field.sqr(pointProjective.z, iArr5);
        X448Field.mul(pointAffine.f228728x, pointProjective.f228730x, iArr6);
        X448Field.mul(pointAffine.f228729y, pointProjective.f228731y, iArr7);
        X448Field.mul(iArr6, iArr7, iArr8);
        X448Field.mul(iArr8, C_d, iArr8);
        X448Field.add(iArr5, iArr8, iArr3);
        X448Field.sub(iArr5, iArr8, iArr4);
        X448Field.add(pointProjective.f228731y, pointProjective.f228730x, iArr8);
        X448Field.mul(iArr11, iArr8, iArr11);
        X448Field.add(iArr7, iArr6, iArr);
        X448Field.sub(iArr7, iArr6, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(iArr11, iArr5, iArr11);
        X448Field.mul(iArr11, pointProjective.z, iArr11);
        X448Field.mul(iArr8, pointProjective.z, iArr8);
        X448Field.mul(iArr9, iArr11, pointProjective.f228730x);
        X448Field.mul(iArr8, iArr10, pointProjective.f228731y);
        X448Field.mul(iArr9, iArr10, pointProjective.z);
    }

    private static void pointCopy(PointAffine pointAffine, PointProjective pointProjective) {
        X448Field.copy(pointAffine.f228728x, 0, pointProjective.f228730x, 0);
        X448Field.copy(pointAffine.f228729y, 0, pointProjective.f228731y, 0);
        X448Field.one(pointProjective.z);
    }

    private static void pointDouble(PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr = pointTemp.f228733r1;
        int[] iArr2 = pointTemp.r2;
        int[] iArr3 = pointTemp.r3;
        int[] iArr4 = pointTemp.r4;
        int[] iArr5 = pointTemp.f228736r7;
        int[] iArr6 = pointTemp.f228732r0;
        X448Field.add(pointProjective.f228730x, pointProjective.f228731y, iArr);
        X448Field.sqr(iArr, iArr);
        X448Field.sqr(pointProjective.f228730x, iArr2);
        X448Field.sqr(pointProjective.f228731y, iArr3);
        X448Field.add(iArr2, iArr3, iArr4);
        X448Field.carry(iArr4);
        X448Field.sqr(pointProjective.z, iArr5);
        X448Field.add(iArr5, iArr5, iArr5);
        X448Field.carry(iArr5);
        X448Field.sub(iArr4, iArr5, iArr6);
        X448Field.sub(iArr, iArr4, iArr);
        X448Field.sub(iArr2, iArr3, iArr2);
        X448Field.mul(iArr, iArr6, pointProjective.f228730x);
        X448Field.mul(iArr4, iArr2, pointProjective.f228731y);
        X448Field.mul(iArr4, iArr6, pointProjective.z);
    }

    private static void pointLookup(int i, int i2, PointAffine pointAffine) {
        int i3 = i * 512;
        for (int i5 = 0; i5 < 16; i5++) {
            int i6 = ((i5 ^ i2) - 1) >> 31;
            X448Field.cmov(i6, PRECOMP_BASE_COMB, i3, pointAffine.f228728x, 0);
            X448Field.cmov(i6, PRECOMP_BASE_COMB, i3 + 16, pointAffine.f228729y, 0);
            i3 += 32;
        }
    }

    private static void pointLookup15(int[] iArr, PointProjective pointProjective) {
        X448Field.copy(iArr, 336, pointProjective.f228730x, 0);
        X448Field.copy(iArr, 352, pointProjective.f228731y, 0);
        X448Field.copy(iArr, 368, pointProjective.z, 0);
    }

    private static void pointPrecompute(PointAffine pointAffine, PointProjective[] pointProjectiveArr, int i, int i2, PointTemp pointTemp) {
        PointProjective pointProjective = new PointProjective();
        pointCopy(pointAffine, pointProjective);
        pointDouble(pointProjective, pointTemp);
        PointProjective pointProjective2 = new PointProjective();
        pointProjectiveArr[i] = pointProjective2;
        pointCopy(pointAffine, pointProjective2);
        for (int i3 = 1; i3 < i2; i3++) {
            int i5 = i + i3;
            PointProjective pointProjective3 = new PointProjective();
            pointProjectiveArr[i5] = pointProjective3;
            pointCopy(pointProjectiveArr[i5 - 1], pointProjective3);
            pointAdd(pointProjective, pointProjectiveArr[i5], pointTemp);
        }
    }

    private static void pointSetNeutral(PointProjective pointProjective) {
        X448Field.zero(pointProjective.f228730x);
        X448Field.one(pointProjective.f228731y);
        X448Field.one(pointProjective.z);
    }

    public static void precompute() {
        int i;
        synchronized (PRECOMP_LOCK) {
            try {
                if (PRECOMP_BASE_COMB == null) {
                    PointProjective[] pointProjectiveArr = new PointProjective[SyslogConstants.LOG_LOCAL2];
                    PointTemp pointTemp = new PointTemp();
                    PointAffine pointAffine = new PointAffine();
                    X448Field.copy(B_x, 0, pointAffine.f228728x, 0);
                    X448Field.copy(B_y, 0, pointAffine.f228729y, 0);
                    pointPrecompute(pointAffine, pointProjectiveArr, 0, 32, pointTemp);
                    PointAffine pointAffine2 = new PointAffine();
                    X448Field.copy(B225_x, 0, pointAffine2.f228728x, 0);
                    X448Field.copy(B225_y, 0, pointAffine2.f228729y, 0);
                    pointPrecompute(pointAffine2, pointProjectiveArr, 32, 32, pointTemp);
                    PointProjective pointProjective = new PointProjective();
                    pointCopy(pointAffine, pointProjective);
                    int i2 = 5;
                    PointProjective[] pointProjectiveArr2 = new PointProjective[5];
                    for (int i3 = 0; i3 < 5; i3++) {
                        pointProjectiveArr2[i3] = new PointProjective();
                    }
                    int i5 = 0;
                    int i6 = 64;
                    while (i5 < i2) {
                        PointProjective pointProjective2 = new PointProjective();
                        int i21 = 0;
                        while (true) {
                            i = 1;
                            if (i21 >= i2) {
                                break;
                            }
                            if (i21 == 0) {
                                pointCopy(pointProjective, pointProjective2);
                            } else {
                                pointAdd(pointProjective, pointProjective2, pointTemp);
                            }
                            pointDouble(pointProjective, pointTemp);
                            pointCopy(pointProjective, pointProjectiveArr2[i21]);
                            if (i5 + i21 != 8) {
                                while (i < 18) {
                                    pointDouble(pointProjective, pointTemp);
                                    i++;
                                }
                            }
                            i21++;
                            i2 = 5;
                        }
                        int[] iArr = pointProjective2.f228730x;
                        X448Field.negate(iArr, iArr);
                        pointProjectiveArr[i6] = pointProjective2;
                        i6++;
                        int i22 = 0;
                        while (i22 < 4) {
                            int i32 = i << i22;
                            int i33 = 0;
                            while (i33 < i32) {
                                PointProjective pointProjective3 = new PointProjective();
                                pointProjectiveArr[i6] = pointProjective3;
                                pointCopy(pointProjectiveArr[i6 - i32], pointProjective3);
                                pointAdd(pointProjectiveArr2[i22], pointProjectiveArr[i6], pointTemp);
                                i33++;
                                i6++;
                            }
                            i22++;
                            i = 1;
                        }
                        i5++;
                        i2 = 5;
                    }
                    invertZs(pointProjectiveArr);
                    PRECOMP_BASE_WNAF = new PointAffine[32];
                    for (int i43 = 0; i43 < 32; i43++) {
                        PointProjective pointProjective4 = pointProjectiveArr[i43];
                        PointAffine pointAffine3 = new PointAffine();
                        X448Field.mul(pointProjective4.f228730x, pointProjective4.z, pointAffine3.f228728x);
                        X448Field.normalize(pointAffine3.f228728x);
                        X448Field.mul(pointProjective4.f228731y, pointProjective4.z, pointAffine3.f228729y);
                        X448Field.normalize(pointAffine3.f228729y);
                        PRECOMP_BASE_WNAF[i43] = pointAffine3;
                    }
                    PRECOMP_BASE225_WNAF = new PointAffine[32];
                    for (int i59 = 0; i59 < 32; i59++) {
                        PointProjective pointProjective5 = pointProjectiveArr[32 + i59];
                        PointAffine pointAffine4 = new PointAffine();
                        X448Field.mul(pointProjective5.f228730x, pointProjective5.z, pointAffine4.f228728x);
                        X448Field.normalize(pointAffine4.f228728x);
                        X448Field.mul(pointProjective5.f228731y, pointProjective5.z, pointAffine4.f228729y);
                        X448Field.normalize(pointAffine4.f228729y);
                        PRECOMP_BASE225_WNAF[i59] = pointAffine4;
                    }
                    PRECOMP_BASE_COMB = X448Field.createTable(160);
                    int i66 = 0;
                    for (int i74 = 64; i74 < 144; i74++) {
                        PointProjective pointProjective6 = pointProjectiveArr[i74];
                        int[] iArr2 = pointProjective6.f228730x;
                        X448Field.mul(iArr2, pointProjective6.z, iArr2);
                        X448Field.normalize(pointProjective6.f228730x);
                        int[] iArr3 = pointProjective6.f228731y;
                        X448Field.mul(iArr3, pointProjective6.z, iArr3);
                        X448Field.normalize(pointProjective6.f228731y);
                        X448Field.copy(pointProjective6.f228730x, 0, PRECOMP_BASE_COMB, i66);
                        X448Field.copy(pointProjective6.f228731y, 0, PRECOMP_BASE_COMB, i66 + 16);
                        i66 += 32;
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static void scalarMult(byte[] bArr, PointProjective pointProjective, PointProjective pointProjective2) {
        int[] iArr = new int[15];
        Scalar448.decode(bArr, iArr);
        Scalar448.toSignedDigits(449, iArr, iArr);
        PointProjective pointProjective3 = new PointProjective();
        PointTemp pointTemp = new PointTemp();
        int[] iArrPointPrecompute = pointPrecompute(pointProjective, 8, pointTemp);
        pointLookup15(iArrPointPrecompute, pointProjective2);
        pointAdd(pointProjective, pointProjective2, pointTemp);
        int i = LDSFile.EF_DG15_TAG;
        while (true) {
            pointLookup(iArr, i, iArrPointPrecompute, pointProjective3);
            pointAdd(pointProjective3, pointProjective2, pointTemp);
            i--;
            if (i < 0) {
                return;
            }
            for (int i2 = 0; i2 < 4; i2++) {
                pointDouble(pointProjective2, pointTemp);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointProjective pointProjective) {
        precompute();
        int[] iArr = new int[15];
        Scalar448.decode(bArr, iArr);
        Scalar448.toSignedDigits(PRECOMP_RANGE, iArr, iArr);
        PointAffine pointAffine = new PointAffine();
        PointTemp pointTemp = new PointTemp();
        pointSetNeutral(pointProjective);
        int i = 17;
        while (true) {
            int i2 = i;
            for (int i3 = 0; i3 < 5; i3++) {
                int i5 = 0;
                for (int i6 = 0; i6 < 5; i6++) {
                    i5 = (i5 & (~(1 << i6))) ^ ((iArr[i2 >>> 5] >>> (i2 & 31)) << i6);
                    i2 += 18;
                }
                int i21 = (i5 >>> 4) & 1;
                pointLookup(i3, ((-i21) ^ i5) & 15, pointAffine);
                X448Field.cnegate(i21, pointAffine.f228728x);
                pointAdd(pointAffine, pointProjective, pointTemp);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointProjective, pointTemp);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i) {
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr, pointProjective);
        if (encodeResult(pointProjective, bArr2, i) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        pruneScalar(bArr, i, bArr2);
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr2, pointProjective);
        if (checkPoint(pointProjective) == 0) {
            throw new IllegalStateException();
        }
        X448Field.copy(pointProjective.f228730x, 0, iArr, 0);
        X448Field.copy(pointProjective.f228731y, 0, iArr2, 0);
    }

    private static void scalarMultOrderVar(PointAffine pointAffine, PointProjective pointProjective) {
        byte[] bArr = new byte[OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG];
        Scalar448.getOrderWnafVar(5, bArr);
        PointProjective[] pointProjectiveArr = new PointProjective[8];
        PointTemp pointTemp = new PointTemp();
        pointPrecompute(pointAffine, pointProjectiveArr, 0, 8, pointTemp);
        pointSetNeutral(pointProjective);
        int i = OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED;
        while (true) {
            byte b4 = bArr[i];
            if (b4 != 0) {
                pointAddVar(b4 < 0, pointProjectiveArr[(b4 >> 1) ^ (b4 >> Ascii.US)], pointProjective, pointTemp);
            }
            i--;
            if (i < 0) {
                return;
            } else {
                pointDouble(pointProjective, pointTemp);
            }
        }
    }

    private static void scalarMultStraus225Var(int[] iArr, int[] iArr2, PointAffine pointAffine, int[] iArr3, PointAffine pointAffine2, PointProjective pointProjective) {
        int i;
        precompute();
        byte[] bArr = new byte[PRECOMP_RANGE];
        int i2 = Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE;
        byte[] bArr2 = new byte[Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE];
        byte[] bArr3 = new byte[Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE];
        Wnaf.getSignedVar(iArr, 7, bArr);
        Wnaf.getSignedVar(iArr2, 5, bArr2);
        Wnaf.getSignedVar(iArr3, 5, bArr3);
        PointProjective[] pointProjectiveArr = new PointProjective[8];
        PointProjective[] pointProjectiveArr2 = new PointProjective[8];
        PointTemp pointTemp = new PointTemp();
        pointPrecompute(pointAffine, pointProjectiveArr, 0, 8, pointTemp);
        pointPrecompute(pointAffine2, pointProjectiveArr2, 0, 8, pointTemp);
        pointSetNeutral(pointProjective);
        while (true) {
            i = i2 - 1;
            if (i < 0 || (bArr[i] | bArr[i2 + BERTags.FLAGS] | bArr2[i] | bArr3[i]) != 0) {
                break;
            } else {
                i2 = i;
            }
        }
        while (i >= 0) {
            byte b4 = bArr[i];
            if (b4 != 0) {
                pointAddVar(b4 < 0, PRECOMP_BASE_WNAF[(b4 >> 1) ^ (b4 >> Ascii.US)], pointProjective, pointTemp);
            }
            byte b5 = bArr[i + Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE];
            if (b5 != 0) {
                pointAddVar(b5 < 0, PRECOMP_BASE225_WNAF[(b5 >> 1) ^ (b5 >> Ascii.US)], pointProjective, pointTemp);
            }
            byte b7 = bArr2[i];
            if (b7 != 0) {
                pointAddVar(b7 < 0, pointProjectiveArr[(b7 >> 1) ^ (b7 >> Ascii.US)], pointProjective, pointTemp);
            }
            byte b13 = bArr3[i];
            if (b13 != 0) {
                pointAddVar(b13 < 0, pointProjectiveArr2[(b13 >> 1) ^ (b13 >> Ascii.US)], pointProjective, pointTemp);
            }
            pointDouble(pointProjective, pointTemp);
            i--;
        }
        pointDouble(pointProjective, pointTemp);
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i5, byte[] bArr5, int i6) {
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i5, bArr5, i6);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, Xof xof2, byte[] bArr4, int i3) {
        byte[] bArr5 = new byte[64];
        if (64 != xof2.doFinal(bArr5, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i3);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i) {
        byte[] bArrCopy = copy(bArr, i, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine)) {
            return checkPointOrderVar(pointAffine);
        }
        return false;
    }

    public static PublicPoint validatePublicKeyFullExport(byte[] bArr, int i) {
        byte[] bArrCopy = copy(bArr, i, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return null;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine) && checkPointOrderVar(pointAffine)) {
            return exportPoint(pointAffine);
        }
        return null;
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i) {
        byte[] bArrCopy = copy(bArr, i, 57);
        if (checkPointFullVar(bArrCopy)) {
            return decodePointVar(bArrCopy, false, new PointAffine());
        }
        return false;
    }

    public static PublicPoint validatePublicKeyPartialExport(byte[] bArr, int i) {
        byte[] bArrCopy = copy(bArr, i, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return null;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine)) {
            return exportPoint(pointAffine);
        }
        return null;
    }

    public static boolean verify(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i2, int i3) {
        return implVerify(bArr, i, publicPoint, bArr2, (byte) 0, bArr3, i2, i3);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, Xof xof2) {
        byte[] bArr3 = new byte[64];
        if (64 == xof2.doFinal(bArr3, 0, 64)) {
            return implVerify(bArr, i, publicPoint, bArr2, (byte) 1, bArr3, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    private static int checkPoint(PointProjective pointProjective) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        X448Field.sqr(pointProjective.f228730x, iArrCreate2);
        X448Field.sqr(pointProjective.f228731y, iArrCreate3);
        X448Field.sqr(pointProjective.z, iArrCreate4);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate2, iArrCreate4, iArrCreate2);
        X448Field.sqr(iArrCreate4, iArrCreate4);
        X448Field.mul(iArrCreate, C_d, iArrCreate);
        X448Field.sub(iArrCreate, iArrCreate4, iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.normalize(iArrCreate3);
        X448Field.normalize(iArrCreate4);
        return X448Field.isZero(iArrCreate) & (~X448Field.isZero(iArrCreate3)) & (~X448Field.isZero(iArrCreate4));
    }

    public static void generatePublicKey(byte[] bArr, int i, byte[] bArr2, int i2) {
        Xof xofCreateXof = createXof();
        byte[] bArr3 = new byte[114];
        xofCreateXof.update(bArr, i, 57);
        xofCreateXof.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i2);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, byte b4, byte[] bArr3, int i2, int i3, byte[] bArr4, int i5) {
        if (!checkContextVar(bArr2)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        xofCreateXof.update(bArr, i, 57);
        xofCreateXof.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(xofCreateXof, bArr5, bArr6, bArr7, 0, bArr2, b4, bArr3, i2, i3, bArr4, i5);
    }

    private static boolean implVerify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b4, byte[] bArr4, int i3, int i5) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrCopy = copy(bArr, i, 57);
        byte[] bArrCopy2 = copy(bArr, i + 57, 57);
        byte[] bArrCopy3 = copy(bArr2, i2, 57);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!Scalar448.checkVar(bArrCopy2, iArr) || !checkPointFullVar(bArrCopy3)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        if (!decodePointVar(bArrCopy3, true, pointAffine2)) {
            return false;
        }
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(xofCreateXof, b4, bArr3);
        xofCreateXof.update(bArrCopy, 0, 57);
        xofCreateXof.update(bArrCopy3, 0, 57);
        xofCreateXof.update(bArr4, i3, i5);
        xofCreateXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        Scalar448.decode(Scalar448.reduce912(bArr5), iArr2);
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        if (!Scalar448.reduceBasisVar(iArr2, iArr3, iArr4)) {
            throw new IllegalStateException();
        }
        Scalar448.multiply225Var(iArr, iArr4, iArr);
        PointProjective pointProjective = new PointProjective();
        scalarMultStraus225Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }

    private static void pointAdd(PointProjective pointProjective, PointProjective pointProjective2, PointTemp pointTemp) {
        int[] iArr = pointTemp.f228732r0;
        int[] iArr2 = pointTemp.f228733r1;
        int[] iArr3 = pointTemp.r2;
        int[] iArr4 = pointTemp.r3;
        int[] iArr5 = pointTemp.r4;
        int[] iArr6 = pointTemp.f228734r5;
        int[] iArr7 = pointTemp.f228735r6;
        int[] iArr8 = pointTemp.f228736r7;
        X448Field.mul(pointProjective.z, pointProjective2.z, iArr);
        X448Field.sqr(iArr, iArr2);
        X448Field.mul(pointProjective.f228730x, pointProjective2.f228730x, iArr3);
        X448Field.mul(pointProjective.f228731y, pointProjective2.f228731y, iArr4);
        X448Field.mul(iArr3, iArr4, iArr5);
        X448Field.mul(iArr5, C_d, iArr5);
        X448Field.add(iArr2, iArr5, iArr6);
        X448Field.sub(iArr2, iArr5, iArr7);
        X448Field.add(pointProjective.f228731y, pointProjective.f228730x, iArr8);
        X448Field.add(pointProjective2.f228731y, pointProjective2.f228730x, iArr5);
        X448Field.mul(iArr8, iArr5, iArr8);
        X448Field.add(iArr4, iArr3, iArr2);
        X448Field.sub(iArr4, iArr3, iArr5);
        X448Field.carry(iArr2);
        X448Field.sub(iArr8, iArr2, iArr8);
        X448Field.mul(iArr8, iArr, iArr8);
        X448Field.mul(iArr5, iArr, iArr5);
        X448Field.mul(iArr6, iArr8, pointProjective2.f228730x);
        X448Field.mul(iArr5, iArr7, pointProjective2.f228731y);
        X448Field.mul(iArr6, iArr7, pointProjective2.z);
    }

    private static void pointAddVar(boolean z, PointProjective pointProjective, PointProjective pointProjective2, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = pointTemp.f228732r0;
        int[] iArr6 = pointTemp.f228733r1;
        int[] iArr7 = pointTemp.r2;
        int[] iArr8 = pointTemp.r3;
        int[] iArr9 = pointTemp.r4;
        int[] iArr10 = pointTemp.f228734r5;
        int[] iArr11 = pointTemp.f228735r6;
        int[] iArr12 = pointTemp.f228736r7;
        if (z) {
            X448Field.sub(pointProjective.f228731y, pointProjective.f228730x, iArr12);
            iArr2 = iArr6;
            iArr = iArr9;
            iArr4 = iArr10;
            iArr3 = iArr11;
        } else {
            X448Field.add(pointProjective.f228731y, pointProjective.f228730x, iArr12);
            iArr = iArr6;
            iArr2 = iArr9;
            iArr3 = iArr10;
            iArr4 = iArr11;
        }
        X448Field.mul(pointProjective.z, pointProjective2.z, iArr5);
        X448Field.sqr(iArr5, iArr6);
        X448Field.mul(pointProjective.f228730x, pointProjective2.f228730x, iArr7);
        X448Field.mul(pointProjective.f228731y, pointProjective2.f228731y, iArr8);
        X448Field.mul(iArr7, iArr8, iArr9);
        X448Field.mul(iArr9, C_d, iArr9);
        X448Field.add(iArr6, iArr9, iArr3);
        X448Field.sub(iArr6, iArr9, iArr4);
        X448Field.add(pointProjective2.f228731y, pointProjective2.f228730x, iArr9);
        X448Field.mul(iArr12, iArr9, iArr12);
        X448Field.add(iArr8, iArr7, iArr);
        X448Field.sub(iArr8, iArr7, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(iArr12, iArr6, iArr12);
        X448Field.mul(iArr12, iArr5, iArr12);
        X448Field.mul(iArr9, iArr5, iArr9);
        X448Field.mul(iArr10, iArr12, pointProjective2.f228730x);
        X448Field.mul(iArr9, iArr11, pointProjective2.f228731y);
        X448Field.mul(iArr10, iArr11, pointProjective2.z);
    }

    private static void pointCopy(PointProjective pointProjective, PointProjective pointProjective2) {
        X448Field.copy(pointProjective.f228730x, 0, pointProjective2.f228730x, 0);
        X448Field.copy(pointProjective.f228731y, 0, pointProjective2.f228731y, 0);
        X448Field.copy(pointProjective.z, 0, pointProjective2.z, 0);
    }

    private static void pointLookup(int[] iArr, int i, int[] iArr2, PointProjective pointProjective) {
        int window4 = getWindow4(iArr, i);
        int i2 = (window4 >>> 3) ^ 1;
        int i3 = (window4 ^ (-i2)) & 7;
        int i5 = 0;
        for (int i6 = 0; i6 < 8; i6++) {
            int i21 = ((i6 ^ i3) - 1) >> 31;
            X448Field.cmov(i21, iArr2, i5, pointProjective.f228730x, 0);
            X448Field.cmov(i21, iArr2, i5 + 16, pointProjective.f228731y, 0);
            X448Field.cmov(i21, iArr2, i5 + 32, pointProjective.z, 0);
            i5 += 48;
        }
        X448Field.cnegate(i2, pointProjective.f228730x);
    }

    private static int[] pointPrecompute(PointProjective pointProjective, int i, PointTemp pointTemp) {
        PointProjective pointProjective2 = new PointProjective();
        pointCopy(pointProjective, pointProjective2);
        PointProjective pointProjective3 = new PointProjective();
        pointCopy(pointProjective, pointProjective3);
        pointDouble(pointProjective3, pointTemp);
        int[] iArrCreateTable = X448Field.createTable(i * 3);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            X448Field.copy(pointProjective2.f228730x, 0, iArrCreateTable, i2);
            X448Field.copy(pointProjective2.f228731y, 0, iArrCreateTable, i2 + 16);
            X448Field.copy(pointProjective2.z, 0, iArrCreateTable, i2 + 32);
            i2 += 48;
            i3++;
            if (i3 == i) {
                return iArrCreateTable;
            }
            pointAdd(pointProjective3, pointProjective2, pointTemp);
        }
    }

    public static void sign(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i5) {
        implSign(bArr, i, bArr2, (byte) 0, bArr3, i2, i3, bArr4, i5);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i5) {
        implSign(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i5);
    }

    public static boolean verify(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i5) {
        return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i5);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i2) {
        return implVerify(bArr, i, publicPoint, bArr2, (byte) 1, bArr3, i2, 64);
    }

    private static void implSign(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b4, byte[] bArr4, int i3, int i5, byte[] bArr5, int i6) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof xofCreateXof = createXof();
        byte[] bArr6 = new byte[114];
        xofCreateXof.update(bArr, i, 57);
        xofCreateXof.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        pruneScalar(bArr6, 0, bArr7);
        implSign(xofCreateXof, bArr6, bArr7, bArr2, i2, bArr3, b4, bArr4, i3, i5, bArr5, i6);
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, Xof xof2, byte[] bArr3, int i2) {
        byte[] bArr4 = new byte[64];
        if (64 != xof2.doFinal(bArr4, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i2);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, Xof xof2) {
        byte[] bArr4 = new byte[64];
        if (64 == xof2.doFinal(bArr4, 0, 64)) {
            return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    public static void signPrehash(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4, int i3) {
        implSign(bArr, i, bArr2, (byte) 1, bArr3, i2, 64, bArr4, i3);
    }

    public static boolean verifyPrehash(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3) {
        return implVerify(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64);
    }
}
