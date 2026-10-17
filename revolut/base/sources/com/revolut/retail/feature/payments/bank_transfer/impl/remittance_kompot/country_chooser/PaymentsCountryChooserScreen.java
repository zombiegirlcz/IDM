package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.country_chooser;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.PaymentsCountrySelector$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$id;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$layout;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.country_chooser.PaymentsCountryChooserScreen;
import d2k.k;
import d2k.m;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u1.g;
import u3k.b;
import u3k.c;
import u3k.d;
import u3k.f;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/country_chooser/PaymentsCountryChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld2k/m;", "Ldli/a;", "Lu3k/g;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentsCountryChooserScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PaymentsCountryChooserScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payments/bank_transfer/impl/databinding/ScreenPaymentsCountryChooserBinding;", 0))};
    public final PaymentsCountrySelector$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public PaymentsCountryChooserScreen(PaymentsCountrySelector$InputData inputData, k interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.K = inputData;
        this.L = R$layout.screen_payments_country_chooser;
        this.M = s.t(this, b.f);
        this.N = w.y0(new ty.a(19));
        this.O = w.y0(new ty.a(20));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: u3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsCountryChooserScreen f276942b;

            {
                this.f276942b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsCountryChooserScreen.S;
                        PaymentsCountryChooserScreen paymentsCountryChooserScreen = this.f276942b;
                        return dli.f.a(paymentsCountryChooserScreen, (f) paymentsCountryChooserScreen.R.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), (RowDelegate) paymentsCountryChooserScreen.N.getValue(), (ErrorDelegate) paymentsCountryChooserScreen.O.getValue()), R$id.paymentsCountryChooser_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PaymentsCountryChooserScreen.S;
                        return (f) ((p2k.w) this.f276942b.Q.getValue()).f232500c.get();
                }
            }
        });
        this.Q = w.y0(new g(this, interactor, 11));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: u3k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsCountryChooserScreen f276942b;

            {
                this.f276942b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsCountryChooserScreen.S;
                        PaymentsCountryChooserScreen paymentsCountryChooserScreen = this.f276942b;
                        return dli.f.a(paymentsCountryChooserScreen, (f) paymentsCountryChooserScreen.R.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), (RowDelegate) paymentsCountryChooserScreen.N.getValue(), (ErrorDelegate) paymentsCountryChooserScreen.O.getValue()), R$id.paymentsCountryChooser_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PaymentsCountryChooserScreen.S;
                        return (f) ((p2k.w) this.f276942b.Q.getValue()).f232500c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((u3k.g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p2k.w) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((o2k.a) value).f221651b;
        PaymentsCountrySelector$InputData paymentsCountrySelector$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(paymentsCountrySelector$InputData.f101971a);
        navBarWithToolbar.setTitle(paymentsCountrySelector$InputData.f101971a, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.remittance_select_destination_search, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59409p.f57337m), null, new tz6.e(this, (Continuation) null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ErrorDelegate) this.O.getValue()).f52226c), null, new c(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
