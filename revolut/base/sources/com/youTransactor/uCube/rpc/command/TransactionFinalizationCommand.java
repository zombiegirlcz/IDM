package com.youTransactor.uCube.rpc.command;

import com.google.common.base.Ascii;
import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCCommandStatus;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes17.dex */
public class TransactionFinalizationCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f107729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f107730n;
    public byte[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f107731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f107732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f107733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f107734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f107735t;
    public HashMap u;

    public TransactionFinalizationCommand() {
        super(Constants.TRANSACTION_FINAL, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
        this.f107729m = (byte) 0;
        this.f107730n = (byte) 2;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArr = new byte[1024];
        bArr[0] = -33;
        bArr[1] = Ascii.NAK;
        bArr[2] = 1;
        bArr[3] = this.f107729m;
        bArr[4] = -33;
        bArr[5] = Ascii.SYN;
        bArr[6] = 1;
        bArr[7] = this.f107730n;
        byte[] bArr2 = this.o;
        int length = 8;
        if (bArr2 != null) {
            bArr[8] = ISOFileInfo.LCS_BYTE;
            bArr[9] = 2;
            bArr[10] = bArr2[0];
            bArr[11] = bArr2[1];
            length = 12;
        }
        byte[] bArr3 = this.f107731p;
        if (bArr3 != null) {
            int i = length + 1;
            bArr[length] = -111;
            int i2 = length + 2;
            bArr[i] = (byte) bArr3.length;
            System.arraycopy(bArr3, 0, bArr, i2, bArr3.length);
            length = i2 + this.f107731p.length;
        }
        byte[] bArr4 = this.f107732q;
        if (bArr4 != null) {
            int i3 = length + 1;
            bArr[length] = 113;
            int i5 = length + 2;
            bArr[i3] = (byte) bArr4.length;
            System.arraycopy(bArr4, 0, bArr, i5, bArr4.length);
            length = i5 + this.f107732q.length;
        }
        byte[] bArr5 = this.f107733r;
        if (bArr5 != null) {
            int i6 = length + 1;
            bArr[length] = 114;
            int i21 = length + 2;
            bArr[i6] = (byte) bArr5.length;
            System.arraycopy(bArr5, 0, bArr, i21, bArr5.length);
            length = i21 + this.f107733r.length;
        }
        int[] iArr = this.f107734s;
        if (iArr != null) {
            byte[] bArr6 = new byte[iArr.length * 2];
            int iWriteTagID = 0;
            for (int i22 : iArr) {
                iWriteTagID += TLV.writeTagID(i22, bArr6, iWriteTagID);
            }
            int i32 = length + 1;
            bArr[length] = -63;
            int i33 = length + 2;
            bArr[i32] = (byte) iWriteTagID;
            System.arraycopy(bArr6, 0, bArr, i33, iWriteTagID);
            length = i33 + iWriteTagID;
        }
        return Arrays.copyOfRange(bArr, 0, length);
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public RPCCommandStatus getCommandStatusValue() {
        return RPCCommandStatus.SUCCESS;
    }

    public Map<Integer, byte[]> getTagsTLV() {
        return this.u;
    }

    public byte[] getTransactionData() {
        return null;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean isValidResponse() {
        return this.response.getStatus() == 7 || this.response.getStatus() == 8;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        this.f107735t = TLV.parse(this.response.getData());
        int[] iArr = this.f107734s;
        if (iArr == null || iArr.length <= 0) {
            return true;
        }
        this.u = new HashMap();
        for (int i : this.f107734s) {
            this.u.put(Integer.valueOf(i), (byte[]) this.f107735t.get(Integer.valueOf(i)));
        }
        return true;
    }

    public void setAuthResponse(byte[] bArr) {
        setAuthResponse(TLV.parse(bArr));
    }

    public void setAuthResponseCode(byte[] bArr) {
        this.o = bArr;
        if (bArr == null || bArr.length != 2) {
            return;
        }
        byte b4 = bArr[0];
        if (b4 == 57) {
            this.f107730n = (byte) 0;
        } else if (b4 == 48 && bArr[1] == 48) {
            this.f107730n = (byte) 1;
        } else {
            this.f107730n = (byte) 2;
        }
    }

    public void setAuthorizationStatus(byte b4) {
        this.f107730n = b4;
    }

    public void setForceFlag(byte b4) {
        this.f107729m = b4;
    }

    public void setIssuerDataAuth(byte[] bArr) {
        this.f107731p = bArr;
    }

    public void setIssuerScript1(byte[] bArr) {
        this.f107732q = bArr;
    }

    public void setIssuerScript2(byte[] bArr) {
        this.f107733r = bArr;
    }

    public void setRequestedTags(int[] iArr) {
        this.f107734s = iArr;
    }

    public void setAuthResponse(Map<Integer, byte[]> map) {
        setAuthResponseCode(map.get(138));
        setIssuerDataAuth(map.get(145));
        setIssuerScript1(map.get(113));
        setIssuerScript2(map.get(114));
    }
}
