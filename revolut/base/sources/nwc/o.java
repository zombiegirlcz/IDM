package nwc;

import android.os.Parcelable;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        g currentState = (g) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return currentState.f219820a;
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        g initialState = (g) obj2;
        WealthProtectionFeaturesState retainedState = (WealthProtectionFeaturesState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return g.a(initialState, retainedState, null, null, null, 14);
    }
}
