package ytj;

import android.os.Parcelable;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        j currentState = (j) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ChallengeDetailsScreenContract$RetainedState(currentState.f316818b, currentState.f316819c, currentState.d, currentState.e);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        j initialState = (j) obj2;
        ChallengeDetailsScreenContract$RetainedState retainedState = (ChallengeDetailsScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return j.a(initialState, null, retainedState.f101576a, retainedState.f101577b, retainedState.f101578c, retainedState.d, 1);
    }
}
