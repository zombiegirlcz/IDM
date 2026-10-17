package hee;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalContent;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferArrivalRequest f151692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferArrivalContent f151693b;

    public k(TransferArrivalRequest request, TransferArrivalContent transferArrivalContent) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(transferArrivalContent, "transferArrivalContent");
        this.f151692a = request;
        this.f151693b = transferArrivalContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f151692a, kVar.f151692a) && Intrinsics.f(this.f151693b, kVar.f151693b);
    }

    public final int hashCode() {
        return this.f151693b.hashCode() + (this.f151692a.hashCode() * 31);
    }
}
