package aee;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferArrivalContent f3561a;

    public i(TransferArrivalContent transferArrivalContent) {
        Intrinsics.checkNotNullParameter(transferArrivalContent, "transferArrivalContent");
        this.f3561a = transferArrivalContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f3561a, ((i) obj2).f3561a);
    }

    public final int hashCode() {
        return this.f3561a.hashCode();
    }
}
