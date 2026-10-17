package a9e;

import com.revolut.core.ui_kit.models.Clause;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f2428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2429c;
    public final boolean d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2430g;

    public f(String id10, xi0.b baseCurrency, Clause startLabelClause, boolean z, List rates, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(startLabelClause, "startLabelClause");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f2427a = id10;
        this.f2428b = baseCurrency;
        this.f2429c = startLabelClause;
        this.d = z;
        this.e = rates;
        this.f = z3;
        this.f2430g = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f2427a.equals(fVar.f2427a) && Intrinsics.f(this.f2428b, fVar.f2428b) && this.f2429c.equals(fVar.f2429c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && this.f2430g == fVar.f2430g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2430g) + j6.a.c(p.a.d(j6.a.c(p.a.b(l.j(this.f2428b, this.f2427a.hashCode() * 31, 31), 31, this.f2429c), 31, this.d), 31, this.e), 31, this.f);
    }
}
