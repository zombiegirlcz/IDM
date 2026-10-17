package ghk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a f143957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a f143958b;

    public h(com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a top, com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.a bottom) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        this.f143957a = top;
        this.f143958b = bottom;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f143957a, hVar.f143957a) && Intrinsics.f(this.f143958b, hVar.f143958b);
    }

    public final int hashCode() {
        return this.f143958b.hashCode() + (this.f143957a.hashCode() * 31);
    }
}
