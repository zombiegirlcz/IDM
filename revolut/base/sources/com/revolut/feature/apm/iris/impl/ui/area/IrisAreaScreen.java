package com.revolut.feature.apm.iris.impl.ui.area;

import aii.q;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.feature.apm.core.ui.api.R$layout;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.impl.ui.area.IrisAreaScreen;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import g3e.h;
import g62.g;
import h12.b;
import h12.d;
import h12.e;
import h12.f;
import h12.i;
import h12.j;
import h12.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import y02.c;
import z52.l;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/area/IrisAreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lg62/g;", "Ly02/c;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IrisAreaScreen extends ViewController<q> implements a, c {
    public final int K;
    public final int L;
    public final ApmIris M;
    public final TextLocalisedClause N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public IrisAreaScreen(IrisAreaScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$style.UiKitTheme_Transparent;
        this.L = R$layout.screen_apm_area;
        this.M = ApmIris.f61811c;
        this.N = new TextLocalisedClause(R$string.iris_area_title, null, null, 14);
        this.O = w.y0(new fx5.a(this, inputData, 10));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: g62.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisAreaScreen f140814b;

            {
                this.f140814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (f) ((z52.l) this.f140814b.O.getValue()).i.get();
                    default:
                        IrisAreaScreen irisAreaScreen = this.f140814b;
                        return dli.f.a(irisAreaScreen, irisAreaScreen.d(), ((r12.g) ((y02.a) ((z52.l) irisAreaScreen.O.getValue()).e.get())).f250889l, R$id.apmArea_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: g62.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisAreaScreen f140814b;

            {
                this.f140814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (f) ((z52.l) this.f140814b.O.getValue()).i.get();
                    default:
                        IrisAreaScreen irisAreaScreen = this.f140814b;
                        return dli.f.a(irisAreaScreen, irisAreaScreen.d(), ((r12.g) ((y02.a) ((z52.l) irisAreaScreen.O.getValue()).e.get())).f250889l, R$id.apmArea_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.K);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ((r12.g) ((y02.a) ((l) this.O.getValue()).e.get())).Q(uiState);
    }

    @Override // y02.c
    public final void D0(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g62.l lVar = (g62.l) d();
        lVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        h12.g gVarC = ((u12.a) lVar.f140830t).c(event);
        if (Intrinsics.f(gVarC, b.f148445a)) {
            lVar.J2(g62.a.AddContact);
            return;
        }
        if (gVarC instanceof d) {
            lVar.C1(((d) gVarC).f148447a);
            return;
        }
        boolean z = gVarC instanceof e;
        WhoToTransferFilter.ApmIris apmIris = WhoToTransferFilter.ApmIris.f79989a;
        if (z) {
            lVar.C1(new TransferDestination.PaymentsSearch(apmIris, 29));
            return;
        }
        if (gVarC instanceof f) {
            lVar.L2();
            return;
        }
        if (gVarC instanceof h12.c) {
            lVar.K2(((h12.c) gVarC).f148446a);
            return;
        }
        if (gVarC != null) {
            throw new NoWhenBranchMatchedException();
        }
        String id10 = event.a();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "ApmAreaContactsMapper_event")) {
            lVar.C1(new TransferDestination.PaymentsSearch(apmIris, 29));
        } else if (Intrinsics.f(id10, "ApmAreaTransactionsMapper_event")) {
            lVar.L2();
        } else {
            g62.l.I2(id10);
        }
    }

    @Override // y02.c
    public final void D1() {
        g62.l lVar = (g62.l) d();
        lVar.H2(lVar.f140833y, new h(27));
        lVar.z.k(Unit.f186387a);
    }

    @Override // y02.c
    public final void E1() {
        m2().onBackPressed();
    }

    @Override // y02.c
    public final Clause G() {
        return this.N;
    }

    @Override // y02.c
    public final void H(Object obj2) {
        g62.a aVar = obj2 instanceof g62.a ? (g62.a) obj2 : null;
        if (aVar == null) {
            return;
        }
        ((g62.l) d()).J2(aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.O.getValue();
    }

    @Override // y02.c
    public final void T0(t clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        g62.l lVar = (g62.l) d();
        lVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        k kVarB = ((u12.a) lVar.f140830t).b(clickData);
        if (Intrinsics.f(kVarB, i.f148450a)) {
            ((pn3.b) lVar.f140828r).c(lVar, new g62.h(lVar, 1));
        } else if (Intrinsics.f(kVarB, j.f148451a)) {
            lVar.l2(new g62.j(lVar, null, 0), new yi5.b(26));
        } else if (kVarB != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // y02.c
    public final void T1(Object obj2) {
        ((g62.l) d()).K2(obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g62.f d() {
        return (g62.f) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // y02.c
    public final ApmProduct l() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
