package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms;

import afj.q1;
import afj.r1;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreenContract$InputData;
import efm.r;
import jii.f;
import jjj.b;
import jjj.c;
import jjj.d;
import jjj.e;
import jjj.h;
import jjj.i;
import jjj.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljjj/h;", "Ldli/a;", "Ljjj/i;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanCancellationTermsScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanCancellationTermsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final EsimMobilePlanCancellationTermsScreenContract$InputData K;
    public final int L;
    public final ao.h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanCancellationTermsScreen(EsimMobilePlanCancellationTermsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = s.t(this, b.f);
        this.N = w.y0(new jj9.b(4));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: jjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationTermsScreen f174997b;

            {
                this.f174997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanCancellationTermsScreen esimMobilePlanCancellationTermsScreen = this.f174997b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCancellationTermsScreen.R;
                        EsimMobilePlanCancellationTermsScreen esimMobilePlanCancellationTermsScreen2 = this.f174997b;
                        return dli.f.a(esimMobilePlanCancellationTermsScreen2, (j) esimMobilePlanCancellationTermsScreen2.Q.getValue(), v.k((LargeActionButtonDelegate) esimMobilePlanCancellationTermsScreen2.N.getValue(), new CellDetailsDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCancellationTermsScreen.R;
                        qji.b bVarU2 = esimMobilePlanCancellationTermsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.di.EsimMobilePlanCancellationTermsScreenInjector");
                        }
                        q1 q1Var = (q1) ((kjj.a) bVarU2).s().mo3808a(esimMobilePlanCancellationTermsScreen);
                        EsimMobilePlanCancellationTermsScreenContract$InputData esimMobilePlanCancellationTermsScreenContract$InputData = esimMobilePlanCancellationTermsScreen.K;
                        switch (q1Var.f4402a) {
                            case 0:
                                esimMobilePlanCancellationTermsScreenContract$InputData.getClass();
                                q1Var.d = esimMobilePlanCancellationTermsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanCancellationTermsScreenContract$InputData.getClass();
                                q1Var.d = esimMobilePlanCancellationTermsScreenContract$InputData;
                                break;
                        }
                        return (r1) q1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCancellationTermsScreen.R;
                        r1 r1Var = (r1) esimMobilePlanCancellationTermsScreen.P.getValue();
                        switch (r1Var.f4419a) {
                            case 0:
                                return (j) r1Var.d.get();
                            default:
                                return (j) r1Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: jjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationTermsScreen f174997b;

            {
                this.f174997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanCancellationTermsScreen esimMobilePlanCancellationTermsScreen = this.f174997b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCancellationTermsScreen.R;
                        EsimMobilePlanCancellationTermsScreen esimMobilePlanCancellationTermsScreen2 = this.f174997b;
                        return dli.f.a(esimMobilePlanCancellationTermsScreen2, (j) esimMobilePlanCancellationTermsScreen2.Q.getValue(), v.k((LargeActionButtonDelegate) esimMobilePlanCancellationTermsScreen2.N.getValue(), new CellDetailsDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCancellationTermsScreen.R;
                        qji.b bVarU2 = esimMobilePlanCancellationTermsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.di.EsimMobilePlanCancellationTermsScreenInjector");
                        }
                        q1 q1Var = (q1) ((kjj.a) bVarU2).s().mo3808a(esimMobilePlanCancellationTermsScreen);
                        EsimMobilePlanCancellationTermsScreenContract$InputData esimMobilePlanCancellationTermsScreenContract$InputData = esimMobilePlanCancellationTermsScreen.K;
                        switch (q1Var.f4402a) {
                            case 0:
                                esimMobilePlanCancellationTermsScreenContract$InputData.getClass();
                                q1Var.d = esimMobilePlanCancellationTermsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanCancellationTermsScreenContract$InputData.getClass();
                                q1Var.d = esimMobilePlanCancellationTermsScreenContract$InputData;
                                break;
                        }
                        return (r1) q1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCancellationTermsScreen.R;
                        r1 r1Var = (r1) esimMobilePlanCancellationTermsScreen.P.getValue();
                        switch (r1Var.f4419a) {
                            case 0:
                                return (j) r1Var.d.get();
                            default:
                                return (j) r1Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: jjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanCancellationTermsScreen f174997b;

            {
                this.f174997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanCancellationTermsScreen esimMobilePlanCancellationTermsScreen = this.f174997b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanCancellationTermsScreen.R;
                        EsimMobilePlanCancellationTermsScreen esimMobilePlanCancellationTermsScreen2 = this.f174997b;
                        return dli.f.a(esimMobilePlanCancellationTermsScreen2, (j) esimMobilePlanCancellationTermsScreen2.Q.getValue(), v.k((LargeActionButtonDelegate) esimMobilePlanCancellationTermsScreen2.N.getValue(), new CellDetailsDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanCancellationTermsScreen.R;
                        qji.b bVarU2 = esimMobilePlanCancellationTermsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.di.EsimMobilePlanCancellationTermsScreenInjector");
                        }
                        q1 q1Var = (q1) ((kjj.a) bVarU2).s().mo3808a(esimMobilePlanCancellationTermsScreen);
                        EsimMobilePlanCancellationTermsScreenContract$InputData esimMobilePlanCancellationTermsScreenContract$InputData = esimMobilePlanCancellationTermsScreen.K;
                        switch (q1Var.f4402a) {
                            case 0:
                                esimMobilePlanCancellationTermsScreenContract$InputData.getClass();
                                q1Var.d = esimMobilePlanCancellationTermsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanCancellationTermsScreenContract$InputData.getClass();
                                q1Var.d = esimMobilePlanCancellationTermsScreenContract$InputData;
                                break;
                        }
                        return (r1) q1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanCancellationTermsScreen.R;
                        r1 r1Var = (r1) esimMobilePlanCancellationTermsScreen.P.getValue();
                        switch (r1Var.f4419a) {
                            case 0:
                                return (j) r1Var.d.get();
                            default:
                                return (j) r1Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((f) value).f174519b;
        e eVar = uiState.f175003b;
        navBarBottomSheet.setHeaderModel(new lw0.a(eVar.f174998a, eVar.f174999b, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r72 = this.N;
        r rVarFilter = ((LargeActionButtonDelegate) r72.getValue()).d.f121375b.filter(new jeg.h(new jj3.a(10), 14));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new c(this, null), 3);
        r rVarFilter2 = ((LargeActionButtonDelegate) r72.getValue()).d.f121375b.filter(new jeg.h(new jj3.a(11), 15));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new d(this, null), 3);
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
