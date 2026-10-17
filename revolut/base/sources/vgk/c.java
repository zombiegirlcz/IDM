package vgk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xfa.b f289188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.a f289189b;

    public c(xfa.b source, com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.a launchMode) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.f289188a = source;
        this.f289189b = launchMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f289188a == cVar.f289188a && Intrinsics.f(this.f289189b, cVar.f289189b);
    }

    public final int hashCode() {
        return this.f289189b.hashCode() + (this.f289188a.hashCode() * 31);
    }
}
