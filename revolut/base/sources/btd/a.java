package btd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetContract$Variant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmartEstimationBottomSheetContract$Variant f18558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18559b;

    public a(SmartEstimationBottomSheetContract$Variant variant, boolean z) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f18558a = variant;
        this.f18559b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f18558a, aVar.f18558a) && this.f18559b == aVar.f18559b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18559b) + (this.f18558a.hashCode() * 31);
    }
}
