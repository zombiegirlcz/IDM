package uo3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u001b"}, d2 = {"Luo3/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "state", "c", "baseCurrency", "d", "refLink", "", "J", "h", "()J", "totalTopUp", "f", "Ljava/lang/Long;", "()Ljava/lang/Long;", "topUpLimit", "g", "topUpResetDate", "ownerId", "feature_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("base_currency")
    @NotNull
    private final String baseCurrency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("reference")
    private final String refLink;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("total_topup")
    private final long totalTopUp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("topup_limit")
    private final Long topUpLimit;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("topup_reset_date")
    private final Long topUpResetDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("owner_id")
    @NotNull
    private final String ownerId;

    public g(String id10, String state, long j2, Long l2, Long l3, String baseCurrency, String str, String ownerId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.id = id10;
        this.state = state;
        this.baseCurrency = baseCurrency;
        this.refLink = str;
        this.totalTopUp = j2;
        this.topUpLimit = l2;
        this.topUpResetDate = l3;
        this.ownerId = ownerId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRefLink() {
        return this.refLink;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.state, gVar.state) && Intrinsics.f(this.baseCurrency, gVar.baseCurrency) && Intrinsics.f(this.refLink, gVar.refLink) && this.totalTopUp == gVar.totalTopUp && Intrinsics.f(this.topUpLimit, gVar.topUpLimit) && Intrinsics.f(this.topUpResetDate, gVar.topUpResetDate) && Intrinsics.f(this.ownerId, gVar.ownerId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getTopUpLimit() {
        return this.topUpLimit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getTopUpResetDate() {
        return this.topUpResetDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTotalTopUp() {
        return this.totalTopUp;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.baseCurrency);
        String str = this.refLink;
        int iC2 = a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.totalTopUp);
        Long l2 = this.topUpLimit;
        int iHashCode = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.topUpResetDate;
        return this.ownerId.hashCode() + ((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31);
    }
}
