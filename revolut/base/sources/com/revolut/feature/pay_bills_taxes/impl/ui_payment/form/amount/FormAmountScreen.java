package com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.R$id;
import com.revolut.feature.pay_bills_taxes.impl.R$layout;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import je5.n;
import jh9.b;
import jh9.c;
import jh9.d;
import jh9.j;
import jh9.k;
import jh9.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_payment/form/amount/FormAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljh9/j;", "Ldli/a;", "Ljh9/l;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormAmountScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FormAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/pay_bills_taxes/impl/databinding/ScreenApmFormAmountBinding;", 0))};
    public final boolean K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public FormAmountScreen(FormAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_apm_form_amount;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jh9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormAmountScreen f174156b;

            {
                this.f174156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FormAmountScreen formAmountScreen = this.f174156b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FormAmountScreen.S;
                        return (k) ((lf9.e) formAmountScreen.Q.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FormAmountScreen.S;
                        qd0.b bVarN = ((lf9.e) formAmountScreen.Q.getValue()).f194708b.f194734b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = FormAmountScreen.S;
                        FormAmountScreen formAmountScreen2 = this.f174156b;
                        return dli.f.a(formAmountScreen2, formAmountScreen2.d(), v.k((CenteredAmountDelegate) formAmountScreen2.P.getValue(), new RowLoadingDelegate()), R$id.formAmountScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, c.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jh9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormAmountScreen f174156b;

            {
                this.f174156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FormAmountScreen formAmountScreen = this.f174156b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormAmountScreen.S;
                        return (k) ((lf9.e) formAmountScreen.Q.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FormAmountScreen.S;
                        qd0.b bVarN = ((lf9.e) formAmountScreen.Q.getValue()).f194708b.f194734b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = FormAmountScreen.S;
                        FormAmountScreen formAmountScreen2 = this.f174156b;
                        return dli.f.a(formAmountScreen2, formAmountScreen2.d(), v.k((CenteredAmountDelegate) formAmountScreen2.P.getValue(), new RowLoadingDelegate()), R$id.formAmountScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new b(inputData, this));
        this.Q = w.y0(new b(this, inputData));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: jh9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormAmountScreen f174156b;

            {
                this.f174156b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FormAmountScreen formAmountScreen = this.f174156b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FormAmountScreen.S;
                        return (k) ((lf9.e) formAmountScreen.Q.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FormAmountScreen.S;
                        qd0.b bVarN = ((lf9.e) formAmountScreen.Q.getValue()).f194708b.f194734b.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = FormAmountScreen.S;
                        FormAmountScreen formAmountScreen2 = this.f174156b;
                        return dli.f.a(formAmountScreen2, formAmountScreen2.d(), v.k((CenteredAmountDelegate) formAmountScreen2.P.getValue(), new RowLoadingDelegate()), R$id.formAmountScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f160973b.setModel(uiState.f174170b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lf9.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f160974c;
        Continuation continuation = null;
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.pay_bills_taxes_payment_amount_title, null, null, 14));
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithAvatar.f59338a), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160973b.f), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f160973b.f58955g), null, new d(this, continuation, 2), 3);
        ?? r62 = this.P;
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(((CenteredAmountDelegate) r62.getValue()).e.f121375b, ((CenteredAmountDelegate) r62.getValue()).f51966j.f121375b, "merge(...)"), null, new jh9.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((CenteredAmountDelegate) r62.getValue()).f.f121375b, new n(22))), null, new j82.q(this, continuation, 25), 3);
    }

    public final if9.c d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (if9.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
