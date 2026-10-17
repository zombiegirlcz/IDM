package nya;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitesListContract$InputData f220754a;

    public p(InvitesListContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f220754a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f220754a, ((p) obj2).f220754a);
    }

    public final int hashCode() {
        return this.f220754a.hashCode();
    }
}
