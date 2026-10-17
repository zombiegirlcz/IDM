package ex2;

import android.os.Parcelable;
import com.revolut.feature.card_contactless_limit.impl.ui.kompot.ResetCardScaContract$ResetCardScaRetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        c currentState = (c) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ResetCardScaContract$ResetCardScaRetainedState(currentState.f130336a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        c initialState = (c) obj2;
        ResetCardScaContract$ResetCardScaRetainedState retainedState = (ResetCardScaContract$ResetCardScaRetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return c.a(initialState, retainedState.f64523a, null, 510);
    }
}
