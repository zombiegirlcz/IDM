package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker;

import afj.s1;
import afj.t1;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import th9.k;
import tkj.b;
import tkj.c;
import tkj.e;
import tkj.f;
import tkj.g;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/contract_type_picker/EsimMobilePlanNumberTransferContractTypePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltkj/e;", "Ldli/a;", "Ltkj/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanNumberTransferContractTypePickerScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanNumberTransferContractTypePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanNumberTransferContractTypePickerScreen(EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = w.y0(new k(25));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferContractTypePickerScreen f271962b;

            {
                this.f271962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen = this.f271962b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen2 = this.f271962b;
                        return dli.f.a(esimMobilePlanNumberTransferContractTypePickerScreen2, (g) esimMobilePlanNumberTransferContractTypePickerScreen2.Q.getValue(), u.c((RowDelegate) esimMobilePlanNumberTransferContractTypePickerScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferContractTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.di.EsimMobilePlanNumberTransferContractTypePickerScreenInjector");
                        s1 s1Var = (s1) ((ukj.a) bVarU2).s().mo3808a(esimMobilePlanNumberTransferContractTypePickerScreen);
                        EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData = esimMobilePlanNumberTransferContractTypePickerScreen.K;
                        switch (s1Var.f4434a) {
                            case 0:
                                esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData.getClass();
                                s1Var.d = esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData.getClass();
                                s1Var.d = esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
                                break;
                        }
                        return (t1) s1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        t1 t1Var = (t1) esimMobilePlanNumberTransferContractTypePickerScreen.P.getValue();
                        switch (t1Var.f4450a) {
                            case 0:
                                return (g) t1Var.d.get();
                            default:
                                return (g) t1Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferContractTypePickerScreen f271962b;

            {
                this.f271962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen = this.f271962b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen2 = this.f271962b;
                        return dli.f.a(esimMobilePlanNumberTransferContractTypePickerScreen2, (g) esimMobilePlanNumberTransferContractTypePickerScreen2.Q.getValue(), u.c((RowDelegate) esimMobilePlanNumberTransferContractTypePickerScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferContractTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.di.EsimMobilePlanNumberTransferContractTypePickerScreenInjector");
                        s1 s1Var = (s1) ((ukj.a) bVarU2).s().mo3808a(esimMobilePlanNumberTransferContractTypePickerScreen);
                        EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData = esimMobilePlanNumberTransferContractTypePickerScreen.K;
                        switch (s1Var.f4434a) {
                            case 0:
                                esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData.getClass();
                                s1Var.d = esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData.getClass();
                                s1Var.d = esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
                                break;
                        }
                        return (t1) s1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        t1 t1Var = (t1) esimMobilePlanNumberTransferContractTypePickerScreen.P.getValue();
                        switch (t1Var.f4450a) {
                            case 0:
                                return (g) t1Var.d.get();
                            default:
                                return (g) t1Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: tkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferContractTypePickerScreen f271962b;

            {
                this.f271962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen = this.f271962b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen2 = this.f271962b;
                        return dli.f.a(esimMobilePlanNumberTransferContractTypePickerScreen2, (g) esimMobilePlanNumberTransferContractTypePickerScreen2.Q.getValue(), u.c((RowDelegate) esimMobilePlanNumberTransferContractTypePickerScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferContractTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.di.EsimMobilePlanNumberTransferContractTypePickerScreenInjector");
                        s1 s1Var = (s1) ((ukj.a) bVarU2).s().mo3808a(esimMobilePlanNumberTransferContractTypePickerScreen);
                        EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData = esimMobilePlanNumberTransferContractTypePickerScreen.K;
                        switch (s1Var.f4434a) {
                            case 0:
                                esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData.getClass();
                                s1Var.d = esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData.getClass();
                                s1Var.d = esimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
                                break;
                        }
                        return (t1) s1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferContractTypePickerScreen.R;
                        t1 t1Var = (t1) esimMobilePlanNumberTransferContractTypePickerScreen.P.getValue();
                        switch (t1Var.f4450a) {
                            case 0:
                                return (g) t1Var.d.get();
                            default:
                                return (g) t1Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t1) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_contract_type_picker_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new c(this, null), 3);
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
