package qbf;

import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u0016"}, d2 = {"Lqbf/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "Ljava/time/ZonedDateTime;", "b", "Ljava/time/ZonedDateTime;", "e", "()Ljava/time/ZonedDateTime;", "nextBillingDate", "Lqbf/b;", "c", "Lqbf/b;", "()Lqbf/b;", "billingCode", "endDate", "billingCycleId", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextBillingDate")
    private final ZonedDateTime nextBillingDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingPeriod")
    private final b billingCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("endDate")
    private final ZonedDateTime endDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("billingCycleId")
    @NotNull
    private final String billingCycleId;

    public m(String id10, ZonedDateTime zonedDateTime, b bVar, ZonedDateTime zonedDateTime2, String billingCycleId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(billingCycleId, "billingCycleId");
        this.id = id10;
        this.nextBillingDate = zonedDateTime;
        this.billingCode = bVar;
        this.endDate = zonedDateTime2;
        this.billingCycleId = billingCycleId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getBillingCode() {
        return this.billingCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillingCycleId() {
        return this.billingCycleId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZonedDateTime getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ZonedDateTime getNextBillingDate() {
        return this.nextBillingDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.id, mVar.id) && Intrinsics.f(this.nextBillingDate, mVar.nextBillingDate) && this.billingCode == mVar.billingCode && Intrinsics.f(this.endDate, mVar.endDate) && Intrinsics.f(this.billingCycleId, mVar.billingCycleId);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.nextBillingDate;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        b bVar = this.billingCode;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.endDate;
        return this.billingCycleId.hashCode() + ((iHashCode3 + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0)) * 31);
    }
}
