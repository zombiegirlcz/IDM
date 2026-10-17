package yrd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetContract$Variant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmartEstimationBottomSheetContract$Variant f316273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f316274c;

    public c(SmartEstimationBottomSheetContract$Variant variant, boolean z) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f316273b = variant;
        this.f316274c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f316273b, cVar.f316273b) && this.f316274c == cVar.f316274c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f316274c) + (this.f316273b.hashCode() * 31);
    }
}
