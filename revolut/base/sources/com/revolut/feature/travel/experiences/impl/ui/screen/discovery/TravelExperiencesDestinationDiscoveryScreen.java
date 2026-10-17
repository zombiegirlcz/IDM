package com.revolut.feature.travel.experiences.impl.ui.screen.discovery;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.z0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import d2g.b;
import d2g.c;
import d2g.d;
import d2g.f;
import d2g.g;
import d2g.i;
import d2g.j;
import d2g.l;
import d2g.m;
import d2g.n;
import d2g.t;
import d2g.u;
import dli.a;
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
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/discovery/TravelExperiencesDestinationDiscoveryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld2g/t;", "Ldli/a;", "Ld2g/w;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesDestinationDiscoveryScreen extends ViewController<t> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelExperiencesDestinationDiscoveryScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenTravelExperiencesDestinationDiscoveryBinding;", 0))};
    public final int K;
    public final VoucherSmallTileDelegate L;
    public final CenteredContentTileDelegate M;
    public final ListSubheaderDelegate N;
    public final FullScreenStateDelegate O;
    public final ScrollerDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public TravelExperiencesDestinationDiscoveryScreen(TravelExperiencesDestinationDiscoveryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_experiences_destination_discovery;
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.L = voucherSmallTileDelegate;
        CenteredContentTileDelegate centeredContentTileDelegate = new CenteredContentTileDelegate();
        this.M = centeredContentTileDelegate;
        this.N = new ListSubheaderDelegate();
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        final int i2 = 1;
        this.P = new ScrollerDelegate(v.k(voucherSmallTileDelegate, centeredContentTileDelegate, new CenteredContentTileLoadingDelegate(), new VoucherSmallLoadingDelegate()), false);
        this.Q = w.y0(new Function0(this) { // from class: d2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesDestinationDiscoveryScreen f110804b;

            {
                this.f110804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesDestinationDiscoveryScreen.U;
                        TravelExperiencesDestinationDiscoveryScreen travelExperiencesDestinationDiscoveryScreen = this.f110804b;
                        return dli.f.a(travelExperiencesDestinationDiscoveryScreen, travelExperiencesDestinationDiscoveryScreen.d(), zhm.v.k(travelExperiencesDestinationDiscoveryScreen.N, travelExperiencesDestinationDiscoveryScreen.P, travelExperiencesDestinationDiscoveryScreen.O, new ListSubheaderLoadingDelegate()), R$id.travelExperiencesDestinationDiscovery_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesDestinationDiscoveryScreen.U;
                        return (v) ((z0g.h) this.f110804b.S.getValue()).f.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        this.S = w.y0(new cvi.b(this, inputData, 11));
        this.T = w.y0(new Function0(this) { // from class: d2g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesDestinationDiscoveryScreen f110804b;

            {
                this.f110804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesDestinationDiscoveryScreen.U;
                        TravelExperiencesDestinationDiscoveryScreen travelExperiencesDestinationDiscoveryScreen = this.f110804b;
                        return dli.f.a(travelExperiencesDestinationDiscoveryScreen, travelExperiencesDestinationDiscoveryScreen.d(), zhm.v.k(travelExperiencesDestinationDiscoveryScreen.N, travelExperiencesDestinationDiscoveryScreen.P, travelExperiencesDestinationDiscoveryScreen.O, new ListSubheaderLoadingDelegate()), R$id.travelExperiencesDestinationDiscovery_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesDestinationDiscoveryScreen.U;
                        return (v) ((z0g.h) this.f110804b.S.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d2g.w uiState = (d2g.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        j jVar = uiState.f110826c;
        u uVar = qVar instanceof u ? (u) qVar : null;
        if (uVar == null || uVar.f110822a) {
            d2g.o oVar2 = uiState.f110825b;
            if (oVar2 instanceof l) {
                NavBarWithBigTile navBarWithBigTile = d3().f293739c;
                navBarWithBigTile.setLoadingState(false);
                l lVar = (l) oVar2;
                TextClause textClause = lVar.f110811b;
                navBarWithBigTile.setTitle(new z0(textClause, false));
                navBarWithBigTile.setToolbarTitle(textClause);
                navBarWithBigTile.setActionStatusLabel(lVar.d);
                navBarWithBigTile.setDescription(lVar.f110812c);
                c1.S(navBarWithBigTile, lVar.f110810a, null, null, 6);
                navBarWithBigTile.setMenuItems(lVar.e);
            } else if (oVar2 instanceof m) {
                d3().f293739c.setLoadingState(false);
            } else {
                if (!(oVar2 instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                d3().f293739c.setLoadingState(true);
            }
        }
        if (uVar == null || uVar.f110823b) {
            if (jVar instanceof i) {
                LargeActionButton largeActionButton = d3().f293738b;
                largeActionButton.setVisibility(0);
                largeActionButton.setText(((i) jVar).f110806a);
            } else {
                if (!(jVar instanceof d2g.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                LargeActionButton travelExperiencesDestinationDiscoveryButton = d3().f293738b;
                Intrinsics.checkNotNullExpressionValue(travelExperiencesDestinationDiscoveryButton, "travelExperiencesDestinationDiscoveryButton");
                travelExperiencesDestinationDiscoveryButton.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z0g.h) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f293739c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f293739c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.b()), null, new cvi.j(this, (Continuation) null, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293738b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52707c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.e), null, new d2g.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53608c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new g(this, null), 3);
    }

    public final w0g.s d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d2g.v d() {
        return (d2g.v) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
