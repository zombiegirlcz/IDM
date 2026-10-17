package hcm;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;
import gcm.h6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class h0 {
    static {
        Logger.getLogger(h0.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size][];
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (it8.hasNext()) {
            icm.c cVar = (icm.c) it8.next();
            int i2 = i + 1;
            bArr[i] = cVar.f160311a.u();
            i += 2;
            bArr[i2] = cVar.f160312b.u();
        }
        byte[] bArr2 = h6.f142677b;
        int i3 = 0;
        while (i3 < size) {
            byte[] bArr3 = bArr[i3];
            int i5 = i3 + 1;
            byte[] bArr4 = bArr[i5];
            if (h6.a(bArr3, bArr2)) {
                for (byte b4 : bArr4) {
                    if (b4 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i6 = 0; i6 < i3; i6++) {
                            arrayList2.add(bArr[i6]);
                        }
                        while (i3 < size) {
                            byte[] bArr5 = bArr[i3];
                            byte[] bArr6 = bArr[i3 + 1];
                            if (h6.a(bArr5, bArr2)) {
                                int i21 = 0;
                                for (int i22 = 0; i22 <= bArr6.length; i22++) {
                                    if (i22 == bArr6.length || bArr6[i22] == 44) {
                                        byte[] bArrDecode = BaseEncoding.base64().decode(new String(bArr6, i21, i22 - i21, Charsets.US_ASCII));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(bArrDecode);
                                        i21 = i22 + 1;
                                    }
                                }
                            } else {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            }
                            i3 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0][]);
                    }
                }
                bArr[i5] = BaseEncoding.base64().decode(new String(bArr4, Charsets.US_ASCII));
            }
            i3 += 2;
        }
        return bArr;
    }
}
