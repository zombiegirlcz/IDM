package cvl;

import android.os.Parcelable;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerScreenContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends o {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        l currentState = (l) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new SourcePocketPickerScreenContract$RetainedState(currentState.f109489a, currentState.f109490b, currentState.f109491c, currentState.k);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        l initialState = (l) obj2;
        SourcePocketPickerScreenContract$RetainedState retainedState = (SourcePocketPickerScreenContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return l.a(initialState, retainedState.f107050a, retainedState.f107051b, retainedState.f107052c, null, null, null, null, null, null, null, retainedState.d, false, false, 7160);
    }
}
