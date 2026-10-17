package i2l;

import android.os.Parcelable;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        q currentState = (q) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new TravelStatusPartnerScreenContract$RetainedState(currentState.d);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        q initialState = (q) obj2;
        TravelStatusPartnerScreenContract$RetainedState retainedState = (TravelStatusPartnerScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return q.a(initialState, null, null, null, retainedState.f104323a, null, 23);
    }
}
