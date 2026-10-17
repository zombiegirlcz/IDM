package vuc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f292318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f292319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f292320c;
    public final boolean d;

    public f() {
        this(null, 15);
    }

    public static f a(f fVar, List pagerItems, boolean z, m tab2, boolean z3, int i) {
        if ((i & 1) != 0) {
            pagerItems = fVar.f292318a;
        }
        if ((i & 2) != 0) {
            z = fVar.f292319b;
        }
        if ((i & 4) != 0) {
            tab2 = fVar.f292320c;
        }
        if ((i & 8) != 0) {
            z3 = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        return new f(pagerItems, z, tab2, z3);
    }

    @Override // oki.a
    public final List W() {
        return this.f292318a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f292318a, fVar.f292318a) && this.f292319b == fVar.f292319b && this.f292320c == fVar.f292320c && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f292320c.hashCode() + j6.a.c(this.f292318a.hashCode() * 31, 31, this.f292319b)) * 31);
    }

    @Override // oki.a
    public final String z() {
        return this.f292320c.getId();
    }

    public f(List pagerItems, boolean z, m tab2, boolean z3) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        this.f292318a = pagerItems;
        this.f292319b = z;
        this.f292320c = tab2;
        this.d = z3;
    }

    public f(List list, int i) {
        this((i & 1) != 0 ? f0.f322471a : list, false, m.WALLETS, false);
    }
}
