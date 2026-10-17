package mem;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f204798a = 0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[PHI: r7
      0x0056: PHI (r7v2 long) = (r7v1 long), (r7v0 long) binds: [B:18:0x0064, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            mem.a r0 = mem.c.Companion
            kem.x r1 = kem.y.Companion
            r1.getClass()
            java.util.List r1 = kem.y.f183242g
            com.fourthline.vision.internal.qh r2 = new com.fourthline.vision.internal.qh
            r3 = 27
            r2.<init>(r3)
            f3.a r3 = new f3.a
            r4 = 2
            r3.<init>(r4)
            r0.getClass()
            mem.a.a(r1, r2, r3)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 1
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r5 = zhm.w.t(r0, r4)
            r2.<init>(r5)
            vim.f r0 = r0.iterator()
        L34:
            boolean r5 = r0.f289625c
            if (r5 == 0) goto L71
            int r5 = r0.nextInt()
            r6 = 48
            if (r6 > r5) goto L49
            r6 = 58
            if (r5 >= r6) goto L49
            long r5 = (long) r5
            r7 = 48
            long r5 = r5 - r7
            goto L69
        L49:
            long r5 = (long) r5
            r7 = 97
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L5a
            r9 = 102(0x66, double:5.04E-322)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 > 0) goto L5a
        L56:
            long r5 = r5 - r7
            long r7 = (long) r4
            long r5 = r5 + r7
            goto L69
        L5a:
            r7 = 65
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L67
            r9 = 70
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 > 0) goto L67
            goto L56
        L67:
            r5 = -1
        L69:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2.add(r5)
            goto L34
        L71:
            zhm.d0.e1(r2)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r2 = 15
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = zhm.w.t(r0, r4)
            r1.<init>(r2)
            vim.f r0 = r0.iterator()
        L88:
            boolean r2 = r0.f289625c
            if (r2 == 0) goto La4
            int r2 = r0.nextInt()
            if (r2 >= r4) goto L96
            int r2 = r2 + 48
        L94:
            byte r2 = (byte) r2
            goto L9c
        L96:
            int r2 = r2 + 97
            char r2 = (char) r2
            int r2 = r2 - r4
            char r2 = (char) r2
            goto L94
        L9c:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r1.add(r2)
            goto L88
        La4:
            zhm.d0.Y0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mem.h.<clinit>():void");
    }

    public static final int a(CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int i3 = 0;
        while (i < i2) {
            int iCharAt = charSequence.charAt(i);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i3 = (i3 * 31) + iCharAt;
            i++;
        }
        return i3;
    }

    public static final void b(int i, CharSequence charSequence) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + ((d) charSequence).charAt(i) + " at position " + i);
    }
}
