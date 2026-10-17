package wya;

import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActiveOrPastInviteeDetails f301188a;

    public i(ActiveOrPastInviteeDetails inviteeDetails) {
        Intrinsics.checkNotNullParameter(inviteeDetails, "inviteeDetails");
        this.f301188a = inviteeDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f301188a, ((i) obj2).f301188a);
    }

    public final int hashCode() {
        return this.f301188a.hashCode();
    }
}
