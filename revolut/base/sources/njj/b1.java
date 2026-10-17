package njj;

import android.os.Parcelable;
import com.revolut.retail.feature.esim.impl.ui.utils.StringRetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b1 extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        return new StringRetainedState(((b0) obj2).f216543a);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable retainedState) {
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return b0.a((b0) obj2, ((StringRetainedState) retainedState).f101489a, null, null, null, null, null, null, false, null, 510);
    }
}
