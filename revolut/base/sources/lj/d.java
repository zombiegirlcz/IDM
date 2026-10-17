package lj;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.base.Ascii;
import com.youTransactor.uCube.rpc.Constants;
import java.nio.charset.Charset;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Charset f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f195582g = {ISO7816.INS_DECREASE, Constants.INQUIRY, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, 54, 55, 56, 57, 97, ISOFileInfo.FCP_BYTE, 99, ISOFileInfo.FMD_BYTE, 101, 102, 103, 104, 106, 107, 109, 110, ISO7816.INS_MANAGE_CHANNEL, 113, 114, 115, 116, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f195583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f195584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f195585c;
    public int d;
    public long e;

    public static byte a(byte b4) {
        switch (b4) {
            case 48:
                return (byte) 0;
            case 49:
                return (byte) 1;
            case 50:
                return (byte) 2;
            case 51:
                return (byte) 3;
            case 52:
                return (byte) 4;
            case 53:
                return (byte) 5;
            case 54:
                return (byte) 6;
            case 55:
                return (byte) 7;
            case 56:
                return (byte) 8;
            case 57:
                return (byte) 9;
            default:
                switch (b4) {
                    case 65:
                        return (byte) 10;
                    case 66:
                        return (byte) 11;
                    case 67:
                        return (byte) 12;
                    case 68:
                        return (byte) 13;
                    case 69:
                        return (byte) 14;
                    case 70:
                        return (byte) 15;
                    case 71:
                        return (byte) 16;
                    case 72:
                        return (byte) 17;
                    case 73:
                    case 76:
                        return (byte) 1;
                    case 74:
                        return (byte) 18;
                    case 75:
                        return (byte) 19;
                    case 77:
                        return Ascii.DC4;
                    case 78:
                        return Ascii.NAK;
                    case 79:
                        return (byte) 0;
                    case 80:
                        return Ascii.SYN;
                    case 81:
                        return Ascii.ETB;
                    case 82:
                        return Ascii.CAN;
                    case 83:
                        return Ascii.EM;
                    case 84:
                        return Ascii.SUB;
                    case 85:
                    case 86:
                        return Ascii.ESC;
                    case 87:
                        return (byte) 28;
                    case 88:
                        return (byte) 29;
                    case 89:
                        return (byte) 30;
                    case 90:
                        return Ascii.US;
                    default:
                        switch (b4) {
                            case 97:
                                return (byte) 10;
                            case 98:
                                return (byte) 11;
                            case 99:
                                return (byte) 12;
                            case 100:
                                return (byte) 13;
                            case 101:
                                return (byte) 14;
                            case 102:
                                return (byte) 15;
                            case 103:
                                return (byte) 16;
                            case 104:
                                return (byte) 17;
                            case 105:
                            case LDSFile.EF_DG12_TAG /* 108 */:
                                return (byte) 1;
                            case 106:
                                return (byte) 18;
                            case 107:
                                return (byte) 19;
                            case LDSFile.EF_DG13_TAG /* 109 */:
                                return Ascii.DC4;
                            case LDSFile.EF_DG14_TAG /* 110 */:
                                return Ascii.NAK;
                            case LDSFile.EF_DG15_TAG /* 111 */:
                                return (byte) 0;
                            case 112:
                                return Ascii.SYN;
                            case 113:
                                return Ascii.ETB;
                            case 114:
                                return Ascii.CAN;
                            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                                return Ascii.EM;
                            case 116:
                                return Ascii.SUB;
                            case LDSFile.EF_DG2_TAG /* 117 */:
                            case LDSFile.EF_DG4_TAG /* 118 */:
                                return Ascii.ESC;
                            case LDSFile.EF_SOD_TAG /* 119 */:
                                return (byte) 28;
                            case SyslogConstants.LOG_CLOCK /* 120 */:
                                return (byte) 29;
                            case 121:
                                return (byte) 30;
                            case 122:
                                return Ascii.US;
                            default:
                                return (byte) -1;
                        }
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r22, byte[] r23) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj.d.b(int, byte[]):void");
    }

    public final void c(byte[] bArr, int i) {
        if (this.f195585c) {
            return;
        }
        byte[] bArr2 = f195582g;
        if (i >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                d(8);
                int i5 = (this.d + 1) % 5;
                this.d = i5;
                int i6 = i3 + 1;
                int i21 = bArr[i3];
                if (i21 < 0) {
                    i21 += 256;
                }
                long j2 = (this.e << 8) + ((long) i21);
                this.e = j2;
                if (i5 == 0) {
                    byte[] bArr3 = this.f195583a;
                    int i22 = this.f195584b;
                    int i32 = i22 + 1;
                    this.f195584b = i32;
                    bArr3[i22] = bArr2[((int) (j2 >> 35)) & 31];
                    int i33 = i22 + 2;
                    this.f195584b = i33;
                    bArr3[i32] = bArr2[((int) (j2 >> 30)) & 31];
                    int i43 = i22 + 3;
                    this.f195584b = i43;
                    bArr3[i33] = bArr2[((int) (j2 >> 25)) & 31];
                    int i59 = i22 + 4;
                    this.f195584b = i59;
                    bArr3[i43] = bArr2[((int) (j2 >> 20)) & 31];
                    int i66 = i22 + 5;
                    this.f195584b = i66;
                    bArr3[i59] = bArr2[((int) (j2 >> 15)) & 31];
                    int i74 = i22 + 6;
                    this.f195584b = i74;
                    bArr3[i66] = bArr2[((int) (j2 >> 10)) & 31];
                    int i92 = i22 + 7;
                    this.f195584b = i92;
                    bArr3[i74] = bArr2[((int) (j2 >> 5)) & 31];
                    this.f195584b = i22 + 8;
                    bArr3[i92] = bArr2[((int) j2) & 31];
                }
                i2++;
                i3 = i6;
            }
            return;
        }
        this.f195585c = true;
        if (this.d == 0) {
            return;
        }
        d(8);
        int i96 = this.d;
        if (i96 == 1) {
            byte[] bArr4 = this.f195583a;
            int i99 = this.f195584b;
            int i100 = i99 + 1;
            this.f195584b = i100;
            long j3 = this.e;
            bArr4[i99] = bArr2[((int) (j3 >> 3)) & 31];
            this.f195584b = i99 + 2;
            bArr4[i100] = bArr2[((int) (j3 << 2)) & 31];
            return;
        }
        if (i96 == 2) {
            byte[] bArr5 = this.f195583a;
            int i101 = this.f195584b;
            int i102 = i101 + 1;
            this.f195584b = i102;
            long j5 = this.e;
            bArr5[i101] = bArr2[((int) (j5 >> 11)) & 31];
            int i103 = i101 + 2;
            this.f195584b = i103;
            bArr5[i102] = bArr2[((int) (j5 >> 6)) & 31];
            int i104 = i101 + 3;
            this.f195584b = i104;
            bArr5[i103] = bArr2[((int) (j5 >> 1)) & 31];
            this.f195584b = i101 + 4;
            bArr5[i104] = bArr2[((int) (j5 << 4)) & 31];
            return;
        }
        if (i96 == 3) {
            byte[] bArr6 = this.f195583a;
            int i105 = this.f195584b;
            int i106 = i105 + 1;
            this.f195584b = i106;
            long j16 = this.e;
            bArr6[i105] = bArr2[((int) (j16 >> 19)) & 31];
            int i107 = i105 + 2;
            this.f195584b = i107;
            bArr6[i106] = bArr2[((int) (j16 >> 14)) & 31];
            int i108 = i105 + 3;
            this.f195584b = i108;
            bArr6[i107] = bArr2[((int) (j16 >> 9)) & 31];
            int i109 = i105 + 4;
            this.f195584b = i109;
            bArr6[i108] = bArr2[((int) (j16 >> 4)) & 31];
            this.f195584b = i105 + 5;
            bArr6[i109] = bArr2[((int) (j16 << 1)) & 31];
            return;
        }
        if (i96 != 4) {
            return;
        }
        byte[] bArr7 = this.f195583a;
        int i110 = this.f195584b;
        int i111 = i110 + 1;
        this.f195584b = i111;
        long j22 = this.e;
        bArr7[i110] = bArr2[((int) (j22 >> 27)) & 31];
        int i112 = i110 + 2;
        this.f195584b = i112;
        bArr7[i111] = bArr2[((int) (j22 >> 22)) & 31];
        int i113 = i110 + 3;
        this.f195584b = i113;
        bArr7[i112] = bArr2[((int) (j22 >> 17)) & 31];
        int i114 = i110 + 4;
        this.f195584b = i114;
        bArr7[i113] = bArr2[((int) (j22 >> 12)) & 31];
        int i115 = i110 + 5;
        this.f195584b = i115;
        bArr7[i114] = bArr2[((int) (j22 >> 7)) & 31];
        int i116 = i110 + 6;
        this.f195584b = i116;
        bArr7[i115] = bArr2[((int) (j22 >> 2)) & 31];
        this.f195584b = i110 + 7;
        bArr7[i116] = bArr2[((int) (j22 << 3)) & 31];
    }

    public final void d(int i) {
        byte[] bArr = this.f195583a;
        if (bArr == null || bArr.length < this.f195584b + i) {
            if (bArr == null) {
                this.f195583a = new byte[8192];
                this.f195584b = 0;
            } else {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f195583a = bArr2;
            }
        }
    }
}
