package m4j;

import aii.r;
import com.revolut.domain.models.beneficiary.BeneficiarySearchListItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiarySearchListItem f202739a;

    public h(BeneficiarySearchListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f202739a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f202739a, ((h) obj2).f202739a);
    }

    public final int hashCode() {
        return this.f202739a.hashCode();
    }
}
