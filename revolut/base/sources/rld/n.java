package rld;

import android.os.Parcelable;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptControllerContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        h currentState = (h) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new SlotManagerPromptControllerContract$RetainedState(currentState.f255019b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        h initialState = (h) obj2;
        SlotManagerPromptControllerContract$RetainedState retainedState = (SlotManagerPromptControllerContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        String actionToken = retainedState.f87378a;
        SlotDefaultPrompt prompt = initialState.f255018a;
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(actionToken, "actionToken");
        return new h(prompt, actionToken);
    }
}
