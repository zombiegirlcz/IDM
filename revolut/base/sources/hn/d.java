package hn;

import ag.j;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends fsi.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f154009h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final npi.f f154010j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ImmutableSet handlers, h dialogsMediator, npi.f dialogView) {
        super(new fsi.b("COMMON_UI_DIALOGS_MEDIATOR"));
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        Intrinsics.checkNotNullParameter(dialogsMediator, "dialogsMediator");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        this.f154009h = handlers;
        this.i = dialogsMediator;
        this.f154010j = dialogView;
    }

    @Override // fsi.a
    public final void onResume() {
        r rVarF = o70.a.f(this.i.b());
        b bVar = new b(this, 0);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new gn.b(1, new bo.c(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(3, bVar), new bo.e(3, function1M), new c86.f(3, function0L));
        ifm.b bVar2 = this.e;
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.b bVarFlatMapCompletable = ((npi.c) this.f154010j).f218224m.flatMapCompletable(new j(new b(this, 1), 26));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1M2 = M();
        gn.b bVar3 = new gn.b(1, new bo.c(new BreadcrumbException(), 10));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, bVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new bo.e(3, function1M2), new c86.f(3, c.f154008a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar2, hVarW);
    }
}
