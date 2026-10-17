package v4j;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationResult f286120a;

    public n(ConfirmationResult confirmationResult) {
        this.f286120a = confirmationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f286120a, ((n) obj2).f286120a);
    }

    public final int hashCode() {
        ConfirmationResult confirmationResult = this.f286120a;
        if (confirmationResult == null) {
            return 0;
        }
        return confirmationResult.hashCode();
    }
}
