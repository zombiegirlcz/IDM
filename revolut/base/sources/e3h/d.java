package e3h;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f122286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f122287c;
    public final Set d;
    public final boolean e;
    public final eel.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f122288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f122289h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f122290j;
    public final eel.d k;

    public d(String ref2, List availablePeriods, eel.c defaultSelectedPeriod, Set accountTypeForTradingEvents, boolean z, eel.c cVar, boolean z3, boolean z4, boolean z6, eel.d chartTabStyle, int i) {
        cVar = (i & 32) != 0 ? null : cVar;
        boolean z11 = (i & 64) != 0;
        z3 = (i & 128) != 0 ? false : z3;
        z4 = (i & 256) != 0 ? false : z4;
        z6 = (i & 512) != 0 ? true : z6;
        chartTabStyle = (i & 1024) != 0 ? eel.d.FIXED : chartTabStyle;
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(defaultSelectedPeriod, "defaultSelectedPeriod");
        Intrinsics.checkNotNullParameter(accountTypeForTradingEvents, "accountTypeForTradingEvents");
        Intrinsics.checkNotNullParameter(chartTabStyle, "chartTabStyle");
        this.f122285a = ref2;
        this.f122286b = availablePeriods;
        this.f122287c = defaultSelectedPeriod;
        this.d = accountTypeForTradingEvents;
        this.e = z;
        this.f = cVar;
        this.f122288g = z11;
        this.f122289h = z3;
        this.i = z4;
        this.f122290j = z6;
        this.k = chartTabStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f122285a, dVar.f122285a) && Intrinsics.f(this.f122286b, dVar.f122286b) && this.f122287c == dVar.f122287c && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && this.f122288g == dVar.f122288g && this.f122289h == dVar.f122289h && this.i == dVar.i && this.f122290j == dVar.f122290j && this.k == dVar.k;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.f(o.c(this.f122287c, p.a.d(this.f122285a.hashCode() * 31, 31, this.f122286b), 31), 31, this.d), 31, this.e);
        eel.c cVar = this.f;
        return this.k.hashCode() + j6.a.c(j6.a.c(j6.a.c(j6.a.c((iC + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f122288g), 31, this.f122289h), 31, this.i), 31, this.f122290j);
    }
}
