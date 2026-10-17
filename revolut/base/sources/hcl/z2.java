package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhcl/z2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "consensus", "", "I", "()I", "buyRecommendations", "c", "holdRecommendations", "d", "sellRecommendations", "Lorg/joda/time/Instant;", "e", "Lorg/joda/time/Instant;", "()Lorg/joda/time/Instant;", "updatedAt", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("consensus")
    @NotNull
    private final String consensus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("buyRecommendations")
    private final int buyRecommendations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("holdRecommendations")
    private final int holdRecommendations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("sellRecommendations")
    private final int sellRecommendations;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("updatedAt")
    @NotNull
    private final Instant updatedAt;

    public z2(String consensus, int i, int i2, int i3, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(consensus, "consensus");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.consensus = consensus;
        this.buyRecommendations = i;
        this.holdRecommendations = i2;
        this.sellRecommendations = i3;
        this.updatedAt = updatedAt;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBuyRecommendations() {
        return this.buyRecommendations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConsensus() {
        return this.consensus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getHoldRecommendations() {
        return this.holdRecommendations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSellRecommendations() {
        return this.sellRecommendations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.consensus, z2Var.consensus) && this.buyRecommendations == z2Var.buyRecommendations && this.holdRecommendations == z2Var.holdRecommendations && this.sellRecommendations == z2Var.sellRecommendations && Intrinsics.f(this.updatedAt, z2Var.updatedAt);
    }

    public final int hashCode() {
        return this.updatedAt.hashCode() + j6.a.b(this.sellRecommendations, j6.a.b(this.holdRecommendations, j6.a.b(this.buyRecommendations, this.consensus.hashCode() * 31, 31), 31), 31);
    }
}
