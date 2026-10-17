package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info;

import afj.g3;
import afj.h3;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.EsimRefundInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.EsimRefundInfoBottomSheetScreenContract$InputData;
import fnj.c;
import fnj.g;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/EsimRefundInfoBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/a;", "Ldli/a;", "Lfnj/g;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimRefundInfoBottomSheetScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimRefundInfoBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final EsimRefundInfoBottomSheetScreenContract$InputData K;
    public final int L;
    public final TwinHorizontalButtonDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public EsimRefundInfoBottomSheetScreen(EsimRefundInfoBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = new TwinHorizontalButtonDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundInfoBottomSheetScreen f136688b;

            {
                this.f136688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimRefundInfoBottomSheetScreen esimRefundInfoBottomSheetScreen = this.f136688b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundInfoBottomSheetScreen.R;
                        EsimRefundInfoBottomSheetScreen esimRefundInfoBottomSheetScreen2 = this.f136688b;
                        return dli.f.a(esimRefundInfoBottomSheetScreen2, (f) esimRefundInfoBottomSheetScreen2.Q.getValue(), u.c(esimRefundInfoBottomSheetScreen2.M), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundInfoBottomSheetScreen.R;
                        qji.b bVarU2 = esimRefundInfoBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.di.EsimInfoBottomSheetScreenInjector");
                        g3 g3Var = (g3) ((gnj.a) bVarU2).b().mo3808a(esimRefundInfoBottomSheetScreen);
                        EsimRefundInfoBottomSheetScreenContract$InputData esimRefundInfoBottomSheetScreenContract$InputData = esimRefundInfoBottomSheetScreen.K;
                        switch (g3Var.f4260a) {
                            case 0:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (h3) g3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundInfoBottomSheetScreen.R;
                        h3 h3Var = (h3) esimRefundInfoBottomSheetScreen.P.getValue();
                        switch (h3Var.f4275a) {
                            case 0:
                                return (f) h3Var.d.get();
                            case 1:
                                return (f) h3Var.d.get();
                            default:
                                return (f) h3Var.d.get();
                        }
                }
            }
        });
        this.O = s.t(this, fnj.b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundInfoBottomSheetScreen f136688b;

            {
                this.f136688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimRefundInfoBottomSheetScreen esimRefundInfoBottomSheetScreen = this.f136688b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundInfoBottomSheetScreen.R;
                        EsimRefundInfoBottomSheetScreen esimRefundInfoBottomSheetScreen2 = this.f136688b;
                        return dli.f.a(esimRefundInfoBottomSheetScreen2, (f) esimRefundInfoBottomSheetScreen2.Q.getValue(), u.c(esimRefundInfoBottomSheetScreen2.M), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundInfoBottomSheetScreen.R;
                        qji.b bVarU2 = esimRefundInfoBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.di.EsimInfoBottomSheetScreenInjector");
                        g3 g3Var = (g3) ((gnj.a) bVarU2).b().mo3808a(esimRefundInfoBottomSheetScreen);
                        EsimRefundInfoBottomSheetScreenContract$InputData esimRefundInfoBottomSheetScreenContract$InputData = esimRefundInfoBottomSheetScreen.K;
                        switch (g3Var.f4260a) {
                            case 0:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (h3) g3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundInfoBottomSheetScreen.R;
                        h3 h3Var = (h3) esimRefundInfoBottomSheetScreen.P.getValue();
                        switch (h3Var.f4275a) {
                            case 0:
                                return (f) h3Var.d.get();
                            case 1:
                                return (f) h3Var.d.get();
                            default:
                                return (f) h3Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundInfoBottomSheetScreen f136688b;

            {
                this.f136688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimRefundInfoBottomSheetScreen esimRefundInfoBottomSheetScreen = this.f136688b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundInfoBottomSheetScreen.R;
                        EsimRefundInfoBottomSheetScreen esimRefundInfoBottomSheetScreen2 = this.f136688b;
                        return dli.f.a(esimRefundInfoBottomSheetScreen2, (f) esimRefundInfoBottomSheetScreen2.Q.getValue(), u.c(esimRefundInfoBottomSheetScreen2.M), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundInfoBottomSheetScreen.R;
                        qji.b bVarU2 = esimRefundInfoBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info.di.EsimInfoBottomSheetScreenInjector");
                        g3 g3Var = (g3) ((gnj.a) bVarU2).b().mo3808a(esimRefundInfoBottomSheetScreen);
                        EsimRefundInfoBottomSheetScreenContract$InputData esimRefundInfoBottomSheetScreenContract$InputData = esimRefundInfoBottomSheetScreen.K;
                        switch (g3Var.f4260a) {
                            case 0:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimRefundInfoBottomSheetScreenContract$InputData.getClass();
                                g3Var.d = esimRefundInfoBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (h3) g3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundInfoBottomSheetScreen.R;
                        h3 h3Var = (h3) esimRefundInfoBottomSheetScreen.P.getValue();
                        switch (h3Var.f4275a) {
                            case 0:
                                return (f) h3Var.d.get();
                            case 1:
                                return (f) h3Var.d.get();
                            default:
                                return (f) h3Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((f) value).f174519b.setHeaderModel(uiState.f136690a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h3) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (fnj.f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new c(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
