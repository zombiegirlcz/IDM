package com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PdfDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.impl.R$id;
import com.revolut.feature.bank_account_switching.impl.R$layout;
import com.revolut.feature.bank_account_switching.impl.ui.terms_and_conditions.TermsAndConditionsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.ui_kit_pdf.PdfView;
import dli.a;
import ghk.t;
import gq2.b;
import gq2.c;
import gq2.d;
import gq2.i;
import gq2.j;
import gq2.k;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vn2.d0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/terms_and_conditions/TermsAndConditionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgq2/i;", "Ldli/a;", "Lgq2/k;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TermsAndConditionsScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TermsAndConditionsScreen.class, "binding", "getBinding()Lcom/revolut/feature/bank_account_switching/impl/databinding/ScreenBankAccountSwitchingTermsAndConditionsBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;

    public TermsAndConditionsScreen(TermsAndConditionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_bank_account_switching_terms_and_conditions;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gq2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsAndConditionsScreen f145518b;

            {
                this.f145518b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TermsAndConditionsScreen.P;
                        TermsAndConditionsScreen termsAndConditionsScreen = this.f145518b;
                        return dli.f.a(termsAndConditionsScreen, (j) termsAndConditionsScreen.N.getValue(), v.k(new FullScreenDocumentLoadingDelegate(), new PlainTextLoadingDelegate(), new WebViewDelegate(), new PdfDelegate(), new FullScreenStateDelegate()), R$id.bankAccountSwitchingTermsAndConditions_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TermsAndConditionsScreen.P;
                        return (j) ((d0) this.f145518b.M.getValue()).f290654c.get();
                }
            }
        });
        this.M = w.y0(new t(this, inputData, 15));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gq2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TermsAndConditionsScreen f145518b;

            {
                this.f145518b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TermsAndConditionsScreen.P;
                        TermsAndConditionsScreen termsAndConditionsScreen = this.f145518b;
                        return dli.f.a(termsAndConditionsScreen, (j) termsAndConditionsScreen.N.getValue(), v.k(new FullScreenDocumentLoadingDelegate(), new PlainTextLoadingDelegate(), new WebViewDelegate(), new PdfDelegate(), new FullScreenStateDelegate()), R$id.bankAccountSwitchingTermsAndConditions_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TermsAndConditionsScreen.P;
                        return (j) ((d0) this.f145518b.M.getValue()).f290654c.get();
                }
            }
        });
        this.O = s.t(this, c.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f264476c;
        TextClause textClause = uiState.f145532b;
        File file = uiState.e;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        Clause clause = uiState.f145533c;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
        if (file != null) {
            PdfView bankAccountSwitchingTermsAndConditionsPdfView = d3().d;
            Intrinsics.checkNotNullExpressionValue(bankAccountSwitchingTermsAndConditionsPdfView, "bankAccountSwitchingTermsAndConditionsPdfView");
            bankAccountSwitchingTermsAndConditionsPdfView.setVisibility(0);
            d3().d.a(new b(this, 0)).d(file);
        } else {
            PdfView bankAccountSwitchingTermsAndConditionsPdfView2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(bankAccountSwitchingTermsAndConditionsPdfView2, "bankAccountSwitchingTermsAndConditionsPdfView");
            bankAccountSwitchingTermsAndConditionsPdfView2.setVisibility(8);
        }
        LargeActionButton largeActionButton = d3().f264475b;
        largeActionButton.setText((Clause) uiState.d);
        largeActionButton.setEnabled(uiState.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f264476c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f264475b.setLoadingButtonTag("ACCEPT_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f264476c.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f264475b.o), null, new d(this, null, 1), 3);
    }

    public final sn2.a d3() {
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (sn2.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
