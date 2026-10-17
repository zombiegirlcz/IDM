package pmj;

import android.os.Parcelable;
import com.revolut.retail.feature.esim.impl.ui.utils.StringRetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends cli.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a f237606a;

    public l(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.a aVar) {
        this.f237606a = aVar;
    }

    @Override // cli.i
    public final Parcelable a(Object obj2) {
        return new StringRetainedState(this.f237606a.f101411q);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable retainedState) {
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        cli.k kVar = (cli.k) obj2;
        this.f237606a.f101411q = ((StringRetainedState) retainedState).f101489a;
        return kVar;
    }
}
