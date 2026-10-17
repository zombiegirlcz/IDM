package n61;

import com.revolut.domain.models.beneficiary.ConfirmationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConfirmationResult f212702a;

    public r(ConfirmationResult confirmationResult) {
        this.f212702a = confirmationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f212702a, ((r) obj2).f212702a);
    }

    public final int hashCode() {
        ConfirmationResult confirmationResult = this.f212702a;
        if (confirmationResult == null) {
            return 0;
        }
        return confirmationResult.hashCode();
    }
}
