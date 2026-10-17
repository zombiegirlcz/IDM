package com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountController;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.external.AddExternalAccountControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import h45.b;
import h45.c;
import h45.d;
import h45.i;
import h45.j;
import in0.g;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/loan/autopay/impl/ui/select_account/external/AddExternalAccountController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lh45/i;", "Ldli/a;", "Lh45/j;", "Lno/k;", "Lin0/g;", "feature_credit_loan_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddExternalAccountController extends ViewController<i> implements dli.a, k, g {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AddExternalAccountController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AddExternalAccountControllerContract$InputData K;
    public AnalyticsContext L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public AddExternalAccountController(AddExternalAccountControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.f70294c;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, b.f);
        this.O = w.y0(new h43.b(2));
        this.P = w.y0(new h43.b(3));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: h45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddExternalAccountController f149315b;

            {
                this.f149315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddExternalAccountController addExternalAccountController = this.f149315b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddExternalAccountController.T;
                        phm.a aVar = (phm.a) ue0.e.j(addExternalAccountController.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AddExternalAccountControllerContract$InputData addExternalAccountControllerContract$InputData = addExternalAccountController.K;
                        addExternalAccountControllerContract$InputData.getClass();
                        return new z35.b(cVar, addExternalAccountControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddExternalAccountController.T;
                        return (g) ((z35.b) addExternalAccountController.Q.getValue()).f319165b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddExternalAccountController.T;
                        AddExternalAccountController addExternalAccountController2 = this.f149315b;
                        return dli.f.a(addExternalAccountController2, addExternalAccountController2.d(), v.k((InputTextDelegate) addExternalAccountController2.O.getValue(), (CellDetailsDelegate) addExternalAccountController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: h45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddExternalAccountController f149315b;

            {
                this.f149315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddExternalAccountController addExternalAccountController = this.f149315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddExternalAccountController.T;
                        phm.a aVar = (phm.a) ue0.e.j(addExternalAccountController.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AddExternalAccountControllerContract$InputData addExternalAccountControllerContract$InputData = addExternalAccountController.K;
                        addExternalAccountControllerContract$InputData.getClass();
                        return new z35.b(cVar, addExternalAccountControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddExternalAccountController.T;
                        return (g) ((z35.b) addExternalAccountController.Q.getValue()).f319165b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddExternalAccountController.T;
                        AddExternalAccountController addExternalAccountController2 = this.f149315b;
                        return dli.f.a(addExternalAccountController2, addExternalAccountController2.d(), v.k((InputTextDelegate) addExternalAccountController2.O.getValue(), (CellDetailsDelegate) addExternalAccountController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: h45.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddExternalAccountController f149315b;

            {
                this.f149315b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddExternalAccountController addExternalAccountController = this.f149315b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddExternalAccountController.T;
                        phm.a aVar = (phm.a) ue0.e.j(addExternalAccountController.m2()).a().get(z35.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z35.c.class, " is not found"));
                        }
                        z35.c cVar = ((z35.c) aVar2.b()).f319171j;
                        AddExternalAccountControllerContract$InputData addExternalAccountControllerContract$InputData = addExternalAccountController.K;
                        addExternalAccountControllerContract$InputData.getClass();
                        return new z35.b(cVar, addExternalAccountControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddExternalAccountController.T;
                        return (g) ((z35.b) addExternalAccountController.Q.getValue()).f319165b.get();
                    default:
                        KProperty[] kPropertyArr3 = AddExternalAccountController.T;
                        AddExternalAccountController addExternalAccountController2 = this.f149315b;
                        return dli.f.a(addExternalAccountController2, addExternalAccountController2.d(), v.k((InputTextDelegate) addExternalAccountController2.O.getValue(), (CellDetailsDelegate) addExternalAccountController2.P.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f149318a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f149319b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f149320c);
        largeActionButton.setEnabled(uiState.d);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z35.b) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.O.getValue()).e.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) this.P.getValue()).d), new h45.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final h45.g d() {
        return (h45.g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.d;
    }
}
