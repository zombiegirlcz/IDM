package l1l;

import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferAvailability f191592a;

    public p(TransferAvailability transferAvailability) {
        this.f191592a = transferAvailability;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f191592a, ((p) obj2).f191592a);
    }

    public final int hashCode() {
        TransferAvailability transferAvailability = this.f191592a;
        if (transferAvailability == null) {
            return 0;
        }
        return transferAvailability.hashCode();
    }
}
