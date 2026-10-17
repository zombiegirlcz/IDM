package yfg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lyfg/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "textSuggestion", "", "Lyfg/f$a;", "Ljava/util/List;", "()Ljava/util/List;", "destinations", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("textSuggestion")
    @NotNull
    private final String textSuggestion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("destinations")
    @NotNull
    private final List<a> destinations;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lyfg/f$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "city", "b", "country", "c", "countryCode", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("city")
        @NotNull
        private final String city;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("country")
        @NotNull
        private final String country;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("countryCode")
        @NotNull
        private final String countryCode;

        public a(String city, String country, String countryCode) {
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.city = city;
            this.country = country;
            this.countryCode = countryCode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.city, aVar.city) && Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.countryCode, aVar.countryCode);
        }

        public final int hashCode() {
            return this.countryCode.hashCode() + p.a.c(this.city.hashCode() * 31, 31, this.country);
        }
    }

    public f(String textSuggestion, ArrayList destinations) {
        Intrinsics.checkNotNullParameter(textSuggestion, "textSuggestion");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.textSuggestion = textSuggestion;
        this.destinations = destinations;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDestinations() {
        return this.destinations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTextSuggestion() {
        return this.textSuggestion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.textSuggestion, fVar.textSuggestion) && Intrinsics.f(this.destinations, fVar.destinations);
    }

    public final int hashCode() {
        return this.destinations.hashCode() + (this.textSuggestion.hashCode() * 31);
    }
}
