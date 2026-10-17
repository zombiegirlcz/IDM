package v0d;

import com.revolut.feature.semi_independent_onboarding.api.navigation.SemiIndependentInvitationContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiIndependentInvitationContract$InputData f284793a;

    public e(SemiIndependentInvitationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f284793a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f284793a, ((e) obj2).f284793a);
    }

    public final int hashCode() {
        return this.f284793a.hashCode();
    }
}
