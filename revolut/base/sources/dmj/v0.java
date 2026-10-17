package dmj;

import android.os.Parcelable;
import com.revolut.retail.feature.esim.impl.ui.utils.StringRetainedState;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v0 extends cli.i {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        return new StringRetainedState(((a0) obj2).f116135b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable retainedState) {
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return a0.a((a0) obj2, null, ((StringRetainedState) retainedState).f101489a, null, null, null, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
    }
}
