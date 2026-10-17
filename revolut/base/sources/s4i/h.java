package s4i;

import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$InputData;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$ModalStep;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$Payloads$FaqDetails;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends oki.h implements c {
    public final BreakdownFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f259884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f259885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f259886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mre.c f259887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final prl.e f259888t;
    public final RateExplanationDialogMapper u;
    public final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BaseBottomSheetController f259889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BaseBottomSheetController f259890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f259891y;
    public final yki.i z;

    public h(BreakdownFlowContract$InputData inputData, a bottomSheetsBuilder, x deeplinkHandler, i rateDetailsDestinationProvider, mre.c termsNavigationFactory, prl.e upgradeEntryPointItemClickHandler, RateExplanationDialogMapper rateExplanationDialogMapper, j webUrlChecker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomSheetsBuilder, "bottomSheetsBuilder");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(rateDetailsDestinationProvider, "rateDetailsDestinationProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemClickHandler, "upgradeEntryPointItemClickHandler");
        Intrinsics.checkNotNullParameter(rateExplanationDialogMapper, "rateExplanationDialogMapper");
        Intrinsics.checkNotNullParameter(webUrlChecker, "webUrlChecker");
        this.o = inputData;
        this.f259884p = bottomSheetsBuilder;
        this.f259885q = deeplinkHandler;
        this.f259886r = rateDetailsDestinationProvider;
        this.f259887s = termsNavigationFactory;
        this.f259888t = upgradeEntryPointItemClickHandler;
        this.u = rateExplanationDialogMapper;
        this.v = webUrlChecker;
        this.z = d8l.d.a(this, new s42.f(this, 3));
    }

    public final void I2(Function1 function1) {
        this.f259891y++;
        A1(new s09.c(function1, this, (Continuation) null), new yi5.b(25));
    }

    public final void J2(Object obj2) {
        if (!(obj2 instanceof BreakdownFlowContract$Payloads$FaqDetails)) {
            hx7.e.h(new IllegalArgumentException(a0.d.m(obj2, "Unknown parcel ")));
        } else {
            BreakdownFlowContract$Payloads$FaqDetails breakdownFlowContract$Payloads$FaqDetails = (BreakdownFlowContract$Payloads$FaqDetails) obj2;
            K2(new Breakdown.Faq(breakdownFlowContract$Payloads$FaqDetails.f97167a, breakdownFlowContract$Payloads$FaqDetails.f97168b, false));
        }
    }

    public final void K2(Breakdown breakdown) {
        oki.h.z2(this.z, new BreakdownFlowContract$ModalStep(breakdown), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void L2() {
        if (this.f259889w == null && this.f259890x == null && this.f259891y == 0) {
            oki.h.D2(this.z);
        }
    }

    @Override // yki.j
    public final void M0() {
        K2(this.o.f97163a);
    }

    public final void M2(BaseBottomSheetController baseBottomSheetController, Function1 function1) {
        s06.e block = new s06.e(this, 2, baseBottomSheetController, function1);
        Intrinsics.checkNotNullParameter(block, "block");
        baseBottomSheetController.H = block;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.z;
    }
}
