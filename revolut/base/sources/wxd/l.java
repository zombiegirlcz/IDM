package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300872c;
    public final String d;
    public final e e;

    public l(String id10, String title, String str, String str2, e action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f300870a = id10;
        this.f300871b = title;
        this.f300872c = str;
        this.d = str2;
        this.e = action;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
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
            boolean r1 = r5 instanceof wxd.l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wxd.l r5 = (wxd.l) r5
            java.lang.String r1 = r4.f300870a
            java.lang.String r3 = r5.f300870a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f300871b
            java.lang.String r3 = r5.f300871b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f300872c
            java.lang.String r3 = r5.f300872c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r5.d
            java.lang.String r3 = r4.d
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
            wxd.e r1 = r4.e
            wxd.e r5 = r5.e
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L4e
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wxd.l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iC = p.a.c(this.f300870a.hashCode() * 31, 31, this.f300871b);
        String str = this.f300872c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
