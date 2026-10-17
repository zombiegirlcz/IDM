package com.revolut.feature.card_order_new.impl.kompot.screen.address_verification;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.CardDeliveryAddressVerificationController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pt4.d;
import q1l.e;
import q23.f;
import q23.p;
import te0.w;
import tx0.j0;
import vc.s;
import x13.l;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/CardDeliveryAddressVerificationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_verification/c;", "Ldli/a;", "Lq23/s;", "Lno/m;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDeliveryAddressVerificationController extends ViewController<c> implements dli.a, m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CardDeliveryAddressVerificationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final AnalyticsProduct K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public CardDeliveryAddressVerificationController(CardDeliveryAddressVerificationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData.f65141c;
        this.L = w.y0(new d(this, inputData, 15));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: q23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryAddressVerificationController f241501b;

            {
                this.f241501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController = this.f241501b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardDeliveryAddressVerificationController.W;
                        return (p) ((x13.l) cardDeliveryAddressVerificationController.L.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CardDeliveryAddressVerificationController.W;
                        return (j60.a) ((x13.l) cardDeliveryAddressVerificationController.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardDeliveryAddressVerificationController.W;
                        return new SelectableDelegate((RowDelegate) cardDeliveryAddressVerificationController.T.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CardDeliveryAddressVerificationController.W;
                        CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController2 = this.f241501b;
                        return dli.f.a(cardDeliveryAddressVerificationController2, cardDeliveryAddressVerificationController2.R2(), zhm.v.k((MapPlainDelegate) cardDeliveryAddressVerificationController2.Q.getValue(), (RowDelegate) cardDeliveryAddressVerificationController2.R.getValue(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new MapPlainLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: q23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryAddressVerificationController f241501b;

            {
                this.f241501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController = this.f241501b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardDeliveryAddressVerificationController.W;
                        return (p) ((x13.l) cardDeliveryAddressVerificationController.L.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CardDeliveryAddressVerificationController.W;
                        return (j60.a) ((x13.l) cardDeliveryAddressVerificationController.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardDeliveryAddressVerificationController.W;
                        return new SelectableDelegate((RowDelegate) cardDeliveryAddressVerificationController.T.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CardDeliveryAddressVerificationController.W;
                        CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController2 = this.f241501b;
                        return dli.f.a(cardDeliveryAddressVerificationController2, cardDeliveryAddressVerificationController2.R2(), zhm.v.k((MapPlainDelegate) cardDeliveryAddressVerificationController2.Q.getValue(), (RowDelegate) cardDeliveryAddressVerificationController2.R.getValue(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new MapPlainLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_two_buttons;
        this.P = s.t(this, q23.b.f);
        this.Q = w.y0(new e(5));
        this.R = w.y0(new e(6));
        this.S = w.y0(new e(7));
        this.T = w.y0(new e(8));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: q23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryAddressVerificationController f241501b;

            {
                this.f241501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController = this.f241501b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardDeliveryAddressVerificationController.W;
                        return (p) ((x13.l) cardDeliveryAddressVerificationController.L.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CardDeliveryAddressVerificationController.W;
                        return (j60.a) ((x13.l) cardDeliveryAddressVerificationController.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardDeliveryAddressVerificationController.W;
                        return new SelectableDelegate((RowDelegate) cardDeliveryAddressVerificationController.T.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CardDeliveryAddressVerificationController.W;
                        CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController2 = this.f241501b;
                        return dli.f.a(cardDeliveryAddressVerificationController2, cardDeliveryAddressVerificationController2.R2(), zhm.v.k((MapPlainDelegate) cardDeliveryAddressVerificationController2.Q.getValue(), (RowDelegate) cardDeliveryAddressVerificationController2.R.getValue(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new MapPlainLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: q23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDeliveryAddressVerificationController f241501b;

            {
                this.f241501b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController = this.f241501b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardDeliveryAddressVerificationController.W;
                        return (p) ((x13.l) cardDeliveryAddressVerificationController.L.getValue()).k.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CardDeliveryAddressVerificationController.W;
                        return (j60.a) ((x13.l) cardDeliveryAddressVerificationController.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CardDeliveryAddressVerificationController.W;
                        return new SelectableDelegate((RowDelegate) cardDeliveryAddressVerificationController.T.getValue());
                    default:
                        KProperty[] kPropertyArr4 = CardDeliveryAddressVerificationController.W;
                        CardDeliveryAddressVerificationController cardDeliveryAddressVerificationController2 = this.f241501b;
                        return dli.f.a(cardDeliveryAddressVerificationController2, cardDeliveryAddressVerificationController2.R2(), zhm.v.k((MapPlainDelegate) cardDeliveryAddressVerificationController2.Q.getValue(), (RowDelegate) cardDeliveryAddressVerificationController2.R.getValue(), new PlainTextWarningDelegate(), new RowLoadingDelegate(), new MapPlainLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        q23.s uiState = (q23.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        TextLocalisedClause textLocalisedClause = uiState.f241522b;
        Clause clause = uiState.d;
        TextLocalisedClause textLocalisedClause2 = uiState.f241523c;
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = d3().f174573b;
        largeActionButton.setText(textLocalisedClause2);
        largeActionButton.setVisibility(0);
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.setText(clause);
        largeActionButton2.setVisibility(clause == null ? 8 : 0);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getG0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.N.getValue()).d(v.k((LargeActionButtonDelegate) this.S.getValue(), (SelectableDelegate) this.U.getValue(), (RowDelegate) this.T.getValue()));
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174573b.setVisibility(8);
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
        d3().e.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new q23.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new q23.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new q23.c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((MapPlainDelegate) this.Q.getValue()).f52768c), null, new q23.c(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.U.getValue()).r()), null, new q23.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b), null, new q23.e(this, null), 3);
        ?? r72 = this.R;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(((RowDelegate) r72.getValue()).f53218h), rd0.e.b(((RowDelegate) r72.getValue()).f53220l)), null, new f(this, null), 3);
    }

    public final x d3() {
        ViewBinding value = this.P.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
