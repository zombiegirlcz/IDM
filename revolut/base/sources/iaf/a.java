package iaf;

import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets.SelectedAssetsListScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends cli.i {
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        j currentState = (j) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new SelectedAssetsListScreenContract$RetainedState(currentState.f160003a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        j initialState = (j) obj2;
        SelectedAssetsListScreenContract$RetainedState retainedState = (SelectedAssetsListScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return j.a(initialState, retainedState.f91604a, false, 6);
    }
}
