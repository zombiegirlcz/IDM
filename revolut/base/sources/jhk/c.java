package jhk;

import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanFilter f174279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanSelection f174280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xfa.b f174281c;
    public final j d;
    public final k e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xfa.a f174282g;

    public c(PlanFilter planFilter, PlanSelection planSelection, xfa.b source, j planSelectionUiConfig, k switchToAnnualPromptUiConfig, boolean z, xfa.a aVar, int i) {
        z = (i & 32) != 0 ? false : z;
        aVar = (i & 64) != 0 ? null : aVar;
        Intrinsics.checkNotNullParameter(planFilter, "planFilter");
        Intrinsics.checkNotNullParameter(planSelection, "planSelection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(planSelectionUiConfig, "planSelectionUiConfig");
        Intrinsics.checkNotNullParameter(switchToAnnualPromptUiConfig, "switchToAnnualPromptUiConfig");
        this.f174279a = planFilter;
        this.f174280b = planSelection;
        this.f174281c = source;
        this.d = planSelectionUiConfig;
        this.e = switchToAnnualPromptUiConfig;
        this.f = z;
        this.f174282g = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f174279a, cVar.f174279a) && Intrinsics.f(this.f174280b, cVar.f174280b) && this.f174281c == cVar.f174281c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f && Intrinsics.f(this.f174282g, cVar.f174282g);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.d.hashCode() + v1.c.c(this.f174281c, (this.f174280b.hashCode() + (this.f174279a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e.f174296a), 31, this.f);
        xfa.a aVar = this.f174282g;
        return iC + (aVar == null ? 0 : aVar.f305202a.hashCode());
    }
}
