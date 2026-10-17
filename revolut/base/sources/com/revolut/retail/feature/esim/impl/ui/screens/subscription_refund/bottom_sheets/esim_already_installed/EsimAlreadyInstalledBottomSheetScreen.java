package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed;

import afj.c3;
import afj.d3;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.EsimAlreadyInstalledBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.EsimAlreadyInstalledBottomSheetScreenContract$InputData;
import dnj.b;
import dnj.c;
import dnj.e;
import dnj.f;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_already_installed/EsimAlreadyInstalledBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ldnj/e;", "Lcli/k;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimAlreadyInstalledBottomSheetScreen extends BaseBottomSheetRecyclerController<e, k> {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(EsimAlreadyInstalledBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final EsimAlreadyInstalledBottomSheetScreenContract$InputData Q;
    public final h R;
    public final Object S;
    public final List T;
    public final Object U;
    public final Object V;

    public EsimAlreadyInstalledBottomSheetScreen(EsimAlreadyInstalledBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        Lazy lazyY0 = w.y0(new dmj.b(3));
        this.S = lazyY0;
        this.T = u.c((TextDelegate) lazyY0.getValue());
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: dnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimAlreadyInstalledBottomSheetScreen f116350b;

            {
                this.f116350b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimAlreadyInstalledBottomSheetScreen esimAlreadyInstalledBottomSheetScreen = this.f116350b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimAlreadyInstalledBottomSheetScreen.W;
                        qji.b bVarU2 = esimAlreadyInstalledBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.di.EsimAlreadyInstalledBottomSheetScreenInjector");
                        c3 c3Var = (c3) ((enj.a) bVarU2).c().mo3808a(esimAlreadyInstalledBottomSheetScreen);
                        EsimAlreadyInstalledBottomSheetScreenContract$InputData esimAlreadyInstalledBottomSheetScreenContract$InputData = esimAlreadyInstalledBottomSheetScreen.Q;
                        switch (c3Var.f4194a) {
                            case 0:
                                esimAlreadyInstalledBottomSheetScreenContract$InputData.getClass();
                                c3Var.d = esimAlreadyInstalledBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimAlreadyInstalledBottomSheetScreenContract$InputData.getClass();
                                c3Var.d = esimAlreadyInstalledBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (d3) c3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimAlreadyInstalledBottomSheetScreen.W;
                        d3 d3Var = (d3) esimAlreadyInstalledBottomSheetScreen.U.getValue();
                        switch (d3Var.f4209a) {
                            case 0:
                                return (f) d3Var.d.get();
                            default:
                                return (f) d3Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: dnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimAlreadyInstalledBottomSheetScreen f116350b;

            {
                this.f116350b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimAlreadyInstalledBottomSheetScreen esimAlreadyInstalledBottomSheetScreen = this.f116350b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimAlreadyInstalledBottomSheetScreen.W;
                        qji.b bVarU2 = esimAlreadyInstalledBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_already_installed.di.EsimAlreadyInstalledBottomSheetScreenInjector");
                        c3 c3Var = (c3) ((enj.a) bVarU2).c().mo3808a(esimAlreadyInstalledBottomSheetScreen);
                        EsimAlreadyInstalledBottomSheetScreenContract$InputData esimAlreadyInstalledBottomSheetScreenContract$InputData = esimAlreadyInstalledBottomSheetScreen.Q;
                        switch (c3Var.f4194a) {
                            case 0:
                                esimAlreadyInstalledBottomSheetScreenContract$InputData.getClass();
                                c3Var.d = esimAlreadyInstalledBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimAlreadyInstalledBottomSheetScreenContract$InputData.getClass();
                                c3Var.d = esimAlreadyInstalledBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (d3) c3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimAlreadyInstalledBottomSheetScreen.W;
                        d3 d3Var = (d3) esimAlreadyInstalledBottomSheetScreen.U.getValue();
                        switch (d3Var.f4209a) {
                            case 0:
                                return (f) d3Var.d.get();
                            default:
                                return (f) d3Var.d.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d3) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new c(this, null, 0), 3);
        a.g2(this, rd0.e.b(((TextDelegate) this.S.getValue()).d), null, new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.T;
    }
}
