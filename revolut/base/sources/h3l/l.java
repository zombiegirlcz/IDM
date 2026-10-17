package h3l;

import a08.o0;
import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import te0.s;
import te0.w;
import ufm.n;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f149245h;
    public final k3l.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tri.c f149246j;
    public final mm.d k;

    public l(h presentationModel, k3l.b statusDialogView, tri.c backButtonView, mm.d actionsDispatcher) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        this.f149245h = presentationModel;
        this.i = statusDialogView;
        this.f149246j = backButtonView;
        this.k = actionsDispatcher;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        h hVar = this.f149245h;
        hVar.init();
        e eVar = hVar.f149240b;
        m mVar = (m) eVar;
        te0.j jVar = mVar.f149248b;
        KProperty[] kPropertyArr = m.f149247j;
        te0.e value = jVar.getValue(mVar, kPropertyArr[0]);
        s sVar = s.f270018a;
        d0 d0VarFirstOrError = value.c(sVar).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        n nVarI = o70.a.i(d0VarFirstOrError);
        gwc.h hVar2 = new gwc.h(1, this.i, k3l.b.class, "show", "show(Lcom/revolut/retail/operation_status/modal_status/StatusViewConfiguration;)V", 0, 3);
        Function1 function1K = K();
        ufm.i iVar = new ufm.i(nVarI, new p0(17, new h2i.b(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        int i = 0;
        ofm.i iVar2 = new ofm.i(new o0(20, hVar2), new o0(20, function1K), i);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, iVar2);
        efm.b bVarSwitchMapCompletable = ((k3l.d) this.i).f180813j.switchMapCompletable(new h0l.g(new i(this, i), 11));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K2 = K();
        p0 p0Var = new p0(17, new h2i.b(new BreadcrumbException(), 2));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, p0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o0(20, function1K2), new ea9.c(20, j.f149243a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        ihm.f fVar = this.f149246j.f273801b;
        m mVar2 = (m) eVar;
        d0 d0VarFirstOrError2 = mVar2.f149248b.getValue(mVar2, kPropertyArr[0]).c(sVar).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        r rVarX = d0VarFirstOrError2.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.b bVarSwitchMapCompletable2 = w.l(fVar, rVarX).switchMapCompletable(new h0l.g(new i(this, 1), 12));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        Function1 function1K3 = K();
        p0 p0Var2 = new p0(17, new h2i.b(new BreadcrumbException(), 3));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, p0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(20, function1K3), new ea9.c(20, k.f149244a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
