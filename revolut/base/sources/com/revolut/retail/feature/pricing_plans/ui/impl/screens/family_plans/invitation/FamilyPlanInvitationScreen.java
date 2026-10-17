package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.s0;
import au0.u0;
import aw0.i;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.AvatarGroupDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemsLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreenContract$InputData;
import dli.a;
import java.util.List;
import kkk.d;
import kkk.g;
import kkk.n;
import kkk.p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ngk.c;
import qgk.i0;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;
import z92.f;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/invitation/FamilyPlanInvitationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkkk/n;", "Ldli/a;", "Lkkk/p;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FamilyPlanInvitationScreen extends ViewController<n> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(FamilyPlanInvitationScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenFamilyPlanInvitationBinding;", 0))};
    public final FamilyPlanInvitationScreenContract$InputData K;
    public final int L;
    public final int M;
    public final TextDelegate N;
    public final FullScreenStateDelegate O;
    public final LargeActionButtonDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public FamilyPlanInvitationScreen(FamilyPlanInvitationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_family_plan_invitation;
        this.M = R$style.UiKitTheme_Mono;
        this.N = new TextDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new LargeActionButtonDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: kkk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanInvitationScreen f185099b;

            {
                this.f185099b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FamilyPlanInvitationScreen familyPlanInvitationScreen = this.f185099b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanInvitationScreen.U;
                        FamilyPlanInvitationScreen familyPlanInvitationScreen2 = this.f185099b;
                        return dli.f.a(familyPlanInvitationScreen2, familyPlanInvitationScreen2.R2(), zhm.v.k(familyPlanInvitationScreen2.O, new EsimDelegate(), new EsimLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), familyPlanInvitationScreen2.P, new ToDoItemDelegate(), familyPlanInvitationScreen2.N, new ToDoItemsLoadingDelegate(), new AvatarGroupDelegate(), new LabelButtonDelegate()), R$id.familyPlanInvitationScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanInvitationScreen.U;
                        qji.b bVarU2 = familyPlanInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.di.FamilyPlanInvitationScreenInjector");
                        qgk.l lVar = (qgk.l) bVarU2;
                        i0 i0Var = lVar.f246094c;
                        qgk.l lVar2 = lVar.d;
                        FamilyPlanInvitationScreenContract$InputData familyPlanInvitationScreenContract$InputData = familyPlanInvitationScreen.K;
                        familyPlanInvitationScreenContract$InputData.getClass();
                        return new qgk.n(i0Var, lVar2, familyPlanInvitationScreen, familyPlanInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanInvitationScreen.U;
                        return (o) ((qgk.n) familyPlanInvitationScreen.S.getValue()).f.get();
                }
            }
        });
        this.R = s.t(this, d.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: kkk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanInvitationScreen f185099b;

            {
                this.f185099b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FamilyPlanInvitationScreen familyPlanInvitationScreen = this.f185099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanInvitationScreen.U;
                        FamilyPlanInvitationScreen familyPlanInvitationScreen2 = this.f185099b;
                        return dli.f.a(familyPlanInvitationScreen2, familyPlanInvitationScreen2.R2(), zhm.v.k(familyPlanInvitationScreen2.O, new EsimDelegate(), new EsimLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), familyPlanInvitationScreen2.P, new ToDoItemDelegate(), familyPlanInvitationScreen2.N, new ToDoItemsLoadingDelegate(), new AvatarGroupDelegate(), new LabelButtonDelegate()), R$id.familyPlanInvitationScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanInvitationScreen.U;
                        qji.b bVarU2 = familyPlanInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.di.FamilyPlanInvitationScreenInjector");
                        qgk.l lVar = (qgk.l) bVarU2;
                        i0 i0Var = lVar.f246094c;
                        qgk.l lVar2 = lVar.d;
                        FamilyPlanInvitationScreenContract$InputData familyPlanInvitationScreenContract$InputData = familyPlanInvitationScreen.K;
                        familyPlanInvitationScreenContract$InputData.getClass();
                        return new qgk.n(i0Var, lVar2, familyPlanInvitationScreen, familyPlanInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanInvitationScreen.U;
                        return (o) ((qgk.n) familyPlanInvitationScreen.S.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: kkk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FamilyPlanInvitationScreen f185099b;

            {
                this.f185099b = this;
            }

            /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FamilyPlanInvitationScreen familyPlanInvitationScreen = this.f185099b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FamilyPlanInvitationScreen.U;
                        FamilyPlanInvitationScreen familyPlanInvitationScreen2 = this.f185099b;
                        return dli.f.a(familyPlanInvitationScreen2, familyPlanInvitationScreen2.R2(), zhm.v.k(familyPlanInvitationScreen2.O, new EsimDelegate(), new EsimLoadingDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), familyPlanInvitationScreen2.P, new ToDoItemDelegate(), familyPlanInvitationScreen2.N, new ToDoItemsLoadingDelegate(), new AvatarGroupDelegate(), new LabelButtonDelegate()), R$id.familyPlanInvitationScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FamilyPlanInvitationScreen.U;
                        qji.b bVarU2 = familyPlanInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.di.FamilyPlanInvitationScreenInjector");
                        qgk.l lVar = (qgk.l) bVarU2;
                        i0 i0Var = lVar.f246094c;
                        qgk.l lVar2 = lVar.d;
                        FamilyPlanInvitationScreenContract$InputData familyPlanInvitationScreenContract$InputData = familyPlanInvitationScreen.K;
                        familyPlanInvitationScreenContract$InputData.getClass();
                        return new qgk.n(i0Var, lVar2, familyPlanInvitationScreen, familyPlanInvitationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FamilyPlanInvitationScreen.U;
                        return (o) ((qgk.n) familyPlanInvitationScreen.S.getValue()).f.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u0 u0Var;
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().d;
        Clause clause = uiState.d;
        i iVar = uiState.e;
        navBarWithBigTile.setTitle(clause);
        navBarWithBigTile.setToolbarTitle(clause);
        if (clause != null) {
            Image image = uiState.f185115c;
            u0Var = new u0(image != null ? new NavBarWithContainerBackground.ImageBackground(image, (s8) null, (Color.SolidRes) null, 14) : NavBarWithContainerBackground.TransparentBackground.f57882a, clause, null);
        } else {
            u0Var = null;
        }
        c1.S(navBarWithBigTile, v.l(u0Var), null, null, 6);
        if (iVar != null) {
            d3().f215186b.setModel(iVar);
        }
        ActionFooterView familyPlanInvitationScreenActionFooterView = d3().f215186b;
        Intrinsics.checkNotNullExpressionValue(familyPlanInvitationScreenActionFooterView, "familyPlanInvitationScreenActionFooterView");
        familyPlanInvitationScreenActionFooterView.setVisibility(iVar != null ? 0 : 8);
        d3().f215187c.setBackgroundType(uiState.f185114b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qgk.n) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().d;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        ScreenContentRecyclerView familyPlanInvitationScreenRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(familyPlanInvitationScreenRecyclerView, "familyPlanInvitationScreenRecyclerView");
        ActionFooterView familyPlanInvitationScreenActionFooterView = d3().f215186b;
        Intrinsics.checkNotNullExpressionValue(familyPlanInvitationScreenActionFooterView, "familyPlanInvitationScreenActionFooterView");
        f.b(familyPlanInvitationScreenActionFooterView, familyPlanInvitationScreenRecyclerView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().d.f59357t), new kkk.e(this, continuation, 0), 3);
        ViewController.P2(this, y.x(this.N.d, d3().f215186b.e, "mergeWith(...)"), new kae.d(this, continuation, 18), 3);
        ViewController.P2(this, rd0.e.b(d3().f215186b.f), new kkk.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f215186b.f58955g), new kkk.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new kkk.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new g(this, null), 3);
    }

    public final c d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final kkk.o R2() {
        return (kkk.o) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
