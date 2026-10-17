package f6d;

import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationOfPayeeScreenContract$InputData f132418a;

    public e(ConfirmationOfPayeeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f132418a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f132418a, ((e) obj2).f132418a);
    }

    public final int hashCode() {
        return this.f132418a.hashCode();
    }
}
