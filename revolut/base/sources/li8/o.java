package li8;

import android.os.Parcelable;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a currentState = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new JuniorPersonalDetailsScreenContract$RetainedState(currentState.f77053a, currentState.f77054b, currentState.f77055c, currentState.d, currentState.e);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a initialState = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a) obj2;
        JuniorPersonalDetailsScreenContract$RetainedState retainedState = (JuniorPersonalDetailsScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.a.a(initialState, retainedState.f77050a, retainedState.f77051b, retainedState.f77052c, retainedState.d, retainedState.e, null, null, null, false, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
    }
}
