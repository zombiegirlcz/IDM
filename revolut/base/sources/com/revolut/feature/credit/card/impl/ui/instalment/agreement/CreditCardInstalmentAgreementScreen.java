package com.revolut.feature.credit.card.impl.ui.instalment.agreement;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.agreement.CreditCardInstalmentAgreementScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import jii.u;
import jm4.a1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rr4.c;
import rr4.k;
import rr4.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/agreement/CreditCardInstalmentAgreementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrr4/k;", "Ldli/a;", "Lrr4/m;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardInstalmentAgreementScreen extends ViewController<k> implements dli.a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditCardInstalmentAgreementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public CreditCardInstalmentAgreementScreen(CreditCardInstalmentAgreementScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new rm0.k(29));
        final int i = 0;
        this.N = w.y0(new rr4.a(0));
        this.O = w.y0(new Function0(this) { // from class: rr4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentAgreementScreen f256682b;

            {
                this.f256682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentAgreementScreen.S;
                        CreditCardInstalmentAgreementScreen creditCardInstalmentAgreementScreen = this.f256682b;
                        return dli.f.a(creditCardInstalmentAgreementScreen, creditCardInstalmentAgreementScreen.R2(), v.k((RowDelegate) creditCardInstalmentAgreementScreen.M.getValue(), (InputChecklistDelegate) creditCardInstalmentAgreementScreen.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentAgreementScreen.S;
                        return (l) ((a1) this.f256682b.Q.getValue()).f175959c.get();
                }
            }
        });
        this.P = s.t(this, c.f);
        this.Q = w.y0(new rgf.b(this, inputData, 18));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: rr4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentAgreementScreen f256682b;

            {
                this.f256682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentAgreementScreen.S;
                        CreditCardInstalmentAgreementScreen creditCardInstalmentAgreementScreen = this.f256682b;
                        return dli.f.a(creditCardInstalmentAgreementScreen, creditCardInstalmentAgreementScreen.R2(), v.k((RowDelegate) creditCardInstalmentAgreementScreen.M.getValue(), (InputChecklistDelegate) creditCardInstalmentAgreementScreen.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentAgreementScreen.S;
                        return (l) ((a1) this.f256682b.Q.getValue()).f175959c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        rr4.m uiState = (rr4.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f256690b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a1) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_instalment_document_agreement_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_instalment_document_agreement_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_card_instalment_document_agreement_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174564b.setText(new TextLocalisedClause(R$string.credit_common_confirm, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new f(vkm.q.J(rd0.e.b(((RowDelegate) this.M.getValue()).f53226s)), yx4.b.Companion, 27), null, new q9c.v(2, R2(), l.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new rr4.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new rr4.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) this.N.getValue()).f52518c), null, new rr4.f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
