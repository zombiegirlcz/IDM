package com.revolut.feature.pay_bills_taxes.impl.ui.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bg9.b;
import bg9.c;
import bg9.f;
import bg9.g;
import bg9.i;
import bg9.j;
import bg9.k;
import bg9.l;
import bg9.r;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.PayBillsAndTaxesScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.u;
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
import wp5.y;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/PayBillsAndTaxesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbg9/c;", "<init>", "()V", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayBillsAndTaxesScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PayBillsAndTaxesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object M;
    public final Object P;
    public final Object R;
    public final Object S;
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final Object L = w.y0(new b8g.a(21));
    public final Object N = w.y0(new b8g.a(22));
    public final Object O = w.y0(new b8g.a(23));
    public final h Q = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public PayBillsAndTaxesScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bg9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayBillsAndTaxesScreen f15146b;

            {
                this.f15146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayBillsAndTaxesScreen payBillsAndTaxesScreen = this.f15146b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayBillsAndTaxesScreen.T;
                        return new InputTextDelegate(new b7d.c(payBillsAndTaxesScreen, 26));
                    case 1:
                        KProperty[] kPropertyArr2 = PayBillsAndTaxesScreen.T;
                        PayBillsAndTaxesScreen payBillsAndTaxesScreen2 = this.f15146b;
                        return dli.f.a(payBillsAndTaxesScreen2, payBillsAndTaxesScreen2.R2(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (RowDelegate) payBillsAndTaxesScreen2.L.getValue(), payBillsAndTaxesScreen2.f3(), (ListSubheaderDelegate) payBillsAndTaxesScreen2.N.getValue(), (LargeActionButtonDelegate) payBillsAndTaxesScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PayBillsAndTaxesScreen.T;
                        qji.b bVarU2 = payBillsAndTaxesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.di.PayBillsAndTaxesScreenInjector");
                        lf9.n nVar = (lf9.n) bVarU2;
                        return new lf9.o(nVar.f194749b, nVar.f194750c, payBillsAndTaxesScreen);
                    default:
                        KProperty[] kPropertyArr4 = PayBillsAndTaxesScreen.T;
                        return (b) ((lf9.o) payBillsAndTaxesScreen.R.getValue()).f194763p.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bg9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayBillsAndTaxesScreen f15146b;

            {
                this.f15146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayBillsAndTaxesScreen payBillsAndTaxesScreen = this.f15146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayBillsAndTaxesScreen.T;
                        return new InputTextDelegate(new b7d.c(payBillsAndTaxesScreen, 26));
                    case 1:
                        KProperty[] kPropertyArr2 = PayBillsAndTaxesScreen.T;
                        PayBillsAndTaxesScreen payBillsAndTaxesScreen2 = this.f15146b;
                        return dli.f.a(payBillsAndTaxesScreen2, payBillsAndTaxesScreen2.R2(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (RowDelegate) payBillsAndTaxesScreen2.L.getValue(), payBillsAndTaxesScreen2.f3(), (ListSubheaderDelegate) payBillsAndTaxesScreen2.N.getValue(), (LargeActionButtonDelegate) payBillsAndTaxesScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PayBillsAndTaxesScreen.T;
                        qji.b bVarU2 = payBillsAndTaxesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.di.PayBillsAndTaxesScreenInjector");
                        lf9.n nVar = (lf9.n) bVarU2;
                        return new lf9.o(nVar.f194749b, nVar.f194750c, payBillsAndTaxesScreen);
                    default:
                        KProperty[] kPropertyArr4 = PayBillsAndTaxesScreen.T;
                        return (b) ((lf9.o) payBillsAndTaxesScreen.R.getValue()).f194763p.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: bg9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayBillsAndTaxesScreen f15146b;

            {
                this.f15146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayBillsAndTaxesScreen payBillsAndTaxesScreen = this.f15146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayBillsAndTaxesScreen.T;
                        return new InputTextDelegate(new b7d.c(payBillsAndTaxesScreen, 26));
                    case 1:
                        KProperty[] kPropertyArr2 = PayBillsAndTaxesScreen.T;
                        PayBillsAndTaxesScreen payBillsAndTaxesScreen2 = this.f15146b;
                        return dli.f.a(payBillsAndTaxesScreen2, payBillsAndTaxesScreen2.R2(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (RowDelegate) payBillsAndTaxesScreen2.L.getValue(), payBillsAndTaxesScreen2.f3(), (ListSubheaderDelegate) payBillsAndTaxesScreen2.N.getValue(), (LargeActionButtonDelegate) payBillsAndTaxesScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PayBillsAndTaxesScreen.T;
                        qji.b bVarU2 = payBillsAndTaxesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.di.PayBillsAndTaxesScreenInjector");
                        lf9.n nVar = (lf9.n) bVarU2;
                        return new lf9.o(nVar.f194749b, nVar.f194750c, payBillsAndTaxesScreen);
                    default:
                        KProperty[] kPropertyArr4 = PayBillsAndTaxesScreen.T;
                        return (b) ((lf9.o) payBillsAndTaxesScreen.R.getValue()).f194763p.get();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: bg9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayBillsAndTaxesScreen f15146b;

            {
                this.f15146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PayBillsAndTaxesScreen payBillsAndTaxesScreen = this.f15146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayBillsAndTaxesScreen.T;
                        return new InputTextDelegate(new b7d.c(payBillsAndTaxesScreen, 26));
                    case 1:
                        KProperty[] kPropertyArr2 = PayBillsAndTaxesScreen.T;
                        PayBillsAndTaxesScreen payBillsAndTaxesScreen2 = this.f15146b;
                        return dli.f.a(payBillsAndTaxesScreen2, payBillsAndTaxesScreen2.R2(), v.k(new FullScreenStateDelegate(), new RowLoadingDelegate(), (RowDelegate) payBillsAndTaxesScreen2.L.getValue(), payBillsAndTaxesScreen2.f3(), (ListSubheaderDelegate) payBillsAndTaxesScreen2.N.getValue(), (LargeActionButtonDelegate) payBillsAndTaxesScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PayBillsAndTaxesScreen.T;
                        qji.b bVarU2 = payBillsAndTaxesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.di.PayBillsAndTaxesScreenInjector");
                        lf9.n nVar = (lf9.n) bVarU2;
                        return new lf9.o(nVar.f194749b, nVar.f194750c, payBillsAndTaxesScreen);
                    default:
                        KProperty[] kPropertyArr4 = PayBillsAndTaxesScreen.T;
                        return (b) ((lf9.o) payBillsAndTaxesScreen.R.getValue()).f194763p.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(uiState.f15143b);
        largeActionButton.setVisibility(uiState.f15144c ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Integer num = uiState.e;
        if (num != null) {
            int iIntValue = num.intValue();
            navBarWithToolbar.setTitle(new TextLocalisedClause(iIntValue, null, null, 14), null);
            navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(iIntValue, null, null, 14));
        }
        navBarWithToolbar.setMenuItems(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        r rVar = (r) R2();
        xf9.a aVarI2 = rVar.I2();
        if (aVarI2 != null && aVarI2.b3()) {
            return true;
        }
        rVar.C2(q.f5292a);
        return super.F2();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lf9.o) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setTag("CONTINUE_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.pay_bills_taxes_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, y.x(f3().f52575g.f121375b, f3().i.f121375b, "mergeWith(...)"), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f52576h.f121375b), null, new bg9.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().e.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new bg9.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f52577j.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.L.getValue()).f53218h), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.O.getValue()).d.f121375b), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.N.getValue()).d), null, new bg9.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b R2() {
        return (b) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final InputTextDelegate f3() {
        return (InputTextDelegate) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF85147a0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
