package l1j;

import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyChooserInputData f191548a;

    public c(CurrencyChooserInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f191548a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f191548a, ((c) obj2).f191548a);
    }

    public final int hashCode() {
        return this.f191548a.hashCode();
    }
}
