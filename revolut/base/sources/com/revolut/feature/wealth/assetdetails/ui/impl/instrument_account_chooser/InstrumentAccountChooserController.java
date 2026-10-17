package com.revolut.feature.wealth.assetdetails.ui.impl.instrument_account_chooser;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.assetdetails.ui.impl.instrument_account_chooser.InstrumentAccountChooserController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n4h.g;
import n4h.h;
import n4h.i;
import t2h.a;
import t2h.b;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/impl/instrument_account_chooser/InstrumentAccountChooserController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lt2h/b;", "Ln4h/h;", "Ln4h/i;", "feature_wealth_asset_details_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentAccountChooserController extends BaseBottomSheetRecyclerController<b, h> implements i {
    public static final /* synthetic */ int V = 0;
    public final a Q;
    public final Lazy R;
    public final RowDelegate S;
    public final List T;
    public final Lazy U;

    public InstrumentAccountChooserController(a input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.Q = input;
        final int i = 0;
        this.R = j.b(new Function0(this) { // from class: n4h.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentAccountChooserController f212448b;

            {
                this.f212448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstrumentAccountChooserController instrumentAccountChooserController = this.f212448b;
                switch (i2) {
                    case 0:
                        int i3 = InstrumentAccountChooserController.V;
                        return (g) ((z3h.b) instrumentAccountChooserController.U.getValue()).d.get();
                    default:
                        int i5 = InstrumentAccountChooserController.V;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentAccountChooserController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        t2h.a aVar3 = instrumentAccountChooserController.Q;
                        aVar3.getClass();
                        return new z3h.b(gVar, aVar3, instrumentAccountChooserController);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        this.T = u.c(rowDelegate);
        final int i2 = 1;
        this.U = j.b(new Function0(this) { // from class: n4h.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentAccountChooserController f212448b;

            {
                this.f212448b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstrumentAccountChooserController instrumentAccountChooserController = this.f212448b;
                switch (i22) {
                    case 0:
                        int i3 = InstrumentAccountChooserController.V;
                        return (g) ((z3h.b) instrumentAccountChooserController.U.getValue()).d.get();
                    default:
                        int i5 = InstrumentAccountChooserController.V;
                        phm.a aVar = (phm.a) ue0.e.j(instrumentAccountChooserController.m2()).a().get(m2h.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2h.b.class, " is not found"));
                        }
                        z3h.g gVar = ((z3h.g) aVar2.b()).f319291s;
                        t2h.a aVar3 = instrumentAccountChooserController.Q;
                        aVar3.getClass();
                        return new z3h.b(gVar, aVar3, instrumentAccountChooserController);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z3h.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
