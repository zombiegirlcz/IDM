package com.revolut.feature.insurance_credit.impl.ui.screen.coverage_bottom_sheet;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bt7.i;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_bottom_sheet.CoverageBottomSheetController;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_bottom_sheet.CoverageBottomSheetControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import grl.k9;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ot7.b;
import ot7.c;
import ot7.d;
import ot7.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/screen/coverage_bottom_sheet/CoverageBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lot7/d;", "Ldli/a;", "Lot7/e;", "Lno/m;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoverageBottomSheetController extends ViewController<d> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CoverageBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final CoverageBottomSheetControllerContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CoverageBottomSheetController(CoverageBottomSheetControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_bottom_sheet_base;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ot7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageBottomSheetController f229563b;

            {
                this.f229563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CoverageBottomSheetController coverageBottomSheetController = this.f229563b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageBottomSheetController.R;
                        CoverageBottomSheetController coverageBottomSheetController2 = this.f229563b;
                        return dli.f.a(coverageBottomSheetController2, (c) coverageBottomSheetController2.Q.getValue(), v.k(new RowDelegate(null, null, 7), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageBottomSheetController.R;
                        phm.a aVar = (phm.a) ue0.e.j(coverageBottomSheetController.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f18430l;
                        CoverageBottomSheetControllerContract$InputData coverageBottomSheetControllerContract$InputData = coverageBottomSheetController.K;
                        coverageBottomSheetControllerContract$InputData.getClass();
                        return new bt7.d(iVar, coverageBottomSheetControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageBottomSheetController.R;
                        return (c) ((bt7.d) coverageBottomSheetController.P.getValue()).f18412c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ot7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageBottomSheetController f229563b;

            {
                this.f229563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CoverageBottomSheetController coverageBottomSheetController = this.f229563b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageBottomSheetController.R;
                        CoverageBottomSheetController coverageBottomSheetController2 = this.f229563b;
                        return dli.f.a(coverageBottomSheetController2, (c) coverageBottomSheetController2.Q.getValue(), v.k(new RowDelegate(null, null, 7), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageBottomSheetController.R;
                        phm.a aVar = (phm.a) ue0.e.j(coverageBottomSheetController.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f18430l;
                        CoverageBottomSheetControllerContract$InputData coverageBottomSheetControllerContract$InputData = coverageBottomSheetController.K;
                        coverageBottomSheetControllerContract$InputData.getClass();
                        return new bt7.d(iVar, coverageBottomSheetControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageBottomSheetController.R;
                        return (c) ((bt7.d) coverageBottomSheetController.P.getValue()).f18412c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ot7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoverageBottomSheetController f229563b;

            {
                this.f229563b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CoverageBottomSheetController coverageBottomSheetController = this.f229563b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CoverageBottomSheetController.R;
                        CoverageBottomSheetController coverageBottomSheetController2 = this.f229563b;
                        return dli.f.a(coverageBottomSheetController2, (c) coverageBottomSheetController2.Q.getValue(), v.k(new RowDelegate(null, null, 7), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CoverageBottomSheetController.R;
                        phm.a aVar = (phm.a) ue0.e.j(coverageBottomSheetController.m2()).a().get(i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f18430l;
                        CoverageBottomSheetControllerContract$InputData coverageBottomSheetControllerContract$InputData = coverageBottomSheetController.K;
                        coverageBottomSheetControllerContract$InputData.getClass();
                        return new bt7.d(iVar, coverageBottomSheetControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CoverageBottomSheetController.R;
                        return (c) ((bt7.d) coverageBottomSheetController.P.getValue()).f18412c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        ArrayList arrayList = uiState.f229565a;
        aw0.i iVar = uiState.f229567c;
        bottomSheetControllerBaseRecyclerView.setVisibility(!arrayList.isEmpty() ? 0 : 8);
        d3().f174514c.setHeaderModel(uiState.f229566b);
        ActionFooterView bottomSheetControllerBaseFooterView = d3().f174513b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
        bottomSheetControllerBaseFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174513b.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (bt7.d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174513b.f), new ocb.d(this, null, 20), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
