package com.youTransactor.uCube.rpc.command;

import androidx.annotation.NonNull;
import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.Tools;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.Currency;
import com.youTransactor.uCube.rpc.EMVApplicationDescriptor;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.SecurityMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes17.dex */
public class InitTransactionCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f107691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f107692n;
    public final Currency o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte f107693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte f107694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f107695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EMVApplicationDescriptor f107696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f107697t;
    public int[] u;
    public Date v;

    public InitTransactionCommand(long j2, @NonNull Currency currency, byte b4, @NonNull EMVApplicationDescriptor eMVApplicationDescriptor) {
        super(Constants.TRANSACTION_INIT, SecurityMode.SIGNED_NOT_CHECKED, SecurityMode.SIGNED_CIPHERED);
        this.f107692n = 0;
        this.f107694q = (byte) 9;
        this.f107691m = j2;
        this.o = currency;
        this.f107693p = b4;
        this.f107696s = eMVApplicationDescriptor;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public byte[] createPayload() {
        byte[] bArr = new byte[500];
        bArr[0] = -124;
        bArr[1] = (byte) this.f107696s.getAid().length;
        System.arraycopy(this.f107696s.getAid(), 0, bArr, 2, this.f107696s.getAid().length);
        int length = this.f107696s.getAid().length;
        bArr[length + 2] = 95;
        bArr[length + 3] = ISO7816.INS_PSO;
        bArr[length + 4] = 2;
        System.arraycopy(Tools.toBCD(this.o.getCode(), 2), 0, bArr, length + 5, 2);
        bArr[length + 7] = 95;
        bArr[length + 8] = 54;
        bArr[length + 9] = 1;
        bArr[length + 10] = (byte) this.o.getExponent();
        bArr[length + 11] = -100;
        bArr[length + 12] = 1;
        bArr[length + 13] = this.f107693p;
        bArr[length + 14] = -97;
        bArr[length + 15] = 2;
        bArr[length + 16] = 6;
        System.arraycopy(Tools.toBCD(this.f107691m, 6), 0, bArr, length + 17, 6);
        int i = length + 23;
        if (this.f107693p == 9) {
            bArr[i] = -97;
            bArr[length + 24] = 3;
            bArr[length + 25] = 6;
            System.arraycopy(Tools.toBCD(this.f107692n, 6), 0, bArr, length + 26, 6);
            i = length + 32;
        }
        bArr[i] = -97;
        bArr[i + 1] = 57;
        bArr[i + 2] = 1;
        int i2 = i + 4;
        bArr[i + 3] = this.f107694q;
        ArrayList arrayList = this.f107695r;
        if (arrayList != null && arrayList.size() > 0) {
            bArr[i2] = -33;
            int i3 = i + 6;
            bArr[i + 5] = 45;
            int i5 = i + 7;
            bArr[i3] = (byte) (this.f107695r.size() * 2);
            ArrayList arrayList2 = this.f107695r;
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList2.get(i6);
                i6++;
                byte[] bytes = ((String) obj2).getBytes();
                int i21 = i5 + 1;
                bArr[i5] = bytes[0];
                i5 += 2;
                bArr[i21] = bytes[1];
            }
            i2 = i5;
        }
        bArr[i2] = -33;
        bArr[i2 + 1] = 80;
        bArr[i2 + 2] = 1;
        int i22 = i2 + 4;
        bArr[i2 + 3] = this.f107697t ? (byte) 1 : (byte) 0;
        if (this.v != null) {
            Calendar.getInstance().setTime(this.v);
            bArr[i22] = -102;
            bArr[i2 + 5] = 3;
            bArr[i2 + 6] = Tools.toBCD(r1.get(1), 1)[0];
            bArr[i2 + 7] = Tools.toBCD(r1.get(2) + 1, 1)[0];
            bArr[i2 + 8] = Tools.toBCD(r1.get(5), 1)[0];
            bArr[i2 + 9] = -97;
            bArr[i2 + 10] = Constants.NFC_READER;
            bArr[i2 + 11] = 3;
            bArr[i2 + 12] = Tools.toBCD(r1.get(11), 1)[0];
            bArr[i2 + 13] = Tools.toBCD(r1.get(12), 1)[0];
            bArr[i2 + 14] = Tools.toBCD(r1.get(13), 1)[0];
            i22 = i2 + 15;
        }
        int[] iArr = this.u;
        if (iArr != null) {
            byte[] bArr2 = new byte[iArr.length * 2];
            int iWriteTagID = 0;
            for (int i32 : iArr) {
                iWriteTagID += TLV.writeTagID(i32, bArr2, iWriteTagID);
            }
            int i33 = i22 + 1;
            bArr[i22] = -63;
            int i43 = i22 + 2;
            bArr[i33] = (byte) iWriteTagID;
            System.arraycopy(bArr2, 0, bArr, i43, iWriteTagID);
            i22 = i43 + iWriteTagID;
        }
        return Arrays.copyOfRange(bArr, 0, i22);
    }

    public void setCashbackAmount(int i) {
        this.f107692n = i;
    }

    public void setDate(Date date) {
        this.v = date;
    }

    public void setEnableTIP(boolean z) {
        this.f107697t = z;
    }

    public void setPreferredLanguageList(List<String> list) {
        this.f107695r = new ArrayList();
        for (String str : list) {
            if (str != null && str.length() == 2) {
                this.f107695r.add(str);
            }
        }
    }

    public void setRequestedTagList(int[] iArr) {
        this.u = iArr;
    }
}
