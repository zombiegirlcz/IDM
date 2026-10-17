package r40;

import com.revolut.chat.ui.chatlist.ChatListContract$RetainedState;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        a currentState = (a) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ChatListContract$RetainedState(currentState.f251320b);
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        a initialState = (a) iVar;
        ChatListContract$RetainedState retainedState = (ChatListContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return a.a(initialState, null, retainedState.f51143a, null, null, null, null, 61);
    }
}
