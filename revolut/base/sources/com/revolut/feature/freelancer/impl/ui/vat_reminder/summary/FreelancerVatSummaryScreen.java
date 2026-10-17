package com.revolut.feature.freelancer.impl.ui.vat_reminder.summary;

import aii.q;
import bt6.i;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.summary.FreelancerVatSummaryScreen;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.summary.FreelancerVatSummaryScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import i57.b;
import i57.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wp5.y;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/summary/FreelancerVatSummaryScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Li57/b;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerVatSummaryScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int U = 0;
    public final FreelancerVatSummaryScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public FreelancerVatSummaryScreen(FreelancerVatSummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: i57.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatSummaryScreen f158779b;

            {
                this.f158779b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerVatSummaryScreen freelancerVatSummaryScreen = this.f158779b;
                switch (i2) {
                    case 0:
                        int i3 = FreelancerVatSummaryScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerVatSummaryScreen.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        FreelancerVatSummaryScreenContract$InputData freelancerVatSummaryScreenContract$InputData = freelancerVatSummaryScreen.Q;
                        freelancerVatSummaryScreenContract$InputData.getClass();
                        return new i(bVar, freelancerVatSummaryScreenContract$InputData);
                    default:
                        int i5 = FreelancerVatSummaryScreen.U;
                        return (c) ((i) freelancerVatSummaryScreen.R.getValue()).f18352b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: i57.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatSummaryScreen f158779b;

            {
                this.f158779b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerVatSummaryScreen freelancerVatSummaryScreen = this.f158779b;
                switch (i22) {
                    case 0:
                        int i3 = FreelancerVatSummaryScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerVatSummaryScreen.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        FreelancerVatSummaryScreenContract$InputData freelancerVatSummaryScreenContract$InputData = freelancerVatSummaryScreen.Q;
                        freelancerVatSummaryScreenContract$InputData.getClass();
                        return new i(bVar, freelancerVatSummaryScreenContract$InputData);
                    default:
                        int i5 = FreelancerVatSummaryScreen.U;
                        return (c) ((i) freelancerVatSummaryScreen.R.getValue()).f18352b.get();
                }
            }
        });
        this.T = y.w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.S.getValue();
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
