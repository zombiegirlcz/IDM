package dpd;

import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CategoryImage f116858c;
    public final CategoryColor d;
    public final String e;

    public b(CategoryColor color, CategoryImage icon, String id10, String name, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(color, "color");
        this.f116856a = id10;
        this.f116857b = name;
        this.f116858c = icon;
        this.d = color;
        this.e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
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
            boolean r1 = r5 instanceof dpd.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dpd.b r5 = (dpd.b) r5
            java.lang.String r1 = r4.f116856a
            java.lang.String r3 = r5.f116856a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f116857b
            java.lang.String r3 = r5.f116857b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            com.revolut.domain.models.transactions.CategoryImage r1 = r4.f116858c
            com.revolut.domain.models.transactions.CategoryImage r3 = r5.f116858c
            if (r1 == r3) goto L29
            return r2
        L29:
            com.revolut.domain.models.transactions.CategoryColor r1 = r4.d
            com.revolut.domain.models.transactions.CategoryColor r3 = r5.d
            if (r1 == r3) goto L30
            return r2
        L30:
            java.lang.String r5 = r5.e
            java.lang.String r1 = r4.e
            if (r1 != 0) goto L3c
            if (r5 != 0) goto L3a
            r5 = r0
            goto L43
        L3a:
            r5 = r2
            goto L43
        L3c:
            if (r5 != 0) goto L3f
            goto L3a
        L3f:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L43:
            if (r5 != 0) goto L46
            return r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dpd.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f116858c.hashCode() + p.a.c(this.f116856a.hashCode() * 31, 31, this.f116857b)) * 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
