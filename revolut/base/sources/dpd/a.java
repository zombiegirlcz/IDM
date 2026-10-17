package dpd;

import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CategoryImage f116854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CategoryColor f116855c;
    public final String d;

    public a(CategoryColor color, CategoryImage icon, String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(color, "color");
        this.f116853a = name;
        this.f116854b = icon;
        this.f116855c = color;
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
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
            boolean r1 = r5 instanceof dpd.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dpd.a r5 = (dpd.a) r5
            java.lang.String r1 = r4.f116853a
            java.lang.String r3 = r5.f116853a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.revolut.domain.models.transactions.CategoryImage r1 = r4.f116854b
            com.revolut.domain.models.transactions.CategoryImage r3 = r5.f116854b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            com.revolut.domain.models.transactions.CategoryColor r1 = r4.f116855c
            com.revolut.domain.models.transactions.CategoryColor r3 = r5.f116855c
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r5 = r5.d
            java.lang.String r1 = r4.d
            if (r1 != 0) goto L31
            if (r5 != 0) goto L2f
            r5 = r0
            goto L38
        L2f:
            r5 = r2
            goto L38
        L31:
            if (r5 != 0) goto L34
            goto L2f
        L34:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        L38:
            if (r5 != 0) goto L3b
            return r2
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dpd.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = (this.f116855c.hashCode() + ((this.f116854b.hashCode() + (this.f116853a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
