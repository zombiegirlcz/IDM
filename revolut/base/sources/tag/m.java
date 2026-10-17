package tag;

import android.os.Parcelable;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$DomainState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends b {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        TravelHotelsCheckoutFlowContract$DomainState currentState = (TravelHotelsCheckoutFlowContract$DomainState) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return currentState;
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        TravelHotelsCheckoutFlowContract$DomainState initialState = (TravelHotelsCheckoutFlowContract$DomainState) obj2;
        TravelHotelsCheckoutFlowContract$DomainState retainedState = (TravelHotelsCheckoutFlowContract$DomainState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return retainedState;
    }
}
