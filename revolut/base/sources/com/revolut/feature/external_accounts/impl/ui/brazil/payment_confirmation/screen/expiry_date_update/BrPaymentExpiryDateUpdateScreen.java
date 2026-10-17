package com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hba.k;
import hk6.b;
import hk6.c;
import hk6.d;
import hk6.f;
import hk6.g;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.g3;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/screen/expiry_date_update/BrPaymentExpiryDateUpdateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/payment_confirmation/screen/expiry_date_update/BrPaymentExpiryDateUpdateScreenContract$OutputData;", "Ldli/a;", "Lhk6/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrPaymentExpiryDateUpdateScreen extends ViewController<BrPaymentExpiryDateUpdateScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BrPaymentExpiryDateUpdateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final BrPaymentExpiryDateUpdateScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final InputChecklistDelegate P;
    public final DatePickerDelegate Q;
    public final Object R;

    public BrPaymentExpiryDateUpdateScreen(BrPaymentExpiryDateUpdateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentExpiryDateUpdateScreen f152851b;

            {
                this.f152851b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen = this.f152851b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrPaymentExpiryDateUpdateScreen.S;
                        qji.b bVarU2 = brPaymentExpiryDateUpdateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.di.BrPaymentExpiryDateUpdateScreenInjector");
                        xf6.k kVar = (xf6.k) ((ik6.a) bVarU2).j().mo3808a(brPaymentExpiryDateUpdateScreen);
                        BrPaymentExpiryDateUpdateScreenContract$InputData brPaymentExpiryDateUpdateScreenContract$InputData = brPaymentExpiryDateUpdateScreen.K;
                        switch (kVar.f304907a) {
                            case 0:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                            case 1:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                            default:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                        }
                        return (g3) kVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrPaymentExpiryDateUpdateScreen.S;
                        g3 g3Var = (g3) brPaymentExpiryDateUpdateScreen.N.getValue();
                        switch (g3Var.f304865a) {
                            case 0:
                                return (f) g3Var.d.get();
                            case 1:
                                return (f) g3Var.d.get();
                            default:
                                return (f) g3Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BrPaymentExpiryDateUpdateScreen.S;
                        BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen2 = this.f152851b;
                        return dli.f.a(brPaymentExpiryDateUpdateScreen2, brPaymentExpiryDateUpdateScreen2.R2(), v.k(brPaymentExpiryDateUpdateScreen2.P, brPaymentExpiryDateUpdateScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentExpiryDateUpdateScreen f152851b;

            {
                this.f152851b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen = this.f152851b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrPaymentExpiryDateUpdateScreen.S;
                        qji.b bVarU2 = brPaymentExpiryDateUpdateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.di.BrPaymentExpiryDateUpdateScreenInjector");
                        xf6.k kVar = (xf6.k) ((ik6.a) bVarU2).j().mo3808a(brPaymentExpiryDateUpdateScreen);
                        BrPaymentExpiryDateUpdateScreenContract$InputData brPaymentExpiryDateUpdateScreenContract$InputData = brPaymentExpiryDateUpdateScreen.K;
                        switch (kVar.f304907a) {
                            case 0:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                            case 1:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                            default:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                        }
                        return (g3) kVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrPaymentExpiryDateUpdateScreen.S;
                        g3 g3Var = (g3) brPaymentExpiryDateUpdateScreen.N.getValue();
                        switch (g3Var.f304865a) {
                            case 0:
                                return (f) g3Var.d.get();
                            case 1:
                                return (f) g3Var.d.get();
                            default:
                                return (f) g3Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BrPaymentExpiryDateUpdateScreen.S;
                        BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen2 = this.f152851b;
                        return dli.f.a(brPaymentExpiryDateUpdateScreen2, brPaymentExpiryDateUpdateScreen2.R2(), v.k(brPaymentExpiryDateUpdateScreen2.P, brPaymentExpiryDateUpdateScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new InputChecklistDelegate();
        this.Q = new DatePickerDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: hk6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentExpiryDateUpdateScreen f152851b;

            {
                this.f152851b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen = this.f152851b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrPaymentExpiryDateUpdateScreen.S;
                        qji.b bVarU2 = brPaymentExpiryDateUpdateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.di.BrPaymentExpiryDateUpdateScreenInjector");
                        xf6.k kVar = (xf6.k) ((ik6.a) bVarU2).j().mo3808a(brPaymentExpiryDateUpdateScreen);
                        BrPaymentExpiryDateUpdateScreenContract$InputData brPaymentExpiryDateUpdateScreenContract$InputData = brPaymentExpiryDateUpdateScreen.K;
                        switch (kVar.f304907a) {
                            case 0:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                            case 1:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                            default:
                                brPaymentExpiryDateUpdateScreenContract$InputData.getClass();
                                kVar.f304909c = brPaymentExpiryDateUpdateScreenContract$InputData;
                                break;
                        }
                        return (g3) kVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrPaymentExpiryDateUpdateScreen.S;
                        g3 g3Var = (g3) brPaymentExpiryDateUpdateScreen.N.getValue();
                        switch (g3Var.f304865a) {
                            case 0:
                                return (f) g3Var.d.get();
                            case 1:
                                return (f) g3Var.d.get();
                            default:
                                return (f) g3Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = BrPaymentExpiryDateUpdateScreen.S;
                        BrPaymentExpiryDateUpdateScreen brPaymentExpiryDateUpdateScreen2 = this.f152851b;
                        return dli.f.a(brPaymentExpiryDateUpdateScreen2, brPaymentExpiryDateUpdateScreen2.R2(), v.k(brPaymentExpiryDateUpdateScreen2.P, brPaymentExpiryDateUpdateScreen2.Q), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f152855b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g3) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Clause textLocalisedClause = this.K.f72714b;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.open_finance_payment_authorization_end_date_update_title, null, null, 14);
        }
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.open_finance_payment_authorization_edit_consent_end_date_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGreyTone50);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52518c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52176c.f121375b), new k(this, (Continuation) null, 22), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.O.getValue();
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
}
