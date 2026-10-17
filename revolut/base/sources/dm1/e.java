package dm1;

import com.revolut.feature.apm.bills.billers.api.navigation.BillersChooserNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillersChooserNavigation$InputData f115818a;

    public e(BillersChooserNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f115818a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f115818a, ((e) obj2).f115818a);
    }

    public final int hashCode() {
        return this.f115818a.hashCode();
    }
}
