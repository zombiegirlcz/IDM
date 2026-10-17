package v4j;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationResult f286117a;

    public k(ConfirmationResult confirmationResult) {
        Intrinsics.checkNotNullParameter(confirmationResult, "confirmationResult");
        this.f286117a = confirmationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f286117a, ((k) obj2).f286117a);
    }

    public final int hashCode() {
        return this.f286117a.hashCode();
    }
}
