package com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info;

import afj.a1;
import afj.z0;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.EsimAutoRenewalInfoScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.EsimAutoRenewalInfoScreenContract$InputData;
import dli.a;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wgj.b;
import wgj.c;
import wgj.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/auto_renewal_info/EsimAutoRenewalInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwgj/e;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimAutoRenewalInfoScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimAutoRenewalInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final EsimAutoRenewalInfoScreenContract$InputData K;
    public final int L;
    public final h M;
    public final LargeActionButtonDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimAutoRenewalInfoScreen(EsimAutoRenewalInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = s.t(this, b.f);
        this.N = new LargeActionButtonDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: wgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimAutoRenewalInfoScreen f297326b;

            {
                this.f297326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimAutoRenewalInfoScreen esimAutoRenewalInfoScreen = this.f297326b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimAutoRenewalInfoScreen.R;
                        EsimAutoRenewalInfoScreen esimAutoRenewalInfoScreen2 = this.f297326b;
                        return dli.f.a(esimAutoRenewalInfoScreen2, (f) esimAutoRenewalInfoScreen2.Q.getValue(), v.k(new ListCellDelegate(), new RowLoadingDelegate(), esimAutoRenewalInfoScreen2.N, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimAutoRenewalInfoScreen.R;
                        qji.b bVarU2 = esimAutoRenewalInfoScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.di.EsimAutoRenewalInfoScreenInjector");
                        }
                        z0 z0Var = (z0) ((xgj.a) bVarU2).H().mo3808a(esimAutoRenewalInfoScreen);
                        EsimAutoRenewalInfoScreenContract$InputData esimAutoRenewalInfoScreenContract$InputData = esimAutoRenewalInfoScreen.K;
                        switch (z0Var.f4547a) {
                            case 0:
                                esimAutoRenewalInfoScreenContract$InputData.getClass();
                                z0Var.d = esimAutoRenewalInfoScreenContract$InputData;
                                break;
                            default:
                                esimAutoRenewalInfoScreenContract$InputData.getClass();
                                z0Var.d = esimAutoRenewalInfoScreenContract$InputData;
                                break;
                        }
                        return (a1) z0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimAutoRenewalInfoScreen.R;
                        a1 a1Var = (a1) esimAutoRenewalInfoScreen.P.getValue();
                        switch (a1Var.f4111a) {
                            case 0:
                                return (f) a1Var.d.get();
                            default:
                                return (f) a1Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimAutoRenewalInfoScreen f297326b;

            {
                this.f297326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimAutoRenewalInfoScreen esimAutoRenewalInfoScreen = this.f297326b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimAutoRenewalInfoScreen.R;
                        EsimAutoRenewalInfoScreen esimAutoRenewalInfoScreen2 = this.f297326b;
                        return dli.f.a(esimAutoRenewalInfoScreen2, (f) esimAutoRenewalInfoScreen2.Q.getValue(), v.k(new ListCellDelegate(), new RowLoadingDelegate(), esimAutoRenewalInfoScreen2.N, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimAutoRenewalInfoScreen.R;
                        qji.b bVarU2 = esimAutoRenewalInfoScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.di.EsimAutoRenewalInfoScreenInjector");
                        }
                        z0 z0Var = (z0) ((xgj.a) bVarU2).H().mo3808a(esimAutoRenewalInfoScreen);
                        EsimAutoRenewalInfoScreenContract$InputData esimAutoRenewalInfoScreenContract$InputData = esimAutoRenewalInfoScreen.K;
                        switch (z0Var.f4547a) {
                            case 0:
                                esimAutoRenewalInfoScreenContract$InputData.getClass();
                                z0Var.d = esimAutoRenewalInfoScreenContract$InputData;
                                break;
                            default:
                                esimAutoRenewalInfoScreenContract$InputData.getClass();
                                z0Var.d = esimAutoRenewalInfoScreenContract$InputData;
                                break;
                        }
                        return (a1) z0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimAutoRenewalInfoScreen.R;
                        a1 a1Var = (a1) esimAutoRenewalInfoScreen.P.getValue();
                        switch (a1Var.f4111a) {
                            case 0:
                                return (f) a1Var.d.get();
                            default:
                                return (f) a1Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wgj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimAutoRenewalInfoScreen f297326b;

            {
                this.f297326b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimAutoRenewalInfoScreen esimAutoRenewalInfoScreen = this.f297326b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimAutoRenewalInfoScreen.R;
                        EsimAutoRenewalInfoScreen esimAutoRenewalInfoScreen2 = this.f297326b;
                        return dli.f.a(esimAutoRenewalInfoScreen2, (f) esimAutoRenewalInfoScreen2.Q.getValue(), v.k(new ListCellDelegate(), new RowLoadingDelegate(), esimAutoRenewalInfoScreen2.N, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new LargeActionButtonLoadingDelegate()), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimAutoRenewalInfoScreen.R;
                        qji.b bVarU2 = esimAutoRenewalInfoScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.auto_renewal_info.di.EsimAutoRenewalInfoScreenInjector");
                        }
                        z0 z0Var = (z0) ((xgj.a) bVarU2).H().mo3808a(esimAutoRenewalInfoScreen);
                        EsimAutoRenewalInfoScreenContract$InputData esimAutoRenewalInfoScreenContract$InputData = esimAutoRenewalInfoScreen.K;
                        switch (z0Var.f4547a) {
                            case 0:
                                esimAutoRenewalInfoScreenContract$InputData.getClass();
                                z0Var.d = esimAutoRenewalInfoScreenContract$InputData;
                                break;
                            default:
                                esimAutoRenewalInfoScreenContract$InputData.getClass();
                                z0Var.d = esimAutoRenewalInfoScreenContract$InputData;
                                break;
                        }
                        return (a1) z0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimAutoRenewalInfoScreen.R;
                        a1 a1Var = (a1) esimAutoRenewalInfoScreen.P.getValue();
                        switch (a1Var.f4111a) {
                            case 0:
                                return (f) a1Var.d.get();
                            default:
                                return (f) a1Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TextClause textClause = uiState.f297328a;
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((f) value).f174519b.setHeaderModel(new lw0.a(textClause, null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wgj.f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
