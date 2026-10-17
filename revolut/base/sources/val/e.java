package val;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousTransactionDialog.Action f287333a;

    public e(SuspiciousTransactionDialog.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f287333a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f287333a, ((e) obj2).f287333a);
    }

    public final int hashCode() {
        return this.f287333a.hashCode();
    }
}
