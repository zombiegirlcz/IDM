package org.bouncycastle.crypto.engines;

import android.R;
import com.google.common.base.Ascii;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import okl.m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class DESEngine extends DESBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private boolean forEncryption;
    private int[] workingKey = null;
    private static final short[] bytebit = {128, 64, 32, 16, 8, 4, 2, 1};
    private static final int[] bigbyte = {8388608, 4194304, PKIFailureInfo.badSenderNonce, PKIFailureInfo.badCertTemplate, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: pc1, reason: collision with root package name */
    private static final byte[] f228352pc1 = {56, ISO7816.INS_DECREASE, 40, 32, Ascii.CAN, 16, 8, 0, 57, Constants.INQUIRY, 41, Constants.NFC_READER, Ascii.EM, 17, 9, 1, 58, ISO7816.INS_INCREASE, ISO7816.INS_PSO, ISO7816.INS_MSE, Ascii.SUB, 18, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, 30, Ascii.SYN, 14, 6, 61, 53, 45, 37, 29, Ascii.NAK, 13, 5, 60, ISO7816.INS_DECREASE_STAMPED, ISO7816.INS_UNBLOCK_CHV, ISO7816.INS_CHANGE_CHV, 28, Ascii.DC4, 12, 4, Ascii.ESC, 19, 11, 3};
    private static final byte[] totrot = {1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, Ascii.NAK, Ascii.ETB, Ascii.EM, Ascii.ESC, 28};

    /* JADX INFO: renamed from: pc2, reason: collision with root package name */
    private static final byte[] f228353pc2 = {13, 16, 10, Ascii.ETB, 0, 4, 2, Ascii.ESC, 14, 5, Ascii.DC4, 9, Ascii.SYN, 18, 11, 3, Ascii.EM, 7, 15, 6, Ascii.SUB, 19, 12, 1, 40, 51, 30, ISO7816.INS_CHANGE_CHV, 46, 54, 29, 39, ISO7816.INS_INCREASE, ISO7816.INS_UNBLOCK_CHV, 32, 47, 43, ISO7816.INS_DECREASE, 38, 55, Constants.NFC_READER, ISO7816.INS_DECREASE_STAMPED, 45, 41, Constants.INQUIRY, 35, 28, Ascii.US};
    private static final int[] SP1 = {R.attr.transitionName, 0, 65536, R.attr.fillColor, R.attr.manageSpaceActivity, 66564, 4, 65536, 1024, R.attr.transitionName, R.attr.fillColor, 1024, 16778244, R.attr.manageSpaceActivity, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, R.attr.theme, R.attr.theme, 16778244, 65540, 16777220, 16777220, 65540, 0, 1028, 66564, 16777216, 65536, R.attr.fillColor, 4, R.attr.theme, R.attr.transitionName, 16777216, 16777216, 1024, R.attr.manageSpaceActivity, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, R.attr.fillColor, 65540, R.attr.theme, 16778244, 16777220, 1028, 66564, R.attr.transitionName, 1028, 16778240, 16778240, 0, 65540, 66560, 0, R.attr.manageSpaceActivity};
    private static final int[] SP2 = {-2146402272, -2147450880, 32768, 1081376, PKIFailureInfo.badCertTemplate, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, PKIFailureInfo.badCertTemplate, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, PKIFailureInfo.badCertTemplate, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, PKIFailureInfo.badCertTemplate, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344};
    private static final int[] SP3 = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};
    private static final int[] SP4 = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};
    private static final int[] SP5 = {256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080};
    private static final int[] SP6 = {536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, PKIFailureInfo.duplicateCertReq, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, PKIFailureInfo.duplicateCertReq, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, PKIFailureInfo.duplicateCertReq, 4194320, 536887312};
    private static final int[] SP7 = {PKIFailureInfo.badSenderNonce, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, PKIFailureInfo.badSenderNonce, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, PKIFailureInfo.badSenderNonce, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, PKIFailureInfo.badSenderNonce, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};
    private static final int[] SP8 = {268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696};

    public DESEngine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 56));
    }

    @Override // org.bouncycastle.crypto.engines.DESBase
    public void desFunc(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i + 4);
        int i3 = ((iBigEndianToInt >>> 4) ^ iBigEndianToInt2) & 252645135;
        int i5 = iBigEndianToInt2 ^ i3;
        int i6 = iBigEndianToInt ^ (i3 << 4);
        int i21 = ((i6 >>> 16) ^ i5) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        int i22 = i5 ^ i21;
        int i32 = i6 ^ (i21 << 16);
        int i33 = ((i22 >>> 2) ^ i32) & 858993459;
        int i43 = i32 ^ i33;
        int i59 = i22 ^ (i33 << 2);
        int i66 = ((i59 >>> 8) ^ i43) & 16711935;
        int i74 = i43 ^ i66;
        int i92 = i59 ^ (i66 << 8);
        int i96 = (i92 >>> 31) | (i92 << 1);
        int i99 = (i74 ^ i96) & (-1431655766);
        int i100 = i74 ^ i99;
        int i101 = i96 ^ i99;
        int i102 = (i100 >>> 31) | (i100 << 1);
        for (int i103 = 0; i103 < 8; i103++) {
            int i104 = i103 * 4;
            int i105 = ((i101 << 28) | (i101 >>> 4)) ^ iArr[i104];
            int[] iArr2 = SP7;
            int i106 = iArr2[i105 & 63];
            int[] iArr3 = SP5;
            int i107 = i106 | iArr3[(i105 >>> 8) & 63];
            int[] iArr4 = SP3;
            int i108 = i107 | iArr4[(i105 >>> 16) & 63];
            int[] iArr5 = SP1;
            int i109 = iArr5[(i105 >>> 24) & 63] | i108;
            int i110 = iArr[i104 + 1] ^ i101;
            int[] iArr6 = SP8;
            int i111 = i109 | iArr6[i110 & 63];
            int[] iArr7 = SP6;
            int i112 = i111 | iArr7[(i110 >>> 8) & 63];
            int[] iArr8 = SP4;
            int i113 = i112 | iArr8[(i110 >>> 16) & 63];
            int[] iArr9 = SP2;
            i102 ^= i113 | iArr9[(i110 >>> 24) & 63];
            int i114 = ((i102 << 28) | (i102 >>> 4)) ^ iArr[i104 + 2];
            int i115 = iArr5[(i114 >>> 24) & 63] | iArr2[i114 & 63] | iArr3[(i114 >>> 8) & 63] | iArr4[(i114 >>> 16) & 63];
            int i116 = iArr[i104 + 3] ^ i102;
            i101 ^= (((i115 | iArr6[i116 & 63]) | iArr7[(i116 >>> 8) & 63]) | iArr8[(i116 >>> 16) & 63]) | iArr9[(i116 >>> 24) & 63];
        }
        int i117 = (i101 >>> 1) | (i101 << 31);
        int i118 = (i102 ^ i117) & (-1431655766);
        int i119 = i102 ^ i118;
        int i120 = i117 ^ i118;
        int i121 = (i119 >>> 1) | (i119 << 31);
        int i122 = ((i121 >>> 8) ^ i120) & 16711935;
        int i123 = i120 ^ i122;
        int i124 = i121 ^ (i122 << 8);
        int i125 = ((i124 >>> 2) ^ i123) & 858993459;
        int i126 = i123 ^ i125;
        int i127 = i124 ^ (i125 << 2);
        int i128 = ((i126 >>> 16) ^ i127) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        int i129 = i127 ^ i128;
        int i130 = i126 ^ (i128 << 16);
        int i131 = ((i130 >>> 4) ^ i129) & 252645135;
        Pack.intToBigEndian(i130 ^ (i131 << 4), bArr2, i2);
        Pack.intToBigEndian(i129 ^ i131, bArr2, i2 + 4);
    }

    @Override // org.bouncycastle.crypto.engines.DESBase
    public int[] generateWorkingKey(boolean z, byte[] bArr) {
        int i;
        int[] iArr = new int[32];
        boolean[] zArr = new boolean[56];
        boolean[] zArr2 = new boolean[56];
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= 56) {
                break;
            }
            byte b4 = f228352pc1[i2];
            if ((bytebit[b4 & 7] & bArr[b4 >>> 3]) == 0) {
                z3 = false;
            }
            zArr[i2] = z3;
            i2++;
        }
        for (int i3 = 0; i3 < 16; i3++) {
            int i5 = z ? i3 << 1 : (15 - i3) << 1;
            int i6 = i5 + 1;
            iArr[i6] = 0;
            iArr[i5] = 0;
            int i21 = 0;
            while (true) {
                if (i21 >= 28) {
                    break;
                }
                int i22 = totrot[i3] + i21;
                if (i22 < 28) {
                    zArr2[i21] = zArr[i22];
                } else {
                    zArr2[i21] = zArr[i22 - 28];
                }
                i21++;
            }
            for (i = 28; i < 56; i++) {
                int i32 = totrot[i3] + i;
                if (i32 < 56) {
                    zArr2[i] = zArr[i32];
                } else {
                    zArr2[i] = zArr[i32 - 28];
                }
            }
            for (int i33 = 0; i33 < 24; i33++) {
                byte[] bArr2 = f228353pc2;
                if (zArr2[bArr2[i33]]) {
                    iArr[i5] = iArr[i5] | bigbyte[i33];
                }
                if (zArr2[bArr2[i33 + 24]]) {
                    iArr[i6] = iArr[i6] | bigbyte[i33];
                }
            }
        }
        for (int i43 = 0; i43 != 32; i43 += 2) {
            int i59 = iArr[i43];
            int i66 = i43 + 1;
            int i74 = iArr[i66];
            iArr[i43] = ((16515072 & i74) >>> 10) | ((i59 & 16515072) << 6) | ((i59 & 4032) << 10) | ((i74 & 4032) >>> 6);
            iArr[i66] = ((i59 & 63) << 16) | ((i59 & 258048) << 12) | ((258048 & i74) >>> 4) | (i74 & 63);
        }
        return iArr;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "DES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(m.l("invalid parameter passed to DES init - ", cipherParameters));
        }
        KeyParameter keyParameter = (KeyParameter) cipherParameters;
        if (keyParameter.getKeyLength() > 8) {
            throw new IllegalArgumentException("DES key too long - should be 8 bytes");
        }
        this.forEncryption = z;
        this.workingKey = generateWorkingKey(z, keyParameter.getKey());
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 56, cipherParameters, Utils.getPurpose(this.forEncryption)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("DES engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        desFunc(iArr, bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
