package j04;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lj04/d;", "", "", "toString", "()Ljava/lang/String;", "Lj04/d$a;", "a", "Lj04/d$a;", "getActiveCreditFacilityRetention", "()Lj04/d$a;", "activeCreditFacilityRetention", "b", "getIncompleteApplicationRetention", "incompleteApplicationRetention", "", "c", "Ljava/lang/Long;", "getAmountRequested", "()Ljava/lang/Long;", "amountRequested", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("activeCreditFacilityRetention")
    private final a activeCreditFacilityRetention;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("incompleteApplicationRetention")
    private final a incompleteApplicationRetention;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountRequested")
    private final Long amountRequested;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lj04/d$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "getCustomExpirationDate", "()Ljava/time/LocalDate;", "customExpirationDate", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("customExpirationDate")
        private final LocalDate customExpirationDate;

        public a(LocalDate localDate) {
            this.customExpirationDate = localDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.customExpirationDate, ((a) obj2).customExpirationDate);
        }

        public final int hashCode() {
            LocalDate localDate = this.customExpirationDate;
            if (localDate == null) {
                return 0;
            }
            return localDate.hashCode();
        }
    }

    public d(a aVar, a aVar2, Long l2) {
        this.activeCreditFacilityRetention = aVar;
        this.incompleteApplicationRetention = aVar2;
        this.amountRequested = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.activeCreditFacilityRetention, dVar.activeCreditFacilityRetention) && Intrinsics.f(this.incompleteApplicationRetention, dVar.incompleteApplicationRetention) && Intrinsics.f(this.amountRequested, dVar.amountRequested);
    }

    public final int hashCode() {
        a aVar = this.activeCreditFacilityRetention;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.incompleteApplicationRetention;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Long l2 = this.amountRequested;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }
}
