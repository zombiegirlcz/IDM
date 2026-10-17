package vlm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f290507a = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f290507a.f(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d8, code lost:
    
        if (r8 == 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
    
        if (r9 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00de, code lost:
    
        zhm.p.e(16 - (r8 - r9), r4, r9, r4, r8);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "<this>");
        java.util.Arrays.fill(r4, r9, (16 - r8) + r9, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ef, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] b(int r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vlm.g.b(int, int, java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x02eb, code lost:
    
        r0 = r2.q();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c7 A[LOOP:19: B:155:0x02c1->B:157:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f1  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8, types: [char] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vlm.g.c(java.lang.String):java.lang.String");
    }
}
