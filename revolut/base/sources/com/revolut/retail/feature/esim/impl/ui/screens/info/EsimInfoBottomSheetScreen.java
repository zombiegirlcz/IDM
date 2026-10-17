package com.revolut.retail.feature.esim.impl.ui.screens.info;

import afj.o1;
import afj.p1;
import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreenContract$InputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import x0f.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/info/EsimInfoBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/info/EsimInfoBottomSheetScreenContract$InputData;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimInfoBottomSheetScreen extends BaseBottomSheetRecyclerController<q, EsimInfoBottomSheetScreenContract$InputData> {
    public static final /* synthetic */ int W = 0;
    public final EsimInfoBottomSheetScreenContract$InputData Q;
    public final TextDelegate R;
    public final RowDelegate S;
    public final List T;
    public final Object U;
    public final Object V;

    public EsimInfoBottomSheetScreen(EsimInfoBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        TextDelegate textDelegate = new TextDelegate();
        this.R = textDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        final int i = 0;
        final int i2 = 1;
        this.T = v.k(textDelegate, rowDelegate);
        this.U = w.y0(new Function0(this) { // from class: xij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimInfoBottomSheetScreen f306413b;

            {
                this.f306413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                EsimInfoBottomSheetScreen esimInfoBottomSheetScreen = this.f306413b;
                switch (i3) {
                    case 0:
                        int i5 = EsimInfoBottomSheetScreen.W;
                        qji.b bVarU2 = esimInfoBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.info.di.EsimInfoBottomSheetScreenInjector");
                        o1 o1Var = (o1) ((yij.a) bVarU2).b().mo3808a(esimInfoBottomSheetScreen);
                        EsimInfoBottomSheetScreenContract$InputData esimInfoBottomSheetScreenContract$InputData = esimInfoBottomSheetScreen.Q;
                        switch (o1Var.f4372a) {
                            case 0:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                            case 2:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                            case 3:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (p1) o1Var.mo3783build();
                    default:
                        int i6 = EsimInfoBottomSheetScreen.W;
                        p1 p1Var = (p1) esimInfoBottomSheetScreen.U.getValue();
                        switch (p1Var.f4387a) {
                            case 0:
                                return (b) p1Var.e.get();
                            case 1:
                                return (b) p1Var.e.get();
                            case 2:
                                return (b) p1Var.e.get();
                            case 3:
                                return (b) p1Var.e.get();
                            default:
                                return (b) p1Var.e.get();
                        }
                }
            }
        });
        this.V = w.y0(new Function0(this) { // from class: xij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimInfoBottomSheetScreen f306413b;

            {
                this.f306413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EsimInfoBottomSheetScreen esimInfoBottomSheetScreen = this.f306413b;
                switch (i3) {
                    case 0:
                        int i5 = EsimInfoBottomSheetScreen.W;
                        qji.b bVarU2 = esimInfoBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.info.di.EsimInfoBottomSheetScreenInjector");
                        o1 o1Var = (o1) ((yij.a) bVarU2).b().mo3808a(esimInfoBottomSheetScreen);
                        EsimInfoBottomSheetScreenContract$InputData esimInfoBottomSheetScreenContract$InputData = esimInfoBottomSheetScreen.Q;
                        switch (o1Var.f4372a) {
                            case 0:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                            case 2:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                            case 3:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimInfoBottomSheetScreenContract$InputData.getClass();
                                o1Var.d = esimInfoBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (p1) o1Var.mo3783build();
                    default:
                        int i6 = EsimInfoBottomSheetScreen.W;
                        p1 p1Var = (p1) esimInfoBottomSheetScreen.U.getValue();
                        switch (p1Var.f4387a) {
                            case 0:
                                return (b) p1Var.e.get();
                            case 1:
                                return (b) p1Var.e.get();
                            case 2:
                                return (b) p1Var.e.get();
                            case 3:
                                return (b) p1Var.e.get();
                            default:
                                return (b) p1Var.e.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p1) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (xij.b) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(rd0.e.b(this.R.d), rd0.e.b(this.S.f53226s), d3()), new x64.b(this, null, 29), 3);
        ViewController.P2(this, e3(), new g(this, null, 21), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (xij.b) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.T;
    }
}
