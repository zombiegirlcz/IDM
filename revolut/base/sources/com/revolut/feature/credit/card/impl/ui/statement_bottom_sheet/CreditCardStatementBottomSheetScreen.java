package com.revolut.feature.credit.card.impl.ui.statement_bottom_sheet;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import bx4.c;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;
import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountLoadingDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.credit.card.impl.ui.statement_bottom_sheet.CreditCardStatementBottomSheetScreen;
import com.revolut.feature.credit.card.impl.ui.statement_bottom_sheet.CreditCardStatementBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import ep4.b;
import java.util.List;
import jm4.a3;
import jm4.m2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import wv4.d;
import wv4.g;
import xki.e;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_bottom_sheet/CreditCardStatementBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwv4/h;", "Lbx4/c;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementBottomSheetScreen extends ViewController<q> implements a, c, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditCardStatementBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardStatementBottomSheetScreenContract$InputData L;
    public final h M;
    public final Object N;
    public final Object O;
    public final int P;
    public final FullScreenStateDelegate Q;
    public final Object R;

    public CreditCardStatementBottomSheetScreen(CreditCardStatementBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = s.t(this, wv4.b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementBottomSheetScreen f300288b;

            {
                this.f300288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen = this.f300288b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementBottomSheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardStatementBottomSheetScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardStatementBottomSheetScreenContract$InputData creditCardStatementBottomSheetScreenContract$InputData = creditCardStatementBottomSheetScreen.L;
                        creditCardStatementBottomSheetScreenContract$InputData.getClass();
                        return new m2(a3Var, creditCardStatementBottomSheetScreen, creditCardStatementBottomSheetScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementBottomSheetScreen.S;
                        return (g) ((m2) creditCardStatementBottomSheetScreen.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementBottomSheetScreen.S;
                        CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen2 = this.f300288b;
                        return dli.f.a(creditCardStatementBottomSheetScreen2, creditCardStatementBottomSheetScreen2.R2(), d0.E0(v.k(new LinearProgressWithAmountDelegate(), new LinearProgressWithAmountLoadingDelegate(), creditCardStatementBottomSheetScreen2.Q), ((m2) creditCardStatementBottomSheetScreen2.N.getValue()).c().Q()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementBottomSheetScreen f300288b;

            {
                this.f300288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen = this.f300288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementBottomSheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardStatementBottomSheetScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardStatementBottomSheetScreenContract$InputData creditCardStatementBottomSheetScreenContract$InputData = creditCardStatementBottomSheetScreen.L;
                        creditCardStatementBottomSheetScreenContract$InputData.getClass();
                        return new m2(a3Var, creditCardStatementBottomSheetScreen, creditCardStatementBottomSheetScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementBottomSheetScreen.S;
                        return (g) ((m2) creditCardStatementBottomSheetScreen.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementBottomSheetScreen.S;
                        CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen2 = this.f300288b;
                        return dli.f.a(creditCardStatementBottomSheetScreen2, creditCardStatementBottomSheetScreen2.R2(), d0.E0(v.k(new LinearProgressWithAmountDelegate(), new LinearProgressWithAmountLoadingDelegate(), creditCardStatementBottomSheetScreen2.Q), ((m2) creditCardStatementBottomSheetScreen2.N.getValue()).c().Q()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_bottom_sheet_base;
        this.Q = new FullScreenStateDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: wv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementBottomSheetScreen f300288b;

            {
                this.f300288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen = this.f300288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementBottomSheetScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardStatementBottomSheetScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardStatementBottomSheetScreenContract$InputData creditCardStatementBottomSheetScreenContract$InputData = creditCardStatementBottomSheetScreen.L;
                        creditCardStatementBottomSheetScreenContract$InputData.getClass();
                        return new m2(a3Var, creditCardStatementBottomSheetScreen, creditCardStatementBottomSheetScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementBottomSheetScreen.S;
                        return (g) ((m2) creditCardStatementBottomSheetScreen.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementBottomSheetScreen.S;
                        CreditCardStatementBottomSheetScreen creditCardStatementBottomSheetScreen2 = this.f300288b;
                        return dli.f.a(creditCardStatementBottomSheetScreen2, creditCardStatementBottomSheetScreen2.R2(), d0.E0(v.k(new LinearProgressWithAmountDelegate(), new LinearProgressWithAmountLoadingDelegate(), creditCardStatementBottomSheetScreen2.Q), ((m2) creditCardStatementBottomSheetScreen2.N.getValue()).c().Q()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        wv4.h uiState = (wv4.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        List list = uiState.f300292a;
        i iVar = uiState.f300293b;
        bottomSheetControllerBaseRecyclerView.setVisibility(!list.isEmpty() ? 0 : 8);
        ActionFooterView bottomSheetControllerBaseFooterView = d3().f174513b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
        bottomSheetControllerBaseFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174513b.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m2) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174513b.f), new wv4.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174513b.f58955g), new wv4.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new d(this, null), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.c
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
