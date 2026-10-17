package bfm;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f15036a = Logger.getLogger(b.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:39:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(java.io.InputStream r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error closing input stream (ignored)"
            java.util.logging.Logger r1 = bfm.b.f15036a
            if (r7 != 0) goto Lb
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            java.util.List r7 = (java.util.List) r7
            return r7
        Lb:
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L43
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L43
            yem.l r2 = new yem.l     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r2.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r2.readExternal(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.ArrayList r4 = r2.a()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            if (r4 != 0) goto L36
            java.util.ArrayList r7 = r2.a()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.close()     // Catch: java.io.IOException -> L2b
            return r7
        L2b:
            r2 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r2)
            return r7
        L32:
            r2 = move-exception
            goto L4f
        L34:
            r2 = move-exception
            goto L47
        L36:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r4 = "Empty metadata"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            throw r2     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L3e:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L4f
        L43:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "Unable to parse metadata file"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L4f:
            if (r3 == 0) goto L5c
            r3.close()     // Catch: java.io.IOException -> L55
            goto L66
        L55:
            r7 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r7)
            goto L66
        L5c:
            r7.close()     // Catch: java.io.IOException -> L60
            goto L66
        L60:
            r7 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r7)
        L66:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bfm.b.a(java.io.InputStream):java.util.List");
    }
}
