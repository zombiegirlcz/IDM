package nmm;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import mmm.n0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f217392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f217393b;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f217392a = bytes;
        f217393b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(mmm.h hVar, mmm.m bytes, long j2, long j3, int i) {
        n0 n0Var;
        byte[] bArr;
        long j5 = j2;
        long j16 = j3;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j22 = i;
        mmm.b.b(bytes.d(), 0, j22);
        if (i <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j42 = 0;
        if (j5 < 0) {
            throw new IllegalArgumentException(p.a.m(j5, "fromIndex < 0: ").toString());
        }
        if (j5 > j16) {
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j5, "fromIndex > toIndex: ", " > ");
            sbV.append(j16);
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        long j46 = hVar.f207266b;
        if (j16 > j46) {
            j16 = j46;
        }
        if (j5 == j16 || (n0Var = hVar.f207265a) == null) {
            return -1L;
        }
        if (j46 - j5 >= j5) {
            while (true) {
                long j47 = ((long) (n0Var.f207293c - n0Var.f207292b)) + j42;
                if (j47 > j5) {
                    break;
                }
                n0Var = n0Var.f;
                Intrinsics.h(n0Var);
                j42 = j47;
            }
            byte[] bArrI = bytes.i();
            byte b4 = bArrI[0];
            long jMin = Math.min(j16, (hVar.f207266b - j22) + 1);
            while (j42 < jMin) {
                byte[] bArr2 = n0Var.f207291a;
                int iMin = (int) Math.min(n0Var.f207293c, (((long) n0Var.f207292b) + jMin) - j42);
                for (int i2 = (int) ((((long) n0Var.f207292b) + j5) - j42); i2 < iMin; i2++) {
                    if (bArr2[i2] == b4 && b(n0Var, i2 + 1, bArrI, 1, i)) {
                        return ((long) (i2 - n0Var.f207292b)) + j42;
                    }
                }
                j42 += (long) (n0Var.f207293c - n0Var.f207292b);
                n0Var = n0Var.f;
                Intrinsics.h(n0Var);
                j5 = j42;
            }
            return -1L;
        }
        while (j46 > j5) {
            n0Var = n0Var.f207294g;
            Intrinsics.h(n0Var);
            j46 -= (long) (n0Var.f207293c - n0Var.f207292b);
        }
        byte[] bArrI2 = bytes.i();
        byte b5 = bArrI2[0];
        byte[] bArr3 = bArrI2;
        long jMin2 = Math.min(j16, (hVar.f207266b - j22) + 1);
        while (j46 < jMin2) {
            byte[] bArr4 = n0Var.f207291a;
            int iMin2 = (int) Math.min(n0Var.f207293c, (((long) n0Var.f207292b) + jMin2) - j46);
            int i3 = (int) ((((long) n0Var.f207292b) + j5) - j46);
            while (i3 < iMin2) {
                if (bArr4[i3] == b5) {
                    bArr = bArr3;
                    if (b(n0Var, i3 + 1, bArr, 1, i)) {
                        return ((long) (i3 - n0Var.f207292b)) + j46;
                    }
                } else {
                    bArr = bArr3;
                }
                i3++;
                bArr3 = bArr;
            }
            j46 += (long) (n0Var.f207293c - n0Var.f207292b);
            n0Var = n0Var.f;
            Intrinsics.h(n0Var);
            j5 = j46;
        }
        return -1L;
    }

    public static final boolean b(n0 segment, int i, byte[] bytes, int i2, int i3) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i5 = segment.f207293c;
        byte[] bArr = segment.f207291a;
        while (i2 < i3) {
            if (i == i5) {
                segment = segment.f;
                Intrinsics.h(segment);
                byte[] bArr2 = segment.f207291a;
                bArr = bArr2;
                i = segment.f207292b;
                i5 = segment.f207293c;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(mmm.h hVar, long j2) throws EOFException {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (hVar.j(j3) == 13) {
                String strP = hVar.p(j3, Charsets.UTF_8);
                hVar.skip(2L);
                return strP;
            }
        }
        String strP2 = hVar.p(j2, Charsets.UTF_8);
        hVar.skip(1L);
        return strP2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(mmm.h r16, mmm.f0 r17, boolean r18) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            mmm.n0 r0 = r0.f207265a
            r2 = -1
            if (r0 != 0) goto L17
            if (r18 == 0) goto L16
            goto L63
        L16:
            return r2
        L17:
            byte[] r3 = r0.f207291a
            int r4 = r0.f207292b
            int r5 = r0.f207293c
            int[] r1 = r1.f207264b
            r6 = 0
            r8 = r0
            r9 = r2
            r7 = r6
        L23:
            int r10 = r7 + 1
            r11 = r1[r7]
            int r7 = r7 + 2
            r10 = r1[r10]
            if (r10 == r2) goto L2e
            r9 = r10
        L2e:
            if (r8 != 0) goto L31
            goto L61
        L31:
            r10 = 0
            if (r11 >= 0) goto L79
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L38:
            int r11 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r1[r7]
            if (r4 == r7) goto L45
            goto L83
        L45:
            if (r13 != r12) goto L49
            r4 = 1
            goto L4a
        L49:
            r4 = r6
        L4a:
            if (r11 != r5) goto L69
            kotlin.jvm.internal.Intrinsics.h(r8)
            mmm.n0 r3 = r8.f
            kotlin.jvm.internal.Intrinsics.h(r3)
            int r5 = r3.f207292b
            byte[] r7 = r3.f207291a
            int r8 = r3.f207293c
            if (r3 != r0) goto L65
            if (r4 == 0) goto L61
            r3 = r7
            r7 = r10
            goto L6c
        L61:
            if (r18 == 0) goto L83
        L63:
            r0 = -2
            return r0
        L65:
            r15 = r7
            r7 = r3
            r3 = r15
            goto L6c
        L69:
            r7 = r8
            r8 = r5
            r5 = r11
        L6c:
            if (r4 == 0) goto L74
            r4 = r1[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto La5
        L74:
            r4 = r5
            r5 = r8
            r8 = r7
            r7 = r13
            goto L38
        L79:
            int r12 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L81:
            if (r7 != r13) goto L84
        L83:
            return r9
        L84:
            r14 = r1[r7]
            if (r4 != r14) goto Laf
            int r7 = r7 + r11
            r4 = r1[r7]
            if (r12 != r5) goto La3
            mmm.n0 r8 = r8.f
            kotlin.jvm.internal.Intrinsics.h(r8)
            int r3 = r8.f207292b
            byte[] r5 = r8.f207291a
            int r7 = r8.f207293c
            if (r8 != r0) goto L9f
            r8 = r5
            r5 = r3
            r3 = r8
            r8 = r10
            goto La5
        L9f:
            r15 = r5
            r5 = r3
            r3 = r15
            goto La5
        La3:
            r7 = r5
            r5 = r12
        La5:
            if (r4 < 0) goto La8
            return r4
        La8:
            int r4 = -r4
            r15 = r7
            r7 = r4
            r4 = r5
            r5 = r15
            goto L23
        Laf:
            int r7 = r7 + 1
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: nmm.a.d(mmm.h, mmm.f0, boolean):int");
    }
}
