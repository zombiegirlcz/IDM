package com.revolut.feature.voluntary.offboarding.impl.ui.account_not_closing;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.voluntary.offboarding.impl.R$string;
import com.revolut.feature.voluntary.offboarding.impl.ui.account_not_closing.AccountNotClosingViewController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import dli.f;
import fsg.b;
import hl7.ma;
import java.util.List;
import jii.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/voluntary/offboarding/impl/ui/account_not_closing/AccountNotClosingViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhsg/a;", "<init>", "()V", "feature_voluntary_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountNotClosingViewController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AccountNotClosingViewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar_two_buttons;
    public final Object N = w.y0(new ma(23));
    public final Object O = w.y0(new ma(24));
    public final h Q = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, x.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return x.a(p0);
        }
    }

    public AccountNotClosingViewController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hsg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountNotClosingViewController f155045b;

            {
                this.f155045b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountNotClosingViewController accountNotClosingViewController = this.f155045b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountNotClosingViewController.R;
                        qji.b bVarU2 = accountNotClosingViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.voluntary.offboarding.impl.ui.account_not_closing.di.AccountNotClosingComponent.Injector");
                        fsg.d dVar = ((fsg.e) bVarU2).f137686a;
                        fsg.b bVar = new fsg.b();
                        bVar.f137672a = e4m.b.b(new fa0.q(dVar, bVar, 1, 27));
                        bVar.f137673b = e4m.b.b(new fa0.q(dVar, bVar, 0, 27));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AccountNotClosingViewController.R;
                        return (b) ((fsg.b) accountNotClosingViewController.L.getValue()).f137673b.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountNotClosingViewController.R;
                        AccountNotClosingViewController accountNotClosingViewController2 = this.f155045b;
                        return f.a(accountNotClosingViewController2, (b) accountNotClosingViewController2.M.getValue(), v.k((FullScreenStateDelegate) accountNotClosingViewController2.N.getValue(), (LargeActionButtonDelegate) accountNotClosingViewController2.O.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: hsg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountNotClosingViewController f155045b;

            {
                this.f155045b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountNotClosingViewController accountNotClosingViewController = this.f155045b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountNotClosingViewController.R;
                        qji.b bVarU2 = accountNotClosingViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.voluntary.offboarding.impl.ui.account_not_closing.di.AccountNotClosingComponent.Injector");
                        fsg.d dVar = ((fsg.e) bVarU2).f137686a;
                        fsg.b bVar = new fsg.b();
                        bVar.f137672a = e4m.b.b(new fa0.q(dVar, bVar, 1, 27));
                        bVar.f137673b = e4m.b.b(new fa0.q(dVar, bVar, 0, 27));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AccountNotClosingViewController.R;
                        return (b) ((fsg.b) accountNotClosingViewController.L.getValue()).f137673b.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountNotClosingViewController.R;
                        AccountNotClosingViewController accountNotClosingViewController2 = this.f155045b;
                        return f.a(accountNotClosingViewController2, (b) accountNotClosingViewController2.M.getValue(), v.k((FullScreenStateDelegate) accountNotClosingViewController2.N.getValue(), (LargeActionButtonDelegate) accountNotClosingViewController2.O.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: hsg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountNotClosingViewController f155045b;

            {
                this.f155045b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountNotClosingViewController accountNotClosingViewController = this.f155045b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountNotClosingViewController.R;
                        qji.b bVarU2 = accountNotClosingViewController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.voluntary.offboarding.impl.ui.account_not_closing.di.AccountNotClosingComponent.Injector");
                        fsg.d dVar = ((fsg.e) bVarU2).f137686a;
                        fsg.b bVar = new fsg.b();
                        bVar.f137672a = e4m.b.b(new fa0.q(dVar, bVar, 1, 27));
                        bVar.f137673b = e4m.b.b(new fa0.q(dVar, bVar, 0, 27));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AccountNotClosingViewController.R;
                        return (b) ((fsg.b) accountNotClosingViewController.L.getValue()).f137673b.get();
                    default:
                        KProperty[] kPropertyArr3 = AccountNotClosingViewController.R;
                        AccountNotClosingViewController accountNotClosingViewController2 = this.f155045b;
                        return f.a(accountNotClosingViewController2, (b) accountNotClosingViewController2.M.getValue(), v.k((FullScreenStateDelegate) accountNotClosingViewController2.N.getValue(), (LargeActionButtonDelegate) accountNotClosingViewController2.O.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        hsg.a uiState = (hsg.a) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setTitle(uiState.f155040b, null);
        navBarWithToolbar.setDescriptionText(uiState.f155041c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (hsg.b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174574c.setDescriptionVisible(true);
        Continuation continuation = null;
        d3().f174574c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174573b.setText(new TextLocalisedClause(R$string.voluntary_offboarding_cant_close_keep_open, null, null, 14));
        d3().e.setText(new TextLocalisedClause(R$string.voluntary_offboarding_cant_close_go_to_app, null, null, 14));
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
        ViewController.P2(this, rd0.e.b(d3().f174574c.f59410q), new hsg.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174573b.o), new hsg.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o), new hsg.e(this, continuation, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
