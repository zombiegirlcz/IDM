package sl1;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationPendingAction f264082a;

    public d(ApmPaymentAuthorisationPendingAction pendingAction) {
        Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        this.f264082a = pendingAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f264082a, ((d) obj2).f264082a);
    }

    public final int hashCode() {
        return this.f264082a.hashCode();
    }
}
