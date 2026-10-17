package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install;

import afj.e3;
import afj.f3;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreenContract$InputData;
import hl7.ma;
import hnj.b;
import hnj.c;
import hnj.e;
import hnj.f;
import java.util.List;
import kotlin.Lazy;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_install/EsimInstallBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lhnj/e;", "Lcli/k;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimInstallBottomSheetScreen extends BaseBottomSheetRecyclerController<e, k> {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(EsimInstallBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final EsimInstallBottomSheetScreenContract$InputData Q;
    public final h R;
    public final Object S;
    public final List T;
    public final Object U;
    public final Object V;

    public EsimInstallBottomSheetScreen(EsimInstallBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        Lazy lazyY0 = w.y0(new ma(2));
        this.S = lazyY0;
        this.T = u.c((RowDelegate) lazyY0.getValue());
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: hnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimInstallBottomSheetScreen f154123b;

            {
                this.f154123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimInstallBottomSheetScreen esimInstallBottomSheetScreen = this.f154123b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimInstallBottomSheetScreen.W;
                        qji.b bVarU2 = esimInstallBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.di.EsimInstallBottomSheetScreenInjector");
                        e3 e3Var = (e3) ((inj.a) bVarU2).A().mo3808a(esimInstallBottomSheetScreen);
                        EsimInstallBottomSheetScreenContract$InputData esimInstallBottomSheetScreenContract$InputData = esimInstallBottomSheetScreen.Q;
                        switch (e3Var.f4226a) {
                            case 0:
                                esimInstallBottomSheetScreenContract$InputData.getClass();
                                e3Var.d = esimInstallBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimInstallBottomSheetScreenContract$InputData.getClass();
                                e3Var.d = esimInstallBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimInstallBottomSheetScreenContract$InputData.getClass();
                                e3Var.d = esimInstallBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (f3) e3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimInstallBottomSheetScreen.W;
                        f3 f3Var = (f3) esimInstallBottomSheetScreen.U.getValue();
                        switch (f3Var.f4245a) {
                            case 0:
                                return (f) f3Var.d.get();
                            case 1:
                                return (f) f3Var.d.get();
                            default:
                                return (f) f3Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: hnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimInstallBottomSheetScreen f154123b;

            {
                this.f154123b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimInstallBottomSheetScreen esimInstallBottomSheetScreen = this.f154123b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimInstallBottomSheetScreen.W;
                        qji.b bVarU2 = esimInstallBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.di.EsimInstallBottomSheetScreenInjector");
                        e3 e3Var = (e3) ((inj.a) bVarU2).A().mo3808a(esimInstallBottomSheetScreen);
                        EsimInstallBottomSheetScreenContract$InputData esimInstallBottomSheetScreenContract$InputData = esimInstallBottomSheetScreen.Q;
                        switch (e3Var.f4226a) {
                            case 0:
                                esimInstallBottomSheetScreenContract$InputData.getClass();
                                e3Var.d = esimInstallBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimInstallBottomSheetScreenContract$InputData.getClass();
                                e3Var.d = esimInstallBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimInstallBottomSheetScreenContract$InputData.getClass();
                                e3Var.d = esimInstallBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (f3) e3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimInstallBottomSheetScreen.W;
                        f3 f3Var = (f3) esimInstallBottomSheetScreen.U.getValue();
                        switch (f3Var.f4245a) {
                            case 0:
                                return (f) f3Var.d.get();
                            case 1:
                                return (f) f3Var.d.get();
                            default:
                                return (f) f3Var.d.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f3) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new hbg.h(this, null, 16), 3);
        a.g2(this, rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
