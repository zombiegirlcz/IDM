package kug;

import android.os.Parcelable;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        g currentState = (g) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ConsentPromptPreconditionScreenContract$RetainedState(currentState.f189795b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        g initialState = (g) obj2;
        ConsentPromptPreconditionScreenContract$RetainedState retainedState = (ConsentPromptPreconditionScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return g.a(initialState, null, retainedState.f94935a, 3);
    }
}
