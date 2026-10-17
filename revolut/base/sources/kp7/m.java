package kp7;

import kl7.f1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f188184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f188185c;

    public m(String planId, f1 paymentFrequency, boolean z) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        this.f188183a = planId;
        this.f188184b = paymentFrequency;
        this.f188185c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f188183a, mVar.f188183a) && this.f188184b == mVar.f188184b && this.f188185c == mVar.f188185c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188185c) + ((this.f188184b.hashCode() + (this.f188183a.hashCode() * 31)) * 31);
    }
}
