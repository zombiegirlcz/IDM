package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class CompleteNFCTransactionCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f107662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f107663n;
    public final byte[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f107664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f107665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f107666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte f107667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f107668t;

    public CompleteNFCTransactionCommand(byte[] bArr) {
        super(Constants.COMPLETE_NFC_TRANSACTION, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED);
        Map<Integer, byte[]> map = TLV.parse(bArr);
        if (map != null) {
            byte[] bArr2 = map.get(138);
            this.f107662m = bArr2;
            if (bArr2 == null || bArr2.length != 2) {
                this.f107662m = new byte[]{96, 96};
            }
            this.f107663n = map.get(113);
            this.o = map.get(114);
            this.f107664p = map.get(Integer.valueOf(Constants.TAG_HOST_RESPONSE_DATA));
        }
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArr = new byte[255];
        bArr[0] = -33;
        bArr[1] = 115;
        byte[] bArr2 = this.f107663n;
        int length = (bArr2 != null ? bArr2.length + 2 : 0) + 2;
        byte[] bArr3 = this.o;
        bArr[2] = (byte) (length + (bArr3 != null ? bArr3.length + 2 : 0));
        int length2 = 3;
        if (bArr2 != null && bArr2.length != 0) {
            bArr[3] = 113;
            bArr[4] = (byte) bArr2.length;
            System.arraycopy(bArr2, 0, bArr, 5, bArr2.length);
            length2 = this.f107663n.length + 5;
        }
        byte[] bArr4 = this.o;
        if (bArr4 != null && bArr4.length != 0) {
            int i = length2 + 1;
            bArr[length2] = 114;
            int i2 = length2 + 2;
            bArr[i] = (byte) bArr4.length;
            System.arraycopy(bArr4, 0, bArr, i2, bArr4.length);
            length2 = i2 + this.o.length;
        }
        System.arraycopy(this.f107662m, 0, bArr, length2, 2);
        int length3 = length2 + 2;
        byte[] bArr5 = this.f107664p;
        if (bArr5 != null && bArr5.length != 0) {
            bArr[length3] = -33;
            int i3 = length2 + 4;
            bArr[length2 + 3] = 118;
            int i5 = length2 + 5;
            bArr[i3] = (byte) bArr5.length;
            System.arraycopy(bArr5, 0, bArr, i5, bArr5.length);
            length3 = i5 + this.f107664p.length;
        }
        List list = this.f107665q;
        if (list != null && list.size() > 0) {
            byte[] bArr6 = new byte[this.f107665q.size() * 2];
            int iMin = 0;
            for (byte[] bArr7 : this.f107665q) {
                System.arraycopy(bArr7, 0, bArr6, iMin, Math.min(bArr7.length, 2));
                iMin += Math.min(bArr7.length, 2);
            }
            int i6 = length3 + 1;
            bArr[length3] = -63;
            int i21 = length3 + 2;
            bArr[i6] = (byte) iMin;
            System.arraycopy(bArr6, 0, bArr, i21, iMin);
            length3 = i21 + iMin;
        }
        return Arrays.copyOfRange(bArr, 0, length3);
    }

    public byte getActivatedReader() {
        return this.f107667s;
    }

    public byte[] getNFCOutcome() {
        return this.f107666r;
    }

    public Map<Integer, byte[]> getResponseTLV() {
        return this.f107668t;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        Integer numValueOf = Integer.valueOf(Constants.TAG_NFC_OUTCOME);
        Map<Integer, byte[]> map = TLV.parse(this.response.getData());
        this.f107668t = map;
        if (map.containsKey(57200)) {
            this.f107667s = ((byte[]) this.f107668t.get(57200))[0];
        }
        if (!this.f107668t.containsKey(numValueOf)) {
            return true;
        }
        this.f107666r = (byte[]) this.f107668t.get(numValueOf);
        return true;
    }

    public void setRequestedTagList(List<byte[]> list) {
        this.f107665q = list;
    }
}
