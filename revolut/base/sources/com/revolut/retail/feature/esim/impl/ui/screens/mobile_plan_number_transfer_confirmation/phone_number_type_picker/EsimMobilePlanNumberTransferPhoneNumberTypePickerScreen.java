package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker;

import afj.s2;
import afj.t2;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
import dli.a;
import dli.c;
import gla.k;
import glj.b;
import glj.e;
import glj.f;
import glj.g;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/phone_number_type_picker/EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lglj/e;", "Ldli/a;", "Lglj/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen(EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = w.y0(new k(2));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: glj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen f144708b;

            {
                this.f144708b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen esimMobilePlanNumberTransferPhoneNumberTypePickerScreen = this.f144708b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2 = this.f144708b;
                        return dli.f.a(esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2, (g) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2.Q.getValue(), u.c((SingleChoiceDelegate) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.di.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenInjector");
                        s2 s2Var = (s2) ((hlj.a) bVarU2).c().mo3808a(esimMobilePlanNumberTransferPhoneNumberTypePickerScreen);
                        EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData = esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.K;
                        switch (s2Var.f4437a) {
                            case 0:
                                esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData.getClass();
                                s2Var.d = esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData.getClass();
                                s2Var.d = esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
                                break;
                        }
                        return (t2) s2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        t2 t2Var = (t2) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.P.getValue();
                        switch (t2Var.f4453a) {
                            case 0:
                                return (g) t2Var.d.get();
                            default:
                                return (g) t2Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: glj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen f144708b;

            {
                this.f144708b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen esimMobilePlanNumberTransferPhoneNumberTypePickerScreen = this.f144708b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2 = this.f144708b;
                        return dli.f.a(esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2, (g) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2.Q.getValue(), u.c((SingleChoiceDelegate) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.di.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenInjector");
                        s2 s2Var = (s2) ((hlj.a) bVarU2).c().mo3808a(esimMobilePlanNumberTransferPhoneNumberTypePickerScreen);
                        EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData = esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.K;
                        switch (s2Var.f4437a) {
                            case 0:
                                esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData.getClass();
                                s2Var.d = esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData.getClass();
                                s2Var.d = esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
                                break;
                        }
                        return (t2) s2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        t2 t2Var = (t2) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.P.getValue();
                        switch (t2Var.f4453a) {
                            case 0:
                                return (g) t2Var.d.get();
                            default:
                                return (g) t2Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: glj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen f144708b;

            {
                this.f144708b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen esimMobilePlanNumberTransferPhoneNumberTypePickerScreen = this.f144708b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2 = this.f144708b;
                        return dli.f.a(esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2, (g) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2.Q.getValue(), u.c((SingleChoiceDelegate) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen2.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        qji.b bVarU2 = esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.di.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenInjector");
                        s2 s2Var = (s2) ((hlj.a) bVarU2).c().mo3808a(esimMobilePlanNumberTransferPhoneNumberTypePickerScreen);
                        EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData = esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.K;
                        switch (s2Var.f4437a) {
                            case 0:
                                esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData.getClass();
                                s2Var.d = esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData.getClass();
                                s2Var.d = esimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
                                break;
                        }
                        return (t2) s2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen.R;
                        t2 t2Var = (t2) esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.P.getValue();
                        switch (t2Var.f4453a) {
                            case 0:
                                return (g) t2Var.d.get();
                            default:
                                return (g) t2Var.d.get();
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
        return (t2) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_phone_number_type_picker_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new g9j.q(rd0.e.b(((SingleChoiceDelegate) this.N.getValue()).p()), 10), null, new gii.b(this, null, 6), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
