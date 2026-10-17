package fi8;

import android.os.Parcelable;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        f currentState = (f) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new JuniorDetailsConfirmationScreenContract$RetainedState(currentState.f135347c, currentState.d);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        f initialState = (f) obj2;
        JuniorDetailsConfirmationScreenContract$RetainedState retainedState = (JuniorDetailsConfirmationScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return f.a(initialState, null, null, retainedState.f77026a, retainedState.f77027b, 3);
    }
}
