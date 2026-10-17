package j11;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\t\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lj11/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "startDate", "b", "endDate", "Lj11/b;", "Lj11/b;", "()Lj11/b;", "progress", "", "Lj11/e;", "d", "Ljava/util/List;", "()Ljava/util/List;", "tiers", "Lj11/g;", "e", "Lj11/g;", "getEligibleTier", "()Lj11/g;", "eligibleTier", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    @NotNull
    private final String startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    @NotNull
    private final String endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("progress")
    @NotNull
    private final b progress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("tiers")
    @NotNull
    private final List<e> tiers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("eligibleTier")
    private final g eligibleTier;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTiers() {
        return this.tiers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.startDate, cVar.startDate) && Intrinsics.f(this.endDate, cVar.endDate) && Intrinsics.f(this.progress, cVar.progress) && Intrinsics.f(this.tiers, cVar.tiers) && this.eligibleTier == cVar.eligibleTier;
    }

    public final int hashCode() {
        int iD = p.a.d((this.progress.hashCode() + p.a.c(this.startDate.hashCode() * 31, 31, this.endDate)) * 31, 31, this.tiers);
        g gVar = this.eligibleTier;
        return iD + (gVar == null ? 0 : gVar.hashCode());
    }
}
