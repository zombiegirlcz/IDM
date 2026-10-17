package org.bouncycastle.crypto.digests;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private final CryptoServicePurpose purpose;
    private static final int[] SBOX = {24, 35, Constants.TAG_POWER_OFF_TIMEOUT, 232, 135, SyslogConstants.LOG_LOCAL7, 1, 79, 54, Constants.TAG_PAYMENT_APP_CLESS_VERSION, Constants.TAG_SVPP_CHECKSUM, Constants.TAG_F5, 121, LDSFile.EF_DG15_TAG, 145, 82, 96, 188, 155, 142, Constants.TAG_ACE_LAYER_VERSION, 12, 123, 53, 29, BERTags.FLAGS, Constants.TAG_EMV_L2_VERSION, 194, 46, 75, 254, 87, 21, LDSFile.EF_SOD_TAG, 55, Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION, 159, 240, 74, Constants.TAG_BOOT_LOADER_CHECKSUM, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, Constants.TAG_F4, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1, 62, 5, 103, Constants.TAG_E4_CUSTOMER_DATA, 39, 65, 139, 167, ISO781611.SMT_TAG, 149, Constants.TAG_EMV_L2_CHECKSUM, Constants.TAG_FB_CHARGING_STATUS, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, 124, 102, 221, 23, 71, ISO781611.SMT_DO_DS, 202, 45, 191, 7, 173, 90, ISO781611.CREATION_DATE_AND_TIME_TAG, 51, 99, 2, 170, 113, 200, 25, 73, Constants.TAG_BOOT_LOADER_VERSION, 242, Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS, 91, 136, Constants.EMVTag.TAG_9A_TRANSACTION_DATE, 38, 50, SyslogConstants.LOG_LOCAL6, Constants.TAG_USB_CAPABILITY, 15, Constants.TAG_EMV_L1_VERSION, 128, 190, Constants.TAG_KSN_FORMATS, 52, 72, 255, 122, SyslogConstants.LOG_LOCAL2, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, Constants.TAG_TRANSACTION_DATA, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, 18, 64, 8, 195, Constants.TAG_OS_VERSION, Constants.TAG_KSL_ID, 161, ModuleDescriptor.MODULE_VERSION, 61, ISO7816.TAG_SM_EXPECTED_LENGTH, 0, Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION, 43, LDSFile.EF_DG4_TAG, 130, Constants.TAG_EMV_L1_CHECKSUM, 27, 181, 175, 106, 80, 69, Constants.TAG_F3_BUILD_CONFIGURATION, 48, 239, 63, 85, 162, Constants.TAG_EMV_ICC_CONFIG_VERSION, 101, 186, 47, 192, 222, 28, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, 77, 146, LDSFile.EF_DG2_TAG, 6, 138, 178, 230, 14, 31, 98, Constants.TAG_PCI_PED_CHECKSUM, 168, 150, Constants.TAG_RESOURCE_FILE_VERSION, Constants.TAG_BATTERY_STATE, 37, 89, 132, 114, 57, 76, 94, SyslogConstants.LOG_CLOCK, 56, 140, Constants.TAG_FIRMWARE_VERSION, Constants.TAG_EMVL3_VERSION, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION, 97, 179, 33, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, 30, 67, 199, Constants.TAG_FC_SPEED_MODE, 4, 81, 153, LDSFile.EF_DG13_TAG, 13, Constants.TAG_SUPPORTED_LOCALE_LIST, PassportService.DEFAULT_MAX_BLOCKSIZE, 126, 36, 59, 171, 206, 17, 143, 78, 183, Constants.TAG_EMV_NFC_CONFIG_VERSION, 60, 129, 148, Constants.TAG_BLE_FIRMWARE_VERSION, 185, 19, 44, 211, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION, LDSFile.EF_DG14_TAG, 196, 3, 86, 68, CertificateBody.profileType, 169, 42, 187, Constants.TAG_ATMEL_SERIAL, 83, 220, 11, 157, LDSFile.EF_DG12_TAG, 49, 116, 246, 70, 172, 137, 20, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE, 22, 58, 105, 9, 112, 182, 208, Constants.TAG_MPOS_MODULE_STATE, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, 66, SyslogConstants.LOG_LOCAL3, Constants.TAG_GPI_VERSION, 40, 92, Constants.TAG_FULL_SVPP_IDENTIFICATION, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA};
    private static final long[] C0 = new long[256];
    private static final long[] C1 = new long[256];
    private static final long[] C2 = new long[256];
    private static final long[] C3 = new long[256];
    private static final long[] C4 = new long[256];
    private static final long[] C5 = new long[256];
    private static final long[] C6 = new long[256];
    private static final long[] C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
        for (int i = 0; i < 256; i++) {
            int i2 = SBOX[i];
            int iMulX = mulX(i2);
            int iMulX2 = mulX(iMulX);
            int i3 = iMulX2 ^ i2;
            int iMulX3 = mulX(iMulX2);
            int i5 = iMulX3 ^ i2;
            C0[i] = packIntoLong(i2, i2, iMulX2, i2, iMulX3, i3, iMulX, i5);
            C1[i] = packIntoLong(i5, i2, i2, iMulX2, i2, iMulX3, i3, iMulX);
            C2[i] = packIntoLong(iMulX, i5, i2, i2, iMulX2, i2, iMulX3, i3);
            C3[i] = packIntoLong(i3, iMulX, i5, i2, i2, iMulX2, i2, iMulX3);
            C4[i] = packIntoLong(iMulX3, i3, iMulX, i5, i2, i2, iMulX2, i2);
            C5[i] = packIntoLong(i2, iMulX3, i3, iMulX, i5, i2, i2, iMulX2);
            C6[i] = packIntoLong(iMulX2, i2, iMulX3, i3, iMulX, i5, i2, i2);
            C7[i] = packIntoLong(i2, iMulX2, i2, iMulX3, i3, iMulX, i5, i2);
        }
    }

    public WhirlpoolDigest() {
        this(CryptoServicePurpose.ANY);
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (this._bitCount[i] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] bArrCopyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        bArr[i] = (byte) (bArr[i] | 128);
        int i2 = i + 1;
        this._bufferPos = i2;
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArrCopyBitLength, 0, this._buffer, 32, bArrCopyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i2 = (sArr[length] & 255) + EIGHT[length] + i;
            i = i2 >>> 8;
            sArr[length] = (short) (i2 & 255);
        }
    }

    private static int mulX(int i) {
        return ((-(i >>> 7)) & REDUCTION_POLYNOMIAL) ^ (i << 1);
    }

    private static long packIntoLong(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        return (((((((((long) i2) << 48) ^ (((long) i) << 56)) ^ (((long) i3) << 40)) ^ (((long) i5) << 32)) ^ (((long) i6) << 24)) ^ (((long) i21) << 16)) ^ (((long) i22) << 8)) ^ ((long) i32);
    }

    private void processFilledBuffer(byte[] bArr, int i) {
        Pack.bigEndianToLong(this._buffer, 0, this._block);
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this._hash, bArr, i);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public void processBlock() {
        char c2;
        char c3;
        for (int i = 0; i < 8; i++) {
            long[] jArr = this._state;
            long j2 = this._block[i];
            long[] jArr2 = this._K;
            long j3 = this._hash[i];
            jArr2[i] = j3;
            jArr[i] = j2 ^ j3;
        }
        for (int i2 = 1; i2 <= 10; i2++) {
            int i3 = 0;
            while (true) {
                c2 = p.SPACE_CHAR;
                c3 = CoreConstants.LEFT_PARENTHESIS_CHAR;
                if (i3 >= 8) {
                    break;
                }
                long[] jArr3 = this._L;
                jArr3[i3] = 0;
                long[] jArr4 = C0;
                long[] jArr5 = this._K;
                long j5 = jArr4[((int) (jArr5[i3 & 7] >>> 56)) & 255];
                jArr3[i3] = j5;
                long j16 = C1[((int) (jArr5[(i3 - 1) & 7] >>> 48)) & 255] ^ j5;
                jArr3[i3] = j16;
                long j22 = j16 ^ C2[((int) (jArr5[(i3 - 2) & 7] >>> 40)) & 255];
                jArr3[i3] = j22;
                long j42 = j22 ^ C3[((int) (jArr5[(i3 - 3) & 7] >>> 32)) & 255];
                jArr3[i3] = j42;
                long j46 = j42 ^ C4[((int) (jArr5[(i3 - 4) & 7] >>> 24)) & 255];
                jArr3[i3] = j46;
                long j47 = j46 ^ C5[((int) (jArr5[(i3 - 5) & 7] >>> 16)) & 255];
                jArr3[i3] = j47;
                long j57 = j47 ^ C6[((int) (jArr5[(i3 - 6) & 7] >>> 8)) & 255];
                jArr3[i3] = j57;
                jArr3[i3] = j57 ^ C7[((int) jArr5[(i3 - 7) & 7]) & 255];
                i3++;
            }
            long[] jArr6 = this._L;
            long[] jArr7 = this._K;
            System.arraycopy(jArr6, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this._K;
            jArr8[0] = jArr8[0] ^ this._rc[i2];
            int i5 = 0;
            while (i5 < 8) {
                long[] jArr9 = this._L;
                long j58 = this._K[i5];
                jArr9[i5] = j58;
                long[] jArr10 = C0;
                long[] jArr11 = this._state;
                char c5 = c2;
                char c6 = c3;
                long j65 = jArr10[((int) (jArr11[i5 & 7] >>> 56)) & 255] ^ j58;
                jArr9[i5] = j65;
                long j69 = j65 ^ C1[((int) (jArr11[(i5 - 1) & 7] >>> 48)) & 255];
                jArr9[i5] = j69;
                long j76 = j69 ^ C2[((int) (jArr11[(i5 - 2) & 7] >>> c6)) & 255];
                jArr9[i5] = j76;
                long j85 = j76 ^ C3[((int) (jArr11[(i5 - 3) & 7] >>> c5)) & 255];
                jArr9[i5] = j85;
                long j100 = j85 ^ C4[((int) (jArr11[(i5 - 4) & 7] >>> 24)) & 255];
                jArr9[i5] = j100;
                long j101 = j100 ^ C5[((int) (jArr11[(i5 - 5) & 7] >>> 16)) & 255];
                jArr9[i5] = j101;
                long j102 = j101 ^ C6[((int) (jArr11[(i5 - 6) & 7] >>> 8)) & 255];
                jArr9[i5] = j102;
                jArr9[i5] = j102 ^ C7[((int) jArr11[(i5 - 7) & 7]) & 255];
                i5++;
                c3 = c6;
                c2 = c5;
            }
            long[] jArr12 = this._L;
            long[] jArr13 = this._state;
            System.arraycopy(jArr12, 0, jArr13, 0, jArr13.length);
        }
        for (int i6 = 0; i6 < 8; i6++) {
            long[] jArr14 = this._hash;
            jArr14[i6] = jArr14[i6] ^ (this._state[i6] ^ this._block[i6]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b4) {
        byte[] bArr = this._buffer;
        int i = this._bufferPos;
        bArr[i] = b4;
        int i2 = i + 1;
        this._bufferPos = i2;
        if (i2 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    public WhirlpoolDigest(CryptoServicePurpose cryptoServicePurpose) {
        long[] jArr = new long[11];
        this._rc = jArr;
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        jArr[0] = 0;
        for (int i = 1; i <= 10; i++) {
            int i2 = (i - 1) * 8;
            this._rc[i] = (((((((C0[i2] & (-72057594037927936L)) ^ (C1[i2 + 1] & 71776119061217280L)) ^ (C2[i2 + 2] & 280375465082880L)) ^ (C3[i2 + 3] & 1095216660480L)) ^ (C4[i2 + 4] & 4278190080L)) ^ (C5[i2 + 5] & 16711680)) ^ (C6[i2 + 6] & 65280)) ^ (C7[i2 + 7] & 255);
        }
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize(), cryptoServicePurpose));
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        CryptoServicePurpose cryptoServicePurpose = whirlpoolDigest.purpose;
        this.purpose = cryptoServicePurpose;
        reset(whirlpoolDigest);
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize(), cryptoServicePurpose));
    }
}
