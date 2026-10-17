package htf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonCategory f155374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonNode f155375b;

    public m(TransferReasonCategory category, TransferReasonNode reason) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f155374a = category;
        this.f155375b = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f155374a, mVar.f155374a) && Intrinsics.f(this.f155375b, mVar.f155375b);
    }

    public final int hashCode() {
        return this.f155375b.hashCode() + (this.f155374a.hashCode() * 31);
    }
}
