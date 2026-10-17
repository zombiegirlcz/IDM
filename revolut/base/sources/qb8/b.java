package qb8;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ozc.z;
import pri.c;
import rd0.e;
import te0.w;
import v60.i;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r3l.a f244134h;
    public final sb8.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yb8.a f244135j;

    public b(r3l.a shotDialogView, sb8.a juniorAllowanceShotDialogEventsProvider, yb8.a juniorAllowanceShotDialogProvider) {
        Intrinsics.checkNotNullParameter(shotDialogView, "shotDialogView");
        Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogEventsProvider, "juniorAllowanceShotDialogEventsProvider");
        Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogProvider, "juniorAllowanceShotDialogProvider");
        this.f244134h = shotDialogView;
        this.i = juniorAllowanceShotDialogEventsProvider;
        this.f244135j = juniorAllowanceShotDialogProvider;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        mb8.b view = (mb8.b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        i subject = this.i.f261514a;
        Intrinsics.checkNotNullExpressionValue(subject, "subject");
        r rVarC = e.c(e.b(subject), g.f186406a);
        qa9.r rVar = new qa9.r(this, 5);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarC.onErrorResumeNext(new ogm.i(new pzc.g(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(11, rVar), new ly7.g(11, function1K), new z(16, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
