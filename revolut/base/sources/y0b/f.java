package y0b;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import yrb.x;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f310174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1b.c f310175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f310176c;
    public final g0b.c d;
    public final boolean e;

    public f(Clause chartTitle, c1b.c advancedChartsProductIdentifier, x xVar, g0b.c chartState, boolean z) {
        Intrinsics.checkNotNullParameter(chartTitle, "chartTitle");
        Intrinsics.checkNotNullParameter(advancedChartsProductIdentifier, "advancedChartsProductIdentifier");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        this.f310174a = chartTitle;
        this.f310175b = advancedChartsProductIdentifier;
        this.f310176c = xVar;
        this.d = chartState;
        this.e = z;
    }

    public static f a(f fVar, Clause clause, x xVar, g0b.c cVar, boolean z, int i) {
        if ((i & 1) != 0) {
            clause = fVar.f310174a;
        }
        Clause chartTitle = clause;
        c1b.c advancedChartsProductIdentifier = fVar.f310175b;
        fVar.getClass();
        if ((i & 8) != 0) {
            xVar = fVar.f310176c;
        }
        x xVar2 = xVar;
        if ((i & 16) != 0) {
            cVar = fVar.d;
        }
        g0b.c chartState = cVar;
        if ((i & 32) != 0) {
            z = fVar.e;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(chartTitle, "chartTitle");
        Intrinsics.checkNotNullParameter(advancedChartsProductIdentifier, "advancedChartsProductIdentifier");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        return new f(chartTitle, advancedChartsProductIdentifier, xVar2, chartState, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f310174a, fVar.f310174a) && this.f310175b == fVar.f310175b && Intrinsics.f(this.f310176c, fVar.f310176c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f310175b.hashCode() + (this.f310174a.hashCode() * 31)) * 961;
        x xVar = this.f310176c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31)) * 31);
    }
}
