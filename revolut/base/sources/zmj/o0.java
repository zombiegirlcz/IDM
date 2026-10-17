package zmj;

import android.os.Parcelable;
import com.revolut.retail.feature.esim.impl.ui.utils.StringRetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        return new StringRetainedState(((n) obj2).i);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable retainedState) {
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return n.a((n) obj2, null, null, null, null, null, null, null, ((StringRetainedState) retainedState).f101489a, null, null, null, null, 16127);
    }
}
