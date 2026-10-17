package com.revolut.feature.external_accounts.impl.mandate.bottom_sheet;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import java.util.List;
import je6.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import we6.r0;
import xf6.x1;
import xf6.y1;
import xki.e;
import zc0.b0;
import zfd.s;
import zg6.f;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/bottom_sheet/MandateSetupBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lwe6/r0;", "Lcom/revolut/feature/external_accounts/impl/mandate/bottom_sheet/a;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MandateSetupBottomSheetController extends BaseBottomSheetRecyclerController<r0, a> {
    public static final /* synthetic */ int W = 0;
    public final MandateSetupBottomSheetContract$InputData Q;
    public final Object R;
    public final Object S;
    public final CellDetailsActionDelegate T;
    public final TextDelegate U;
    public final List V;

    public MandateSetupBottomSheetController(MandateSetupBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: zg6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateSetupBottomSheetController f322080b;

            {
                this.f322080b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MandateSetupBottomSheetController mandateSetupBottomSheetController = this.f322080b;
                switch (i2) {
                    case 0:
                        int i3 = MandateSetupBottomSheetController.W;
                        phm.a aVar = (phm.a) ue0.e.j(mandateSetupBottomSheetController.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        MandateSetupBottomSheetContract$InputData mandateSetupBottomSheetContract$InputData = mandateSetupBottomSheetController.Q;
                        mandateSetupBottomSheetContract$InputData.getClass();
                        return new x1(y1Var, mandateSetupBottomSheetContract$InputData);
                    default:
                        int i5 = MandateSetupBottomSheetController.W;
                        return (b) ((x1) mandateSetupBottomSheetController.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: zg6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateSetupBottomSheetController f322080b;

            {
                this.f322080b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MandateSetupBottomSheetController mandateSetupBottomSheetController = this.f322080b;
                switch (i22) {
                    case 0:
                        int i3 = MandateSetupBottomSheetController.W;
                        phm.a aVar = (phm.a) ue0.e.j(mandateSetupBottomSheetController.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        y1 y1Var = ((y1) aVar2.b()).i;
                        MandateSetupBottomSheetContract$InputData mandateSetupBottomSheetContract$InputData = mandateSetupBottomSheetController.Q;
                        mandateSetupBottomSheetContract$InputData.getClass();
                        return new x1(y1Var, mandateSetupBottomSheetContract$InputData);
                    default:
                        int i5 = MandateSetupBottomSheetController.W;
                        return (b) ((x1) mandateSetupBottomSheetController.R.getValue()).d.get();
                }
            }
        });
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        CellDetailsActionDelegate cellDetailsActionDelegate = new CellDetailsActionDelegate();
        this.T = cellDetailsActionDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.U = textDelegate;
        this.V = v.k(cellDetailsDelegate, cellDetailsActionDelegate, new RowLoadingDelegate(), textDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x1) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new zg6.e(this, continuation, 0), 3);
        ViewController.P2(this, f3(), new zg6.e(this, continuation, 1), 3);
        r rVarFilter = this.T.d.filter(new b0(new zg6.c(0), 26));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.d), new s(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zg6.b R2() {
        return (zg6.b) this.S.getValue();
    }
}
