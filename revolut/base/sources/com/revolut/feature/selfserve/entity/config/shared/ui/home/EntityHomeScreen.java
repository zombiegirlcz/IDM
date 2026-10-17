package com.revolut.feature.selfserve.entity.config.shared.ui.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import cli.y;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.selfserve.entity.config.shared.R$id;
import com.revolut.feature.selfserve.entity.config.shared.R$layout;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreenContract$InputData;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import com.revolut.tracking.v3.FinCrimeSelfServeContext;
import dli.c;
import ewh.x;
import eyc.e;
import eyc.i;
import eyc.j;
import eyc.l;
import eyc.m;
import eyc.n;
import eyc.p;
import ir2.a;
import ir2.d;
import ir2.g;
import ir2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import vkm.j2;
import vxc.f;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/entity/config/shared/ui/home/EntityHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/selfserve/entity/config/shared/ui/home/a;", "Ldli/a;", "Leyc/q;", "Lno/k;", "feature_selfserve_entity_config_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EntityHomeScreen extends ViewController<a> implements dli.a, k {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(EntityHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/selfserve/entity/config/shared/databinding/ScreenEntityHomeBinding;", 0))};
    public final EntityHomeScreenContract$InputData K;
    public final h L;
    public AnalyticsContext M;
    public final RowDelegate N;
    public final ListCellBulletDelegate O;
    public final FullScreenStateDelegate P;
    public final ProgressStepVerticalDelegate Q;
    public final ProgressStepVerticalV2Delegate R;
    public final CellDetailsActionDelegate S;
    public final LargeActionButtonDelegate T;
    public final LabelButtonDelegate U;
    public final int V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public EntityHomeScreen(EntityHomeScreenContract$InputData inputData) {
        AnalyticsContext analyticsContext;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, e.f);
        EntityHomeScreenContract$InputData.Params params = inputData instanceof EntityHomeScreenContract$InputData.Params ? (EntityHomeScreenContract$InputData.Params) inputData : null;
        EntityConfigRepository$Params entityConfigRepository$Params = params != null ? params.f85846b : null;
        if (entityConfigRepository$Params instanceof EntityConfigRepository$Params.Config) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            FinCrimeSelfServeContext.a aVarNewBuilder = FinCrimeSelfServeContext.newBuilder();
            String str = ((EntityConfigRepository$Params.Config) entityConfigRepository$Params).f104892a;
            aVarNewBuilder.c();
            ((FinCrimeSelfServeContext) aVarNewBuilder.f49761b).setFlowName(str);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        } else if (entityConfigRepository$Params instanceof EntityConfigRepository$Params.Ticket) {
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            FinCrimeSelfServeContext.a aVarNewBuilder2 = FinCrimeSelfServeContext.newBuilder();
            String str2 = ((EntityConfigRepository$Params.Ticket) entityConfigRepository$Params).f104894a;
            aVarNewBuilder2.c();
            ((FinCrimeSelfServeContext) aVarNewBuilder2.f49761b).setTicketId(str2);
            w0 w0VarA2 = aVarNewBuilder2.a();
            companion2.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2));
        } else {
            if (entityConfigRepository$Params != null) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsContext = null;
        }
        this.M = analyticsContext;
        this.N = new RowDelegate(null, null, 7);
        this.O = new ListCellBulletDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new ProgressStepVerticalDelegate();
        this.R = new ProgressStepVerticalV2Delegate();
        this.S = new CellDetailsActionDelegate();
        this.T = new LargeActionButtonDelegate();
        this.U = new LabelButtonDelegate();
        this.V = R$layout.screen_entity_home;
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: eyc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityHomeScreen f130661b;

            {
                this.f130661b = this;
            }

            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EntityHomeScreen entityHomeScreen = this.f130661b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EntityHomeScreen.Z;
                        EntityHomeScreen entityHomeScreen2 = this.f130661b;
                        return dli.f.a(entityHomeScreen2, entityHomeScreen2.d(), v.k(entityHomeScreen2.N, entityHomeScreen2.P, entityHomeScreen2.O, entityHomeScreen2.Q, entityHomeScreen2.R, entityHomeScreen2.S, entityHomeScreen2.T, entityHomeScreen2.U, new PlainTextWarningDelegate(), new PlainTextDelegate(), new CounterTextDelegate(), new ProgressStepsDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.entityHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EntityHomeScreen.Z;
                        qji.b bVarU2 = entityHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.selfserve.entity.config.shared.ui.home.di.EntityHomeScreenInjector");
                        vxc.c cVar = (vxc.c) bVarU2;
                        vxc.d dVar = cVar.f293058b;
                        vxc.c cVar2 = cVar.f293059c;
                        EntityHomeScreenContract$InputData entityHomeScreenContract$InputData = entityHomeScreen.K;
                        entityHomeScreenContract$InputData.getClass();
                        return new vxc.f(dVar, cVar2, entityHomeScreen, entityHomeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EntityHomeScreen.Z;
                        return (p) ((vxc.f) entityHomeScreen.X.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: eyc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityHomeScreen f130661b;

            {
                this.f130661b = this;
            }

            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EntityHomeScreen entityHomeScreen = this.f130661b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EntityHomeScreen.Z;
                        EntityHomeScreen entityHomeScreen2 = this.f130661b;
                        return dli.f.a(entityHomeScreen2, entityHomeScreen2.d(), v.k(entityHomeScreen2.N, entityHomeScreen2.P, entityHomeScreen2.O, entityHomeScreen2.Q, entityHomeScreen2.R, entityHomeScreen2.S, entityHomeScreen2.T, entityHomeScreen2.U, new PlainTextWarningDelegate(), new PlainTextDelegate(), new CounterTextDelegate(), new ProgressStepsDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.entityHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EntityHomeScreen.Z;
                        qji.b bVarU2 = entityHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.selfserve.entity.config.shared.ui.home.di.EntityHomeScreenInjector");
                        vxc.c cVar = (vxc.c) bVarU2;
                        vxc.d dVar = cVar.f293058b;
                        vxc.c cVar2 = cVar.f293059c;
                        EntityHomeScreenContract$InputData entityHomeScreenContract$InputData = entityHomeScreen.K;
                        entityHomeScreenContract$InputData.getClass();
                        return new vxc.f(dVar, cVar2, entityHomeScreen, entityHomeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EntityHomeScreen.Z;
                        return (p) ((vxc.f) entityHomeScreen.X.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: eyc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EntityHomeScreen f130661b;

            {
                this.f130661b = this;
            }

            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EntityHomeScreen entityHomeScreen = this.f130661b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EntityHomeScreen.Z;
                        EntityHomeScreen entityHomeScreen2 = this.f130661b;
                        return dli.f.a(entityHomeScreen2, entityHomeScreen2.d(), v.k(entityHomeScreen2.N, entityHomeScreen2.P, entityHomeScreen2.O, entityHomeScreen2.Q, entityHomeScreen2.R, entityHomeScreen2.S, entityHomeScreen2.T, entityHomeScreen2.U, new PlainTextWarningDelegate(), new PlainTextDelegate(), new CounterTextDelegate(), new ProgressStepsDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.entityHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EntityHomeScreen.Z;
                        qji.b bVarU2 = entityHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.selfserve.entity.config.shared.ui.home.di.EntityHomeScreenInjector");
                        vxc.c cVar = (vxc.c) bVarU2;
                        vxc.d dVar = cVar.f293058b;
                        vxc.c cVar2 = cVar.f293059c;
                        EntityHomeScreenContract$InputData entityHomeScreenContract$InputData = entityHomeScreen.K;
                        entityHomeScreenContract$InputData.getClass();
                        return new vxc.f(dVar, cVar2, entityHomeScreen, entityHomeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EntityHomeScreen.Z;
                        return (p) ((vxc.f) entityHomeScreen.X.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        eyc.q uiState = (eyc.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ir2.h hVar = uiState.f130667b;
        NavBarWithToolbar navBarWithToolbar = d3().f275384b;
        navBarWithToolbar.setNavigationButtonImage(uiState.f130666a);
        if (hVar instanceof h.a) {
            navBarWithToolbar.I0(t3.DEFAULT, false);
        } else {
            if (!(hVar instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            g gVar = (g) hVar;
            TextClause textClause = gVar.f167989a;
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
            Clause clause = gVar.f167990b;
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            List<? extends NavBarMenuItem> list = gVar.f167991c;
            if (list == null) {
                list = f0.f322471a;
            }
            navBarWithToolbar.setMenuItems(list);
            navBarWithToolbar.l0();
        }
        d dVar = uiState.f130668c;
        TwinVerticalButton twinVerticalButton = d3().f275385c;
        if (dVar instanceof d.a) {
            twinVerticalButton.setVisibility(8);
        } else {
            if (!(dVar instanceof ir2.e)) {
                throw new NoWhenBranchMatchedException();
            }
            twinVerticalButton.setVisibility(0);
            ir2.e eVar = (ir2.e) dVar;
            ir2.b bVar = eVar.f167987a;
            twinVerticalButton.setMainButtonText(bVar.f167981a);
            twinVerticalButton.setMainButtonStyle(bVar.f167982b);
            ir2.a aVar = eVar.f167988b;
            TwinVerticalButton twinVerticalButton2 = d3().f275385c;
            if (aVar instanceof a.C0939a) {
                twinVerticalButton2.setSecondaryButtonVisible(false);
            } else {
                if (!(aVar instanceof ir2.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                twinVerticalButton2.setSecondaryButtonVisible(true);
                ir2.b bVar2 = (ir2.b) aVar;
                twinVerticalButton2.setSecondaryButtonText(bVar2.f167981a);
                twinVerticalButton2.setSecondaryButtonStyle(bVar2.f167982b);
            }
        }
        h60.b bVar3 = uiState.e;
        b bVar4 = (b) d();
        y yVar = bVar4.f85856w;
        if (bVar3 == null || ((n) ((j2) yVar.f22677a).getValue()).f130664c) {
            return;
        }
        bVar4.f85854s.R(bVar3);
        bVar4.H2(yVar, new x(11));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        b bVar = (b) d();
        if (!((n) ((j2) bVar.f85856w.f22677a).getValue()).f130662a) {
            return true;
        }
        bVar.C2(a.C0539a.f85849a);
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.X.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getM() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.U.d.f121375b), new eyc.g(2, 4, p.class, d(), "onLabelButtonClicked", "onLabelButtonClicked(Lcom/revolut/core/ui_kit/delegates/LabelButtonDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new eyc.h(2, 4, p.class, d(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(this.T.d.f121375b), new i(2, 4, p.class, d(), "onLargeActionButtonClicked", "onLargeActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52691c), new exe.k(2, d(), p.class, "onListCellBulletClicked", "onListCellBulletClicked(Lcom/revolut/core/ui_kit/delegates/ListCellBulletDelegate$Model;)V", 4, 2), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new j(2, 4, p.class, d(), "onErrorClicked", "onErrorClicked(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
        vkm.d dVarB = rd0.e.b(this.Q.f53000c);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.R;
        int i = 2;
        ViewController.P2(this, vkm.q.J(dVarB, rd0.e.b(progressStepVerticalV2Delegate.e)), new exe.k(i, d(), p.class, "onProgressStepVerticalDelegateClauseClick", "onProgressStepVerticalDelegateClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 3), 3);
        ViewController.P2(this, rd0.e.b(progressStepVerticalV2Delegate.f.f121375b), new eyc.k(2, 4, p.class, d(), "onProgressPrimaryActionButtonClicked", "onProgressPrimaryActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/ProgressStepVerticalV2Delegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(progressStepVerticalV2Delegate.f53006g.f121375b), new l(2, 4, p.class, d(), "onProgressEndPrimaryActionButtonClicked", "onProgressEndPrimaryActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/ProgressStepVerticalV2Delegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(this.S.d), new m(2, 4, p.class, d(), "onCellDetailsActionDelegateActionClick", "onCellDetailsActionDelegateActionClick(Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(d3().f275384b.o.f57403b), new exe.k(i, d(), p.class, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V", 4, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f275384b.x0()), new ew1.d(this, null, 11), 3);
        ViewController.P2(this, rd0.e.b(d3().f275385c.o0()), new eyc.f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f275385c.p0()), new eyc.f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f275384b.f59410q), new eyc.f(this, null, 2), 3);
    }

    public final txc.a d3() {
        ViewBinding value = this.L.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (txc.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }
}
