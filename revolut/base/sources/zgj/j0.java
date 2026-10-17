package zgj;

import android.os.Parcelable;
import com.revolut.retail.feature.esim.impl.ui.utils.StringRetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        return new StringRetainedState(((r) obj2).f);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable retainedState) {
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return r.a((r) obj2, null, null, null, null, null, ((StringRetainedState) retainedState).f101489a, null, null, null, null, null, null, null, null, null, 32735);
    }
}
