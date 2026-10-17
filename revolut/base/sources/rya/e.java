package rya;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitesDetailsContract$InputData.ByInviteId f258272a;

    public e(InvitesDetailsContract$InputData.ByInviteId inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f258272a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f258272a.equals(((e) obj2).f258272a);
    }

    public final int hashCode() {
        return this.f258272a.hashCode();
    }
}
