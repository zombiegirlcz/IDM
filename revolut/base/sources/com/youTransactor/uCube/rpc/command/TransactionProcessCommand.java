package com.youTransactor.uCube.rpc.command;

import com.google.common.base.Ascii;
import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCMessage;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes17.dex */
public class TransactionProcessCommand extends RPCCommand {
    public int A;
    public int[] B;
    public Map C;
    public HashMap D;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f107736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f107737n;
    public byte[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f107738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f107739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f107740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Date f107741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f107742t;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f107743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f107744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f107745y;
    public int z;

    public TransactionProcessCommand(byte[] bArr) {
        super(Constants.TRANSACTION_PROCESS, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
        this.f107742t = -1;
        this.u = -1;
        this.v = -1;
        this.f107743w = -1;
        this.f107744x = -1;
        this.f107745y = -1;
        this.z = -1;
        this.A = -1;
        setTvr(bArr);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte b4;
        byte b5;
        byte b7;
        byte b13;
        byte[] bArr = new byte[500];
        bArr[0] = -107;
        bArr[1] = 5;
        byte[] bArr2 = this.f107736m;
        System.arraycopy(bArr2, 0, bArr, 2, bArr2.length);
        int length = 7;
        if (this.f107741s != null) {
            Calendar.getInstance().setTime(this.f107741s);
            bArr[7] = -102;
            bArr[8] = 3;
            b4 = 15;
            b5 = 14;
            bArr[9] = Tools.toBCD(r5.get(1), 1)[0];
            bArr[10] = Tools.toBCD(r5.get(2) + 1, 1)[0];
            bArr[11] = Tools.toBCD(r5.get(5), 1)[0];
            bArr[12] = -97;
            bArr[13] = Constants.NFC_READER;
            bArr[14] = 3;
            bArr[15] = Tools.toBCD(r5.get(11), 1)[0];
            bArr[16] = Tools.toBCD(r5.get(12), 1)[0];
            bArr[17] = Tools.toBCD(r5.get(13), 1)[0];
            length = 18;
        } else {
            b4 = 15;
            b5 = 14;
        }
        int i = this.f107742t;
        if (i >= 0) {
            int i2 = length + 1;
            bArr[length] = -97;
            int i3 = length + 2;
            bArr[i2] = 65;
            b7 = 9;
            b13 = 13;
            byte[] bcd2 = Tools.toBCD(i, 4);
            System.arraycopy(bcd2, 0, bArr, i3, bcd2.length);
            length = i3 + bcd2.length;
        } else {
            b7 = 9;
            b13 = 13;
        }
        int i5 = this.u;
        if (i5 > 0) {
            bArr[length] = -97;
            bArr[length + 1] = b7;
            bArr[length + 2] = 2;
            System.arraycopy(Tools.toBCD(i5, 2), 0, bArr, length + 3, 2);
            length += 5;
        }
        byte[] bArr3 = this.f107739q;
        if (bArr3 != null) {
            int i6 = length + 1;
            bArr[length] = ISO7816.INS_UPDATE_BINARY;
            int iWriteTagLength = TLV.writeTagLength(bArr3.length, bArr, i6) + i6;
            byte[] bArr4 = this.f107739q;
            System.arraycopy(bArr4, 0, bArr, iWriteTagLength, bArr4.length);
            length = iWriteTagLength + this.f107739q.length;
        }
        byte[] bArr5 = this.f107740r;
        if (bArr5 != null) {
            int i21 = length + 1;
            bArr[length] = -41;
            int iWriteTagLength2 = TLV.writeTagLength(bArr5.length, bArr, i21) + i21;
            byte[] bArr6 = this.f107740r;
            System.arraycopy(bArr6, 0, bArr, iWriteTagLength2, bArr6.length);
            length = iWriteTagLength2 + this.f107740r.length;
        }
        byte[] bArr7 = this.f107737n;
        if (bArr7 != null && bArr7.length == 5) {
            bArr[length] = ISO7816.INS_LOAD_KEY_FILE;
            bArr[length + 1] = 5;
            System.arraycopy(bArr7, 0, bArr, length + 2, 5);
            length += 7;
        }
        byte[] bArr8 = this.o;
        if (bArr8 != null && bArr8.length == 5) {
            bArr[length] = -39;
            bArr[length + 1] = 5;
            System.arraycopy(bArr8, 0, bArr, length + 2, 5);
            length += 7;
        }
        byte[] bArr9 = this.f107738p;
        if (bArr9 != null && this.f107737n.length == 5) {
            bArr[length] = ISO7816.INS_PUT_DATA;
            bArr[length + 1] = 5;
            System.arraycopy(bArr9, 0, bArr, length + 2, 5);
            length += 7;
        }
        int i22 = this.v;
        if (i22 >= 0) {
            bArr[length] = -33;
            bArr[length + 1] = 18;
            bArr[length + 2] = 4;
            System.arraycopy(Tools.intToByteArray(i22, 4), 0, bArr, length + 3, 4);
            length += 7;
        }
        int i32 = this.f107743w;
        if (i32 >= 0) {
            bArr[length] = -33;
            bArr[length + 1] = 19;
            bArr[length + 2] = 4;
            System.arraycopy(Tools.intToByteArray(i32, 4), 0, bArr, length + 3, 4);
            length += 7;
        }
        int i33 = this.f107744x;
        if (i33 >= 0) {
            bArr[length] = -33;
            bArr[length + 1] = Ascii.DC4;
            bArr[length + 2] = 4;
            System.arraycopy(Tools.intToByteArray(i33, 4), 0, bArr, length + 3, 4);
            length += 7;
        }
        int i43 = this.f107745y;
        if (i43 >= 0) {
            bArr[length] = -33;
            bArr[length + 1] = b13;
            int i59 = length + 3;
            bArr[length + 2] = 1;
            length += 4;
            bArr[i59] = (byte) i43;
        }
        int i66 = this.z;
        if (i66 >= 0) {
            bArr[length] = -33;
            bArr[length + 1] = b5;
            bArr[length + 2] = 4;
            System.arraycopy(Tools.intToByteArray(i66, 4), 0, bArr, length + 3, 4);
            length += 7;
        }
        int i74 = this.A;
        if (i74 >= 0) {
            bArr[length] = -33;
            bArr[length + 1] = b4;
            int i92 = length + 3;
            bArr[length + 2] = 1;
            length += 4;
            bArr[i92] = (byte) i74;
        }
        int[] iArr = this.B;
        if (iArr != null) {
            byte[] bArr10 = new byte[iArr.length * 2];
            int iWriteTagID = 0;
            for (int i96 : iArr) {
                iWriteTagID += TLV.writeTagID(i96, bArr10, iWriteTagID);
            }
            int i99 = length + 1;
            bArr[length] = -63;
            int i100 = length + 2;
            bArr[i99] = (byte) iWriteTagID;
            System.arraycopy(bArr10, 0, bArr, i100, iWriteTagID);
            length = i100 + iWriteTagID;
        }
        return Arrays.copyOfRange(bArr, 0, length);
    }

    public Map<Integer, byte[]> getTagsTLV() {
        return this.D;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        RPCMessage rPCMessage = this.response;
        if (rPCMessage == null || rPCMessage.getData() == null || this.response.getData().length == 0) {
            return false;
        }
        this.C = TLV.parse(this.response.getData());
        int[] iArr = this.B;
        if (iArr == null || iArr.length <= 0) {
            return true;
        }
        this.D = new HashMap();
        for (int i : this.B) {
            this.D.put(Integer.valueOf(i), (byte[]) this.C.get(Integer.valueOf(i)));
        }
        return true;
    }

    public void setApplicationVersion(int i) {
        this.u = i;
    }

    public void setDate(Date date) {
        this.f107741s = date;
    }

    public void setDdol(byte[] bArr) {
        this.f107739q = bArr;
    }

    public void setMaxTargetPercent(int i) {
        this.A = i;
    }

    public void setPINFloorLimit(int i) {
        this.v = i;
    }

    public void setPINSIGFloorLimit(int i) {
        this.f107744x = i;
    }

    public void setRequestedTags(int[] iArr) {
        this.B = iArr;
    }

    public void setSIGFloorLimit(int i) {
        this.f107743w = i;
    }

    public void setSequenceCounter(int i) {
        this.f107742t = i;
    }

    public void setTacDefault(byte[] bArr) {
        this.f107737n = bArr;
    }

    public void setTacDenial(byte[] bArr) {
        this.o = bArr;
    }

    public void setTacOnline(byte[] bArr) {
        this.f107738p = bArr;
    }

    public void setTargetPercent(int i) {
        this.f107745y = i;
    }

    public void setTdol(byte[] bArr) {
        this.f107740r = bArr;
    }

    public void setThreshOldValue(int i) {
        this.z = i;
    }

    public void setTvr(byte[] bArr) {
        this.f107736m = bArr;
    }
}
