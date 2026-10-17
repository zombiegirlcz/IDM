package aee;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferArrivalRequest f3565a;

    public l(TransferArrivalRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f3565a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f3565a, ((l) obj2).f3565a);
    }

    public final int hashCode() {
        return this.f3565a.hashCode();
    }
}
