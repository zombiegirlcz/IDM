package xh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f305783a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f305784b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f305785c;
    public static final int[][] d;

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f305785c = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f305785c[0][i] = i - 63;
        }
        f305785c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f305785c[1][i2] = i2 - 95;
        }
        f305785c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f305785c[2][i3] = i3 - 46;
        }
        int[] iArr2 = f305785c[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, CertificateBody.profileType};
        for (int i5 = 0; i5 < 28; i5++) {
            f305785c[3][iArr3[i5]] = i5;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, ISO781611.SMT_TAG};
        for (int i6 = 0; i6 < 31; i6++) {
            int i21 = iArr4[i6];
            if (i21 > 0) {
                f305785c[4][i21] = i6;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = d;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it8 = linkedList.iterator();
        while (it8.hasNext()) {
            e eVar = (e) it8.next();
            Iterator it9 = linkedList2.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    linkedList2.add(eVar);
                    break;
                }
                e eVar2 = (e) it9.next();
                if (eVar2.c(eVar)) {
                    break;
                }
                if (eVar.c(eVar2)) {
                    it9.remove();
                }
            }
        }
        return linkedList2;
    }
}
