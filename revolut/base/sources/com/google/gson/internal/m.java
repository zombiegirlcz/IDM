package com.google.gson.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49645a;

    public /* synthetic */ m(int i) {
        this.f49645a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.f49645a
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L48;
                default: goto L5;
            }
        L5:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.length()
            int r1 = r6.length()
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 4
        L20:
            if (r1 >= r0) goto L36
            char r2 = r5.charAt(r1)
            char r3 = r6.charAt(r1)
            if (r2 == r3) goto L33
            int r5 = kotlin.jvm.internal.Intrinsics.k(r2, r3)
            if (r5 >= 0) goto L44
            goto L42
        L33:
            int r1 = r1 + 1
            goto L20
        L36:
            int r5 = r5.length()
            int r6 = r6.length()
            if (r5 == r6) goto L46
            if (r5 >= r6) goto L44
        L42:
            r5 = -1
            goto L47
        L44:
            r5 = 1
            goto L47
        L46:
            r5 = 0
        L47:
            return r5
        L48:
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r5 = r5.compareTo(r6)
            return r5
        L4f:
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            int r5 = r5.compareTo(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.m.compare(java.lang.Object, java.lang.Object):int");
    }
}
