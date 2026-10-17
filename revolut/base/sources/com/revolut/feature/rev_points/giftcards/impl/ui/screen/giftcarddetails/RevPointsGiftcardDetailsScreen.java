package com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GiftCardDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.rev_points.giftcards.impl.R$id;
import com.revolut.feature.rev_points.giftcards.impl.R$layout;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import grl.k9;
import iwb.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import twb.b;
import twb.c;
import twb.f;
import twb.g;
import twb.i;
import twb.j;
import twb.n;
import twb.p;
import twb.r;
import tx0.t3;
import uvb.h;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luvb/h;", "Ldli/a;", "Ltwb/r;", "Lno/m;", "Lno/k;", "Companion", "a", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsGiftcardDetailsScreen extends ViewController<h> implements dli.a, m, k {
    public final RevPointsGiftcardDetailsScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct.Retail M;
    public AnalyticsContext N;
    public final FullScreenStateDelegate O;
    public final RowLoadingDelegate P;
    public final SimpleMediaDelegate Q;
    public final GiftCardDelegate R;
    public final AttributeSelectorSmallDelegate S;
    public final ListSubheaderDelegate T;
    public final PlainTextDelegate U;
    public final TextDelegate V;
    public final CounterTextDelegate W;
    public final CellDetailsActionDelegate X;
    public final NotificationCentreItemDelegate Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f83704a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f83705b0;
    public final ao.h c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f83706d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f83707e0;
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(RevPointsGiftcardDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/giftcards/impl/databinding/ScreenRevPointsGiftcardDetailsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public RevPointsGiftcardDetailsScreen(RevPointsGiftcardDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_rev_points_giftcard_details;
        k9 k9Var = k9.GiftCards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.O = new FullScreenStateDelegate();
        this.P = new RowLoadingDelegate();
        this.Q = new SimpleMediaDelegate();
        this.R = new GiftCardDelegate();
        this.S = new AttributeSelectorSmallDelegate();
        this.T = new ListSubheaderDelegate();
        this.U = new PlainTextDelegate();
        this.V = new TextDelegate();
        this.W = new CounterTextDelegate();
        this.X = new CellDetailsActionDelegate();
        this.Y = new NotificationCentreItemDelegate();
        this.Z = new RowDelegate(null, null, 7);
        final int i = 0;
        this.f83704a0 = w.y0(new Function0(this) { // from class: twb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardDetailsScreen f274968b;

            {
                this.f274968b = this;
            }

            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen = this.f274968b;
                switch (i2) {
                    case 0:
                        return new GridBoxDelegate(zhm.u.c(revPointsGiftcardDetailsScreen.S), 0, 8.0f, 8.0f, 2);
                    case 1:
                        RevPointsGiftcardDetailsScreen.Companion companion = RevPointsGiftcardDetailsScreen.INSTANCE;
                        RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen2 = this.f274968b;
                        return dli.f.a(revPointsGiftcardDetailsScreen2, revPointsGiftcardDetailsScreen2.d(), zhm.v.k(revPointsGiftcardDetailsScreen2.O, revPointsGiftcardDetailsScreen2.P, revPointsGiftcardDetailsScreen2.Q, revPointsGiftcardDetailsScreen2.R, (GridBoxDelegate) revPointsGiftcardDetailsScreen2.f83704a0.getValue(), revPointsGiftcardDetailsScreen2.W, revPointsGiftcardDetailsScreen2.X, revPointsGiftcardDetailsScreen2.Y, revPointsGiftcardDetailsScreen2.T, revPointsGiftcardDetailsScreen2.U, revPointsGiftcardDetailsScreen2.Z, revPointsGiftcardDetailsScreen2.V), R$id.revPointsGiftcardDetailsScreen_recyclerView, null, null, null, 56);
                    case 2:
                        RevPointsGiftcardDetailsScreen.Companion companion2 = RevPointsGiftcardDetailsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardDetailsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardDetailsScreenContract$InputData revPointsGiftcardDetailsScreenContract$InputData = revPointsGiftcardDetailsScreen.K;
                        revPointsGiftcardDetailsScreenContract$InputData.getClass();
                        return new iwb.d(eVar, revPointsGiftcardDetailsScreenContract$InputData);
                    default:
                        RevPointsGiftcardDetailsScreen.Companion companion3 = RevPointsGiftcardDetailsScreen.INSTANCE;
                        return (m) ((iwb.d) revPointsGiftcardDetailsScreen.f83706d0.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.f83705b0 = w.y0(new Function0(this) { // from class: twb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardDetailsScreen f274968b;

            {
                this.f274968b = this;
            }

            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen = this.f274968b;
                switch (i22) {
                    case 0:
                        return new GridBoxDelegate(zhm.u.c(revPointsGiftcardDetailsScreen.S), 0, 8.0f, 8.0f, 2);
                    case 1:
                        RevPointsGiftcardDetailsScreen.Companion companion = RevPointsGiftcardDetailsScreen.INSTANCE;
                        RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen2 = this.f274968b;
                        return dli.f.a(revPointsGiftcardDetailsScreen2, revPointsGiftcardDetailsScreen2.d(), zhm.v.k(revPointsGiftcardDetailsScreen2.O, revPointsGiftcardDetailsScreen2.P, revPointsGiftcardDetailsScreen2.Q, revPointsGiftcardDetailsScreen2.R, (GridBoxDelegate) revPointsGiftcardDetailsScreen2.f83704a0.getValue(), revPointsGiftcardDetailsScreen2.W, revPointsGiftcardDetailsScreen2.X, revPointsGiftcardDetailsScreen2.Y, revPointsGiftcardDetailsScreen2.T, revPointsGiftcardDetailsScreen2.U, revPointsGiftcardDetailsScreen2.Z, revPointsGiftcardDetailsScreen2.V), R$id.revPointsGiftcardDetailsScreen_recyclerView, null, null, null, 56);
                    case 2:
                        RevPointsGiftcardDetailsScreen.Companion companion2 = RevPointsGiftcardDetailsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardDetailsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardDetailsScreenContract$InputData revPointsGiftcardDetailsScreenContract$InputData = revPointsGiftcardDetailsScreen.K;
                        revPointsGiftcardDetailsScreenContract$InputData.getClass();
                        return new iwb.d(eVar, revPointsGiftcardDetailsScreenContract$InputData);
                    default:
                        RevPointsGiftcardDetailsScreen.Companion companion3 = RevPointsGiftcardDetailsScreen.INSTANCE;
                        return (m) ((iwb.d) revPointsGiftcardDetailsScreen.f83706d0.getValue()).e.get();
                }
            }
        });
        this.c0 = s.t(this, b.f);
        final int i3 = 2;
        this.f83706d0 = w.y0(new Function0(this) { // from class: twb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardDetailsScreen f274968b;

            {
                this.f274968b = this;
            }

            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen = this.f274968b;
                switch (i22) {
                    case 0:
                        return new GridBoxDelegate(zhm.u.c(revPointsGiftcardDetailsScreen.S), 0, 8.0f, 8.0f, 2);
                    case 1:
                        RevPointsGiftcardDetailsScreen.Companion companion = RevPointsGiftcardDetailsScreen.INSTANCE;
                        RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen2 = this.f274968b;
                        return dli.f.a(revPointsGiftcardDetailsScreen2, revPointsGiftcardDetailsScreen2.d(), zhm.v.k(revPointsGiftcardDetailsScreen2.O, revPointsGiftcardDetailsScreen2.P, revPointsGiftcardDetailsScreen2.Q, revPointsGiftcardDetailsScreen2.R, (GridBoxDelegate) revPointsGiftcardDetailsScreen2.f83704a0.getValue(), revPointsGiftcardDetailsScreen2.W, revPointsGiftcardDetailsScreen2.X, revPointsGiftcardDetailsScreen2.Y, revPointsGiftcardDetailsScreen2.T, revPointsGiftcardDetailsScreen2.U, revPointsGiftcardDetailsScreen2.Z, revPointsGiftcardDetailsScreen2.V), R$id.revPointsGiftcardDetailsScreen_recyclerView, null, null, null, 56);
                    case 2:
                        RevPointsGiftcardDetailsScreen.Companion companion2 = RevPointsGiftcardDetailsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardDetailsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardDetailsScreenContract$InputData revPointsGiftcardDetailsScreenContract$InputData = revPointsGiftcardDetailsScreen.K;
                        revPointsGiftcardDetailsScreenContract$InputData.getClass();
                        return new iwb.d(eVar, revPointsGiftcardDetailsScreenContract$InputData);
                    default:
                        RevPointsGiftcardDetailsScreen.Companion companion3 = RevPointsGiftcardDetailsScreen.INSTANCE;
                        return (m) ((iwb.d) revPointsGiftcardDetailsScreen.f83706d0.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.f83707e0 = w.y0(new Function0(this) { // from class: twb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsGiftcardDetailsScreen f274968b;

            {
                this.f274968b = this;
            }

            /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen = this.f274968b;
                switch (i22) {
                    case 0:
                        return new GridBoxDelegate(zhm.u.c(revPointsGiftcardDetailsScreen.S), 0, 8.0f, 8.0f, 2);
                    case 1:
                        RevPointsGiftcardDetailsScreen.Companion companion = RevPointsGiftcardDetailsScreen.INSTANCE;
                        RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen2 = this.f274968b;
                        return dli.f.a(revPointsGiftcardDetailsScreen2, revPointsGiftcardDetailsScreen2.d(), zhm.v.k(revPointsGiftcardDetailsScreen2.O, revPointsGiftcardDetailsScreen2.P, revPointsGiftcardDetailsScreen2.Q, revPointsGiftcardDetailsScreen2.R, (GridBoxDelegate) revPointsGiftcardDetailsScreen2.f83704a0.getValue(), revPointsGiftcardDetailsScreen2.W, revPointsGiftcardDetailsScreen2.X, revPointsGiftcardDetailsScreen2.Y, revPointsGiftcardDetailsScreen2.T, revPointsGiftcardDetailsScreen2.U, revPointsGiftcardDetailsScreen2.Z, revPointsGiftcardDetailsScreen2.V), R$id.revPointsGiftcardDetailsScreen_recyclerView, null, null, null, 56);
                    case 2:
                        RevPointsGiftcardDetailsScreen.Companion companion2 = RevPointsGiftcardDetailsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsGiftcardDetailsScreen.m2()).a().get(iwb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", iwb.e.class, " is not found"));
                        }
                        iwb.e eVar = ((iwb.e) aVar2.b()).f169026r;
                        RevPointsGiftcardDetailsScreenContract$InputData revPointsGiftcardDetailsScreenContract$InputData = revPointsGiftcardDetailsScreen.K;
                        revPointsGiftcardDetailsScreenContract$InputData.getClass();
                        return new iwb.d(eVar, revPointsGiftcardDetailsScreenContract$InputData);
                    default:
                        RevPointsGiftcardDetailsScreen.Companion companion3 = RevPointsGiftcardDetailsScreen.INSTANCE;
                        return (m) ((iwb.d) revPointsGiftcardDetailsScreen.f83706d0.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        AnalyticsContext analyticsContext = uiState.e;
        twb.q qVar2 = uiState.f274995a;
        if (analyticsContext != null) {
            this.N = new AnalyticsContext(analyticsContext.f50296a);
        }
        NavBarWithToolbar navBarWithToolbar = d3().f138594c;
        if (qVar2 instanceof p) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        }
        if (qVar2 instanceof twb.o) {
            navBarWithToolbar.l0();
        }
        if (qVar2 instanceof n) {
            navBarWithToolbar.l0();
            n nVar = (n) qVar2;
            TextClause textClause = nVar.f274991a;
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setMenuItems(nVar.f274992b);
        }
        LargeActionButton largeActionButton = d3().f138593b;
        largeActionButton.setVisibility(uiState.f274997c ? 0 : 8);
        largeActionButton.setEnabled(uiState.f274996b);
        largeActionButton.setText(uiState.d);
        largeActionButton.setAnalyticsContext(uiState.f);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.f83706d0.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f138594c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f138593b.setText(new TextLocalisedClause(R$string.common_action_confirm, null, null, 14));
        LargeActionButton revPointsGiftcardDetailsScreenButton = d3().f138593b;
        Intrinsics.checkNotNullExpressionValue(revPointsGiftcardDetailsScreenButton, "revPointsGiftcardDetailsScreenButton");
        revPointsGiftcardDetailsScreenButton.setVisibility(8);
        int i = com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_details;
        m70.a.c(t0.f186434a);
        pd.b.p(view, new TextLocalisedClause(i, u.c(""), null, 12));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f138594c.f59410q), null, new twb.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f138594c.o.f57403b), null, new twb.e(this, continuation, 0), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f138593b.o), null, new twb.d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.p()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.d), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f.f121375b), null, new twb.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d), null, new twb.e(this, continuation, i), 3);
        RowDelegate rowDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53225r), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new c(this, null), 3);
    }

    public final fwb.b d3() {
        ViewBinding value = this.c0.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (fwb.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final twb.m d() {
        return (twb.m) this.f83707e0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f83705b0.getValue();
    }
}
