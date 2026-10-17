package com.revolut.feature.robo.impl.ui.screen.manage_goal;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c65.i;
import cli.o;
import cnc.b;
import cnc.e;
import cnc.f;
import cnc.k;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.robo.impl.ui.screen.manage_goal.ManageGoalScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import dmc.g;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/manage_goal/ManageGoalScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lcnc/k;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManageGoalScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ManageGoalScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final e K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final ProductSelectionDelegate P;
    public final ProductSelectionLoadingDelegate Q;
    public final Object R;

    public ManageGoalScreen(e input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: cnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageGoalScreen f25385b;

            {
                this.f25385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManageGoalScreen manageGoalScreen = this.f25385b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManageGoalScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(manageGoalScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        e eVar = manageGoalScreen.K;
                        eVar.getClass();
                        return new dmc.g(rVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ManageGoalScreen.S;
                        dmc.g gVar = (dmc.g) manageGoalScreen.L.getValue();
                        gVar.getClass();
                        r rVar2 = new r();
                        n updateGoalSubtitleMapper = new n();
                        Intrinsics.checkNotNullParameter(updateGoalSubtitleMapper, "updateGoalSubtitleMapper");
                        s sVar = new s(rVar2, new o(), new l(), new q());
                        e eVar2 = gVar.f115947a;
                        dmc.r rVar3 = gVar.f115948b;
                        dmc.a aVar3 = rVar3.e;
                        zjh.f fVarA = aVar3.a();
                        t1j.b bVarG = rVar3.f116028b.G();
                        emc.e eVarC = aVar3.c();
                        l80.e eVarH = rVar3.f116031h.h();
                        vc.s.j(eVarH);
                        woc.f fVar = new woc.f();
                        woc.c cVar = new woc.c();
                        ael.t tVarF = rVar3.f116027a.f();
                        vc.s.j(tVarF);
                        return new com.revolut.feature.robo.impl.ui.screen.manage_goal.a(sVar, eVar2, fVarA, bVarG, eVarC, eVarH, fVar, cVar, tVarF, rVar3.d(), new yoc.n(), rVar3.f());
                    default:
                        KProperty[] kPropertyArr3 = ManageGoalScreen.S;
                        ManageGoalScreen manageGoalScreen2 = this.f25385b;
                        return tki.g.a(manageGoalScreen2, manageGoalScreen2.R2(), zhm.v.k(manageGoalScreen2.P, manageGoalScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: cnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageGoalScreen f25385b;

            {
                this.f25385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManageGoalScreen manageGoalScreen = this.f25385b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManageGoalScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(manageGoalScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        e eVar = manageGoalScreen.K;
                        eVar.getClass();
                        return new dmc.g(rVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ManageGoalScreen.S;
                        dmc.g gVar = (dmc.g) manageGoalScreen.L.getValue();
                        gVar.getClass();
                        r rVar2 = new r();
                        n updateGoalSubtitleMapper = new n();
                        Intrinsics.checkNotNullParameter(updateGoalSubtitleMapper, "updateGoalSubtitleMapper");
                        s sVar = new s(rVar2, new o(), new l(), new q());
                        e eVar2 = gVar.f115947a;
                        dmc.r rVar3 = gVar.f115948b;
                        dmc.a aVar3 = rVar3.e;
                        zjh.f fVarA = aVar3.a();
                        t1j.b bVarG = rVar3.f116028b.G();
                        emc.e eVarC = aVar3.c();
                        l80.e eVarH = rVar3.f116031h.h();
                        vc.s.j(eVarH);
                        woc.f fVar = new woc.f();
                        woc.c cVar = new woc.c();
                        ael.t tVarF = rVar3.f116027a.f();
                        vc.s.j(tVarF);
                        return new com.revolut.feature.robo.impl.ui.screen.manage_goal.a(sVar, eVar2, fVarA, bVarG, eVarC, eVarH, fVar, cVar, tVarF, rVar3.d(), new yoc.n(), rVar3.f());
                    default:
                        KProperty[] kPropertyArr3 = ManageGoalScreen.S;
                        ManageGoalScreen manageGoalScreen2 = this.f25385b;
                        return tki.g.a(manageGoalScreen2, manageGoalScreen2.R2(), zhm.v.k(manageGoalScreen2.P, manageGoalScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, b.f);
        this.P = new ProductSelectionDelegate();
        this.Q = new ProductSelectionLoadingDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: cnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageGoalScreen f25385b;

            {
                this.f25385b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManageGoalScreen manageGoalScreen = this.f25385b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManageGoalScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(manageGoalScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        e eVar = manageGoalScreen.K;
                        eVar.getClass();
                        return new dmc.g(rVar, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ManageGoalScreen.S;
                        dmc.g gVar = (dmc.g) manageGoalScreen.L.getValue();
                        gVar.getClass();
                        r rVar2 = new r();
                        n updateGoalSubtitleMapper = new n();
                        Intrinsics.checkNotNullParameter(updateGoalSubtitleMapper, "updateGoalSubtitleMapper");
                        s sVar = new s(rVar2, new o(), new l(), new q());
                        e eVar2 = gVar.f115947a;
                        dmc.r rVar3 = gVar.f115948b;
                        dmc.a aVar3 = rVar3.e;
                        zjh.f fVarA = aVar3.a();
                        t1j.b bVarG = rVar3.f116028b.G();
                        emc.e eVarC = aVar3.c();
                        l80.e eVarH = rVar3.f116031h.h();
                        vc.s.j(eVarH);
                        woc.f fVar = new woc.f();
                        woc.c cVar = new woc.c();
                        ael.t tVarF = rVar3.f116027a.f();
                        vc.s.j(tVarF);
                        return new com.revolut.feature.robo.impl.ui.screen.manage_goal.a(sVar, eVar2, fVarA, bVarG, eVarC, eVarH, fVar, cVar, tVarF, rVar3.d(), new yoc.n(), rVar3.f());
                    default:
                        KProperty[] kPropertyArr3 = ManageGoalScreen.S;
                        ManageGoalScreen manageGoalScreen2 = this.f25385b;
                        return tki.g.a(manageGoalScreen2, manageGoalScreen2.R2(), zhm.v.k(manageGoalScreen2.P, manageGoalScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f25396a.f25395a;
        navBarWithToolbar.setDescriptionText(clause);
        d3().f174539b.setLoadingVisible(clause == null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_robo_portfolio_manage_goal_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.wealth_robo_portfolio_manage_goal_second_description, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.P.p()), new cnc.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new i(this, null, 29), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
