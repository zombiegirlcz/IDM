package com.revolut.feature.credit.card.impl.ui.items.bottom_sheet;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDialog$InputData;
import com.revolut.feature.credit.card.impl.ui.items.bottom_sheet.CreditCardBottomSheetController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import ep4.b;
import jm4.a3;
import jm4.n0;
import jt4.c;
import jt4.e;
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
import zhm.v;
import zl4.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/items/bottom_sheet/CreditCardBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzl4/f;", "Ldli/a;", "Ljt4/c;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardBottomSheetController extends ViewController<f> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditCardBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardDialog$InputData L;
    public final h M;
    public final CellDetailsDelegate N;
    public final CellDetailsActionDelegate O;
    public final FullScreenStateDelegate P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CreditCardBottomSheetController(CreditCardDialog$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = s.t(this, e.f);
        this.N = new CellDetailsDelegate();
        this.O = new CellDetailsActionDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = R$layout.screen_bottom_sheet_base;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: jt4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBottomSheetController f178343b;

            {
                this.f178343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardBottomSheetController creditCardBottomSheetController = this.f178343b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBottomSheetController.U;
                        CreditCardBottomSheetController creditCardBottomSheetController2 = this.f178343b;
                        return dli.f.a(creditCardBottomSheetController2, (a) creditCardBottomSheetController2.T.getValue(), v.k(creditCardBottomSheetController2.N, creditCardBottomSheetController2.O, new CellDetailsLoadingDelegate(), creditCardBottomSheetController2.P), creditCardBottomSheetController2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardDialog$InputData creditCardDialog$InputData = creditCardBottomSheetController.L;
                        creditCardDialog$InputData.getClass();
                        return new n0(a3Var, creditCardDialog$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardBottomSheetController.U;
                        return (a) ((n0) creditCardBottomSheetController.S.getValue()).f176212c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: jt4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBottomSheetController f178343b;

            {
                this.f178343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardBottomSheetController creditCardBottomSheetController = this.f178343b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBottomSheetController.U;
                        CreditCardBottomSheetController creditCardBottomSheetController2 = this.f178343b;
                        return dli.f.a(creditCardBottomSheetController2, (a) creditCardBottomSheetController2.T.getValue(), v.k(creditCardBottomSheetController2.N, creditCardBottomSheetController2.O, new CellDetailsLoadingDelegate(), creditCardBottomSheetController2.P), creditCardBottomSheetController2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardDialog$InputData creditCardDialog$InputData = creditCardBottomSheetController.L;
                        creditCardDialog$InputData.getClass();
                        return new n0(a3Var, creditCardDialog$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardBottomSheetController.U;
                        return (a) ((n0) creditCardBottomSheetController.S.getValue()).f176212c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: jt4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBottomSheetController f178343b;

            {
                this.f178343b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardBottomSheetController creditCardBottomSheetController = this.f178343b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBottomSheetController.U;
                        CreditCardBottomSheetController creditCardBottomSheetController2 = this.f178343b;
                        return dli.f.a(creditCardBottomSheetController2, (a) creditCardBottomSheetController2.T.getValue(), v.k(creditCardBottomSheetController2.N, creditCardBottomSheetController2.O, new CellDetailsLoadingDelegate(), creditCardBottomSheetController2.P), creditCardBottomSheetController2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBottomSheetController.U;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardBottomSheetController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardDialog$InputData creditCardDialog$InputData = creditCardBottomSheetController.L;
                        creditCardDialog$InputData.getClass();
                        return new n0(a3Var, creditCardDialog$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardBottomSheetController.U;
                        return (a) ((n0) creditCardBottomSheetController.S.getValue()).f176212c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarBottomSheet navBarBottomSheet = d3().f174514c;
        lw0.m mVar = uiState.f178339a;
        i iVar = uiState.f178340b;
        navBarBottomSheet.setHeaderModel(mVar);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(!uiState.f178341c.isEmpty() ? 0 : 8);
        ActionFooterView bottomSheetControllerBaseFooterView = d3().f174513b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
        bottomSheetControllerBaseFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            ActionFooterView bottomSheetControllerBaseFooterView2 = d3().f174513b;
            Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView2, "bottomSheetControllerBaseFooterView");
            bottomSheetControllerBaseFooterView2.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jt4.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        vkm.f fVarJ = vkm.q.J(rd0.e.b(d3().f174513b.f), rd0.e.b(d3().f174513b.f58955g));
        yx4.a aVar = yx4.b.Companion;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, new ay4.f(fVarJ, aVar, 12), null, new jt4.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new ay4.f(vkm.q.J(rd0.e.b(this.N.d), rd0.e.b(this.P.f52371h.f121375b)), aVar, 13), null, new jt4.h(this, continuation, 1), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
