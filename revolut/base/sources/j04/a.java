package j04;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lj04/a;", "", "", "toString", "()Ljava/lang/String;", "Lj04/a$a;", "a", "Lj04/a$a;", "()Lj04/a$a;", "activeCreditFacilityRetention", "b", "incompleteApplicationRetention", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("activeCreditFacilityRetention")
    @NotNull
    private final C0959a activeCreditFacilityRetention;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("incompleteApplicationRetention")
    @NotNull
    private final C0959a incompleteApplicationRetention;

    /* JADX INFO: renamed from: j04.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lj04/a$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "defaultDurationDays", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "customExpirationDate", "c", "d", "minimumExpirationDate", "maximumExpirationDate", "e", "suggestedCustomExpirationDate", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0959a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("defaultDurationDays")
        private final Integer defaultDurationDays;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("customExpirationDate")
        private final LocalDate customExpirationDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("minimumExpirationDate")
        @NotNull
        private final LocalDate minimumExpirationDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("maximumExpirationDate")
        @NotNull
        private final LocalDate maximumExpirationDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("suggestedCustomExpirationDate")
        @NotNull
        private final LocalDate suggestedCustomExpirationDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getCustomExpirationDate() {
            return this.customExpirationDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getDefaultDurationDays() {
            return this.defaultDurationDays;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getMaximumExpirationDate() {
            return this.maximumExpirationDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getMinimumExpirationDate() {
            return this.minimumExpirationDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDate getSuggestedCustomExpirationDate() {
            return this.suggestedCustomExpirationDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0959a)) {
                return false;
            }
            C0959a c0959a = (C0959a) obj2;
            return Intrinsics.f(this.defaultDurationDays, c0959a.defaultDurationDays) && Intrinsics.f(this.customExpirationDate, c0959a.customExpirationDate) && Intrinsics.f(this.minimumExpirationDate, c0959a.minimumExpirationDate) && Intrinsics.f(this.maximumExpirationDate, c0959a.maximumExpirationDate) && Intrinsics.f(this.suggestedCustomExpirationDate, c0959a.suggestedCustomExpirationDate);
        }

        public final int hashCode() {
            Integer num = this.defaultDurationDays;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            LocalDate localDate = this.customExpirationDate;
            return this.suggestedCustomExpirationDate.hashCode() + y.a(y.a((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.minimumExpirationDate), 31, this.maximumExpirationDate);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C0959a getActiveCreditFacilityRetention() {
        return this.activeCreditFacilityRetention;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0959a getIncompleteApplicationRetention() {
        return this.incompleteApplicationRetention;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.activeCreditFacilityRetention, aVar.activeCreditFacilityRetention) && Intrinsics.f(this.incompleteApplicationRetention, aVar.incompleteApplicationRetention);
    }

    public final int hashCode() {
        return this.incompleteApplicationRetention.hashCode() + (this.activeCreditFacilityRetention.hashCode() * 31);
    }
}
