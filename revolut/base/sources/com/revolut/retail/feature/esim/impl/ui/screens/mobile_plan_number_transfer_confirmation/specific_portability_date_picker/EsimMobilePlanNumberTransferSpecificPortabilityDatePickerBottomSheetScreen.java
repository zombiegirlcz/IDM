package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker;

import afj.y2;
import afj.z2;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import ve7.i;
import vfg.m;
import vlj.b;
import vlj.c;
import vlj.d;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/specific_portability_date_picker/EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvlj/c;", "Ldli/a;", "Lvlj/d;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen(EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = w.y0(new i(26));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: vlj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen f290475b;

            {
                this.f290475b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen = this.f290475b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2 = this.f290475b;
                        return dli.f.a(esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2, (e) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2.Q.getValue(), u.c((DatePickerDelegate) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.di.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenInjector");
                        y2 y2Var = (y2) ((wlj.a) bVarU2).q().mo3808a(esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen);
                        EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.K;
                        switch (y2Var.f4541a) {
                            case 0:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (z2) y2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        z2 z2Var = (z2) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.P.getValue();
                        switch (z2Var.f4555a) {
                            case 0:
                                return (e) z2Var.d.get();
                            case 1:
                                return (e) z2Var.d.get();
                            default:
                                return (e) z2Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vlj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen f290475b;

            {
                this.f290475b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen = this.f290475b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2 = this.f290475b;
                        return dli.f.a(esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2, (e) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2.Q.getValue(), u.c((DatePickerDelegate) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.di.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenInjector");
                        y2 y2Var = (y2) ((wlj.a) bVarU2).q().mo3808a(esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen);
                        EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.K;
                        switch (y2Var.f4541a) {
                            case 0:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (z2) y2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        z2 z2Var = (z2) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.P.getValue();
                        switch (z2Var.f4555a) {
                            case 0:
                                return (e) z2Var.d.get();
                            case 1:
                                return (e) z2Var.d.get();
                            default:
                                return (e) z2Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: vlj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen f290475b;

            {
                this.f290475b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen = this.f290475b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2 = this.f290475b;
                        return dli.f.a(esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2, (e) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2.Q.getValue(), u.c((DatePickerDelegate) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.di.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenInjector");
                        y2 y2Var = (y2) ((wlj.a) bVarU2).q().mo3808a(esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen);
                        EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.K;
                        switch (y2Var.f4541a) {
                            case 0:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.getClass();
                                y2Var.d = esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (z2) y2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.R;
                        z2 z2Var = (z2) esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen.P.getValue();
                        switch (z2Var.f4555a) {
                            case 0:
                                return (e) z2Var.d.get();
                            case 1:
                                return (e) z2Var.d.get();
                            default:
                                return (e) z2Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f290478b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z2) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vlj.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((DatePickerDelegate) this.N.getValue()).f52176c.f121375b), null, new m(this, null, 12), 3);
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
