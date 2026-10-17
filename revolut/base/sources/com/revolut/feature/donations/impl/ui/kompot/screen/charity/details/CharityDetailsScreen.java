package com.revolut.feature.donations.impl.ui.kompot.screen.charity.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewProductDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.impl.R$id;
import com.revolut.feature.donations.impl.R$layout;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.CharityDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t05.m;
import t73.z2;
import tb6.d;
import tb6.f;
import tb6.g;
import tb6.i;
import tb6.j;
import tb6.k;
import tb6.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/charity/details/CharityDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/charity/details/a;", "Ldli/a;", "Ltb6/s;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CharityDetailsScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CharityDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/donations/impl/databinding/ScreenCharityDetailsBinding;", 0))};
    public final Object K;
    public final Object L;
    public final int M;
    public final h N;
    public final PlainTextDelegate O;
    public final ActionsDelegate P;
    public final RowDelegate Q;
    public final CellDetailsActionDelegate R;
    public final ListSubheaderDelegate S;
    public final SwipeToActionDelegate T;
    public final NewProductDelegate U;
    public final LargeActionButtonDelegate V;
    public final TextDelegate W;
    public final ActionWidgetDelegate X;
    public final VoucherSmallTileDelegate Y;
    public final ScrollerDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f72061a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f72062b0;

    public CharityDetailsScreen(CharityDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new sw6.a(this, inputData, 12));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tb6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharityDetailsScreen f269473b;

            {
                this.f269473b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CharityDetailsScreen.c0;
                        return (r) ((pa6.d) this.f269473b.K.getValue()).f234360l.get();
                    default:
                        KProperty[] kPropertyArr2 = CharityDetailsScreen.c0;
                        int i2 = R$id.charityDetails_recyclerView;
                        CharityDetailsScreen charityDetailsScreen = this.f269473b;
                        return dli.f.a(charityDetailsScreen, charityDetailsScreen.d(), zhm.v.k(charityDetailsScreen.P, charityDetailsScreen.O, new TextDelegate(), charityDetailsScreen.S, new CellDetailsSwitcherDelegate(), new CellDetailsDelegate(), charityDetailsScreen.Q, charityDetailsScreen.R, charityDetailsScreen.T, charityDetailsScreen.U, charityDetailsScreen.V, charityDetailsScreen.W, charityDetailsScreen.X, new PlainTextWarningDelegate(), charityDetailsScreen.Z, charityDetailsScreen.f72061a0, new PlainTextLoadingDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), i2, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.M = R$layout.screen_charity_details;
        this.N = s.t(this, d.f);
        this.O = new PlainTextDelegate();
        this.P = new ActionsDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new CellDetailsActionDelegate();
        this.S = new ListSubheaderDelegate();
        this.T = new SwipeToActionDelegate(rowDelegate, false);
        this.U = new NewProductDelegate();
        this.V = new LargeActionButtonDelegate();
        this.W = new TextDelegate();
        this.X = new ActionWidgetDelegate();
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.Y = voucherSmallTileDelegate;
        this.Z = new ScrollerDelegate(u.c(voucherSmallTileDelegate), false);
        this.f72061a0 = new FullScreenStateDelegate();
        final int i2 = 1;
        this.f72062b0 = w.y0(new Function0(this) { // from class: tb6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharityDetailsScreen f269473b;

            {
                this.f269473b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CharityDetailsScreen.c0;
                        return (r) ((pa6.d) this.f269473b.K.getValue()).f234360l.get();
                    default:
                        KProperty[] kPropertyArr2 = CharityDetailsScreen.c0;
                        int i22 = R$id.charityDetails_recyclerView;
                        CharityDetailsScreen charityDetailsScreen = this.f269473b;
                        return dli.f.a(charityDetailsScreen, charityDetailsScreen.d(), zhm.v.k(charityDetailsScreen.P, charityDetailsScreen.O, new TextDelegate(), charityDetailsScreen.S, new CellDetailsSwitcherDelegate(), new CellDetailsDelegate(), charityDetailsScreen.Q, charityDetailsScreen.R, charityDetailsScreen.T, charityDetailsScreen.U, charityDetailsScreen.V, charityDetailsScreen.W, charityDetailsScreen.X, new PlainTextWarningDelegate(), charityDetailsScreen.Z, charityDetailsScreen.f72061a0, new PlainTextLoadingDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), i22, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        tb6.s uiState = (tb6.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Clause clause = uiState.f269495c;
        List<ActionsView.Item> list = uiState.f269494b;
        if (clause != null) {
            NavBarVaults navBarVaults = d3().f203954b;
            navBarVaults.setHeaderStatusText(clause);
            navBarVaults.setToolbarTitle(clause);
        }
        d3().f203954b.setHeaderTitleText(uiState.d);
        Image image = uiState.e;
        if (image != null) {
            d3().f203954b.setAvatarImage(image);
        }
        Image image2 = uiState.f;
        if (image2 != null) {
            d3().f203954b.setBackgroundImage(image2);
            d3().f203954b.setBackgroundGradientOverlayVisibility(true);
        }
        if (list.isEmpty()) {
            NavBarVaults navBarVaults2 = d3().f203954b;
            navBarVaults2.setActionsVisibility(false);
            navBarVaults2.setActions(f0.f322471a);
        } else {
            NavBarVaults navBarVaults3 = d3().f203954b;
            navBarVaults3.setActionsVisibility(true);
            navBarVaults3.setActions(list);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pa6.d) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f203954b.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_left, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        ((j60.a) ((pa6.d) this.K.getValue()).e.get()).d(v.k(this.V, this.W));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f203954b.f59328m), null, new m(this, continuation, 17), 3);
        r map = d3().f203954b.u.h0().filter(new z2(new t9b.a(16), 22)).map(new z2(new t9b.a(17), 23));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new g(this, continuation, 1), 3);
        r map2 = this.O.f.f121375b.filter(new z2(new t9b.a(18), 24)).map(new z2(new t9b.a(19), 21));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map2), null, new g(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53225r), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f52780c), null, new tb6.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52707c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f51589c.f121375b), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.f53608c), null, new tb6.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f72061a0.f52371h.f121375b), null, new j(this, null), 3);
    }

    public final ma6.b d3() {
        ViewBinding value = this.N.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ma6.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final tb6.r d() {
        return (tb6.r) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f72062b0.getValue();
    }
}
