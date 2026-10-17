package nvk;

import android.os.Parcelable;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.StockFinancialsStatementsControllerContract$SavedState;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends cli.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f219726a = new o();

    private o() {
    }

    @Override // cli.i
    public final Parcelable a(Object obj2) {
        k currentState = (k) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new StockFinancialsStatementsControllerContract$SavedState(currentState.f219715b, currentState.f219716c, currentState.d, currentState.e);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        k initialState = (k) obj2;
        StockFinancialsStatementsControllerContract$SavedState retainedState = (StockFinancialsStatementsControllerContract$SavedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return k.a(initialState, null, retainedState.f103965a, retainedState.f103966b, retainedState.f103967c, retainedState.d, null, null, null, Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE);
    }
}
