package i1l;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.transfer.models.quotes.TransferAvailabilityReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferAvailabilityReason f157652a;

    public i(TransferAvailabilityReason transferAvailabilityReason) {
        this.f157652a = transferAvailabilityReason;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_error_unavailable, null, null, 14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f157652a, ((i) obj2).f157652a);
    }

    public final int hashCode() {
        TransferAvailabilityReason transferAvailabilityReason = this.f157652a;
        if (transferAvailabilityReason == null) {
            return 0;
        }
        return transferAvailabilityReason.hashCode();
    }
}
