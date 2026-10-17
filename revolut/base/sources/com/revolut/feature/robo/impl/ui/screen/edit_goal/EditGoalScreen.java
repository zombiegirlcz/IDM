package com.revolut.feature.robo.impl.ui.screen.edit_goal;

import anc.d;
import anc.f;
import anc.g;
import anc.l;
import anc.m;
import anc.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.impl.R$layout;
import com.revolut.feature.robo.impl.ui.screen.edit_goal.EditGoalScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/edit_goal/EditGoalScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lanc/l;", "Ltki/c;", "Lanc/q;", "Companion", "a", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditGoalScreen extends ViewController<l> implements c {
    public final f K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EditGoalScreen.class, "binding", "getBinding()Lcom/revolut/feature/robo/impl/databinding/ScreenEditGoalBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.robo.impl.ui.screen.edit_goal.EditGoalScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public EditGoalScreen(f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: anc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditGoalScreen f6739b;

            {
                this.f6739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditGoalScreen editGoalScreen = this.f6739b;
                switch (i2) {
                    case 0:
                        EditGoalScreen.Companion companion = EditGoalScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(editGoalScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        f fVar = editGoalScreen.K;
                        fVar.getClass();
                        return new dmc.f(rVar, fVar);
                    case 1:
                        EditGoalScreen.Companion companion2 = EditGoalScreen.INSTANCE;
                        dmc.f fVar2 = (dmc.f) editGoalScreen.L.getValue();
                        a3e.u uVar = new a3e.u(new u(), new s(fVar2.b()), new t());
                        f fVar3 = fVar2.f115940a;
                        dmc.r rVar2 = fVar2.f115941b;
                        zjh.f fVarA = rVar2.e.a();
                        w80.b bVarB = fVar2.b();
                        l80.e eVarH = rVar2.f116031h.h();
                        vc.s.j(eVarH);
                        return new com.revolut.feature.robo.impl.ui.screen.edit_goal.a(uVar, fVar3, fVarA, bVarB, eVarH);
                    case 2:
                        EditGoalScreen.Companion companion3 = EditGoalScreen.INSTANCE;
                        return new CenteredAmountDelegate(new b(editGoalScreen, 0));
                    default:
                        EditGoalScreen.Companion companion4 = EditGoalScreen.INSTANCE;
                        EditGoalScreen editGoalScreen2 = this.f6739b;
                        return tki.g.a(editGoalScreen2, editGoalScreen2.R2(), zhm.u.c((CenteredAmountDelegate) editGoalScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: anc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditGoalScreen f6739b;

            {
                this.f6739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditGoalScreen editGoalScreen = this.f6739b;
                switch (i22) {
                    case 0:
                        EditGoalScreen.Companion companion = EditGoalScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(editGoalScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        f fVar = editGoalScreen.K;
                        fVar.getClass();
                        return new dmc.f(rVar, fVar);
                    case 1:
                        EditGoalScreen.Companion companion2 = EditGoalScreen.INSTANCE;
                        dmc.f fVar2 = (dmc.f) editGoalScreen.L.getValue();
                        a3e.u uVar = new a3e.u(new u(), new s(fVar2.b()), new t());
                        f fVar3 = fVar2.f115940a;
                        dmc.r rVar2 = fVar2.f115941b;
                        zjh.f fVarA = rVar2.e.a();
                        w80.b bVarB = fVar2.b();
                        l80.e eVarH = rVar2.f116031h.h();
                        vc.s.j(eVarH);
                        return new com.revolut.feature.robo.impl.ui.screen.edit_goal.a(uVar, fVar3, fVarA, bVarB, eVarH);
                    case 2:
                        EditGoalScreen.Companion companion3 = EditGoalScreen.INSTANCE;
                        return new CenteredAmountDelegate(new b(editGoalScreen, 0));
                    default:
                        EditGoalScreen.Companion companion4 = EditGoalScreen.INSTANCE;
                        EditGoalScreen editGoalScreen2 = this.f6739b;
                        return tki.g.a(editGoalScreen2, editGoalScreen2.R2(), zhm.u.c((CenteredAmountDelegate) editGoalScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_edit_goal;
        this.O = s.t(this, anc.c.f);
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: anc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditGoalScreen f6739b;

            {
                this.f6739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditGoalScreen editGoalScreen = this.f6739b;
                switch (i22) {
                    case 0:
                        EditGoalScreen.Companion companion = EditGoalScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(editGoalScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        f fVar = editGoalScreen.K;
                        fVar.getClass();
                        return new dmc.f(rVar, fVar);
                    case 1:
                        EditGoalScreen.Companion companion2 = EditGoalScreen.INSTANCE;
                        dmc.f fVar2 = (dmc.f) editGoalScreen.L.getValue();
                        a3e.u uVar = new a3e.u(new u(), new s(fVar2.b()), new t());
                        f fVar3 = fVar2.f115940a;
                        dmc.r rVar2 = fVar2.f115941b;
                        zjh.f fVarA = rVar2.e.a();
                        w80.b bVarB = fVar2.b();
                        l80.e eVarH = rVar2.f116031h.h();
                        vc.s.j(eVarH);
                        return new com.revolut.feature.robo.impl.ui.screen.edit_goal.a(uVar, fVar3, fVarA, bVarB, eVarH);
                    case 2:
                        EditGoalScreen.Companion companion3 = EditGoalScreen.INSTANCE;
                        return new CenteredAmountDelegate(new b(editGoalScreen, 0));
                    default:
                        EditGoalScreen.Companion companion4 = EditGoalScreen.INSTANCE;
                        EditGoalScreen editGoalScreen2 = this.f6739b;
                        return tki.g.a(editGoalScreen2, editGoalScreen2.R2(), zhm.u.c((CenteredAmountDelegate) editGoalScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: anc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditGoalScreen f6739b;

            {
                this.f6739b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EditGoalScreen editGoalScreen = this.f6739b;
                switch (i22) {
                    case 0:
                        EditGoalScreen.Companion companion = EditGoalScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(editGoalScreen.m2()).a().get(dmc.r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dmc.r.class, " is not found"));
                        }
                        dmc.r rVar = ((dmc.r) aVar2.b()).f116039s;
                        f fVar = editGoalScreen.K;
                        fVar.getClass();
                        return new dmc.f(rVar, fVar);
                    case 1:
                        EditGoalScreen.Companion companion2 = EditGoalScreen.INSTANCE;
                        dmc.f fVar2 = (dmc.f) editGoalScreen.L.getValue();
                        a3e.u uVar = new a3e.u(new u(), new s(fVar2.b()), new t());
                        f fVar3 = fVar2.f115940a;
                        dmc.r rVar2 = fVar2.f115941b;
                        zjh.f fVarA = rVar2.e.a();
                        w80.b bVarB = fVar2.b();
                        l80.e eVarH = rVar2.f116031h.h();
                        vc.s.j(eVarH);
                        return new com.revolut.feature.robo.impl.ui.screen.edit_goal.a(uVar, fVar3, fVarA, bVarB, eVarH);
                    case 2:
                        EditGoalScreen.Companion companion3 = EditGoalScreen.INSTANCE;
                        return new CenteredAmountDelegate(new b(editGoalScreen, 0));
                    default:
                        EditGoalScreen.Companion companion4 = EditGoalScreen.INSTANCE;
                        EditGoalScreen editGoalScreen2 = this.f6739b;
                        return tki.g.a(editGoalScreen2, editGoalScreen2.R2(), zhm.u.c((CenteredAmountDelegate) editGoalScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        anc.q uiState = (anc.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        anc.o oVar2 = uiState.f6757c;
        if (oVar2 instanceof m) {
            d3().f6297c.setSecondaryButtonEnabled(((m) oVar2).f6752a);
        } else {
            if (!oVar2.equals(n.f6753a)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f6297c.setSecondaryButtonEnabled(false);
        }
        BasicNavBar basicNavBar = d3().f6296b;
        List<? extends NavBarMenuItem> listC = uiState.f6755a.f6754a ? u.c(new TextNavBarMenuItem("remove-goal-menu-item", new TextLocalisedClause(R$string.wealth_robo_edit_goal_delete_goal_menu_item, null, null, 14), null, null, 12)) : null;
        if (listC == null) {
            listC = f0.f322471a;
        }
        basicNavBar.setMenuItems(listC);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (dmc.f) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f6296b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f6296b.setTitle(new TextLocalisedClause(R$string.wealth_robo_portfolio_goal_title, null, null, 14));
        TwinHorizontalButton twinHorizontalButton = d3().f6297c;
        twinHorizontalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinHorizontalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.wealth_robo_edit_goal_button, null, null, 14));
        twinHorizontalButton.setPrimaryButtonVisible(false);
        twinHorizontalButton.setGradientBackgroundEnabled(true);
        twinHorizontalButton.setPrimaryButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinHorizontalButton.setPrimaryButtonVisible(true);
        twinHorizontalButton.setPrimaryButtonWeight(0.16666667f);
        twinHorizontalButton.setSecondaryButtonWeight(0.8333333f);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f6297c.c()), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f6297c.d()), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) this.P.getValue()).d.f121375b), new af4.e(this, null, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f6296b.f59210a.f57403b), new d(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f6296b.f59211b), new d(this, null, 3), 3);
    }

    public final amc.a d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (amc.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
