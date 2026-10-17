package hcl;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lhcl/l0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "isListed", "Ljava/time/Instant;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "listingDate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("isListed")
    private final boolean isListed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("listingDate")
    @NotNull
    private final Instant listingDate;

    public l0(Instant listingDate, boolean z) {
        Intrinsics.checkNotNullParameter(listingDate, "listingDate");
        this.isListed = z;
        this.listingDate = listingDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Instant getListingDate() {
        return this.listingDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsListed() {
        return this.isListed;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.isListed == l0Var.isListed && Intrinsics.f(this.listingDate, l0Var.listingDate);
    }

    public final int hashCode() {
        return this.listingDate.hashCode() + (Boolean.hashCode(this.isListed) * 31);
    }
}
