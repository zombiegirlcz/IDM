package hyh;

import android.os.Parcelable;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$RetainedState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends d {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        c currentState = (c) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new CryptoOrderDetailsPagerFlowContract$RetainedState(currentState.f156876a, currentState.f156877b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        c initialState = (c) obj2;
        CryptoOrderDetailsPagerFlowContract$RetainedState retainedState = (CryptoOrderDetailsPagerFlowContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        String selectedPagerItemId = retainedState.f96669a;
        List pagerItems = retainedState.f96670b;
        initialState.getClass();
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new c(selectedPagerItemId, pagerItems);
    }
}
