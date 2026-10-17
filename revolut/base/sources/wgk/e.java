package wgk;

import kotlin.jvm.internal.Intrinsics;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f297334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f297335b;

    public e(l contact, hha.d requiredPlan) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(requiredPlan, "requiredPlan");
        this.f297334a = contact;
        this.f297335b = requiredPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f297334a, eVar.f297334a) && Intrinsics.f(this.f297335b, eVar.f297335b);
    }

    public final int hashCode() {
        return this.f297335b.hashCode() + (this.f297334a.hashCode() * 31);
    }
}
