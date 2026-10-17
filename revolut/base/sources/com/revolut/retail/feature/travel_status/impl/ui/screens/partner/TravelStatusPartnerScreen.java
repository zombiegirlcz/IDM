package com.revolut.retail.feature.travel_status.impl.ui.screens.partner;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.r0;
import au0.u0;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.travel_status.impl.R$layout;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreenContract$InputData;
import dli.c;
import hwi.l0;
import i2l.k;
import i2l.l;
import i2l.m;
import i2l.n;
import i2l.r;
import i2l.t;
import i2l.u;
import i2l.x;
import i2l.y;
import i2l.z;
import i7d.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import y1l.g;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/screens/partner/TravelStatusPartnerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li2l/x;", "Ldli/a;", "Li2l/z;", "Li7d/i;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelStatusPartnerScreen extends ViewController<x> implements dli.a, i {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(TravelStatusPartnerScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/travel_status/impl/databinding/ScreenTravelStatusPartnerBinding;", 0))};
    public final TravelStatusPartnerScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final ListSubheaderDelegate N;
    public final ListCellBulletDelegate O;
    public final LargeActionButtonDelegate P;
    public final FullScreenStateDelegate Q;
    public final VaultsProgressDelegate R;
    public final FooterTextDelegate S;
    public final h T;
    public final Object U;
    public final Object V;
    public final Object W;

    public TravelStatusPartnerScreen(TravelStatusPartnerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_travel_status_partner;
        this.M = new RowDelegate(null, null, 7);
        this.N = new ListSubheaderDelegate();
        this.O = new ListCellBulletDelegate();
        this.P = new LargeActionButtonDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = new VaultsProgressDelegate();
        this.S = new FooterTextDelegate();
        this.T = s.t(this, k.f);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: i2l.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusPartnerScreen f158020b;

            {
                this.f158020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelStatusPartnerScreen travelStatusPartnerScreen = this.f158020b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusPartnerScreen.X;
                        qji.b bVarU2 = travelStatusPartnerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.partner.di.TravelStatusPartnerScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusPartnerScreenContract$InputData travelStatusPartnerScreenContract$InputData = travelStatusPartnerScreen.K;
                        travelStatusPartnerScreenContract$InputData.getClass();
                        return new y1l.g(bVar, dVar2, travelStatusPartnerScreenContract$InputData, travelStatusPartnerScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusPartnerScreen.X;
                        return (y) ((y1l.g) travelStatusPartnerScreen.U.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusPartnerScreen.X;
                        TravelStatusPartnerScreen travelStatusPartnerScreen2 = this.f158020b;
                        return dli.f.a(travelStatusPartnerScreen2, travelStatusPartnerScreen2.R2(), zhm.v.k(new ListSubheaderLoadingDelegate(), travelStatusPartnerScreen2.N, new RowLoadingDelegate(), travelStatusPartnerScreen2.R, travelStatusPartnerScreen2.O, travelStatusPartnerScreen2.M, travelStatusPartnerScreen2.P, travelStatusPartnerScreen2.Q, travelStatusPartnerScreen2.S), travelStatusPartnerScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: i2l.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusPartnerScreen f158020b;

            {
                this.f158020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelStatusPartnerScreen travelStatusPartnerScreen = this.f158020b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusPartnerScreen.X;
                        qji.b bVarU2 = travelStatusPartnerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.partner.di.TravelStatusPartnerScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusPartnerScreenContract$InputData travelStatusPartnerScreenContract$InputData = travelStatusPartnerScreen.K;
                        travelStatusPartnerScreenContract$InputData.getClass();
                        return new y1l.g(bVar, dVar2, travelStatusPartnerScreenContract$InputData, travelStatusPartnerScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusPartnerScreen.X;
                        return (y) ((y1l.g) travelStatusPartnerScreen.U.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusPartnerScreen.X;
                        TravelStatusPartnerScreen travelStatusPartnerScreen2 = this.f158020b;
                        return dli.f.a(travelStatusPartnerScreen2, travelStatusPartnerScreen2.R2(), zhm.v.k(new ListSubheaderLoadingDelegate(), travelStatusPartnerScreen2.N, new RowLoadingDelegate(), travelStatusPartnerScreen2.R, travelStatusPartnerScreen2.O, travelStatusPartnerScreen2.M, travelStatusPartnerScreen2.P, travelStatusPartnerScreen2.Q, travelStatusPartnerScreen2.S), travelStatusPartnerScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: i2l.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusPartnerScreen f158020b;

            {
                this.f158020b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelStatusPartnerScreen travelStatusPartnerScreen = this.f158020b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusPartnerScreen.X;
                        qji.b bVarU2 = travelStatusPartnerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.partner.di.TravelStatusPartnerScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusPartnerScreenContract$InputData travelStatusPartnerScreenContract$InputData = travelStatusPartnerScreen.K;
                        travelStatusPartnerScreenContract$InputData.getClass();
                        return new y1l.g(bVar, dVar2, travelStatusPartnerScreenContract$InputData, travelStatusPartnerScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusPartnerScreen.X;
                        return (y) ((y1l.g) travelStatusPartnerScreen.U.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusPartnerScreen.X;
                        TravelStatusPartnerScreen travelStatusPartnerScreen2 = this.f158020b;
                        return dli.f.a(travelStatusPartnerScreen2, travelStatusPartnerScreen2.R2(), zhm.v.k(new ListSubheaderLoadingDelegate(), travelStatusPartnerScreen2.N, new RowLoadingDelegate(), travelStatusPartnerScreen2.R, travelStatusPartnerScreen2.O, travelStatusPartnerScreen2.M, travelStatusPartnerScreen2.P, travelStatusPartnerScreen2.Q, travelStatusPartnerScreen2.S), travelStatusPartnerScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        z uiState = (z) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f285323c;
        u uVar = uiState.f158054b;
        if (Intrinsics.f(uVar, t.f158046a)) {
            navBarWithBigTile.setVisibility(0);
            navBarWithBigTile.setLoadingState(true);
        } else if (Intrinsics.f(uVar, r.f158041a)) {
            navBarWithBigTile.setVisibility(8);
            navBarWithBigTile.setLoadingState(false);
            navBarWithBigTile.setDescription((Clause) null);
            navBarWithBigTile.setActionStatusLabel(null);
            navBarWithBigTile.setTagViewData(null);
            navBarWithBigTile.setAvatar(null, r0.DEFAULT);
            c1.S(navBarWithBigTile, f0.f322471a, null, null, 6);
        } else {
            if (!(uVar instanceof i2l.s)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setVisibility(0);
            navBarWithBigTile.setLoadingState(false);
            i2l.s sVar = (i2l.s) uVar;
            navBarWithBigTile.setActionStatusLabel(sVar.d);
            navBarWithBigTile.setAvatar(new AvatarModel.Default(sVar.f158045c, null, null, null, null, null, 126), r0.DEFAULT);
            navBarWithBigTile.setIconClickable(false);
            navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
            c1.S(navBarWithBigTile, zhm.u.c(new u0(new NavBarWithContainerBackground.ImageBackground(sVar.f158044b, (s8) null, (Color.SolidRes) null, 14), sVar.f158043a, null, null)), null, null, 6);
        }
        ActionFooterView actionFooterView = d3().f285322b;
        aw0.i iVar = uiState.f158055c;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f285323c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.BOTTOM_BLUR);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((c) this.W.getValue()).w();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f285323c.f59357t), null, new l0(this, continuation, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d.f121375b), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f285322b.f), null, new n(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.e.f121375b), null, new n(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new i2l.o(this, null), 3);
    }

    public final v1l.a d3() {
        ViewBinding value = this.T.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v1l.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final y R2() {
        return (y) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }
}
