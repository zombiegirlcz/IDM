package s1a;

import cli.y;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet.SplitBillLinkBottomSheetContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends oki.h implements dli.b {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f259120p;

    public g(i stateMapper, SplitBillLinkBottomSheetContract$InputData inputData, j perPersonAmountCalculator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(perPersonAmountCalculator, "perPersonAmountCalculator");
        this.o = perPersonAmountCalculator;
        Integer num = inputData.f79864b;
        this.f259120p = mra.d.b(this, new a(num != null ? num.intValue() : 2, inputData.f79863a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f259120p;
    }
}
