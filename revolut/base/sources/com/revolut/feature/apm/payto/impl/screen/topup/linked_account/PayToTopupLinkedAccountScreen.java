package com.revolut.feature.apm.payto.impl.screen.topup.linked_account;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.payto.api.R$string;
import com.revolut.feature.apm.payto.impl.screen.topup.linked_account.PayToTopupLinkedAccountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vb2.b;
import vb2.c;
import vb2.d;
import vb2.f;
import vb2.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/topup/linked_account/PayToTopupLinkedAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvb2/f;", "Ldli/a;", "Lvb2/o;", "<init>", "()V", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayToTopupLinkedAccountScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PayToTopupLinkedAccountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final FixedTabsDelegate K = new FixedTabsDelegate();
    public final InputTextDelegate L = new InputTextDelegate(null);
    public final InputDualTextDelegate M = new InputDualTextDelegate(null, 3);
    public final int N = R$layout.screen_recycler_navbar_action_footer;
    public final h O = s.t(this, a.f);
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public PayToTopupLinkedAccountScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: vb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupLinkedAccountScreen f287358b;

            {
                this.f287358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen = this.f287358b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayToTopupLinkedAccountScreen.S;
                        return (g) ((nb2.e) payToTopupLinkedAccountScreen.Q.getValue()).f213975c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayToTopupLinkedAccountScreen.S;
                        qji.b bVarU2 = payToTopupLinkedAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payto.impl.screen.topup.linked_account.di.PayToTopupLinkedAccountScreenInjector");
                        nb2.d dVar = (nb2.d) bVarU2;
                        return new nb2.e(dVar.f213971b, dVar.f213972c);
                    default:
                        KProperty[] kPropertyArr3 = PayToTopupLinkedAccountScreen.S;
                        PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen2 = this.f287358b;
                        return dli.f.a(payToTopupLinkedAccountScreen2, payToTopupLinkedAccountScreen2.d(), v.k(payToTopupLinkedAccountScreen2.K, payToTopupLinkedAccountScreen2.L, payToTopupLinkedAccountScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: vb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupLinkedAccountScreen f287358b;

            {
                this.f287358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen = this.f287358b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayToTopupLinkedAccountScreen.S;
                        return (g) ((nb2.e) payToTopupLinkedAccountScreen.Q.getValue()).f213975c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayToTopupLinkedAccountScreen.S;
                        qji.b bVarU2 = payToTopupLinkedAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payto.impl.screen.topup.linked_account.di.PayToTopupLinkedAccountScreenInjector");
                        nb2.d dVar = (nb2.d) bVarU2;
                        return new nb2.e(dVar.f213971b, dVar.f213972c);
                    default:
                        KProperty[] kPropertyArr3 = PayToTopupLinkedAccountScreen.S;
                        PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen2 = this.f287358b;
                        return dli.f.a(payToTopupLinkedAccountScreen2, payToTopupLinkedAccountScreen2.d(), v.k(payToTopupLinkedAccountScreen2.K, payToTopupLinkedAccountScreen2.L, payToTopupLinkedAccountScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: vb2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayToTopupLinkedAccountScreen f287358b;

            {
                this.f287358b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen = this.f287358b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayToTopupLinkedAccountScreen.S;
                        return (g) ((nb2.e) payToTopupLinkedAccountScreen.Q.getValue()).f213975c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PayToTopupLinkedAccountScreen.S;
                        qji.b bVarU2 = payToTopupLinkedAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payto.impl.screen.topup.linked_account.di.PayToTopupLinkedAccountScreenInjector");
                        nb2.d dVar = (nb2.d) bVarU2;
                        return new nb2.e(dVar.f213971b, dVar.f213972c);
                    default:
                        KProperty[] kPropertyArr3 = PayToTopupLinkedAccountScreen.S;
                        PayToTopupLinkedAccountScreen payToTopupLinkedAccountScreen2 = this.f287358b;
                        return dli.f.a(payToTopupLinkedAccountScreen2, payToTopupLinkedAccountScreen2.d(), v.k(payToTopupLinkedAccountScreen2.K, payToTopupLinkedAccountScreen2.L, payToTopupLinkedAccountScreen2.M), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        vb2.o uiState = (vb2.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174533b.setModel(uiState.f287371b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nb2.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.topup_linked_account_header_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.topup_linked_account_header_description, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52339c.f121375b), new c(this, null, 1), 3);
        ihm.f fVar = this.L.e.f121375b;
        InputDualTextDelegate inputDualTextDelegate = this.M;
        r rVarMergeWith = fVar.mergeWith(inputDualTextDelegate.f52549c.e.f121375b).mergeWith(inputDualTextDelegate.d.e.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        ViewController.P2(this, rd0.e.b(rVarMergeWith), new d(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
