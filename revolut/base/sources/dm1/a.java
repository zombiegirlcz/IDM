package dm1;

import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillerSearchNavigation$InputData f115815a;

    public a(BillerSearchNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f115815a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f115815a, ((a) obj2).f115815a);
    }

    public final int hashCode() {
        return this.f115815a.hashCode();
    }
}
