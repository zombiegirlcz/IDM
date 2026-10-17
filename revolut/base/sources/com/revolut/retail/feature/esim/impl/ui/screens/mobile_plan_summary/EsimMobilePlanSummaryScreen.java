package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary;

import afj.o2;
import afj.q2;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$InputData;
import jii.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pj9.n;
import pmj.b;
import pmj.c;
import pmj.d;
import pmj.i;
import pmj.j;
import pmj.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_summary/EsimMobilePlanSummaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpmj/k;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanSummaryScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EsimMobilePlanSummaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final EsimMobilePlanSummaryScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public EsimMobilePlanSummaryScreen(EsimMobilePlanSummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = s.t(this, c.f);
        this.N = w.y0(new pka.c(19));
        this.O = w.y0(new pka.c(20));
        this.P = w.y0(new pka.c(21));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: pmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanSummaryScreen f237596b;

            {
                this.f237596b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen = this.f237596b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanSummaryScreen.T;
                        EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen2 = this.f237596b;
                        return dli.f.a(esimMobilePlanSummaryScreen2, esimMobilePlanSummaryScreen2.d(), v.k((CellDetailsDelegate) esimMobilePlanSummaryScreen2.N.getValue(), (ListSubheaderDelegate) esimMobilePlanSummaryScreen2.P.getValue(), (CellDetailsActionDelegate) esimMobilePlanSummaryScreen2.O.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanSummaryScreen.T;
                        qji.b bVarU2 = esimMobilePlanSummaryScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.di.EsimMobilePlanSummaryScreenInjector");
                        }
                        o2 o2Var = (o2) ((qmj.a) bVarU2).y().mo3808a(esimMobilePlanSummaryScreen);
                        EsimMobilePlanSummaryScreenContract$InputData esimMobilePlanSummaryScreenContract$InputData = esimMobilePlanSummaryScreen.K;
                        switch (o2Var.f4375a) {
                            case 0:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                        }
                        return (q2) o2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanSummaryScreen.T;
                        q2 q2Var = (q2) esimMobilePlanSummaryScreen.R.getValue();
                        switch (q2Var.f4405a) {
                            case 0:
                                return (j) q2Var.d.get();
                            case 1:
                                return (j) q2Var.d.get();
                            default:
                                return (j) q2Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: pmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanSummaryScreen f237596b;

            {
                this.f237596b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen = this.f237596b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanSummaryScreen.T;
                        EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen2 = this.f237596b;
                        return dli.f.a(esimMobilePlanSummaryScreen2, esimMobilePlanSummaryScreen2.d(), v.k((CellDetailsDelegate) esimMobilePlanSummaryScreen2.N.getValue(), (ListSubheaderDelegate) esimMobilePlanSummaryScreen2.P.getValue(), (CellDetailsActionDelegate) esimMobilePlanSummaryScreen2.O.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanSummaryScreen.T;
                        qji.b bVarU2 = esimMobilePlanSummaryScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.di.EsimMobilePlanSummaryScreenInjector");
                        }
                        o2 o2Var = (o2) ((qmj.a) bVarU2).y().mo3808a(esimMobilePlanSummaryScreen);
                        EsimMobilePlanSummaryScreenContract$InputData esimMobilePlanSummaryScreenContract$InputData = esimMobilePlanSummaryScreen.K;
                        switch (o2Var.f4375a) {
                            case 0:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                        }
                        return (q2) o2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanSummaryScreen.T;
                        q2 q2Var = (q2) esimMobilePlanSummaryScreen.R.getValue();
                        switch (q2Var.f4405a) {
                            case 0:
                                return (j) q2Var.d.get();
                            case 1:
                                return (j) q2Var.d.get();
                            default:
                                return (j) q2Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: pmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanSummaryScreen f237596b;

            {
                this.f237596b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen = this.f237596b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanSummaryScreen.T;
                        EsimMobilePlanSummaryScreen esimMobilePlanSummaryScreen2 = this.f237596b;
                        return dli.f.a(esimMobilePlanSummaryScreen2, esimMobilePlanSummaryScreen2.d(), v.k((CellDetailsDelegate) esimMobilePlanSummaryScreen2.N.getValue(), (ListSubheaderDelegate) esimMobilePlanSummaryScreen2.P.getValue(), (CellDetailsActionDelegate) esimMobilePlanSummaryScreen2.O.getValue()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanSummaryScreen.T;
                        qji.b bVarU2 = esimMobilePlanSummaryScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.di.EsimMobilePlanSummaryScreenInjector");
                        }
                        o2 o2Var = (o2) ((qmj.a) bVarU2).y().mo3808a(esimMobilePlanSummaryScreen);
                        EsimMobilePlanSummaryScreenContract$InputData esimMobilePlanSummaryScreenContract$InputData = esimMobilePlanSummaryScreen.K;
                        switch (o2Var.f4375a) {
                            case 0:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanSummaryScreenContract$InputData.getClass();
                                o2Var.d = esimMobilePlanSummaryScreenContract$InputData;
                                break;
                        }
                        return (q2) o2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanSummaryScreen.T;
                        q2 q2Var = (q2) esimMobilePlanSummaryScreen.R.getValue();
                        switch (q2Var.f4405a) {
                            case 0:
                                return (j) q2Var.d.get();
                            case 1:
                                return (j) q2Var.d.get();
                            default:
                                return (j) q2Var.d.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((f) value).f174519b;
        i iVar = uiState.f237605b;
        navBarBottomSheet.setHeaderModel(new lw0.a(iVar.f237602a, iVar.f237603b, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q2) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((CellDetailsActionDelegate) this.O.getValue()).d, new n(29))), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((ListSubheaderDelegate) this.P.getValue()).d, new b(0))), null, new pmj.e(this, null), 3);
        ?? r62 = this.N;
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((CellDetailsDelegate) r62.getValue()).e, new b(i))), null, new d(this, continuation, i), 3);
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((CellDetailsDelegate) r62.getValue()).d, new b(i2))), null, new d(this, continuation, i2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
