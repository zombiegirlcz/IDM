package k3l;

import akl.s;
import android.app.Activity;
import android.os.Bundle;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import ecm.q;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.t0;
import nii.y0;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends c {
    public final t0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f180813j;
    public boolean k;

    public d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        t0 displayDelegate = new t0(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayDelegate, "displayDelegate");
        this.i = displayDelegate;
        this.f180813j = v0.a.d("create(...)");
    }

    public final void N() {
        this.k = true;
        ihm.f fVar = this.i.f216224h;
        s sVar = new s(this, 22);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new q(new bo.c(new BreadcrumbException(), 11), (byte) 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new gn.b(2, sVar), new gn.b(2, function1M), new c86.f(4, function0L));
        w.j0(this.d, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }

    public final void O(StatusViewConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (!this.k) {
            od0.a aVar = od0.a.f224253a;
            if (od0.a.e() && !od0.a.i()) {
                throw new IllegalStateException("Show status dialog on non-attached delegate. Check if it's properly configured");
            }
            N();
        }
        this.i.h(new y0(null, com.revolut.retail.operation_status.modal_status.a.a(configuration), false, 4));
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        this.i.getClass();
        N();
    }

    @Override // fsi.c, fsi.a
    public final void onDestroy() {
        this.i.e();
        super.onDestroy();
    }

    @Override // fsi.c, fsi.a
    public final void onPause() {
        this.i.f();
        super.onPause();
    }

    @Override // fsi.a
    public final void onResume() {
        this.i.c();
    }
}
