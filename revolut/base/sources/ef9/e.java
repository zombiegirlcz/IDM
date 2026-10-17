package ef9;

import com.revolut.feature.pay_bills_taxes.api.navigation.FormFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormFlowInputData f125295a;

    public e(FormFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f125295a = inputData;
    }

    public final FormFlowInputData b() {
        return this.f125295a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f125295a, ((e) obj2).f125295a);
    }

    public final int hashCode() {
        return this.f125295a.hashCode();
    }
}
