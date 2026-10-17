package k50;

import android.os.Parcelable;
import com.revolut.chat.ui.messageslist.MessagesContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k4 extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        h0 currentState = (h0) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new MessagesContract$RetainedState(currentState.f181079a, currentState.f181083h, currentState.i, currentState.k);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        h0 initialState = (h0) obj2;
        MessagesContract$RetainedState retainedState = (MessagesContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return h0.a(initialState, retainedState.f51177a, null, null, null, null, null, null, retainedState.f51178b, retainedState.f51179c, null, retainedState.d, false, null, null, null, null, false, null, null, null, null, null, null, null, 268434046);
    }
}
