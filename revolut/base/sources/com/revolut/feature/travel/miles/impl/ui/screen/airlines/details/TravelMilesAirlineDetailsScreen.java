package com.revolut.feature.travel.miles.impl.ui.screen.airlines.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.r0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsHeadlineDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsHeadlineLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
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
import ufg.c;
import vc.s;
import vgg.d;
import vgg.f;
import vgg.g;
import vgg.i;
import vgg.k;
import vgg.l;
import vgg.m;
import vgg.n;
import vgg.r;
import vgg.t;
import vgg.u;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/airlines/details/TravelMilesAirlineDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvgg/r;", "Ldli/a;", "Lvgg/u;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesAirlineDetailsScreen extends ViewController<r> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TravelMilesAirlineDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/ScreenTravelMilesAirlineDetailsBinding;", 0))};
    public final int K;
    public final ActionCardDelegate L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final LargeActionButtonDelegate O;
    public final TextDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public TravelMilesAirlineDetailsScreen(TravelMilesAirlineDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_miles_airline_details;
        this.L = new ActionCardDelegate();
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        this.O = new LargeActionButtonDelegate();
        this.P = new TextDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: vgg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlineDetailsScreen f289154b;

            {
                this.f289154b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlineDetailsScreen.U;
                        TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen = this.f289154b;
                        return dli.f.a(travelMilesAirlineDetailsScreen, travelMilesAirlineDetailsScreen.d(), zhm.v.k(new ListSubheaderDelegate(), travelMilesAirlineDetailsScreen.N, travelMilesAirlineDetailsScreen.O, new RowLoadingDelegate(), new PlainTextLoadingDelegate(), travelMilesAirlineDetailsScreen.P, travelMilesAirlineDetailsScreen.M, new GridBoxDelegate(zhm.v.k(travelMilesAirlineDetailsScreen.L, new ActionCardLoadingDelegate()), 0, 8.0f, 8.0f, 2), new CellDetailsHeadlineDelegate(), new CellDetailsHeadlineLoadingDelegate()), R$id.travelMilesAirlineDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesAirlineDetailsScreen.U;
                        return (t) ((ufg.c) this.f289154b.S.getValue()).d.get();
                }
            }
        });
        this.R = s.t(this, vgg.b.f);
        this.S = w.y0(new vd1.a(this, inputData, 8));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: vgg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesAirlineDetailsScreen f289154b;

            {
                this.f289154b = this;
            }

            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesAirlineDetailsScreen.U;
                        TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen = this.f289154b;
                        return dli.f.a(travelMilesAirlineDetailsScreen, travelMilesAirlineDetailsScreen.d(), zhm.v.k(new ListSubheaderDelegate(), travelMilesAirlineDetailsScreen.N, travelMilesAirlineDetailsScreen.O, new RowLoadingDelegate(), new PlainTextLoadingDelegate(), travelMilesAirlineDetailsScreen.P, travelMilesAirlineDetailsScreen.M, new GridBoxDelegate(zhm.v.k(travelMilesAirlineDetailsScreen.L, new ActionCardLoadingDelegate()), 0, 8.0f, 8.0f, 2), new CellDetailsHeadlineDelegate(), new CellDetailsHeadlineLoadingDelegate()), R$id.travelMilesAirlineDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelMilesAirlineDetailsScreen.U;
                        return (t) ((ufg.c) this.f289154b.S.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        vgg.s sVar = qVar instanceof vgg.s ? (vgg.s) qVar : null;
        if (sVar == null || sVar.f289174a) {
            n nVar = uiState.f289176b;
            if (nVar instanceof k) {
                NavBarWithBigTile navBarWithBigTile = d3().f253791c;
                navBarWithBigTile.setLoadingState(false);
                k kVar = (k) nVar;
                TextClause textClause = kVar.f289166c;
                navBarWithBigTile.setIcon(kVar.f289165b, r0.DEFAULT);
                navBarWithBigTile.setTitle(textClause);
                navBarWithBigTile.setToolbarTitle(textClause);
                navBarWithBigTile.setDescription((Clause) kVar.d);
                c1.S(navBarWithBigTile, kVar.f289164a, null, null, 6);
                navBarWithBigTile.setMenuItems(kVar.e);
                navBarWithBigTile.setActions(kVar.f);
            } else if (nVar instanceof l) {
                d3().f253791c.setLoadingState(false);
            } else {
                if (!(nVar instanceof m)) {
                    throw new NoWhenBranchMatchedException();
                }
                d3().f253791c.setLoadingState(true);
            }
        }
        d3().f253790b.setText(uiState.d);
        LargeActionButton travelMilesAirlineDetailsButton = d3().f253790b;
        Intrinsics.checkNotNullExpressionValue(travelMilesAirlineDetailsButton, "travelMilesAirlineDetailsButton");
        travelMilesAirlineDetailsButton.setVisibility(uiState.f289177c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f253791c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        LargeActionButton largeActionButton = d3().f253790b;
        largeActionButton.setText(new TextLocalisedClause(R$string.miles_airline_details_footer_action, null, null, 14));
        largeActionButton.setLoadingButtonTag("TRANSFER_POINTS_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f253791c;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new vgg.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.K()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.b()), null, new vgg.e(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f253790b.o), null, new vgg.c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f51572n), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new vgg.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.d), null, new vgg.e(this, continuation, i), 3);
    }

    public final rfg.f d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rfg.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
