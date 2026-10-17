package ntf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonCategory f219028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonNode f219029b;

    public l(TransferReasonCategory category, TransferReasonNode reason) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f219028a = category;
        this.f219029b = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f219028a, lVar.f219028a) && Intrinsics.f(this.f219029b, lVar.f219029b);
    }

    public final int hashCode() {
        return this.f219029b.hashCode() + (this.f219028a.hashCode() * 31);
    }
}
