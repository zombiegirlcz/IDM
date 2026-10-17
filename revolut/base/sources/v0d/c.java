package v0d;

import com.revolut.feature.semi_independent_onboarding.api.model.GuardianInvitationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GuardianInvitationResult f284792a;

    public c(GuardianInvitationResult invitationResult) {
        Intrinsics.checkNotNullParameter(invitationResult, "invitationResult");
        this.f284792a = invitationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f284792a, ((c) obj2).f284792a);
    }

    public final int hashCode() {
        return this.f284792a.hashCode();
    }
}
