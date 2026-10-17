package a17;

import aii.r;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerProfileSettings f553a;

    public e(FreelancerProfileSettings freelancerProfileSettings) {
        FreelancerProfileFlowContract$Step.Vat step = FreelancerProfileFlowContract$Step.Vat.f74028a;
        Intrinsics.checkNotNullParameter(step, "step");
        this.f553a = freelancerProfileSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        Object obj3 = FreelancerProfileFlowContract$Step.Vat.f74028a;
        return obj3.equals(obj3) && Intrinsics.f(this.f553a, eVar.f553a);
    }

    public final int hashCode() {
        int iHashCode = FreelancerProfileFlowContract$Step.Vat.f74028a.hashCode() * 31;
        FreelancerProfileSettings freelancerProfileSettings = this.f553a;
        return iHashCode + (freelancerProfileSettings == null ? 0 : freelancerProfileSettings.hashCode());
    }
}
