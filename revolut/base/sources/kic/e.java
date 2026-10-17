package kic;

import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo f184197a;

    public e(PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo activationInfo) {
        Intrinsics.checkNotNullParameter(activationInfo, "activationInfo");
        this.f184197a = activationInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f184197a, ((e) obj2).f184197a);
    }

    public final int hashCode() {
        return this.f184197a.hashCode();
    }
}
