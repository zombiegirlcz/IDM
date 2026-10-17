package kp7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188182a;

    public l(String policyId) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f188182a = policyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f188182a, ((l) obj2).f188182a);
    }

    public final int hashCode() {
        return this.f188182a.hashCode();
    }
}
