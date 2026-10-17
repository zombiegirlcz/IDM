package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials;

import afj.c2;
import afj.d2;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.EsimMobilePlanGetPortOutCredentialsScreenContract$InputData;
import ff4.z;
import fk8.a;
import fkj.b;
import fkj.c;
import fkj.d;
import fkj.e;
import fkj.f;
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
import wp5.y;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_get_port_out_credentials/EsimMobilePlanGetPortOutCredentialsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lfkj/e;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanGetPortOutCredentialsScreen extends BaseBottomSheetRecyclerController<q, e> {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(EsimMobilePlanGetPortOutCredentialsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final EsimMobilePlanGetPortOutCredentialsScreenContract$InputData Q;
    public final h R;
    public final Object S;
    public final Object T;
    public final List U;
    public final Object V;
    public final Object W;

    public EsimMobilePlanGetPortOutCredentialsScreen(EsimMobilePlanGetPortOutCredentialsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        Lazy lazyY0 = w.y0(new a(16));
        this.S = lazyY0;
        Lazy lazyY02 = w.y0(new a(17));
        this.T = lazyY02;
        final int i = 0;
        final int i2 = 1;
        this.U = v.k((RowDelegate) lazyY0.getValue(), new CellDetailsLoadingDelegate(), (FullScreenStateDelegate) lazyY02.getValue());
        this.V = w.y0(new Function0(this) { // from class: fkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanGetPortOutCredentialsScreen f135848b;

            {
                this.f135848b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                EsimMobilePlanGetPortOutCredentialsScreen esimMobilePlanGetPortOutCredentialsScreen = this.f135848b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanGetPortOutCredentialsScreen.X;
                        qji.b bVarU2 = esimMobilePlanGetPortOutCredentialsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.di.EsimMobilePlanGetPortOutCredentialsScreenInjector");
                        c2 c2Var = (c2) ((gkj.a) bVarU2).D().mo3808a(esimMobilePlanGetPortOutCredentialsScreen);
                        EsimMobilePlanGetPortOutCredentialsScreenContract$InputData esimMobilePlanGetPortOutCredentialsScreenContract$InputData = esimMobilePlanGetPortOutCredentialsScreen.Q;
                        switch (c2Var.f4191a) {
                            case 0:
                                esimMobilePlanGetPortOutCredentialsScreenContract$InputData.getClass();
                                c2Var.d = esimMobilePlanGetPortOutCredentialsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanGetPortOutCredentialsScreenContract$InputData.getClass();
                                c2Var.d = esimMobilePlanGetPortOutCredentialsScreenContract$InputData;
                                break;
                        }
                        return (d2) c2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimMobilePlanGetPortOutCredentialsScreen.X;
                        d2 d2Var = (d2) esimMobilePlanGetPortOutCredentialsScreen.V.getValue();
                        switch (d2Var.f4206a) {
                            case 0:
                                return (f) d2Var.d.get();
                            default:
                                return (f) d2Var.d.get();
                        }
                }
            }
        });
        this.W = w.y0(new Function0(this) { // from class: fkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanGetPortOutCredentialsScreen f135848b;

            {
                this.f135848b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EsimMobilePlanGetPortOutCredentialsScreen esimMobilePlanGetPortOutCredentialsScreen = this.f135848b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanGetPortOutCredentialsScreen.X;
                        qji.b bVarU2 = esimMobilePlanGetPortOutCredentialsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_get_port_out_credentials.di.EsimMobilePlanGetPortOutCredentialsScreenInjector");
                        c2 c2Var = (c2) ((gkj.a) bVarU2).D().mo3808a(esimMobilePlanGetPortOutCredentialsScreen);
                        EsimMobilePlanGetPortOutCredentialsScreenContract$InputData esimMobilePlanGetPortOutCredentialsScreenContract$InputData = esimMobilePlanGetPortOutCredentialsScreen.Q;
                        switch (c2Var.f4191a) {
                            case 0:
                                esimMobilePlanGetPortOutCredentialsScreenContract$InputData.getClass();
                                c2Var.d = esimMobilePlanGetPortOutCredentialsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanGetPortOutCredentialsScreenContract$InputData.getClass();
                                c2Var.d = esimMobilePlanGetPortOutCredentialsScreenContract$InputData;
                                break;
                        }
                        return (d2) c2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimMobilePlanGetPortOutCredentialsScreen.X;
                        d2 d2Var = (d2) esimMobilePlanGetPortOutCredentialsScreen.V.getValue();
                        switch (d2Var.f4206a) {
                            case 0:
                                return (f) d2Var.d.get();
                            default:
                                return (f) d2Var.d.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d2) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new z(this, null, 14), 3);
        ?? r56 = this.S;
        com.revolut.kompot.navigable.a.g2(this, y.x(((RowDelegate) r56.getValue()).f53218h, ((RowDelegate) r56.getValue()).k, "mergeWith(...)"), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.T.getValue()).f52371h.f121375b), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.W.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
