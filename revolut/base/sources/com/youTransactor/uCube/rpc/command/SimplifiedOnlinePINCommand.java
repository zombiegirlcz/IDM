package com.youTransactor.uCube.rpc.command;

import androidx.annotation.NonNull;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.Currency;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCMessage;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.Arrays;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes17.dex */
public class SimplifiedOnlinePINCommand extends RPCCommand {
    public byte A;
    public byte B;
    public byte C;
    public byte D;
    public boolean E;
    public byte[] F;
    public byte[] G;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f107709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f107710n;
    public Currency o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f107711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f107712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f107713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f107714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f107715t;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f107716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f107717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f107718y;
    public int z;

    public SimplifiedOnlinePINCommand() {
        super(Constants.SIMPLIFIED_ONLINE_PIN, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
        this.f107709m = (byte) 0;
        this.f107711p = "PIN ?";
        this.f107712q = "...";
        this.f107713r = 4;
        this.f107714s = 12;
        this.f107715t = 24;
        this.u = 24;
        this.v = 60;
        this.f107716w = Constants.ERASE_LAST_DIGIT_PIN_INPUT_CORRECTION_KEY_MODE;
        this.f107717x = 6;
        this.f107718y = 0;
        this.z = 0;
        this.A = (byte) 0;
        this.B = (byte) 0;
        this.C = (byte) 0;
        this.D = (byte) 0;
        this.E = false;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArr = new byte[Constants.MAX_RPC_PACKET_SIZE];
        byte[] bytes = Tools.formattedAmount(this.o.getExponent(), this.f107710n).getBytes();
        bArr[0] = (byte) (bytes.length + 1);
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        int length = bytes.length;
        int i = length + 2;
        bArr[length + 1] = 0;
        byte[] bytes2 = this.o.getLabel().getBytes();
        int i2 = length + 3;
        bArr[i] = (byte) (bytes2.length + 1);
        System.arraycopy(bytes2, 0, bArr, i2, bytes2.length);
        int length2 = i2 + bytes2.length;
        bArr[length2] = 0;
        bArr[length2 + 1] = this.f107709m;
        int i3 = length2 + 3;
        bArr[length2 + 2] = (byte) this.f107718y;
        byte[] bytes3 = this.f107711p.getBytes();
        int i5 = length2 + 4;
        bArr[i3] = (byte) (bytes3.length + 1);
        System.arraycopy(bytes3, 0, bArr, i5, bytes3.length);
        int length3 = i5 + bytes3.length;
        bArr[length3] = 0;
        bArr[length3 + 1] = this.A;
        bArr[length3 + 2] = this.B;
        int i6 = length3 + 4;
        bArr[length3 + 3] = (byte) this.z;
        byte[] bytes4 = this.f107712q.getBytes();
        int i21 = length3 + 5;
        bArr[i6] = (byte) (bytes4.length + 1);
        System.arraycopy(bytes4, 0, bArr, i21, bytes4.length);
        int length4 = i21 + bytes4.length;
        bArr[length4] = 0;
        bArr[length4 + 1] = this.C;
        bArr[length4 + 2] = this.D;
        bArr[length4 + 3] = -33;
        bArr[length4 + 4] = ISO7816.INS_DECREASE;
        bArr[length4 + 5] = 1;
        bArr[length4 + 6] = (byte) this.f107713r;
        bArr[length4 + 7] = -33;
        bArr[length4 + 8] = Constants.INQUIRY;
        bArr[length4 + 9] = 1;
        bArr[length4 + 10] = (byte) this.f107714s;
        bArr[length4 + 11] = -33;
        bArr[length4 + 12] = ISO7816.INS_INCREASE;
        bArr[length4 + 13] = 2;
        bArr[length4 + 14] = 0;
        bArr[length4 + 15] = (byte) this.f107715t;
        bArr[length4 + 16] = -33;
        bArr[length4 + 17] = 51;
        bArr[length4 + 18] = 2;
        bArr[length4 + 19] = 0;
        bArr[length4 + 20] = (byte) this.u;
        bArr[length4 + 21] = -33;
        bArr[length4 + 22] = ISO7816.INS_DECREASE_STAMPED;
        bArr[length4 + 23] = 2;
        bArr[length4 + 24] = 0;
        bArr[length4 + 25] = (byte) this.v;
        bArr[length4 + 26] = -33;
        bArr[length4 + 27] = 53;
        bArr[length4 + 28] = 1;
        bArr[length4 + 29] = this.f107716w;
        bArr[length4 + 30] = -33;
        bArr[length4 + 31] = 54;
        bArr[length4 + 32] = 1;
        int i22 = length4 + 34;
        bArr[length4 + 33] = (byte) this.f107717x;
        if (this.E) {
            bArr[i22] = 95;
            bArr[length4 + 35] = ISO7816.INS_PSO;
            bArr[length4 + 36] = 2;
            System.arraycopy(Tools.toBCD(this.o.getCode(), 2), 0, bArr, length4 + 37, 2);
            bArr[length4 + 39] = 95;
            bArr[length4 + 40] = 54;
            bArr[length4 + 41] = 1;
            bArr[length4 + 42] = (byte) this.o.getExponent();
            bArr[length4 + 43] = -97;
            bArr[length4 + 44] = 2;
            bArr[length4 + 45] = 6;
            System.arraycopy(Tools.toBCD(this.f107710n, 6), 0, bArr, length4 + 46, 6);
            i22 = length4 + 52;
        }
        return Arrays.copyOfRange(bArr, 0, i22);
    }

    public byte[] getEncryptedPinBlock() {
        return this.G;
    }

    public byte[] getPinKSN() {
        return this.F;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        int iMakeInt;
        int i;
        RPCMessage rPCMessage = this.response;
        if (rPCMessage == null || rPCMessage.getData() == null || this.response.getData().length < 1) {
            return false;
        }
        byte[] data = this.response.getData();
        if (data.length >= 2 && (iMakeInt = Tools.makeInt(data[0], data[1])) != 0 && data.length >= (i = iMakeInt + 2)) {
            byte[] bArr = new byte[iMakeInt];
            this.F = bArr;
            System.arraycopy(data, 2, bArr, 0, iMakeInt);
            if (data.length < iMakeInt + i) {
                return true;
            }
            int i2 = iMakeInt + 3;
            int i3 = iMakeInt + 4;
            int iMakeInt2 = Tools.makeInt(data[i], data[i2]);
            if (iMakeInt2 <= 0) {
                return true;
            }
            byte[] bArr2 = new byte[iMakeInt2];
            this.G = bArr2;
            System.arraycopy(data, i3, bArr2, 0, iMakeInt2);
        }
        return true;
    }

    public void setAddAmountAndCurrencyTags(boolean z) {
        this.E = z;
    }

    public void setAmount(int i) {
        this.f107710n = i;
    }

    public void setCorrectionKeyAction(byte b4) {
        this.f107716w = b4;
    }

    public void setCurrency(@NonNull Currency currency) {
        this.o = currency;
    }

    public void setFirstDigitTimeout(int i) {
        if (i <= 0 || i > 60) {
            return;
        }
        this.f107715t = i;
    }

    public void setGlobalTimeout(int i) {
        if (i <= 0 || i > 60) {
            return;
        }
        this.v = i;
    }

    public void setInputDigitPerLine(int i) {
        this.f107717x = i;
    }

    public void setInterDigitTimeout(int i) {
        if (i <= 0 || i > 60) {
            return;
        }
        this.u = i;
    }

    public void setMaxKey(int i) {
        if (i < 0 || i >= 256) {
            return;
        }
        this.f107714s = i;
    }

    public void setMinKey(int i) {
        if (i < 0 || i >= 256) {
            return;
        }
        this.f107713r = i;
    }

    public void setPinFormat(byte b4) {
        this.f107709m = b4;
    }

    public void setPinRequestLabel(@NonNull String str) {
        this.f107711p = str;
    }

    public void setPinRequestLabelFont(int i) {
        this.f107718y = i;
    }

    public void setPinRequestLabelXPosition(byte b4) {
        this.A = b4;
    }

    public void setPinRequestLabelYPosition(byte b4) {
        this.B = b4;
    }

    public void setWaitLabel(@NonNull String str) {
        this.f107712q = str;
    }

    public void setWaitLabelFont(int i) {
        this.z = i;
    }

    public void setWaitLabelXPosition(byte b4) {
        this.C = b4;
    }

    public void setWaitLabelYPosition(byte b4) {
        this.D = b4;
    }

    public SimplifiedOnlinePINCommand(long j2, @NonNull Currency currency, byte b4) {
        this();
        this.f107710n = j2;
        this.o = currency;
        this.f107709m = b4;
    }
}
