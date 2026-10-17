package gn0;

import mlm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144897c;
    public final String d;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f144895a = null;
        } else {
            this.f144895a = str;
        }
        if ((i & 2) == 0) {
            this.f144896b = null;
        } else {
            this.f144896b = str2;
        }
        if ((i & 4) == 0) {
            this.f144897c = null;
        } else {
            this.f144897c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof gn0.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gn0.c r5 = (gn0.c) r5
            java.lang.String r1 = r4.f144895a
            java.lang.String r3 = r5.f144895a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f144896b
            java.lang.String r3 = r4.f144896b
            if (r3 != 0) goto L23
            if (r1 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r1 != 0) goto L26
            goto L21
        L26:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r5.f144897c
            java.lang.String r3 = r4.f144897c
            if (r3 != 0) goto L39
            if (r1 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r1 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r5 = r5.d
            java.lang.String r1 = r4.d
            if (r1 != 0) goto L4f
            if (r5 != 0) goto L4d
            r5 = r0
            goto L56
        L4d:
            r5 = r2
            goto L56
        L4f:
            if (r5 != 0) goto L52
            goto L4d
        L52:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L56:
            if (r5 != 0) goto L59
            return r2
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gn0.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f144895a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f144896b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f144897c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public c(String str, String str2, String str3, String str4) {
        this.f144895a = str;
        this.f144896b = str2;
        this.f144897c = str3;
        this.d = str4;
    }
}
