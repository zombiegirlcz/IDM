package yfg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\u0005\u0014\u000b\u000f\u0012J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001a\u00105\u001a\u0002018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b3\u00104R \u00107\u001a\b\u0012\u0004\u0012\u0002060\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b$\u0010\rR\u001a\u00108\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u00109\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001a\u0010:\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010;\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006<"}, d2 = {"Lyfg/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "flightId", "", "Lyfg/n$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "airlines", "c", "f", "departsAt", "d", "arrivesAt", "e", "h", "departureIataCode", "arrivalIataCode", "", "g", "J", "q", "()J", "totalDuration", "", "D", "n", "()D", "revpointsPrice", "Ljo3/b;", "i", "Ljo3/b;", "p", "()Ljo3/b;", "taxesPrice", "", "I", "l", "()I", "numberOfSegments", "k", "m", "provider", "Lyfg/n$e;", "Lyfg/n$e;", "o", "()Lyfg/n$e;", "segmentsBreakdown", "Lyfg/n$b;", "flightClasses", "ctaText", "flightImageUrl", "departureCity", "arrivalCity", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("flightId")
    @NotNull
    private final String flightId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("airlines")
    @NotNull
    private final List<a> airlines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("departsAt")
    @NotNull
    private final String departsAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("arrivesAt")
    @NotNull
    private final String arrivesAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("departureIataCode")
    @NotNull
    private final String departureIataCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("arrivalIataCode")
    @NotNull
    private final String arrivalIataCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalDuration")
    private final long totalDuration;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("revpointsPrice")
    private final double revpointsPrice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("taxesPrice")
    @NotNull
    private final jo3.b taxesPrice;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("numberOfSegments")
    private final int numberOfSegments;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("provider")
    @NotNull
    private final String provider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("segmentsBreakdown")
    @NotNull
    private final e segmentsBreakdown;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("classes")
    @NotNull
    private final List<b> flightClasses;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("ctaText")
    @NotNull
    private final String ctaText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("flightImageUrl")
    @NotNull
    private final String flightImageUrl;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("departureCity")
    @NotNull
    private final String departureCity;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("arrivalCity")
    @NotNull
    private final String arrivalCity;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Lyfg/n$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "airlineName", "b", "airlineIconUrl", "airlineIconName", "d", "airlineRef", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("airlineName")
        @NotNull
        private final String airlineName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("airlineIconUrl")
        private final String airlineIconUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("airlineIconName")
        private final String airlineIconName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("airlineRef")
        private final String airlineRef;

        public a(String airlineName, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(airlineName, "airlineName");
            this.airlineName = airlineName;
            this.airlineIconUrl = str;
            this.airlineIconName = str2;
            this.airlineRef = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAirlineIconName() {
            return this.airlineIconName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAirlineName() {
            return this.airlineName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAirlineRef() {
            return this.airlineRef;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.airlineName, aVar.airlineName) && Intrinsics.f(this.airlineIconUrl, aVar.airlineIconUrl) && Intrinsics.f(this.airlineIconName, aVar.airlineIconName) && Intrinsics.f(this.airlineRef, aVar.airlineRef);
        }

        public final int hashCode() {
            int iHashCode = this.airlineName.hashCode() * 31;
            String str = this.airlineIconUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.airlineIconName;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.airlineRef;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0016"}, d2 = {"Lyfg/n$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "type", "b", "name", "", "c", "D", "()D", "revpointsPrice", "Ljo3/b;", "d", "Ljo3/b;", "()Ljo3/b;", "taxesPrice", "bookingUrl", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("class")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("revpointsPrice")
        private final double revpointsPrice;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("taxesPrice")
        @NotNull
        private final jo3.b taxesPrice;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("bookingUrl")
        @NotNull
        private final String bookingUrl;

        public b(String type, String name, double d, jo3.b taxesPrice, String bookingUrl) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(taxesPrice, "taxesPrice");
            Intrinsics.checkNotNullParameter(bookingUrl, "bookingUrl");
            this.type = type;
            this.name = name;
            this.revpointsPrice = d;
            this.taxesPrice = taxesPrice;
            this.bookingUrl = bookingUrl;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBookingUrl() {
            return this.bookingUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final double getRevpointsPrice() {
            return this.revpointsPrice;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.b getTaxesPrice() {
            return this.taxesPrice;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.name, bVar.name) && Double.compare(this.revpointsPrice, bVar.revpointsPrice) == 0 && Intrinsics.f(this.taxesPrice, bVar.taxesPrice) && Intrinsics.f(this.bookingUrl, bVar.bookingUrl);
        }

        public final int hashCode() {
            return this.bookingUrl.hashCode() + y.e(this.taxesPrice, m72.b.c(p.a.c(this.type.hashCode() * 31, 31, this.name), this.revpointsPrice, 31), 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u001b\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b$\u0010(¨\u0006*"}, d2 = {"Lyfg/n$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "o", "segmentId", "b", "m", "flightNumber", "c", "aircraftName", "d", "airlineName", "e", "airlineRef", "f", "airlineIconUrl", "g", "airlineIconName", "h", "i", "departsAt", "arrivesAt", "", "j", "Ljava/lang/Long;", "l", "()Ljava/lang/Long;", "duration", "k", "departureAirport", "arrivalAirport", "departureDescription", "n", "arrivalDescription", "Lyfg/n$d;", "Lyfg/n$d;", "()Lyfg/n$d;", "nextConnection", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("segmentId")
        @NotNull
        private final String segmentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("flightNumber")
        @NotNull
        private final String flightNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("aircraftName")
        private final String aircraftName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("airlineName")
        @NotNull
        private final String airlineName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("airlineRef")
        @NotNull
        private final String airlineRef;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("airlineIconUrl")
        private final String airlineIconUrl;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("airlineIconName")
        private final String airlineIconName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("departsAt")
        @NotNull
        private final String departsAt;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("arrivesAt")
        @NotNull
        private final String arrivesAt;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("duration")
        private final Long duration;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("departureAirport")
        @NotNull
        private final String departureAirport;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("arrivalAirport")
        @NotNull
        private final String arrivalAirport;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @lg.b("departureDescription")
        @NotNull
        private final String departureDescription;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @lg.b("arrivalDescription")
        @NotNull
        private final String arrivalDescription;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @lg.b("nextConnection")
        private final d nextConnection;

        public c(String segmentId, String flightNumber, String str, String airlineName, String airlineRef, String str2, String str3, String departsAt, String arrivesAt, Long l2, String departureAirport, String arrivalAirport, String departureDescription, String arrivalDescription, d dVar) {
            Intrinsics.checkNotNullParameter(segmentId, "segmentId");
            Intrinsics.checkNotNullParameter(flightNumber, "flightNumber");
            Intrinsics.checkNotNullParameter(airlineName, "airlineName");
            Intrinsics.checkNotNullParameter(airlineRef, "airlineRef");
            Intrinsics.checkNotNullParameter(departsAt, "departsAt");
            Intrinsics.checkNotNullParameter(arrivesAt, "arrivesAt");
            Intrinsics.checkNotNullParameter(departureAirport, "departureAirport");
            Intrinsics.checkNotNullParameter(arrivalAirport, "arrivalAirport");
            Intrinsics.checkNotNullParameter(departureDescription, "departureDescription");
            Intrinsics.checkNotNullParameter(arrivalDescription, "arrivalDescription");
            this.segmentId = segmentId;
            this.flightNumber = flightNumber;
            this.aircraftName = str;
            this.airlineName = airlineName;
            this.airlineRef = airlineRef;
            this.airlineIconUrl = str2;
            this.airlineIconName = str3;
            this.departsAt = departsAt;
            this.arrivesAt = arrivesAt;
            this.duration = l2;
            this.departureAirport = departureAirport;
            this.arrivalAirport = arrivalAirport;
            this.departureDescription = departureDescription;
            this.arrivalDescription = arrivalDescription;
            this.nextConnection = dVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAircraftName() {
            return this.aircraftName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAirlineIconName() {
            return this.airlineIconName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAirlineName() {
            return this.airlineName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getAirlineRef() {
            return this.airlineRef;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.segmentId, cVar.segmentId) && Intrinsics.f(this.flightNumber, cVar.flightNumber) && Intrinsics.f(this.aircraftName, cVar.aircraftName) && Intrinsics.f(this.airlineName, cVar.airlineName) && Intrinsics.f(this.airlineRef, cVar.airlineRef) && Intrinsics.f(this.airlineIconUrl, cVar.airlineIconUrl) && Intrinsics.f(this.airlineIconName, cVar.airlineIconName) && Intrinsics.f(this.departsAt, cVar.departsAt) && Intrinsics.f(this.arrivesAt, cVar.arrivesAt) && Intrinsics.f(this.duration, cVar.duration) && Intrinsics.f(this.departureAirport, cVar.departureAirport) && Intrinsics.f(this.arrivalAirport, cVar.arrivalAirport) && Intrinsics.f(this.departureDescription, cVar.departureDescription) && Intrinsics.f(this.arrivalDescription, cVar.arrivalDescription) && Intrinsics.f(this.nextConnection, cVar.nextConnection);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getArrivalAirport() {
            return this.arrivalAirport;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getArrivalDescription() {
            return this.arrivalDescription;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getArrivesAt() {
            return this.arrivesAt;
        }

        public final int hashCode() {
            int iC = p.a.c(this.segmentId.hashCode() * 31, 31, this.flightNumber);
            String str = this.aircraftName;
            int iC2 = p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.airlineName), 31, this.airlineRef);
            String str2 = this.airlineIconUrl;
            int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.airlineIconName;
            int iC3 = p.a.c(p.a.c((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.departsAt), 31, this.arrivesAt);
            Long l2 = this.duration;
            int iC4 = p.a.c(p.a.c(p.a.c(p.a.c((iC3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.departureAirport), 31, this.arrivalAirport), 31, this.departureDescription), 31, this.arrivalDescription);
            d dVar = this.nextConnection;
            return iC4 + (dVar != null ? dVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getDepartsAt() {
            return this.departsAt;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getDepartureAirport() {
            return this.departureAirport;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getDepartureDescription() {
            return this.departureDescription;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Long getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getFlightNumber() {
            return this.flightNumber;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final d getNextConnection() {
            return this.nextConnection;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getSegmentId() {
            return this.segmentId;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lyfg/n$d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "airportChange", "", "b", "I", "()I", "layoverDuration", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("airportChange")
        private final boolean airportChange;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("layoverDuration")
        private final int layoverDuration;

        public d(boolean z, int i) {
            this.airportChange = z;
            this.layoverDuration = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAirportChange() {
            return this.airportChange;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLayoverDuration() {
            return this.layoverDuration;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return this.airportChange == dVar.airportChange && this.layoverDuration == dVar.layoverDuration;
        }

        public final int hashCode() {
            return Integer.hashCode(this.layoverDuration) + (Boolean.hashCode(this.airportChange) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lyfg/n$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "arrivalDate", "", "Lyfg/n$c;", "b", "Ljava/util/List;", "()Ljava/util/List;", "segments", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("arrivalDate")
        @NotNull
        private final String arrivalDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("segments")
        @NotNull
        private final List<c> segments;

        public e(String arrivalDate, ArrayList segments) {
            Intrinsics.checkNotNullParameter(arrivalDate, "arrivalDate");
            Intrinsics.checkNotNullParameter(segments, "segments");
            this.arrivalDate = arrivalDate;
            this.segments = segments;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getArrivalDate() {
            return this.arrivalDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getSegments() {
            return this.segments;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.arrivalDate, eVar.arrivalDate) && Intrinsics.f(this.segments, eVar.segments);
        }

        public final int hashCode() {
            return this.segments.hashCode() + (this.arrivalDate.hashCode() * 31);
        }
    }

    public n(String flightId, ArrayList airlines, String departsAt, String arrivesAt, String departureIataCode, String arrivalIataCode, long j2, double d5, jo3.b taxesPrice, int i, String provider, e segmentsBreakdown, ArrayList flightClasses, String ctaText, String flightImageUrl, String departureCity, String arrivalCity) {
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(departsAt, "departsAt");
        Intrinsics.checkNotNullParameter(arrivesAt, "arrivesAt");
        Intrinsics.checkNotNullParameter(departureIataCode, "departureIataCode");
        Intrinsics.checkNotNullParameter(arrivalIataCode, "arrivalIataCode");
        Intrinsics.checkNotNullParameter(taxesPrice, "taxesPrice");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(segmentsBreakdown, "segmentsBreakdown");
        Intrinsics.checkNotNullParameter(flightClasses, "flightClasses");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(flightImageUrl, "flightImageUrl");
        Intrinsics.checkNotNullParameter(departureCity, "departureCity");
        Intrinsics.checkNotNullParameter(arrivalCity, "arrivalCity");
        this.flightId = flightId;
        this.airlines = airlines;
        this.departsAt = departsAt;
        this.arrivesAt = arrivesAt;
        this.departureIataCode = departureIataCode;
        this.arrivalIataCode = arrivalIataCode;
        this.totalDuration = j2;
        this.revpointsPrice = d5;
        this.taxesPrice = taxesPrice;
        this.numberOfSegments = i;
        this.provider = provider;
        this.segmentsBreakdown = segmentsBreakdown;
        this.flightClasses = flightClasses;
        this.ctaText = ctaText;
        this.flightImageUrl = flightImageUrl;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAirlines() {
        return this.airlines;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getArrivalCity() {
        return this.arrivalCity;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getArrivalIataCode() {
        return this.arrivalIataCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getArrivesAt() {
        return this.arrivesAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.flightId, nVar.flightId) && Intrinsics.f(this.airlines, nVar.airlines) && Intrinsics.f(this.departsAt, nVar.departsAt) && Intrinsics.f(this.arrivesAt, nVar.arrivesAt) && Intrinsics.f(this.departureIataCode, nVar.departureIataCode) && Intrinsics.f(this.arrivalIataCode, nVar.arrivalIataCode) && this.totalDuration == nVar.totalDuration && Double.compare(this.revpointsPrice, nVar.revpointsPrice) == 0 && Intrinsics.f(this.taxesPrice, nVar.taxesPrice) && this.numberOfSegments == nVar.numberOfSegments && Intrinsics.f(this.provider, nVar.provider) && Intrinsics.f(this.segmentsBreakdown, nVar.segmentsBreakdown) && Intrinsics.f(this.flightClasses, nVar.flightClasses) && Intrinsics.f(this.ctaText, nVar.ctaText) && Intrinsics.f(this.flightImageUrl, nVar.flightImageUrl) && Intrinsics.f(this.departureCity, nVar.departureCity) && Intrinsics.f(this.arrivalCity, nVar.arrivalCity);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDepartsAt() {
        return this.departsAt;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDepartureCity() {
        return this.departureCity;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDepartureIataCode() {
        return this.departureIataCode;
    }

    public final int hashCode() {
        return this.arrivalCity.hashCode() + p.a.c(p.a.c(p.a.c(p.a.d((this.segmentsBreakdown.hashCode() + p.a.c(j6.a.b(this.numberOfSegments, y.e(this.taxesPrice, m72.b.c(a0.d.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.d(this.flightId.hashCode() * 31, 31, this.airlines), 31, this.departsAt), 31, this.arrivesAt), 31, this.departureIataCode), 31, this.arrivalIataCode), 31, this.totalDuration), this.revpointsPrice, 31), 31), 31), 31, this.provider)) * 31, 31, this.flightClasses), 31, this.ctaText), 31, this.flightImageUrl), 31, this.departureCity);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getFlightClasses() {
        return this.flightClasses;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFlightId() {
        return this.flightId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getFlightImageUrl() {
        return this.flightImageUrl;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getNumberOfSegments() {
        return this.numberOfSegments;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final double getRevpointsPrice() {
        return this.revpointsPrice;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final e getSegmentsBreakdown() {
        return this.segmentsBreakdown;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final jo3.b getTaxesPrice() {
        return this.taxesPrice;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getTotalDuration() {
        return this.totalDuration;
    }
}
