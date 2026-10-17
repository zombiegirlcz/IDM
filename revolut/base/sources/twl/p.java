package twl;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import ha3.x;
import ip0.v7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import pfm.t;
import qfm.r0;
import rfm.f0;
import t33.r;
import te0.s;
import te0.v;
import te0.w;
import tof.fc;
import tof.i7;
import tof.ib;
import tof.l9;
import tof.t0;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends pri.b implements b {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tpi.j f275065h;
    public final sri.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f275066j;
    public final k3l.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f275067l;

    public p(tpi.j progressView, sri.m navigator, i presentationModel, k3l.b statusDialogView, f9b.f errorView) {
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        this.f275065h = progressView;
        this.i = navigator;
        this.f275066j = presentationModel;
        this.k = statusDialogView;
        this.f275067l = errorView;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        i iVar = this.f275066j;
        iVar.getClass();
        l9 l9Var = new l9(t0.SUSPICIOUS);
        c cVar = iVar.f275055a;
        q qVar = (q) cVar;
        i7 i7VarA = fc.a(l9Var, new ib((String) qVar.w0().get()));
        ufm.i iVar2 = new ufm.i(new pfm.a(((x) iVar.d).n((String) qVar.w0().get()), new ts5.o(27, new g(iVar, 0)), 4).f(com.revolut.domain.interactors.transactions.a.b(iVar.f275056b, i7VarA, null, null, null, null, 30)), new ts5.o(28, new tsk.j(28)), 0);
        te0.j jVar = qVar.d;
        KProperty[] kPropertyArr = q.f;
        pfm.h hVarX = v7.x(new ufm.f(new ufm.i(new ufm.f(iVar2, new ts5.o(29, new su0.c(1, jVar.getValue(qVar, kPropertyArr[2]), v.class, "set", "set(Ljava/lang/Object;)V", 0, 22)), 3), new h(0, new g(iVar, 1)), 0), new h(1, new su0.c(1, qVar.e.getValue(qVar, kPropertyArr[3]), v.class, "set", "set(Ljava/lang/Object;)V", 0, 23)), 3), "ignoreElement(...)");
        q qVar2 = (q) cVar;
        te0.e value = qVar2.d.getValue(qVar2, kPropertyArr[2]);
        s sVar = s.f270018a;
        d0 d0VarFirstOrError = value.c(sVar).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        d0 d0VarFirstOrError2 = qVar.e.getValue(qVar, kPropertyArr[3]).c(sVar).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        f0 f0VarF = hVarX.f(w.H0(d0VarFirstOrError, d0VarFirstOrError2));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        t tVarM = new pfm.a(hx7.a.O(mo3.a.w(o70.a.i(f0VarF), this.f275065h), this.f275067l, true, null, 24), new h(2, new j(this, 0)), 4).m(new h(3, new j(this, 1)));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(tVarM, new o0(18, new r(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o(0, function1K), new t1i.n(3, m.f275061a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.r rVarSwitchMapSingle = ((k3l.d) this.k).f180813j.filter(new h(4, new tsk.j(29))).switchMapSingle(new h(5, new j(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        r0 r0VarD = w.D(rVarSwitchMapSingle, new j(this, 3));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new o0(18, new r(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o(0, function1K2), new t1i.n(3, n.f275062a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
