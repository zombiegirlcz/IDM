package on4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\t\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010.\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b&\u0010\u0010R\u001c\u00102\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b\r\u00101¨\u00063"}, d2 = {"Lon4/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "facilityId", "b", "k", "pocketId", "", "c", "J", "e", "()J", "creditLimit", "d", "f", "currency", "n", "state", "", "D", "h", "()D", "interestRate", "Ljava/lang/Double;", "()Ljava/lang/Double;", "apr", "Lon4/g;", "Lon4/g;", "i", "()Lon4/g;", "late", "cardType", "Lon4/m;", "j", "Lon4/m;", "m", "()Lon4/m;", "spendingRestriction", "l", "postTerminationPlanId", "accessLevel", "openDate", "Lon4/a;", "Lon4/a;", "()Lon4/a;", "cancellation", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    @NotNull
    private final String facilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditLimit")
    private final long creditLimit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("interestRate")
    private final double interestRate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    private final Double apr;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("late")
    private final g late;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("cardType")
    private final String cardType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("spendingRestriction")
    private final m spendingRestriction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("postTerminationPlanId")
    private final String postTerminationPlanId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("accessLevel")
    private final String accessLevel;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("openDate")
    private final long openDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellation")
    private final a cancellation;

    public f(String facilityId, String pocketId, long j2, String currency, String state, double d, Double d5, g gVar, String str, m mVar, String str2, String str3, long j3, a aVar) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(state, "state");
        this.facilityId = facilityId;
        this.pocketId = pocketId;
        this.creditLimit = j2;
        this.currency = currency;
        this.state = state;
        this.interestRate = d;
        this.apr = d5;
        this.late = gVar;
        this.cardType = str;
        this.spendingRestriction = mVar;
        this.postTerminationPlanId = str2;
        this.accessLevel = str3;
        this.openDate = j3;
        this.cancellation = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessLevel() {
        return this.accessLevel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCreditLimit() {
        return this.creditLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.facilityId, fVar.facilityId) && Intrinsics.f(this.pocketId, fVar.pocketId) && this.creditLimit == fVar.creditLimit && Intrinsics.f(this.currency, fVar.currency) && Intrinsics.f(this.state, fVar.state) && Double.compare(this.interestRate, fVar.interestRate) == 0 && Intrinsics.f(this.apr, fVar.apr) && Intrinsics.f(this.late, fVar.late) && Intrinsics.f(this.cardType, fVar.cardType) && Intrinsics.f(this.spendingRestriction, fVar.spendingRestriction) && Intrinsics.f(this.postTerminationPlanId, fVar.postTerminationPlanId) && Intrinsics.f(this.accessLevel, fVar.accessLevel) && this.openDate == fVar.openDate && Intrinsics.f(this.cancellation, fVar.cancellation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getInterestRate() {
        return this.interestRate;
    }

    public final int hashCode() {
        int iC = m72.b.c(p.a.c(p.a.c(a0.d.c(p.a.c(this.facilityId.hashCode() * 31, 31, this.pocketId), 31, this.creditLimit), 31, this.currency), 31, this.state), this.interestRate, 31);
        Double d = this.apr;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        g gVar = this.late;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str = this.cardType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        m mVar = this.spendingRestriction;
        int iHashCode4 = (iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str2 = this.postTerminationPlanId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessLevel;
        int iC2 = a0.d.c((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.openDate);
        a aVar = this.cancellation;
        return iC2 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final g getLate() {
        return this.late;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getOpenDate() {
        return this.openDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPostTerminationPlanId() {
        return this.postTerminationPlanId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final m getSpendingRestriction() {
        return this.spendingRestriction;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
