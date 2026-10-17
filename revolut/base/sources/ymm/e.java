package ymm;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends anm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f315063b = String.valueOf(CoreConstants.DOUBLE_QUOTE_CHAR);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f315064c = {CoreConstants.COMMA_CHAR, CoreConstants.DOUBLE_QUOTE_CHAR, '\r', '\n'};

    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    @Override // anm.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.CharSequence r13, int r14, java.io.StringWriter r15) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 != 0) goto Laf
            r14 = 0
            char r0 = r13.charAt(r14)
            r1 = 34
            if (r0 != r1) goto L9f
            int r0 = r13.length()
            r2 = 1
            int r0 = r0 - r2
            char r0 = r13.charAt(r0)
            if (r0 == r1) goto L19
            goto L9f
        L19:
            int r0 = r13.length()
            int r0 = r0 - r2
            java.lang.CharSequence r0 = r13.subSequence(r2, r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = ymm.g.d(r0)
            if (r1 != 0) goto L73
            char[] r1 = ymm.e.f315064c
            if (r1 != 0) goto L32
            r3 = r14
            goto L36
        L32:
            int r3 = java.lang.reflect.Array.getLength(r1)
        L36:
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3b
        L3a:
            r3 = r14
        L3b:
            if (r3 == 0) goto L3e
            goto L73
        L3e:
            int r3 = r0.length()
            int r4 = r1.length
            int r5 = r3 + (-1)
            int r6 = r4 + (-1)
            r7 = r14
        L48:
            if (r7 >= r3) goto L73
            char r8 = r0.charAt(r7)
            r9 = r14
        L4f:
            if (r9 >= r4) goto L70
            char r10 = r1[r9]
            if (r10 != r8) goto L6d
            boolean r10 = java.lang.Character.isHighSurrogate(r8)
            if (r10 == 0) goto L74
            if (r9 != r6) goto L5e
            goto L74
        L5e:
            if (r7 >= r5) goto L6d
            int r10 = r9 + 1
            char r10 = r1[r10]
            int r11 = r7 + 1
            char r11 = r0.charAt(r11)
            if (r10 != r11) goto L6d
            goto L74
        L6d:
            int r9 = r9 + 1
            goto L4f
        L70:
            int r7 = r7 + 1
            goto L48
        L73:
            r2 = r14
        L74:
            if (r2 == 0) goto L8f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ymm.e.f315063b
            r1.append(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = ymm.g.g(r0, r1, r2)
            r15.write(r0)
            goto L96
        L8f:
            java.lang.String r0 = r13.toString()
            r15.write(r0)
        L96:
            int r15 = r13.length()
            int r13 = java.lang.Character.codePointCount(r13, r14, r15)
            return r13
        L9f:
            java.lang.String r0 = r13.toString()
            r15.write(r0)
            int r15 = r13.length()
            int r13 = java.lang.Character.codePointCount(r13, r14, r15)
            return r13
        Laf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "CsvUnescaper should never reach the [1] index"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ymm.e.a(java.lang.CharSequence, int, java.io.StringWriter):int");
    }
}
