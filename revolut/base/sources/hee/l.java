package hee;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferArrivalRequest f151694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferArrivalContent f151695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kq2.l f151696c;

    public l(TransferArrivalRequest request, TransferArrivalContent transferArrivalContent, kq2.l transferType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(transferArrivalContent, "transferArrivalContent");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        this.f151694a = request;
        this.f151695b = transferArrivalContent;
        this.f151696c = transferType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f151694a, lVar.f151694a) && Intrinsics.f(this.f151695b, lVar.f151695b) && this.f151696c == lVar.f151696c;
    }

    public final int hashCode() {
        return this.f151696c.hashCode() + ((this.f151695b.hashCode() + (this.f151694a.hashCode() * 31)) * 31);
    }
}
