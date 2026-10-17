package com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration;

import afj.m1;
import afj.n1;
import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreenContract$InputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import la8.h;
import lij.c;
import lij.d;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/plan_selection/duration/EsimPlanDurationPickerBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Llij/d;", "Llij/c;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimPlanDurationPickerBottomSheetScreen extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final EsimPlanDurationPickerBottomSheetScreenContract$InputData Q;
    public final SelectableDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public EsimPlanDurationPickerBottomSheetScreen(EsimPlanDurationPickerBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        SelectableDelegate selectableDelegate = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.R = selectableDelegate;
        this.S = u.c(selectableDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: lij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPlanDurationPickerBottomSheetScreen f195531b;

            {
                this.f195531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimPlanDurationPickerBottomSheetScreen esimPlanDurationPickerBottomSheetScreen = this.f195531b;
                switch (i2) {
                    case 0:
                        int i3 = EsimPlanDurationPickerBottomSheetScreen.V;
                        qji.b bVarU2 = esimPlanDurationPickerBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.di.EsimPlanDurationPickerBottomSheetScreenInjector");
                        m1 m1Var = (m1) ((mij.a) bVarU2).q().mo3808a(esimPlanDurationPickerBottomSheetScreen);
                        EsimPlanDurationPickerBottomSheetScreenContract$InputData esimPlanDurationPickerBottomSheetScreenContract$InputData = esimPlanDurationPickerBottomSheetScreen.Q;
                        switch (m1Var.f4342a) {
                            case 0:
                                esimPlanDurationPickerBottomSheetScreenContract$InputData.getClass();
                                m1Var.d = esimPlanDurationPickerBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimPlanDurationPickerBottomSheetScreenContract$InputData.getClass();
                                m1Var.d = esimPlanDurationPickerBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (n1) m1Var.mo3783build();
                    default:
                        int i5 = EsimPlanDurationPickerBottomSheetScreen.V;
                        n1 n1Var = (n1) esimPlanDurationPickerBottomSheetScreen.T.getValue();
                        switch (n1Var.f4357a) {
                            case 0:
                                return (e) n1Var.e.get();
                            default:
                                return (e) n1Var.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: lij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimPlanDurationPickerBottomSheetScreen f195531b;

            {
                this.f195531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimPlanDurationPickerBottomSheetScreen esimPlanDurationPickerBottomSheetScreen = this.f195531b;
                switch (i22) {
                    case 0:
                        int i3 = EsimPlanDurationPickerBottomSheetScreen.V;
                        qji.b bVarU2 = esimPlanDurationPickerBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.di.EsimPlanDurationPickerBottomSheetScreenInjector");
                        m1 m1Var = (m1) ((mij.a) bVarU2).q().mo3808a(esimPlanDurationPickerBottomSheetScreen);
                        EsimPlanDurationPickerBottomSheetScreenContract$InputData esimPlanDurationPickerBottomSheetScreenContract$InputData = esimPlanDurationPickerBottomSheetScreen.Q;
                        switch (m1Var.f4342a) {
                            case 0:
                                esimPlanDurationPickerBottomSheetScreenContract$InputData.getClass();
                                m1Var.d = esimPlanDurationPickerBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimPlanDurationPickerBottomSheetScreenContract$InputData.getClass();
                                m1Var.d = esimPlanDurationPickerBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (n1) m1Var.mo3783build();
                    default:
                        int i5 = EsimPlanDurationPickerBottomSheetScreen.V;
                        n1 n1Var = (n1) esimPlanDurationPickerBottomSheetScreen.T.getValue();
                        switch (n1Var.f4357a) {
                            case 0:
                                return (e) n1Var.e.get();
                            default:
                                return (e) n1Var.e.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n1) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (lij.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.r()), new lij.b(this, null), 3);
        ViewController.P2(this, e3(), new h(this, null, 15), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (lij.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
