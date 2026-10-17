package com.revolut.feature.user.checklist.impl.ui.screen;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.common.collect.ImmutableMap;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleLimitProgressBarWithTextDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.user.checklist.impl.R$id;
import com.revolut.feature.user.checklist.impl.R$layout;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistContract$InputData;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fmg.n0;
import fmg.p;
import grl.k9;
import jid.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pki.b;
import qmg.c;
import qmg.d;
import qmg.f;
import qmg.g;
import qmg.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/user/checklist/impl/ui/screen/UserChecklistController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqmg/d;", "Ldli/a;", "Lqmg/c;", "Lno/m;", "feature_user_checklist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserChecklistController extends ViewController<d> implements a, m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(UserChecklistController.class, "binding", "getBinding()Lcom/revolut/feature/user/checklist/impl/databinding/ScreenUserChecklistBinding;", 0))};
    public final UserChecklistContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final boolean O;
    public final boolean P;
    public final Object Q;
    public final TextDelegate R;
    public final LargeActionButtonDelegate S;
    public final RowDelegate T;
    public final FullScreenStateDelegate U;
    public final Object V;
    public final Object W;

    public UserChecklistController(UserChecklistContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Accounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_user_checklist;
        this.N = s.t(this, f.f);
        final int i = 1;
        this.O = true;
        this.P = true;
        final int i2 = 0;
        this.Q = w.y0(new Function0(this) { // from class: qmg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserChecklistController f247829b;

            {
                this.f247829b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                UserChecklistController userChecklistController = this.f247829b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = UserChecklistController.X;
                        qji.b bVarU2 = userChecklistController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user.checklist.impl.ui.screen.di.UserChecklistControllerInjector");
                        kmg.b bVar = (kmg.b) bVarU2;
                        kmg.d dVar = bVar.f185866b;
                        kmg.b bVar2 = bVar.f185867c;
                        UserChecklistContract$InputData userChecklistContract$InputData = userChecklistController.K;
                        userChecklistContract$InputData.getClass();
                        return new kmg.c(dVar, bVar2, userChecklistContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserChecklistController.X;
                        kmg.c cVar = (kmg.c) userChecklistController.Q.getValue();
                        kmg.d dVar2 = cVar.f185869b;
                        Context context = dVar2.e;
                        smg.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        umg.e stepItemsProvider = new umg.e(new f01.c(context));
                        umg.b progressChartProvider = new umg.b();
                        Intrinsics.checkNotNullParameter(stepItemsProvider, "stepItemsProvider");
                        Intrinsics.checkNotNullParameter(progressChartProvider, "progressChartProvider");
                        umg.a aVar = new umg.a(stepItemsProvider, progressChartProvider);
                        tmg.l resourceProvider = new tmg.l();
                        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
                        Intrinsics.checkNotNullParameter(new tmg.j(), "progressChartProvider");
                        tmg.f headerItemsProvider = new tmg.f();
                        tmg.l lVar = new tmg.l();
                        tmg.l lVar2 = new tmg.l();
                        m93.g gVarI = dVar2.f.i();
                        s.j(gVarI);
                        u9l.a aVarB = dVar2.f185874g.b();
                        s.j(aVarB);
                        tmg.n sectionItemsProvider = new tmg.n(lVar, new tmg.g(lVar2, gVarI, aVarB));
                        Intrinsics.checkNotNullParameter(headerItemsProvider, "headerItemsProvider");
                        Intrinsics.checkNotNullParameter(sectionItemsProvider, "sectionItemsProvider");
                        o oVar = new o(ImmutableMap.of(p.class, (tmg.h) aVar, n0.class, new tmg.h(headerItemsProvider, sectionItemsProvider)), cVar.f185868a, new tmg.c());
                        kmg.a aVar2 = dVar2.f185872b;
                        emg.a userChecklistInteractor = aVar2.a();
                        s.j(userChecklistInteractor);
                        kmg.h hVar = kmg.i.Companion;
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(userChecklistInteractor, "userChecklistInteractor");
                        emg.a userChecklistInteractor2 = aVar2.b();
                        s.j(userChecklistInteractor2);
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(userChecklistInteractor2, "userChecklistInteractor");
                        kge.d dVar3 = new kge.d(dVar2.f185873c.c(), dVar2.d.b());
                        kmg.d dVar4 = cVar.f185870c.f185866b;
                        return new l(oVar, userChecklistInteractor, userChecklistInteractor2, dVar3, new z(dVar4.f185873c.c(), dVar4.d.b()), ((s41.a) dVar2.f185871a).d(), cVar.f185868a);
                    default:
                        KProperty[] kPropertyArr3 = UserChecklistController.X;
                        UserChecklistController userChecklistController2 = this.f247829b;
                        return dli.f.a(userChecklistController2, (b) userChecklistController2.V.getValue(), v.k(userChecklistController2.R, userChecklistController2.S, userChecklistController2.T, userChecklistController2.U, new SimpleLimitProgressBarWithTextDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.screenUserChecklist_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new TextDelegate();
        this.S = new LargeActionButtonDelegate();
        this.T = new RowDelegate(null, null, 7);
        this.U = new FullScreenStateDelegate();
        this.V = w.y0(new Function0(this) { // from class: qmg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserChecklistController f247829b;

            {
                this.f247829b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                UserChecklistController userChecklistController = this.f247829b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = UserChecklistController.X;
                        qji.b bVarU2 = userChecklistController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user.checklist.impl.ui.screen.di.UserChecklistControllerInjector");
                        kmg.b bVar = (kmg.b) bVarU2;
                        kmg.d dVar = bVar.f185866b;
                        kmg.b bVar2 = bVar.f185867c;
                        UserChecklistContract$InputData userChecklistContract$InputData = userChecklistController.K;
                        userChecklistContract$InputData.getClass();
                        return new kmg.c(dVar, bVar2, userChecklistContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserChecklistController.X;
                        kmg.c cVar = (kmg.c) userChecklistController.Q.getValue();
                        kmg.d dVar2 = cVar.f185869b;
                        Context context = dVar2.e;
                        smg.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        umg.e stepItemsProvider = new umg.e(new f01.c(context));
                        umg.b progressChartProvider = new umg.b();
                        Intrinsics.checkNotNullParameter(stepItemsProvider, "stepItemsProvider");
                        Intrinsics.checkNotNullParameter(progressChartProvider, "progressChartProvider");
                        umg.a aVar = new umg.a(stepItemsProvider, progressChartProvider);
                        tmg.l resourceProvider = new tmg.l();
                        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
                        Intrinsics.checkNotNullParameter(new tmg.j(), "progressChartProvider");
                        tmg.f headerItemsProvider = new tmg.f();
                        tmg.l lVar = new tmg.l();
                        tmg.l lVar2 = new tmg.l();
                        m93.g gVarI = dVar2.f.i();
                        s.j(gVarI);
                        u9l.a aVarB = dVar2.f185874g.b();
                        s.j(aVarB);
                        tmg.n sectionItemsProvider = new tmg.n(lVar, new tmg.g(lVar2, gVarI, aVarB));
                        Intrinsics.checkNotNullParameter(headerItemsProvider, "headerItemsProvider");
                        Intrinsics.checkNotNullParameter(sectionItemsProvider, "sectionItemsProvider");
                        o oVar = new o(ImmutableMap.of(p.class, (tmg.h) aVar, n0.class, new tmg.h(headerItemsProvider, sectionItemsProvider)), cVar.f185868a, new tmg.c());
                        kmg.a aVar2 = dVar2.f185872b;
                        emg.a userChecklistInteractor = aVar2.a();
                        s.j(userChecklistInteractor);
                        kmg.h hVar = kmg.i.Companion;
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(userChecklistInteractor, "userChecklistInteractor");
                        emg.a userChecklistInteractor2 = aVar2.b();
                        s.j(userChecklistInteractor2);
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(userChecklistInteractor2, "userChecklistInteractor");
                        kge.d dVar3 = new kge.d(dVar2.f185873c.c(), dVar2.d.b());
                        kmg.d dVar4 = cVar.f185870c.f185866b;
                        return new l(oVar, userChecklistInteractor, userChecklistInteractor2, dVar3, new z(dVar4.f185873c.c(), dVar4.d.b()), ((s41.a) dVar2.f185871a).d(), cVar.f185868a);
                    default:
                        KProperty[] kPropertyArr3 = UserChecklistController.X;
                        UserChecklistController userChecklistController2 = this.f247829b;
                        return dli.f.a(userChecklistController2, (b) userChecklistController2.V.getValue(), v.k(userChecklistController2.R, userChecklistController2.S, userChecklistController2.T, userChecklistController2.U, new SimpleLimitProgressBarWithTextDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.screenUserChecklist_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: qmg.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserChecklistController f247829b;

            {
                this.f247829b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                UserChecklistController userChecklistController = this.f247829b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = UserChecklistController.X;
                        qji.b bVarU2 = userChecklistController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.user.checklist.impl.ui.screen.di.UserChecklistControllerInjector");
                        kmg.b bVar = (kmg.b) bVarU2;
                        kmg.d dVar = bVar.f185866b;
                        kmg.b bVar2 = bVar.f185867c;
                        UserChecklistContract$InputData userChecklistContract$InputData = userChecklistController.K;
                        userChecklistContract$InputData.getClass();
                        return new kmg.c(dVar, bVar2, userChecklistContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = UserChecklistController.X;
                        kmg.c cVar = (kmg.c) userChecklistController.Q.getValue();
                        kmg.d dVar2 = cVar.f185869b;
                        Context context = dVar2.e;
                        smg.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        umg.e stepItemsProvider = new umg.e(new f01.c(context));
                        umg.b progressChartProvider = new umg.b();
                        Intrinsics.checkNotNullParameter(stepItemsProvider, "stepItemsProvider");
                        Intrinsics.checkNotNullParameter(progressChartProvider, "progressChartProvider");
                        umg.a aVar = new umg.a(stepItemsProvider, progressChartProvider);
                        tmg.l resourceProvider = new tmg.l();
                        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
                        Intrinsics.checkNotNullParameter(new tmg.j(), "progressChartProvider");
                        tmg.f headerItemsProvider = new tmg.f();
                        tmg.l lVar = new tmg.l();
                        tmg.l lVar2 = new tmg.l();
                        m93.g gVarI = dVar2.f.i();
                        s.j(gVarI);
                        u9l.a aVarB = dVar2.f185874g.b();
                        s.j(aVarB);
                        tmg.n sectionItemsProvider = new tmg.n(lVar, new tmg.g(lVar2, gVarI, aVarB));
                        Intrinsics.checkNotNullParameter(headerItemsProvider, "headerItemsProvider");
                        Intrinsics.checkNotNullParameter(sectionItemsProvider, "sectionItemsProvider");
                        o oVar = new o(ImmutableMap.of(p.class, (tmg.h) aVar, n0.class, new tmg.h(headerItemsProvider, sectionItemsProvider)), cVar.f185868a, new tmg.c());
                        kmg.a aVar2 = dVar2.f185872b;
                        emg.a userChecklistInteractor = aVar2.a();
                        s.j(userChecklistInteractor);
                        kmg.h hVar = kmg.i.Companion;
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(userChecklistInteractor, "userChecklistInteractor");
                        emg.a userChecklistInteractor2 = aVar2.b();
                        s.j(userChecklistInteractor2);
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(userChecklistInteractor2, "userChecklistInteractor");
                        kge.d dVar3 = new kge.d(dVar2.f185873c.c(), dVar2.d.b());
                        kmg.d dVar4 = cVar.f185870c.f185866b;
                        return new l(oVar, userChecklistInteractor, userChecklistInteractor2, dVar3, new z(dVar4.f185873c.c(), dVar4.d.b()), ((s41.a) dVar2.f185871a).d(), cVar.f185868a);
                    default:
                        KProperty[] kPropertyArr3 = UserChecklistController.X;
                        UserChecklistController userChecklistController2 = this.f247829b;
                        return dli.f.a(userChecklistController2, (b) userChecklistController2.V.getValue(), v.k(userChecklistController2.R, userChecklistController2.S, userChecklistController2.T, userChecklistController2.U, new SimpleLimitProgressBarWithTextDelegate(), new RowLoadingDelegate(), new SimpleMediaDelegate()), R$id.screenUserChecklist_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.N.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jmg.a) value).f176623b.setHeaderModel(uiState.f247826b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kmg.c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (qmg.b) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: V2, reason: from getter */
    public final boolean getP() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.U.f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f53218h), new qmg.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.d.f121375b), new i(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
