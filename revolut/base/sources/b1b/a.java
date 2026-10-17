package b1b;

import android.os.Parcelable;
import com.revolut.feature.retail.advanced_charts.impl.screen.indicators.ChartsIndicatorScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        f currentState = (f) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ChartsIndicatorScreenContract$RetainedState(currentState.d, currentState.f11764a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        f initialState = (f) obj2;
        ChartsIndicatorScreenContract$RetainedState retainedState = (ChartsIndicatorScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return f.a(initialState, retainedState.f82083a, null, null, retainedState.f82084b, 6);
    }
}
