package wgk;

import kotlin.jvm.internal.Intrinsics;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f297333a;

    public d(l contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f297333a = contact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f297333a, ((d) obj2).f297333a);
    }

    public final int hashCode() {
        return this.f297333a.hashCode();
    }
}
