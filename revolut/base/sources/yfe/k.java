package yfe;

import ip0.v7;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class k extends h.a {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy[] f313273j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f313274c;
    public final dj0.d d;
    public final int e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1 f313275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f313276h;
    public final dj0.d i;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f313273j = new Lazy[]{null, null, null, yhm.j.c(kVar, new yfd.c(14)), yhm.j.c(kVar, new yfd.c(15)), null, null};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(String title, dj0.d moneyToDisplay, int i, o1 icon) {
        this(title, moneyToDisplay, i, zhm.u.c(icon), null, false, moneyToDisplay);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(moneyToDisplay, "money");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(moneyToDisplay, "moneyToDisplay");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f313274c, kVar.f313274c) && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f313275g, kVar.f313275g) && this.f313276h == kVar.f313276h && Intrinsics.f(this.i, kVar.i);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.b(this.e, v7.c(this.f313274c.hashCode() * 31, 31, this.d), 31), 31, this.f);
        t1 t1Var = this.f313275g;
        return this.i.hashCode() + j6.a.c((iD + (t1Var == null ? 0 : t1Var.hashCode())) * 31, 31, this.f313276h);
    }

    public k(int i, String str, dj0.d dVar, int i2, List list, t1 t1Var, boolean z, dj0.d dVar2) {
        if (7 != (i & 7)) {
            qlm.j1.f(i.f313266a.getDescriptor(), i, 7);
            throw null;
        }
        this.f313274c = str;
        this.d = dVar;
        this.e = i2;
        if ((i & 8) == 0) {
            this.f = zhm.f0.f322471a;
        } else {
            this.f = list;
        }
        if ((i & 16) == 0) {
            this.f313275g = null;
        } else {
            this.f313275g = t1Var;
        }
        if ((i & 32) == 0) {
            this.f313276h = false;
        } else {
            this.f313276h = z;
        }
        if ((i & 64) == 0) {
            this.i = dVar;
        } else {
            this.i = dVar2;
        }
    }

    public k(String title, dj0.d money, int i, List icons, w1 w1Var, boolean z, dj0.d moneyToDisplay) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(moneyToDisplay, "moneyToDisplay");
        this.f313274c = title;
        this.d = money;
        this.e = i;
        this.f = icons;
        this.f313275g = w1Var;
        this.f313276h = z;
        this.i = moneyToDisplay;
    }
}
