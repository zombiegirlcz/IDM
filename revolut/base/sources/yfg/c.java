package yfg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lyfg/c;", "", "", "toString", "()Ljava/lang/String;", "", "Lyfg/c$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "availability", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("availability")
    @NotNull
    private final List<a> availability;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lyfg/c$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "b", "()Ljava/time/LocalDate;", "date", "", "I", "()I", "availableFlights", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("date")
        @NotNull
        private final LocalDate date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("availableFlights")
        private final int availableFlights;

        public a(int i, LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.date = date;
            this.availableFlights = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAvailableFlights() {
            return this.availableFlights;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.date, aVar.date) && this.availableFlights == aVar.availableFlights;
        }

        public final int hashCode() {
            return Integer.hashCode(this.availableFlights) + (this.date.hashCode() * 31);
        }
    }

    public c(ArrayList availability) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.availability = availability;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAvailability() {
        return this.availability;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.availability, ((c) obj2).availability);
    }

    public final int hashCode() {
        return this.availability.hashCode();
    }
}
