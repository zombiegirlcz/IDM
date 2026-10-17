package xya;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActiveOrPastInviteeDetails f309691a;

    public n(ActiveOrPastInviteeDetails inviteeDetails) {
        Intrinsics.checkNotNullParameter(inviteeDetails, "inviteeDetails");
        this.f309691a = inviteeDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f309691a, ((n) obj2).f309691a);
    }

    public final int hashCode() {
        return this.f309691a.hashCode();
    }
}
