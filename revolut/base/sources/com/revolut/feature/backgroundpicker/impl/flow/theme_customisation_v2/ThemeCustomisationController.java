package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import aq0.k;
import au0.t4;
import aw0.o9;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ChatPreviewDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HomeScreenPreviewDelegate;
import com.revolut.core.ui_kit.delegates.HomeScreenPreviewLoadingDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.WallpaperPreviewDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.recycler.CenterScrollableLinearLayoutManager;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.TwoViewsSwitcherView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.backgroundpicker.impl.R$layout;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$PostRecreationAction;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import mx0.q4;
import mx0.r4;
import mx0.s4;
import mx0.u4;
import no.m;
import org.jetbrains.annotations.NotNull;
import tc7.m0;
import te0.w;
import tki.h;
import tw0.a0;
import um2.c;
import um2.d;
import um2.g;
import um2.i;
import um2.k0;
import um2.l;
import um2.n;
import um2.r;
import um2.u;
import um2.x;
import um2.y;
import um2.z;
import vc.s;
import vim.f;
import vkm.j2;
import xki.e;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/theme_customisation_v2/ThemeCustomisationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lum2/c;", "Ltki/h;", "Lum2/r;", "Lno/m;", "Companion", "a", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemeCustomisationController extends ViewController<c> implements h, m {
    public final ThemeCustomisationContract$InputData K;
    public final AnalyticsProduct.Shared L;
    public final int M;
    public final ao.h N;
    public final Lazy O;
    public final Lazy P;
    public final Lazy Q;
    public final boolean R;
    public final Object S;
    public final Object T;
    public final ThemeCustomisationContract$SandboxAppearance U;
    public final Object V;
    public final WallpaperPreviewDelegate W;
    public int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final j f63784a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final j f63785b0;
    public final m0 c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final m0 f63786d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f63783e0 = {o0.f186429a.j(new h0(ThemeCustomisationController.class, "binding", "getBinding()Lcom/revolut/feature/backgroundpicker/impl/databinding/ScreenThemeCustomisationV2Binding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ThemeCustomisationController(ThemeCustomisationContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new AnalyticsProduct.Shared(k9.Profile, x0.RevolutUIKit, q6.RevolutUiKit, w2.Profile, od.RevolutUIKit);
        this.M = R$layout.screen_theme_customisation_v2;
        this.N = s.t(this, u.f);
        this.O = yhm.j.b(new um2.s(this, 5));
        this.P = yhm.j.b(new um2.s(this, 6));
        this.Q = yhm.j.b(new um2.s(this, 7));
        this.R = true;
        this.S = w.y0(new um2.s(this, 8));
        this.T = w.y0(new um2.s(this, 9));
        this.U = inputData.d;
        this.V = w.y0(new um2.s(this, 10));
        WallpaperPreviewDelegate wallpaperPreviewDelegate = new WallpaperPreviewDelegate();
        this.W = wallpaperPreviewDelegate;
        HomeScreenPreviewDelegate homeScreenPreviewDelegate = new HomeScreenPreviewDelegate(wallpaperPreviewDelegate);
        HomeScreenPreviewLoadingDelegate homeScreenPreviewLoadingDelegate = new HomeScreenPreviewLoadingDelegate();
        this.X = -1;
        this.Y = w.y0(new um2.s(this, 1));
        this.Z = w.y0(new um2.s(this, 2));
        this.f63784a0 = new j(7, v.k(homeScreenPreviewDelegate, homeScreenPreviewLoadingDelegate, new FullScreenStateDelegate()), false);
        this.f63785b0 = new j(7, zhm.u.c(new ChatPreviewDelegate()), false);
        this.c0 = new m0(26);
        this.f63786d0 = new m0(27);
    }

    public static void g3(ViewGroup viewGroup, boolean z, boolean z3, Function0 function0) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = viewGroup.animate();
        float fL = BitmapDescriptorFactory.HUE_RED;
        ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(BitmapDescriptorFactory.HUE_RED);
        if (z3) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fL = kli.a.l(context, 16.0f);
        }
        viewPropertyAnimatorAlpha.translationY(fL).setDuration(z ? 300L : 0L).setStartDelay(0L).setListener(new t4(viewGroup, function0, 3)).start();
    }

    public static void h3(ViewGroup viewGroup, boolean z) {
        viewGroup.animate().alpha(1.0f).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(z ? 300L : 0L).setStartDelay(z ? 300L : 0L).setListener(new k(viewGroup, 16)).start();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return (Integer) this.S.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        um2.q qVar2 = qVar instanceof um2.q ? (um2.q) qVar : null;
        boolean z = qVar2 == null;
        if (qVar2 != null && qVar2.d && !Intrinsics.f(uiState.e, this.U)) {
            Bundle bundle = new Bundle();
            g(bundle);
            c3(new d(new ThemeCustomisationContract$SavedState(bundle, false), uiState.e));
            return;
        }
        boolean z3 = !z;
        um2.o oVar2 = uiState.f281215a;
        g gVar = uiState.d;
        um2.j jVar = uiState.f281216b;
        n nVar = uiState.f281217c;
        d3().f.setTitle(oVar2.f281210a);
        d3().f.setMenuItems(oVar2.f281211b);
        BasicNavBar themeCustomisationNavBar = d3().f;
        Intrinsics.checkNotNullExpressionValue(themeCustomisationNavBar, "themeCustomisationNavBar");
        h3(themeCustomisationNavBar, z3);
        if (jVar instanceof i) {
            i iVar = (i) jVar;
            this.f63784a0.c(iVar.f281199a);
            d3().f207135g.c(z3);
            int i = this.X;
            int i2 = iVar.f281200b;
            if (i != i2) {
                this.X = i2;
                ((b) d()).A.f281204a = true;
                d3().f207136h.scrollToPosition(this.X);
            }
        } else {
            if (!(jVar instanceof um2.h)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f63785b0.c(((um2.h) jVar).f281196a);
            d3().f207135g.d(z3);
        }
        if (nVar instanceof l) {
            f3().setActions(((l) nVar).f281207a);
            d3().f207134c.c(z3);
            FooterTextView themeCustomisationDisclaimer = d3().e;
            Intrinsics.checkNotNullExpressionValue(themeCustomisationDisclaimer, "themeCustomisationDisclaimer");
            g3(themeCustomisationDisclaimer, z3, true, new um2.s(this, 0));
        } else if (nVar instanceof um2.m) {
            TwoViewsSwitcherView twoViewsSwitcherView = d3().f207134c;
            CircleActionButtonsBarView circleActionButtonsBarViewF3 = f3();
            Lazy lazy = this.O;
            twoViewsSwitcherView.setChildren(circleActionButtonsBarViewF3, (q4) lazy.getValue());
            d3().f207134c.d(z3);
            q4 q4Var = (q4) lazy.getValue();
            um2.m mVar = (um2.m) nVar;
            Clause clause = mVar.f281209b;
            u4 model = mVar.f281208a;
            RecyclerView recyclerView = q4Var.f209955j;
            j jVar2 = q4Var.k;
            Intrinsics.checkNotNullParameter(model, "model");
            if (model instanceof s4) {
                s4 s4Var = (s4) model;
                r4 r4Var = s4Var.f209992b;
                jVar2.c(s4Var.f209991a);
                AnimationRequest animationRequest = r4Var.f209976b;
                if (!animationRequest.f57724a) {
                    recyclerView.scrollToPosition(r4Var.f209975a);
                    animationRequest.f57724a = true;
                }
            } else {
                if (!Intrinsics.f(model, mx0.t4.f210012a)) {
                    throw new NoWhenBranchMatchedException();
                }
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                f it8 = intRange.iterator();
                while (it8.f289625c) {
                    int iNextInt = it8.nextInt();
                    IconSelectorDelegate.SelectableIconModel.INSTANCE.getClass();
                    arrayList.add(IconSelectorDelegate.SelectableIconModel.Companion.b("loading_icon_id_" + iNextInt));
                }
                jVar2.c(arrayList);
                recyclerView.scrollToPosition(1);
            }
            if (clause != null) {
                d3().e.setTextClause(clause);
                FooterTextView themeCustomisationDisclaimer2 = d3().e;
                Intrinsics.checkNotNullExpressionValue(themeCustomisationDisclaimer2, "themeCustomisationDisclaimer");
                h3(themeCustomisationDisclaimer2, z3);
            } else {
                FooterTextView footerTextView = d3().e;
                m70.a.c(t0.f186434a);
                footerTextView.setTextClause(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                FooterTextView themeCustomisationDisclaimer3 = d3().e;
                Intrinsics.checkNotNullExpressionValue(themeCustomisationDisclaimer3, "themeCustomisationDisclaimer");
                g3(themeCustomisationDisclaimer3, z3, true, new um2.s(this, 3));
            }
        } else {
            if (!(nVar instanceof um2.k)) {
                throw new NoWhenBranchMatchedException();
            }
            TwoViewsSwitcherView twoViewsSwitcherView2 = d3().f207134c;
            CircleActionButtonsBarView circleActionButtonsBarViewF32 = f3();
            Lazy lazy2 = this.Q;
            twoViewsSwitcherView2.setChildren(circleActionButtonsBarViewF32, (FooterTextView) lazy2.getValue());
            d3().f207134c.d(z3);
            ((FooterTextView) lazy2.getValue()).setTextClause(((um2.k) nVar).f281203a);
            FooterTextView themeCustomisationDisclaimer4 = d3().e;
            Intrinsics.checkNotNullExpressionValue(themeCustomisationDisclaimer4, "themeCustomisationDisclaimer");
            g3(themeCustomisationDisclaimer4, z3, true, new um2.s(this, 4));
        }
        if (gVar.f281195b) {
            d3().f207133b.setModel(gVar.f281194a);
            ActionFooterView themeCustomisationActionFooter = d3().f207133b;
            Intrinsics.checkNotNullExpressionValue(themeCustomisationActionFooter, "themeCustomisationActionFooter");
            h3(themeCustomisationActionFooter, z3);
        } else {
            ActionFooterView themeCustomisationActionFooter2 = d3().f207133b;
            Intrinsics.checkNotNullExpressionValue(themeCustomisationActionFooter2, "themeCustomisationActionFooter");
            g3(themeCustomisationActionFooter2, z3, true, new uj7.a(this, uiState, 7));
        }
        if (z) {
            b bVar = (b) d();
            k0 k0Var = bVar.A;
            Set<ThemeCustomisationContract$PostRecreationAction> set = k0Var.f281206c;
            if (set.isEmpty()) {
                return;
            }
            zhm.h0 h0Var = zhm.h0.f322473a;
            Intrinsics.checkNotNullParameter(h0Var, "<set-?>");
            k0Var.f281206c = h0Var;
            for (ThemeCustomisationContract$PostRecreationAction themeCustomisationContract$PostRecreationAction : set) {
                if (themeCustomisationContract$PostRecreationAction instanceof ThemeCustomisationContract$PostRecreationAction.BackToMenu) {
                    bVar.H2(bVar.B, new uj6.v(22));
                } else if (themeCustomisationContract$PostRecreationAction instanceof ThemeCustomisationContract$PostRecreationAction.ShowSuccess) {
                    bVar.L2();
                } else if (themeCustomisationContract$PostRecreationAction instanceof ThemeCustomisationContract$PostRecreationAction.ClearSandbox) {
                    bVar.I2();
                } else {
                    if (!(themeCustomisationContract$PostRecreationAction instanceof ThemeCustomisationContract$PostRecreationAction.OpenThemeGallery)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.J2();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final Set B2() {
        return (Set) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!super.F2()) {
            b bVar = (b) d();
            boolean z = ((um2.a) ((j2) bVar.B.f22677a).getValue()).f281179c != null;
            if (z) {
                bVar.K2();
            }
            if (!z) {
                return false;
            }
        }
        return true;
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
        return (pm2.d) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: V2, reason: from getter */
    public final boolean getR() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f207134c.setChildren(f3(), (q4) this.O.getValue());
        ThemeCustomisationContract$SavedState themeCustomisationContract$SavedState = this.K.e;
        if (themeCustomisationContract$SavedState != null && !themeCustomisationContract$SavedState.f63777b) {
            e(themeCustomisationContract$SavedState.f63776a);
            themeCustomisationContract$SavedState.f63777b = true;
        }
        d3().f.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TwoViewsSwitcherView twoViewsSwitcherView = d3().f207135g;
        m0 m0Var = this.f63786d0;
        twoViewsSwitcherView.setOutAnimatorFactory(m0Var);
        TwoViewsSwitcherView twoViewsSwitcherView2 = d3().f207135g;
        m0 m0Var2 = this.c0;
        twoViewsSwitcherView2.setInAnimatorFactory(m0Var2);
        RecyclerView recyclerView = d3().f207136h;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(new CenterScrollableLinearLayoutManager(context));
        recyclerView.setClipToPadding(false);
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", 16.0f);
        recyclerView.addItemDecoration(new a0(iA, iA, 0, 0));
        recyclerView.setAdapter(this.f63784a0);
        RecyclerView recyclerView2 = d3().d;
        Context context2 = recyclerView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView2.setLayoutManager(new CenterScrollableLinearLayoutManager(context2));
        recyclerView2.setAdapter(this.f63785b0);
        f3().setHapticFeedback(true);
        d3().f207134c.setOutAnimatorFactory(m0Var);
        d3().f207134c.setInAnimatorFactory(m0Var2);
        FooterTextView footerTextView = d3().e;
        m70.a.c(t0.f186434a);
        footerTextView.setTextClause(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f.f59211b), null, new um2.v(this, null), 3);
        Lazy lazy = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((q4) lazy.getValue()).f209952b), null, new uea.e(this, continuation, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((q4) lazy.getValue()).f209953g.d), null, new um2.w(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().a()), null, new x(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.f53633c), null, new y(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f.f59210a.f57403b), null, new z(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(d3().e.f58608l), rd0.e.b(((FooterTextView) this.Q.getValue()).f58608l)), null, new z(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(d3().f207133b.f), rd0.e.b(d3().f207133b.f58955g)), null, new z(this, continuation, 2), 3);
    }

    public final mm2.b d3() {
        ViewBinding value = this.N.getValue(this, f63783e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mm2.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final um2.b d() {
        return (um2.b) this.Y.getValue();
    }

    public final CircleActionButtonsBarView f3() {
        return (CircleActionButtonsBarView) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.e) this.Z.getValue();
    }
}
