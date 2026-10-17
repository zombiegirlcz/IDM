package com.youTransactor.uCube.rpc.command;

import com.google.common.base.Ascii;
import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.CardReaderType;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.Currency;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCMessage;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.ISO7816;
import zsc.p;

/* JADX INFO: loaded from: classes17.dex */
public class StartNFCTransactionCommand extends RPCCommand {
    public boolean A;
    public byte[] B;
    public Map C;
    public HashMap D;
    public byte[] E;
    public boolean F;
    public byte[] G;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f107719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f107720n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f107721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f107722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f107723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f107724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Currency f107725t;
    public byte u;
    public Date v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public short f107726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f107727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f107728y;
    public char z;

    public StartNFCTransactionCommand(byte[] bArr, Currency currency) {
        super(Constants.START_NFC_TRANSACTION, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
        this.o = -1L;
        this.f107721p = 0;
        this.f107722q = 0.0d;
        this.f107723r = 0.0d;
        this.f107724s = 60;
        this.f107726w = (short) -1;
        this.z = p.SPACE_CHAR;
        this.A = false;
        this.f107719m = bArr;
        this.f107725t = currency;
        this.G = null;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArr = new byte[254];
        bArr[0] = -33;
        bArr[1] = ISO7816.INS_MANAGE_CHANNEL;
        byte[] bArr2 = this.f107719m;
        bArr[2] = (byte) bArr2.length;
        System.arraycopy(bArr2, 0, bArr, 3, bArr2.length);
        int length = this.f107719m.length;
        bArr[length + 3] = -33;
        bArr[length + 4] = 113;
        bArr[length + 5] = 1;
        bArr[length + 6] = (byte) this.f107724s;
        bArr[length + 7] = -33;
        bArr[length + 8] = 82;
        bArr[length + 9] = 1;
        bArr[length + 10] = this.F ? (byte) 1 : (byte) 0;
        bArr[length + 11] = -100;
        bArr[length + 12] = 1;
        bArr[length + 13] = this.u;
        bArr[length + 14] = 95;
        bArr[length + 15] = ISO7816.INS_PSO;
        bArr[length + 16] = 2;
        System.arraycopy(Tools.toBCD(this.f107725t.getCode(), 2), 0, bArr, length + 17, 2);
        bArr[length + 19] = 95;
        bArr[length + 20] = 54;
        bArr[length + 21] = 1;
        bArr[length + 22] = (byte) this.f107725t.getExponent();
        bArr[length + 23] = -97;
        bArr[length + 24] = 2;
        bArr[length + 25] = 6;
        System.arraycopy(Tools.toBCD(this.o, 6), 0, bArr, length + 26, 6);
        int iMin = length + 32;
        if (this.u == 9) {
            bArr[iMin] = -97;
            bArr[length + 33] = 3;
            bArr[length + 34] = 6;
            System.arraycopy(Tools.toBCD(this.f107721p, 6), 0, bArr, length + 35, 6);
            iMin = length + 41;
        }
        if (this.v != null) {
            Calendar.getInstance().setTime(this.v);
            bArr[iMin] = -102;
            bArr[iMin + 1] = 3;
            bArr[iMin + 2] = Tools.toBCD(r3.get(1), 1)[0];
            bArr[iMin + 3] = Tools.toBCD(r3.get(2) + 1, 1)[0];
            bArr[iMin + 4] = Tools.toBCD(r3.get(5), 1)[0];
            bArr[iMin + 5] = -97;
            bArr[iMin + 6] = Constants.NFC_READER;
            bArr[iMin + 7] = 3;
            bArr[iMin + 8] = Tools.toBCD(r3.get(11), 1)[0];
            int i = iMin + 10;
            bArr[iMin + 9] = Tools.toBCD(r3.get(12), 1)[0];
            iMin += 11;
            bArr[i] = Tools.toBCD(r3.get(13), 1)[0];
        }
        short s2 = this.f107726w;
        if (s2 != -1) {
            bArr[iMin] = -97;
            bArr[iMin + 1] = Ascii.NAK;
            bArr[iMin + 2] = 2;
            System.arraycopy(Tools.toBCD(s2, 2), 0, bArr, iMin + 3, 2);
            iMin += 5;
        }
        String str = this.f107727x;
        if (str != null) {
            bArr[iMin] = -97;
            int i2 = iMin + 2;
            bArr[iMin + 1] = Ascii.NAK;
            int i3 = iMin + 3;
            bArr[i2] = 15;
            byte[] bytes = str.getBytes();
            System.arraycopy(bytes, 0, bArr, i3, Math.min(bytes.length, 15));
            iMin = i3 + Math.min(bytes.length, 15);
        }
        char c2 = this.z;
        if (c2 != ' ') {
            bArr[iMin] = -97;
            bArr[iMin + 1] = 83;
            int i5 = iMin + 3;
            bArr[iMin + 2] = 1;
            iMin += 4;
            bArr[i5] = (byte) c2;
        }
        byte[] bArr3 = this.B;
        if (bArr3 != null) {
            bArr[iMin] = -97;
            int i6 = iMin + 2;
            bArr[iMin + 1] = 124;
            int i21 = iMin + 3;
            bArr[i6] = (byte) Math.min(bArr3.length, 20);
            byte[] bArr4 = this.B;
            System.arraycopy(bArr4, 0, bArr, i21, Math.min(bArr4.length, 20));
            iMin = i21 + Math.min(this.B.length, 20);
        }
        if (this.f107722q != 0.0d) {
            bArr[iMin] = -33;
            bArr[iMin + 1] = 4;
            bArr[iMin + 2] = 6;
            System.arraycopy(Tools.toBCD((int) r11, 6), 0, bArr, iMin + 3, 6);
            iMin += 9;
        }
        if (this.f107723r != 0.0d) {
            bArr[iMin] = -33;
            bArr[iMin + 1] = 5;
            bArr[iMin + 2] = 6;
            System.arraycopy(Tools.toBCD((int) r11, 6), 0, bArr, iMin + 3, 6);
            iMin += 9;
        }
        bArr[iMin] = -33;
        bArr[iMin + 1] = Ascii.DEL;
        int i22 = iMin + 3;
        bArr[iMin + 2] = 1;
        int length2 = iMin + 4;
        bArr[i22] = this.A ? (byte) 1 : (byte) 0;
        byte[] bArr5 = this.G;
        if (bArr5 != null) {
            System.arraycopy(bArr5, 0, bArr, length2, bArr5.length);
            length2 += this.G.length;
        }
        int[] iArr = this.f107728y;
        if (iArr != null && iArr.length > 0) {
            byte[] bArr6 = new byte[iArr.length * 2];
            int iWriteTagID = 0;
            for (int i32 : iArr) {
                iWriteTagID += TLV.writeTagID(i32, bArr6, iWriteTagID);
            }
            int i33 = length2 + 1;
            bArr[length2] = -63;
            int i43 = length2 + 2;
            bArr[i33] = (byte) iWriteTagID;
            System.arraycopy(bArr6, 0, bArr, i43, iWriteTagID);
            length2 = i43 + iWriteTagID;
        }
        return Arrays.copyOfRange(bArr, 0, length2);
    }

    public byte getActivatedReader() {
        return this.f107720n;
    }

    public long getAmount() {
        return this.o;
    }

    public byte[] getNFCOutcome() {
        return this.E;
    }

    public Map<Integer, byte[]> getPlainTags() {
        return this.D;
    }

    public int getTimeout() {
        return this.f107724s;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        byte[] bArr;
        Integer numValueOf = Integer.valueOf(Constants.TAG_NFC_OUTCOME);
        RPCMessage rPCMessage = this.response;
        if (rPCMessage == null || rPCMessage.getData() == null) {
            return false;
        }
        Map<Integer, byte[]> map = TLV.parse(this.response.getData());
        this.C = map;
        if (!map.containsKey(57200)) {
            return false;
        }
        byte b4 = ((byte[]) this.C.get(57200))[0];
        this.f107720n = b4;
        if (b4 == CardReaderType.NFC.getCode() && !this.C.containsKey(numValueOf)) {
            return false;
        }
        this.E = (byte[]) this.C.get(numValueOf);
        if (this.F && (bArr = (byte[]) this.C.get(Integer.valueOf(Constants.EMVTag.TAG_9F02_AMOUNT_AUTHORISED))) != null) {
            this.o = Tools.fromBCD(bArr);
        }
        int[] iArr = this.f107728y;
        if (iArr == null || iArr.length <= 0) {
            return true;
        }
        this.D = new HashMap();
        for (int i : this.f107728y) {
            this.D.put(Integer.valueOf(i), (byte[]) this.C.get(Integer.valueOf(i)));
        }
        return true;
    }

    public void setAmount(long j2) {
        if (j2 >= 0) {
            this.o = j2;
        } else {
            this.o = 0L;
            this.F = true;
        }
    }

    public void setBalanceAfterGAC(double d) {
        this.f107723r = d;
    }

    public void setBalanceBeforeGAC(double d) {
        this.f107722q = d;
    }

    public void setCashbackAmount(int i) {
        this.f107721p = i;
    }

    public void setDate(Date date) {
        this.v = date;
    }

    public void setForceAuthorization(boolean z) {
        this.A = z;
    }

    public void setInputProprietaryTLVStream(byte[] bArr) {
        this.G = bArr;
    }

    public void setMerchantCategoryCode(short s2) {
        this.f107726w = s2;
    }

    public void setMerchantID(String str) {
        this.f107727x = str;
    }

    public void setMerchantProprietaryData(byte[] bArr) {
        this.B = bArr;
    }

    public void setNoAmount(boolean z) {
        this.F = z;
    }

    public void setRequestedTagList(int[] iArr) {
        this.f107728y = iArr;
    }

    public void setTimeout(int i) {
        this.f107724s = i;
    }

    public void setTransactionCategoryCode(char c2) {
        this.z = c2;
    }

    public void setTransactionType(byte b4) {
        this.u = b4;
    }
}
