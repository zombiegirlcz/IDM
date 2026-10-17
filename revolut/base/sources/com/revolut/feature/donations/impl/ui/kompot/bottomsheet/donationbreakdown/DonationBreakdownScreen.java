package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import hb6.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pa6.k;
import pa6.m;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/donationbreakdown/DonationBreakdownScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lhb6/a;", "Ldli/a;", "Lcii/b;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DonationBreakdownScreen extends BaseBottomSheetRecyclerController<q, hb6.a> {
    public static final /* synthetic */ int V = 0;
    public final DonationBreakdownContract$InputData Q;
    public final CellDetailsDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public DonationBreakdownScreen(DonationBreakdownContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.R = cellDetailsDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(cellDetailsDelegate, new FullScreenStateDelegate(), new CellDetailsLoadingDelegate());
        this.T = w.y0(new Function0(this) { // from class: hb6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DonationBreakdownScreen f150615b;

            {
                this.f150615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                DonationBreakdownScreen donationBreakdownScreen = this.f150615b;
                switch (i3) {
                    case 0:
                        int i5 = DonationBreakdownScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(donationBreakdownScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).G;
                        DonationBreakdownContract$InputData donationBreakdownContract$InputData = donationBreakdownScreen.Q;
                        donationBreakdownContract$InputData.getClass();
                        return new k(mVar, donationBreakdownContract$InputData);
                    default:
                        int i6 = DonationBreakdownScreen.V;
                        return (b) ((k) donationBreakdownScreen.T.getValue()).f234381b.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: hb6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DonationBreakdownScreen f150615b;

            {
                this.f150615b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                DonationBreakdownScreen donationBreakdownScreen = this.f150615b;
                switch (i3) {
                    case 0:
                        int i5 = DonationBreakdownScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(donationBreakdownScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).G;
                        DonationBreakdownContract$InputData donationBreakdownContract$InputData = donationBreakdownScreen.Q;
                        donationBreakdownContract$InputData.getClass();
                        return new k(mVar, donationBreakdownContract$InputData);
                    default:
                        int i6 = DonationBreakdownScreen.V;
                        return (b) ((k) donationBreakdownScreen.T.getValue()).f234381b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (hb6.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.d), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (hb6.b) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
