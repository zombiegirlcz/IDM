package nya;

import android.os.Parcelable;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        k currentState = (k) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new InviteCampaignHomeControllerContract$RetainedState(currentState.f220740c, currentState.d, currentState.e);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        k initialState = (k) obj2;
        InviteCampaignHomeControllerContract$RetainedState retainedState = (InviteCampaignHomeControllerContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return k.a(initialState, null, null, retainedState.f81849a, retainedState.f81850b, retainedState.f81851c, 3);
    }
}
