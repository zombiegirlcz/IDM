package kv9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u001a"}, d2 = {"Lkv9/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "state", "c", "f", "planTier", "discountDuration", "", "e", "D", "()D", "discountPercentage", "", "J", "()J", "planReferralEndDate", "assetUri", "feature_payments_messaging_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("planTier")
    @NotNull
    private final String planTier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("discountDuration")
    @NotNull
    private final String discountDuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("discountPercentage")
    private final double discountPercentage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("planReferralEndDate")
    private final long planReferralEndDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetUri")
    private final String assetUri;

    public o(String id10, String state, String planTier, String discountDuration, double d, long j2, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(discountDuration, "discountDuration");
        this.id = id10;
        this.state = state;
        this.planTier = planTier;
        this.discountDuration = discountDuration;
        this.discountPercentage = d;
        this.planReferralEndDate = j2;
        this.assetUri = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAssetUri() {
        return this.assetUri;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDiscountDuration() {
        return this.discountDuration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getDiscountPercentage() {
        return this.discountPercentage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getPlanReferralEndDate() {
        return this.planReferralEndDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.state, oVar.state) && Intrinsics.f(this.planTier, oVar.planTier) && Intrinsics.f(this.discountDuration, oVar.discountDuration) && Double.compare(this.discountPercentage, oVar.discountPercentage) == 0 && this.planReferralEndDate == oVar.planReferralEndDate && Intrinsics.f(this.assetUri, oVar.assetUri);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlanTier() {
        return this.planTier;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = a0.d.c(m72.b.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.planTier), 31, this.discountDuration), this.discountPercentage, 31), 31, this.planReferralEndDate);
        String str = this.assetUri;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
