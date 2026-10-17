package nik;

import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanFilter f216275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanSelection f216276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xfa.b f216277c;
    public final d d;
    public final xfa.a e;

    public c(PlanFilter planFilter, PlanSelection planSelection, xfa.b source, d planSelectionUiConfig, xfa.a aVar) {
        Intrinsics.checkNotNullParameter(planFilter, "planFilter");
        Intrinsics.checkNotNullParameter(planSelection, "planSelection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(planSelectionUiConfig, "planSelectionUiConfig");
        this.f216275a = planFilter;
        this.f216276b = planSelection;
        this.f216277c = source;
        this.d = planSelectionUiConfig;
        this.e = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f216275a, cVar.f216275a) && Intrinsics.f(this.f216276b, cVar.f216276b) && this.f216277c == cVar.f216277c && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + v1.c.c(this.f216277c, (this.f216276b.hashCode() + (this.f216275a.hashCode() * 31)) * 31, 31)) * 31;
        xfa.a aVar = this.e;
        return iHashCode + (aVar == null ? 0 : aVar.f305202a.hashCode());
    }
}
