package k3k;

import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyChooserFlowDestination.InputData f180745a;

    public a(CurrencyChooserFlowDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f180745a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f180745a, ((a) obj2).f180745a);
    }

    public final int hashCode() {
        return this.f180745a.f99473a.hashCode();
    }
}
