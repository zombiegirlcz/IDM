package com.youTransactor.uCube.rpc;

import com.youTransactor.uCube.TLV;
import com.youTransactor.uCube.Tools;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class EMVApplicationDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f107632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f107633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107634c;
    public int d;
    public byte e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f107635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f107636h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f107637j;

    public static EMVApplicationDescriptor parseLegacy(byte[] bArr, int i) {
        EMVApplicationDescriptor eMVApplicationDescriptor = new EMVApplicationDescriptor();
        int i2 = i + 1;
        if (bArr[i] != -124) {
            return null;
        }
        int i3 = i + 2;
        eMVApplicationDescriptor.f107632a = Arrays.copyOfRange(bArr, i3, bArr[i2] + i3);
        int i5 = i + 18;
        int i6 = i5 + (bArr[i5] == 80 ? 2 : 3);
        int i21 = 0;
        while (bArr[i6 + i21] != 0) {
            i21++;
        }
        eMVApplicationDescriptor.f107633b = new String(bArr, i6, i21);
        eMVApplicationDescriptor.f107634c = bArr[i6 + 18] & 15;
        eMVApplicationDescriptor.d = bArr[i6 + 22] & 15;
        eMVApplicationDescriptor.e = (byte) (bArr[i6 + 26] & 240);
        int i22 = i6 + 31;
        eMVApplicationDescriptor.f = bArr[i6 + 30] == 1;
        int i32 = i6 + 34;
        if (i32 < bArr.length && bArr[i22] == 95 && bArr[i6 + 32] == 45) {
            i22 = i32 + bArr[i6 + 33];
            eMVApplicationDescriptor.f107635g = Arrays.copyOfRange(bArr, i32, i22);
        }
        int i33 = i22 + 3;
        if (i33 < bArr.length && bArr[i22] == -65 && bArr[i22 + 1] == 12) {
            i22 = i33 + bArr[i22 + 2];
            eMVApplicationDescriptor.f107636h = Arrays.copyOfRange(bArr, i33, i22);
        }
        int i43 = i22 + 3;
        if (i43 < bArr.length && bArr[i22] == -97 && bArr[i22 + 1] == 10) {
            eMVApplicationDescriptor.i = Arrays.copyOfRange(bArr, i43, bArr[i22 + 2] + i43);
        }
        eMVApplicationDescriptor.f107637j = 64;
        return eMVApplicationDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EMVApplicationDescriptor parseTLV(byte[] bArr, int i) {
        int length;
        int i2;
        Integer numValueOf = Integer.valueOf(Constants.TAG_APP_FCI_ISSUER_DISCRETIONARY_DATA);
        Integer numValueOf2 = Integer.valueOf(Constants.TAG_APP_SRPD);
        Integer numValueOf3 = Integer.valueOf(Constants.TAG_APP_LANGUAGE);
        Integer numValueOf4 = Integer.valueOf(Constants.TAG_APP_STATUS);
        Integer numValueOf5 = Integer.valueOf(Constants.TAG_APP_SELECT_OPT);
        Integer numValueOf6 = Integer.valueOf(Constants.TAG_APP_ISSUER_CODE_INDEX);
        EMVApplicationDescriptor eMVApplicationDescriptor = new EMVApplicationDescriptor();
        Map<Integer, byte[]> withRedundancy = TLV.parseWithRedundancy(bArr, i, 64);
        if (withRedundancy.containsKey(132)) {
            byte[] bArr2 = withRedundancy.get(132);
            eMVApplicationDescriptor.f107632a = bArr2;
            length = bArr2.length + 2;
        } else {
            length = 0;
        }
        if (withRedundancy.containsKey(80)) {
            byte[] bArr3 = withRedundancy.get(80);
            StringBuilder sb6 = new StringBuilder("");
            int length2 = bArr3.length;
            i2 = 0;
            int i3 = 0;
            while (i3 < length2) {
                int i5 = length;
                byte b4 = bArr3[i3];
                if (b4 != 0) {
                    sb6.append((char) b4);
                }
                i3++;
                length = i5;
            }
            eMVApplicationDescriptor.f107633b = sb6.toString();
            length = length + 2 + bArr3.length;
        } else {
            i2 = 0;
        }
        if (withRedundancy.containsKey(40722)) {
            byte[] bArr4 = withRedundancy.get(40722);
            StringBuilder sb9 = new StringBuilder("");
            int length3 = bArr4.length;
            for (int i6 = i2; i6 < length3; i6++) {
                byte b5 = bArr4[i6];
                if (b5 != 0) {
                    sb9.append((char) b5);
                }
            }
            eMVApplicationDescriptor.f107633b = sb9.toString();
            length = length + 3 + bArr4.length;
        }
        if (withRedundancy.containsKey(135)) {
            eMVApplicationDescriptor.f107634c = withRedundancy.get(135)[i2] & 15;
            length = length + 2 + withRedundancy.get(135).length;
        }
        if (withRedundancy.containsKey(numValueOf6)) {
            eMVApplicationDescriptor.d = withRedundancy.get(numValueOf6)[i2] & 15;
            length = length + 3 + withRedundancy.get(numValueOf6).length;
        }
        if (withRedundancy.containsKey(numValueOf5)) {
            eMVApplicationDescriptor.e = (byte) (withRedundancy.get(numValueOf5)[i2] & 240);
            length = length + 3 + withRedundancy.get(numValueOf5).length;
        }
        if (withRedundancy.containsKey(numValueOf4)) {
            eMVApplicationDescriptor.f = withRedundancy.get(numValueOf4)[i2] == 1 ? 1 : i2;
            length = length + 3 + withRedundancy.get(numValueOf4).length;
        }
        if (withRedundancy.containsKey(numValueOf3)) {
            eMVApplicationDescriptor.f107635g = withRedundancy.get(numValueOf3);
            length = length + 3 + withRedundancy.get(numValueOf3).length;
        }
        if (withRedundancy.containsKey(numValueOf2)) {
            eMVApplicationDescriptor.i = withRedundancy.get(numValueOf2);
            length = length + 3 + withRedundancy.get(numValueOf2).length;
        }
        if (withRedundancy.containsKey(numValueOf)) {
            eMVApplicationDescriptor.f107636h = withRedundancy.get(numValueOf);
            length = length + 3 + withRedundancy.get(numValueOf).length;
        }
        eMVApplicationDescriptor.f107637j = length;
        return eMVApplicationDescriptor;
    }

    public byte[] getAid() {
        return this.f107632a;
    }

    public int getApplicationBufferLen() {
        return this.f107637j;
    }

    public byte[] getFci() {
        return this.f107636h;
    }

    public int getIssuerCodeIndex() {
        return this.d;
    }

    public String getLabel() {
        return this.f107633b;
    }

    public byte[] getLanguagePreference() {
        return this.f107635g;
    }

    public int getPriority() {
        return this.f107634c;
    }

    public byte[] getProductId() {
        return this.i;
    }

    public byte getSelectionOptions() {
        return this.e;
    }

    public boolean isBlocked() {
        return this.f;
    }

    public String toString() {
        return "\nAID : " + Tools.bytesToHex(this.f107632a) + "\nLabel : " + this.f107633b + "\npriority : " + this.f107634c + "\nIssuer code index : " + this.d + "\nselectionOptions : " + Tools.neg_byte_to_int(this.e) + "\nBlocked status : " + this.f + "\nLanguage preference : " + Tools.bytesToHex(this.f107635g) + "\nFCI : " + Tools.bytesToHex(this.f107636h) + "\nProduct id : " + Tools.bytesToHex(this.i) + "\nApp Buffer length : " + this.f107637j;
    }
}
