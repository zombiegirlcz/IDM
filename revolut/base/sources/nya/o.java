package nya;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitesDetailsContract$InputData.ByInviteeDetails f220753a;

    public o(InvitesDetailsContract$InputData.ByInviteeDetails inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f220753a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f220753a.equals(((o) obj2).f220753a);
    }

    public final int hashCode() {
        return this.f220753a.hashCode();
    }
}
