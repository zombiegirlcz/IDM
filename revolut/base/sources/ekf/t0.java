package ekf;

import com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousRecipientWarningDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousRecipientWarningDestination f127127a;

    public t0(SuspiciousRecipientWarningDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f127127a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && Intrinsics.f(this.f127127a, ((t0) obj2).f127127a);
    }

    public final int hashCode() {
        return this.f127127a.f104981a.hashCode();
    }
}
