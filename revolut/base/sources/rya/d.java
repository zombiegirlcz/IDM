package rya;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitesDetailsContract$InputData.ByInviteeDetails f258271a;

    public d(InvitesDetailsContract$InputData.ByInviteeDetails inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f258271a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f258271a.equals(((d) obj2).f258271a);
    }

    public final int hashCode() {
        return this.f258271a.hashCode();
    }
}
