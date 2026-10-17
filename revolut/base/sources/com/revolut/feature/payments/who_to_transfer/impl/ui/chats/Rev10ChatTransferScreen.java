package com.revolut.feature.payments.who_to_transfer.impl.ui.chats;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.viewbinding.ViewBinding;
import c42.j;
import c5a.a1;
import c5a.b1;
import c5a.c1;
import c5a.e1;
import c5a.f1;
import c5a.g1;
import c5a.n;
import c5a.t;
import c5a.w0;
import c5a.x0;
import c5a.y0;
import c5a.z0;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.feature.payments.who_to_transfer.impl.R$id;
import com.revolut.feature.payments.who_to_transfer.impl.R$layout;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.Rev10ChatTransferScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fnc.s;
import hx0.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import jji.h;
import jji.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import no.k;
import q3a.g;
import rp0.l0;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/Rev10ChatTransferScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lc5a/v;", "Ldte/c;", "Lno/k;", "Lhx0/d0;", "Lkji/f;", "Ljji/h;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Rev10ChatTransferScreen extends ViewController<q> implements dli.a, dte.c, k, d0, kji.f, h {
    public static final /* synthetic */ KProperty[] i0;
    public final ChatTransferScreenContract$InputData K;
    public final s L;
    public final int M;
    public final int N;
    public final ao.h O;
    public final ao.h P;
    public l0 Q;
    public final boolean R;
    public final Object S;
    public final ihm.f T;
    public final RateEmojiDelegate U;
    public final RowDelegate V;
    public final SwipeToActionDelegate W;
    public final SearchButtonDelegate X;
    public final FullScreenStateDelegate Y;
    public final ActionWidgetDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final BannerDelegate f80156a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final HeroBannerDelegate f80157b0;
    public final ScrollerDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f80158d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final no0.a f80159e0;
    public AnalyticsContext f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f80160h0;

    static {
        h0 h0Var = new h0(Rev10ChatTransferScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsTransfersNewBinding;", 0);
        p0 p0Var = o0.f186429a;
        i0 = new KProperty[]{p0Var.j(h0Var), p.a.y(Rev10ChatTransferScreen.class, "bindingRev10", "getBindingRev10()Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsTransfersRev10Binding;", 0, p0Var)};
    }

    public Rev10ChatTransferScreen(ChatTransferScreenContract$InputData inputData) {
        int i;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new s(new u(this));
        this.M = R$style.TransparentNavigationBarMarkerTheme;
        int i2 = w0.f21539a[inputData.f80150a.ordinal()];
        final int i3 = 2;
        final int i5 = 1;
        if (i2 == 1) {
            i = R$layout.screen_payments_transfers_new;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException("Fullscreen not supported in Rev10 onwards");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            i = R$layout.screen_payments_transfers_rev10;
        }
        this.N = i;
        this.O = vc.s.t(this, x0.f);
        this.P = vc.s.t(this, y0.f);
        final int i6 = 0;
        this.R = inputData.f80150a != n.EMBEDDED;
        this.S = w.y0(new Function0(this) { // from class: c5a.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rev10ChatTransferScreen f21531b;

            {
                this.f21531b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i6;
                Rev10ChatTransferScreen rev10ChatTransferScreen = this.f21531b;
                switch (i21) {
                    case 0:
                        d5a.a aVar = new d5a.a(rev10ChatTransferScreen.T, rev10ChatTransferScreen.c0.i, rev10ChatTransferScreen.f80159e0.f, 0);
                        qji.b bVarR1 = rev10ChatTransferScreen.z2().R1();
                        e5a.b bVar = bVarR1 instanceof e5a.b ? (e5a.b) bVarR1 : null;
                        if (bVar == null) {
                            phm.a aVar2 = (phm.a) ue0.e.j(rev10ChatTransferScreen.m2()).a().get(s3a.r.class);
                            b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                            if (aVar3 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", s3a.r.class, " is not found"));
                            }
                            bVar = (e5a.b) aVar3.b();
                        }
                        return (s3a.n) ((e5a.a) bVar.I().mo3808a(rev10ChatTransferScreen)).X(rev10ChatTransferScreen).g0(rev10ChatTransferScreen.K).Q(aVar).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr = Rev10ChatTransferScreen.i0;
                        return rev10ChatTransferScreen.R1().j();
                    default:
                        KProperty[] kPropertyArr2 = Rev10ChatTransferScreen.i0;
                        Rev10ChatTransferScreen rev10ChatTransferScreen2 = this.f21531b;
                        return dli.f.a(rev10ChatTransferScreen2, rev10ChatTransferScreen2.d(), zhm.d0.E0(rev10ChatTransferScreen2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), rev10ChatTransferScreen2.U, rev10ChatTransferScreen2.V, rev10ChatTransferScreen2.W, rev10ChatTransferScreen2.X, rev10ChatTransferScreen2.Y, rev10ChatTransferScreen2.c0, rev10ChatTransferScreen2.Z, rev10ChatTransferScreen2.f80156a0, rev10ChatTransferScreen2.f80157b0, new ActionWidgetLoadingDelegate(), new HeroBannerLoadingDelegate())), R$id.transferScreen_recyclerView, null, rev10ChatTransferScreen2.f80159e0, null, 40);
                }
            }
        });
        this.T = v0.a.d("create(...)");
        this.U = new RateEmojiDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.V = rowDelegate;
        this.W = new SwipeToActionDelegate(rowDelegate, false);
        this.X = new SearchButtonDelegate();
        this.Y = new FullScreenStateDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.Z = actionWidgetDelegate;
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.f80156a0 = bannerDelegate;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        this.f80157b0 = heroBannerDelegate;
        this.c0 = new ScrollerDelegate(v.k(actionWidgetDelegate, bannerDelegate, heroBannerDelegate, new ActionWidgetLoadingDelegate(), new HeroBannerLoadingDelegate()), false);
        this.f80158d0 = w.y0(new c0d.e(13));
        this.f80159e0 = new no0.a(new koi.c(0), 8);
        this.g0 = w.y0(new Function0(this) { // from class: c5a.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rev10ChatTransferScreen f21531b;

            {
                this.f21531b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i5;
                Rev10ChatTransferScreen rev10ChatTransferScreen = this.f21531b;
                switch (i21) {
                    case 0:
                        d5a.a aVar = new d5a.a(rev10ChatTransferScreen.T, rev10ChatTransferScreen.c0.i, rev10ChatTransferScreen.f80159e0.f, 0);
                        qji.b bVarR1 = rev10ChatTransferScreen.z2().R1();
                        e5a.b bVar = bVarR1 instanceof e5a.b ? (e5a.b) bVarR1 : null;
                        if (bVar == null) {
                            phm.a aVar2 = (phm.a) ue0.e.j(rev10ChatTransferScreen.m2()).a().get(s3a.r.class);
                            b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                            if (aVar3 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", s3a.r.class, " is not found"));
                            }
                            bVar = (e5a.b) aVar3.b();
                        }
                        return (s3a.n) ((e5a.a) bVar.I().mo3808a(rev10ChatTransferScreen)).X(rev10ChatTransferScreen).g0(rev10ChatTransferScreen.K).Q(aVar).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr = Rev10ChatTransferScreen.i0;
                        return rev10ChatTransferScreen.R1().j();
                    default:
                        KProperty[] kPropertyArr2 = Rev10ChatTransferScreen.i0;
                        Rev10ChatTransferScreen rev10ChatTransferScreen2 = this.f21531b;
                        return dli.f.a(rev10ChatTransferScreen2, rev10ChatTransferScreen2.d(), zhm.d0.E0(rev10ChatTransferScreen2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), rev10ChatTransferScreen2.U, rev10ChatTransferScreen2.V, rev10ChatTransferScreen2.W, rev10ChatTransferScreen2.X, rev10ChatTransferScreen2.Y, rev10ChatTransferScreen2.c0, rev10ChatTransferScreen2.Z, rev10ChatTransferScreen2.f80156a0, rev10ChatTransferScreen2.f80157b0, new ActionWidgetLoadingDelegate(), new HeroBannerLoadingDelegate())), R$id.transferScreen_recyclerView, null, rev10ChatTransferScreen2.f80159e0, null, 40);
                }
            }
        });
        this.f80160h0 = w.y0(new Function0(this) { // from class: c5a.u0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rev10ChatTransferScreen f21531b;

            {
                this.f21531b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i21 = i3;
                Rev10ChatTransferScreen rev10ChatTransferScreen = this.f21531b;
                switch (i21) {
                    case 0:
                        d5a.a aVar = new d5a.a(rev10ChatTransferScreen.T, rev10ChatTransferScreen.c0.i, rev10ChatTransferScreen.f80159e0.f, 0);
                        qji.b bVarR1 = rev10ChatTransferScreen.z2().R1();
                        e5a.b bVar = bVarR1 instanceof e5a.b ? (e5a.b) bVarR1 : null;
                        if (bVar == null) {
                            phm.a aVar2 = (phm.a) ue0.e.j(rev10ChatTransferScreen.m2()).a().get(s3a.r.class);
                            b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                            if (aVar3 == null) {
                                throw new IllegalStateException(a0.d.q("Api ", s3a.r.class, " is not found"));
                            }
                            bVar = (e5a.b) aVar3.b();
                        }
                        return (s3a.n) ((e5a.a) bVar.I().mo3808a(rev10ChatTransferScreen)).X(rev10ChatTransferScreen).g0(rev10ChatTransferScreen.K).Q(aVar).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr = Rev10ChatTransferScreen.i0;
                        return rev10ChatTransferScreen.R1().j();
                    default:
                        KProperty[] kPropertyArr2 = Rev10ChatTransferScreen.i0;
                        Rev10ChatTransferScreen rev10ChatTransferScreen2 = this.f21531b;
                        return dli.f.a(rev10ChatTransferScreen2, rev10ChatTransferScreen2.d(), zhm.d0.E0(rev10ChatTransferScreen2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), rev10ChatTransferScreen2.U, rev10ChatTransferScreen2.V, rev10ChatTransferScreen2.W, rev10ChatTransferScreen2.X, rev10ChatTransferScreen2.Y, rev10ChatTransferScreen2.c0, rev10ChatTransferScreen2.Z, rev10ChatTransferScreen2.f80156a0, rev10ChatTransferScreen2.f80157b0, new ActionWidgetLoadingDelegate(), new HeroBannerLoadingDelegate())), R$id.transferScreen_recyclerView, null, rev10ChatTransferScreen2.f80159e0, null, 40);
                }
            }
        });
    }

    @Override // dte.c
    public final ihm.f A0() {
        return R1().s().f256232c;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c5a.v uiState = (c5a.v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        c5a.u uVar = qVar instanceof c5a.u ? (c5a.u) qVar : null;
        final DefaultItemAnimator defaultItemAnimator = pd.b.j(uVar != null ? Boolean.valueOf(uVar.f21529a) : null) ? (DefaultItemAnimator) this.f80158d0.getValue() : null;
        final int i = 0;
        final int i2 = 1;
        d3(new Function1() { // from class: c5a.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i;
                DefaultItemAnimator defaultItemAnimator2 = defaultItemAnimator;
                switch (i3) {
                    case 0:
                        q3a.e applyOnBinding = (q3a.e) obj2;
                        KProperty[] kPropertyArr = Rev10ChatTransferScreen.i0;
                        Intrinsics.checkNotNullParameter(applyOnBinding, "$this$applyOnBinding");
                        applyOnBinding.d.setItemAnimator(defaultItemAnimator2);
                        break;
                    default:
                        q3a.g applyOnBinding2 = (q3a.g) obj2;
                        KProperty[] kPropertyArr2 = Rev10ChatTransferScreen.i0;
                        Intrinsics.checkNotNullParameter(applyOnBinding2, "$this$applyOnBinding");
                        applyOnBinding2.f241935c.setItemAnimator(defaultItemAnimator2);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1() { // from class: c5a.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                DefaultItemAnimator defaultItemAnimator2 = defaultItemAnimator;
                switch (i3) {
                    case 0:
                        q3a.e applyOnBinding = (q3a.e) obj2;
                        KProperty[] kPropertyArr = Rev10ChatTransferScreen.i0;
                        Intrinsics.checkNotNullParameter(applyOnBinding, "$this$applyOnBinding");
                        applyOnBinding.d.setItemAnimator(defaultItemAnimator2);
                        break;
                    default:
                        q3a.g applyOnBinding2 = (q3a.g) obj2;
                        KProperty[] kPropertyArr2 = Rev10ChatTransferScreen.i0;
                        Intrinsics.checkNotNullParameter(applyOnBinding2, "$this$applyOnBinding");
                        applyOnBinding2.f241935c.setItemAnimator(defaultItemAnimator2);
                        break;
                }
                return Unit.f186387a;
            }
        });
        dli.a.z0(uiState);
        c5a.s sVar = uiState.f21532a;
        e3().f241928b.setMessage(sVar.f);
        d3(new c1g.o(sVar, 5, this, uiState), new byc.a(sVar, this, 24));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void J() {
        super.J();
        m2();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF0() {
        return this.f0;
    }

    @Override // dte.c
    public final ihm.f S0() {
        return R1().s().e;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void W() {
        super.W();
        m2();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.Q = new l0(m2());
        pd.b.p(view, new TextLocalisedClause(R$string.home_transfers, null, null, 14));
        d3(new j(15), new j(13));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        final int i = 0;
        final int i2 = 1;
        d3(new Function1(this) { // from class: c5a.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rev10ChatTransferScreen f21536b;

            {
                this.f21536b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i;
                int i5 = 5;
                int i6 = 4;
                Continuation continuation = null;
                Rev10ChatTransferScreen rev10ChatTransferScreen = this.f21536b;
                int i21 = 3;
                switch (i3) {
                    case 0:
                        q3a.e applyOnBinding = (q3a.e) obj2;
                        KProperty[] kPropertyArr = Rev10ChatTransferScreen.i0;
                        Intrinsics.checkNotNullParameter(applyOnBinding, "$this$applyOnBinding");
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(applyOnBinding.f241928b.b()), new z0(rev10ChatTransferScreen, continuation, i6), 3);
                        NavBarWithContainer navBarWithContainer = applyOnBinding.f241928b;
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainer.D()), new d1(rev10ChatTransferScreen, continuation, 0), 3);
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainer.F()), new d1(rev10ChatTransferScreen, continuation, 1), 3);
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainer.L()), new d1(rev10ChatTransferScreen, continuation, 2), 3);
                        r10.v vVar = navBarWithContainer.f59369w;
                        vVar.c();
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).f59386m.f59003n), new z0(rev10ChatTransferScreen, continuation, i5), 3);
                        break;
                    default:
                        q3a.g applyOnBinding2 = (q3a.g) obj2;
                        KProperty[] kPropertyArr2 = Rev10ChatTransferScreen.i0;
                        Intrinsics.checkNotNullParameter(applyOnBinding2, "$this$applyOnBinding");
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(applyOnBinding2.f241934b.f59375b.f57403b), new z0(rev10ChatTransferScreen, continuation, 6), 3);
                        NavBarWithContainerHeaderView navBarWithContainerHeaderView = applyOnBinding2.f241934b;
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainerHeaderView.P), new d1(rev10ChatTransferScreen, continuation, i21), 3);
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainerHeaderView.Q), new d1(rev10ChatTransferScreen, continuation, i6), 3);
                        SearchButton searchButton = navBarWithContainerHeaderView.f59386m;
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(searchButton.f59002m), new d1(rev10ChatTransferScreen, continuation, i5), 3);
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(searchButton.f59003n), new z0(rev10ChatTransferScreen, continuation, 7), 3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new Function1(this) { // from class: c5a.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Rev10ChatTransferScreen f21536b;

            {
                this.f21536b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                int i5 = 5;
                int i6 = 4;
                Continuation continuation = null;
                Rev10ChatTransferScreen rev10ChatTransferScreen = this.f21536b;
                int i21 = 3;
                switch (i3) {
                    case 0:
                        q3a.e applyOnBinding = (q3a.e) obj2;
                        KProperty[] kPropertyArr = Rev10ChatTransferScreen.i0;
                        Intrinsics.checkNotNullParameter(applyOnBinding, "$this$applyOnBinding");
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(applyOnBinding.f241928b.b()), new z0(rev10ChatTransferScreen, continuation, i6), 3);
                        NavBarWithContainer navBarWithContainer = applyOnBinding.f241928b;
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainer.D()), new d1(rev10ChatTransferScreen, continuation, 0), 3);
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainer.F()), new d1(rev10ChatTransferScreen, continuation, 1), 3);
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainer.L()), new d1(rev10ChatTransferScreen, continuation, 2), 3);
                        r10.v vVar = navBarWithContainer.f59369w;
                        vVar.c();
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).f59386m.f59003n), new z0(rev10ChatTransferScreen, continuation, i5), 3);
                        break;
                    default:
                        q3a.g applyOnBinding2 = (q3a.g) obj2;
                        KProperty[] kPropertyArr2 = Rev10ChatTransferScreen.i0;
                        Intrinsics.checkNotNullParameter(applyOnBinding2, "$this$applyOnBinding");
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(applyOnBinding2.f241934b.f59375b.f57403b), new z0(rev10ChatTransferScreen, continuation, 6), 3);
                        NavBarWithContainerHeaderView navBarWithContainerHeaderView = applyOnBinding2.f241934b;
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainerHeaderView.P), new d1(rev10ChatTransferScreen, continuation, i21), 3);
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(navBarWithContainerHeaderView.Q), new d1(rev10ChatTransferScreen, continuation, i6), 3);
                        SearchButton searchButton = navBarWithContainerHeaderView.f59386m;
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(searchButton.f59002m), new d1(rev10ChatTransferScreen, continuation, i5), 3);
                        ViewController.P2(rev10ChatTransferScreen, rd0.e.b(searchButton.f59003n), new z0(rev10ChatTransferScreen, continuation, 7), 3);
                        break;
                }
                return Unit.f186387a;
            }
        });
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((f) d()).g0), new z0(this, continuation, 8), 3);
        RowDelegate rowDelegate = this.V;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new e1(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53227t), new f1(this, null), 3);
        l0 l0Var = this.Q;
        if (l0Var == null) {
            Intrinsics.r("popupMenuDialogDisplayer");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(l0Var.f256113c), new z0(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.W.f, new j(14))), new z0(this, continuation, 10), 3);
        SearchButtonDelegate searchButtonDelegate = this.X;
        ViewController.P2(this, rd0.e.b(searchButtonDelegate.f53283c.f121375b), new g1(this, null), 3);
        ViewController.P2(this, rd0.e.b(searchButtonDelegate.d.f121375b), new z0(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.Z.f51589c.f121375b), new z0(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Y.f52371h.f121375b), new a1(this, null), 3);
        BannerDelegate bannerDelegate = this.f80156a0;
        ViewController.P2(this, rd0.e.b(bannerDelegate.f51699c), new b1(this, null), 3);
        ViewController.P2(this, rd0.e.b(bannerDelegate.e), new c1(this, null), 3);
        RateEmojiDelegate rateEmojiDelegate = this.U;
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.f53143c), new z0(this, continuation, 11), 3);
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.e), new z0(this, continuation, 12), 3);
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.d), new z0(this, continuation, 13), 3);
        ViewController.P2(this, rd0.e.b(e3().f241928b.H()), new z0(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(e3().f241928b.I()), new z0(this, continuation, 3), 3);
    }

    public final void d3(Function1 function1, Function1 function12) {
        int i = w0.f21539a[this.K.f80150a.ordinal()];
        if (i == 1) {
            function1.invoke(e3());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ViewBinding value = this.P.getValue(this, i0[1]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            function12.invoke((g) value);
        }
    }

    public final q3a.e e3() {
        ViewBinding value = this.O.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q3a.e) value;
    }

    @Override // jji.h
    public final NavBarWithContainer f() {
        NavBarWithContainer transferScreenNavigationBar = e3().f241928b;
        Intrinsics.checkNotNullExpressionValue(transferScreenNavigationBar, "transferScreenNavigationBar");
        return transferScreenNavigationBar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final s3a.n R1() {
        return (s3a.n) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.g0.getValue();
    }

    @Override // jji.h
    public final View getContent() {
        ScreenContentRecyclerView transferScreenRecyclerView = e3().d;
        Intrinsics.checkNotNullExpressionValue(transferScreenRecyclerView, "transferScreenRecyclerView");
        return transferScreenRecyclerView;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f80160h0.getValue();
    }

    @Override // hx0.d0
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final s getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }

    @Override // jji.h
    public final View v() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = e3().f241927a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return hx0.h.b(controllerContainerCoordinatorLayout);
    }

    @Override // dte.c
    public final ihm.f v1() {
        return R1().s().f256231b;
    }
}
