package bmm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mmm.m f16929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f16930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f16931c;
    public static final String[] d;

    static {
        mmm.m.Companion.getClass();
        f16929a = mmm.l.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f16930b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f16931c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(...)");
            strArr[i] = kotlin.text.a0.E(vlm.j.g("%8s", binaryString), zsc.p.SPACE_CHAR, '0');
        }
        d = strArr;
        String[] strArr2 = f16931c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = v0.a.i(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i5 = iArr2[i3];
            int i6 = iArr[0];
            String[] strArr3 = f16931c;
            int i21 = i6 | i5;
            strArr3[i21] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb6 = new StringBuilder();
            sb6.append(strArr3[i6]);
            sb6.append('|');
            strArr3[i21 | 8] = v0.a.i(sb6, strArr3[i5], "|PADDED");
        }
        int length = f16931c.length;
        for (int i22 = 0; i22 < length; i22++) {
            String[] strArr4 = f16931c;
            if (strArr4[i22] == null) {
                strArr4[i22] = d[i22];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = f16930b;
        return i < strArr.length ? strArr[i] : vlm.j.g("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            java.lang.String r0 = a(r6)
            if (r7 != 0) goto L9
            java.lang.String r6 = ""
            goto L58
        L9:
            r1 = 2
            java.lang.String[] r2 = bmm.i.d
            if (r6 == r1) goto L56
            r1 = 3
            if (r6 == r1) goto L56
            r1 = 4
            if (r6 == r1) goto L4d
            r1 = 6
            if (r6 == r1) goto L4d
            r1 = 7
            if (r6 == r1) goto L56
            r1 = 8
            if (r6 == r1) goto L56
            java.lang.String[] r1 = bmm.i.f16931c
            int r3 = r1.length
            if (r7 >= r3) goto L29
            r1 = r1[r7]
            kotlin.jvm.internal.Intrinsics.h(r1)
            goto L2b
        L29:
            r1 = r2[r7]
        L2b:
            r2 = 5
            r3 = 0
            if (r6 != r2) goto L3c
            r2 = r7 & 4
            if (r2 == 0) goto L3c
            java.lang.String r6 = "HEADERS"
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r6 = kotlin.text.a0.D(r1, r6, r7, r3)
            goto L58
        L3c:
            if (r6 != 0) goto L4b
            r6 = r7 & 32
            if (r6 == 0) goto L4b
            java.lang.String r6 = "PRIORITY"
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r6 = kotlin.text.a0.D(r1, r6, r7, r3)
            goto L58
        L4b:
            r6 = r1
            goto L58
        L4d:
            r6 = 1
            if (r7 != r6) goto L53
            java.lang.String r6 = "ACK"
            goto L58
        L53:
            r6 = r2[r7]
            goto L58
        L56:
            r6 = r2[r7]
        L58:
            if (r8 == 0) goto L5d
            java.lang.String r7 = "<<"
            goto L5f
        L5d:
            java.lang.String r7 = ">>"
        L5f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r4, r5, r0, r6}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = vlm.j.g(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bmm.i.b(int, int, int, int, boolean):java.lang.String");
    }

    public static String c(int i, int i2, long j2, boolean z) {
        return vlm.j.g("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a(8), Long.valueOf(j2));
    }
}
