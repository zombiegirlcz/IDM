package abf;

import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.asset_selection.TransferOutAssetSelectionScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        i currentState = (i) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new TransferOutAssetSelectionScreenContract$RetainedState(currentState.f2953b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        i initialState = (i) obj2;
        TransferOutAssetSelectionScreenContract$RetainedState retainedState = (TransferOutAssetSelectionScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return i.a(initialState, null, retainedState.f91640a, 1);
    }
}
