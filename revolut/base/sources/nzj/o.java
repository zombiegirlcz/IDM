package nzj;

import a08.f0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.oc;
import ny7.t;
import nya.b0;
import nyb.h0;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import te0.s;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends pri.a implements b {

    @NotNull
    public static final k Companion = new k();
    public final tpi.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k3l.b f221084j;
    public final mzj.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f221085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f221086m;

    public o(tpi.j progressView, k3l.b statusDialogView, mzj.b limitsPromptPresenterDelegate, c router, i presentationModel, pri.f authorizedPresenterDelegate) {
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(limitsPromptPresenterDelegate, "limitsPromptPresenterDelegate");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        this.i = progressView;
        this.f221084j = statusDialogView;
        this.k = limitsPromptPresenterDelegate;
        this.f221085l = router;
        this.f221086m = presentationModel;
        P(v.k(authorizedPresenterDelegate, limitsPromptPresenterDelegate));
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        i iVar = this.f221086m;
        iVar.init();
        q qVar = (q) iVar.f221079c;
        r rVarSwitchMap = qVar.f221090b.getValue(qVar, q.e[0]).c(s.f270018a).switchMap(new h0(18, new b0(iVar, 14)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        d0 d0VarFirstOrError = m70.a.g(rVarSwitchMap, null, new nz7.g(5), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        ufm.f fVar = new ufm.f(o70.a.i(ue0.e.t(d0VarFirstOrError, zhm.h0.f322473a)), new h0(19, new n(1, this, o.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, 0)), 1);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        d0 d0VarW = mo3.a.w(fVar, this.i);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: nzj.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f221081b;

            {
                this.f221081b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        czj.d limit = (czj.d) obj2;
                        mzj.b bVar = this.f221081b.k;
                        Intrinsics.h(limit);
                        mzj.n nVar = (mzj.n) bVar;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        nVar.o.onNext(limit);
                        v60.i iVar2 = nVar.f210806n;
                        Unit unit = Unit.f186387a;
                        iVar2.onNext(unit);
                        break;
                    case 1:
                        k3l.j it8 = (k3l.j) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                }
                return ((p) this.f221081b.f221085l).a();
            }
        };
        Function1 function1K = K();
        ufm.i iVar2 = new ufm.i(d0VarW, new f0(29, new t(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new nw8.d(1, function1), new nw8.d(1, function1K), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, iVar3);
        final int i2 = 1;
        r0 r0VarD = w.D(((k3l.d) this.f221084j).f180813j, new Function1(this) { // from class: nzj.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f221081b;

            {
                this.f221081b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        czj.d limit = (czj.d) obj2;
                        mzj.b bVar2 = this.f221081b.k;
                        Intrinsics.h(limit);
                        mzj.n nVar = (mzj.n) bVar2;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        nVar.o.onNext(limit);
                        v60.i iVar22 = nVar.f210806n;
                        Unit unit = Unit.f186387a;
                        iVar22.onNext(unit);
                        break;
                    case 1:
                        k3l.j it8 = (k3l.j) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                }
                return ((p) this.f221081b.f221085l).a();
            }
        });
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new f0(29, new t(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new nw8.d(1, function1K2), new j7a.j(24, l.f221082a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        cqi.j jVar = (cqi.j) ((mzj.n) this.k).f210802h;
        r map = jVar.i.f256147a.f().map(new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(23), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarMerge = r.merge(map.filter(new mzj.j(new oc(19), 1)).map(new mzj.j(new oc(23), 2)), jVar.i.b().map(new mzj.j(new oc(24), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        final int i3 = 2;
        r0 r0VarD2 = w.D(rVarMerge, new Function1(this) { // from class: nzj.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f221081b;

            {
                this.f221081b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        czj.d limit = (czj.d) obj2;
                        mzj.b bVar2 = this.f221081b.k;
                        Intrinsics.h(limit);
                        mzj.n nVar = (mzj.n) bVar2;
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(limit, "limit");
                        nVar.o.onNext(limit);
                        v60.i iVar22 = nVar.f210806n;
                        Unit unit = Unit.f186387a;
                        iVar22.onNext(unit);
                        break;
                    case 1:
                        k3l.j it8 = (k3l.j) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        break;
                    default:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                }
                return ((p) this.f221081b.f221085l).a();
            }
        });
        Function1 function1K3 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new f0(29, new t(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new nw8.d(1, function1K3), new j7a.j(24, m.f221083a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
