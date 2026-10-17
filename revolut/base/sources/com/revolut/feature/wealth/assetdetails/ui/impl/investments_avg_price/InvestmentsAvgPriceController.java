package com.revolut.feature.wealth.assetdetails.ui.impl.investments_avg_price;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments_avg_price.InvestmentsAvgPriceController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qp7.g;
import r4h.c;
import r4h.d;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/impl/investments_avg_price/InvestmentsAvgPriceController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lr4h/d;", "<init>", "()V", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestmentsAvgPriceController extends BaseBottomSheetRecyclerController<q, d> {
    public static final /* synthetic */ int U = 0;
    public final CellDetailsDelegate Q;
    public final Object R;
    public final Object S;
    public final List T;

    public InvestmentsAvgPriceController() {
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.Q = cellDetailsDelegate;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: r4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentsAvgPriceController f251462b;

            {
                this.f251462b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestmentsAvgPriceController investmentsAvgPriceController = this.f251462b;
                switch (i2) {
                    case 0:
                        int i3 = InvestmentsAvgPriceController.U;
                        phm.a aVar = (phm.a) ue0.e.j(investmentsAvgPriceController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        z3h.d dVar = new z3h.d();
                        dVar.f319270a = e4m.b.b(new vk6.a(28));
                        return dVar;
                    default:
                        int i5 = InvestmentsAvgPriceController.U;
                        return (c) ((z3h.d) investmentsAvgPriceController.R.getValue()).f319270a.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: r4h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestmentsAvgPriceController f251462b;

            {
                this.f251462b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestmentsAvgPriceController investmentsAvgPriceController = this.f251462b;
                switch (i22) {
                    case 0:
                        int i3 = InvestmentsAvgPriceController.U;
                        phm.a aVar = (phm.a) ue0.e.j(investmentsAvgPriceController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        z3h.d dVar = new z3h.d();
                        dVar.f319270a = e4m.b.b(new vk6.a(28));
                        return dVar;
                    default:
                        int i5 = InvestmentsAvgPriceController.U;
                        return (c) ((z3h.d) investmentsAvgPriceController.R.getValue()).f319270a.get();
                }
            }
        });
        this.T = v.k(cellDetailsDelegate, new PlainTextDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z3h.d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.f), new r4h.b(this, null), 3);
        ViewController.P2(this, e3(), new g(this, null, 29), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
