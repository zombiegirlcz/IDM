package ef9;

import com.revolut.feature.pay_bills_taxes.api.navigation.FormDetailsInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormDetailsInputData f125293a;

    public c(FormDetailsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f125293a = inputData;
    }

    public final FormDetailsInputData b() {
        return this.f125293a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f125293a, ((c) obj2).f125293a);
    }

    public final int hashCode() {
        return this.f125293a.f78677a.hashCode();
    }
}
