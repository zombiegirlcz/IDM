package com.revolut.feature.apm.bills.bpay.impl.screen.input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ao1.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.bpay.api.R$string;
import com.revolut.feature.apm.bills.bpay.impl.screen.input.InputScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import le8.d;
import lo1.b;
import lo1.c;
import lo1.f;
import lo1.l;
import lo1.p;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/screen/input/InputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llo1/f;", "Ldli/a;", "Llo1/l;", "<init>", "()V", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(InputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final h L = s.t(this, a.f);
    public final InputTextDelegate M = new InputTextDelegate(null);
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public InputScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: lo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputScreen f197362b;

            {
                this.f197362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InputScreen inputScreen = this.f197362b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InputScreen.Q;
                        return (p) ((ao1.i) inputScreen.P.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InputScreen.Q;
                        InputScreen inputScreen2 = this.f197362b;
                        return dli.f.a(inputScreen2, inputScreen2.R2(), zhm.u.c(inputScreen2.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InputScreen.Q;
                        qji.b bVarU2 = inputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.input.di.InputScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        return new ao1.i(eVar.f7883b, eVar.f7884c, inputScreen);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: lo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputScreen f197362b;

            {
                this.f197362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InputScreen inputScreen = this.f197362b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputScreen.Q;
                        return (p) ((ao1.i) inputScreen.P.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InputScreen.Q;
                        InputScreen inputScreen2 = this.f197362b;
                        return dli.f.a(inputScreen2, inputScreen2.R2(), zhm.u.c(inputScreen2.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InputScreen.Q;
                        qji.b bVarU2 = inputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.input.di.InputScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        return new ao1.i(eVar.f7883b, eVar.f7884c, inputScreen);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: lo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InputScreen f197362b;

            {
                this.f197362b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InputScreen inputScreen = this.f197362b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InputScreen.Q;
                        return (p) ((ao1.i) inputScreen.P.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = InputScreen.Q;
                        InputScreen inputScreen2 = this.f197362b;
                        return dli.f.a(inputScreen2, inputScreen2.R2(), zhm.u.c(inputScreen2.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = InputScreen.Q;
                        qji.b bVarU2 = inputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.input.di.InputScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        return new ao1.i(eVar.f7883b, eVar.f7884c, inputScreen);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f197376b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pay_bills_taxes_country_au_input_page_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(false);
        largeActionButton.setTag("GOTO_BUTTON_TAG");
        h30.l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new b(this, null, 1), 3);
        InputTextDelegate inputTextDelegate = this.M;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f.f121375b), new d(this, (Continuation) null, 26), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
