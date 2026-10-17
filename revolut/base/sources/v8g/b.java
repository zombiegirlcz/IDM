package v8g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\b\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\r\u0010\u0017¨\u0006\u0019"}, d2 = {"Lv8g/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "checkIn", "b", "checkOut", "c", "f", "validUntil", "d", "deeplink", "Lv8g/b$b;", "e", "Lv8g/b$b;", "()Lv8g/b$b;", "location", "", "Lv8g/b$a;", "Ljava/util/List;", "()Ljava/util/List;", "hotels", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkIn")
    @NotNull
    private final String checkIn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkOut")
    @NotNull
    private final String checkOut;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("validUntil")
    @NotNull
    private final String validUntil;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("deeplink")
    @NotNull
    private final String deeplink;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("location")
    @NotNull
    private final C1585b location;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("hotels")
    @NotNull
    private final List<a> hotels;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u001b"}, d2 = {"Lv8g/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "d", "image", "Lv8g/b$c;", "c", "Lv8g/b$c;", "f", "()Lv8g/b$c;", "pricing", "", "I", "()I", "guestReviews", "", "D", "()D", "guestReviewScore10Scale", "deeplink", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("image")
        @NotNull
        private final String image;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricing")
        @NotNull
        private final c pricing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("guestReviews")
        private final int guestReviews;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("guestReviewScore10Scale")
        private final double guestReviewScore10Scale;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("deeplink")
        @NotNull
        private final String deeplink;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getGuestReviewScore10Scale() {
            return this.guestReviewScore10Scale;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getGuestReviews() {
            return this.guestReviews;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.image, aVar.image) && Intrinsics.f(this.pricing, aVar.pricing) && this.guestReviews == aVar.guestReviews && Double.compare(this.guestReviewScore10Scale, aVar.guestReviewScore10Scale) == 0 && Intrinsics.f(this.deeplink, aVar.deeplink);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final c getPricing() {
            return this.pricing;
        }

        public final int hashCode() {
            return this.deeplink.hashCode() + m72.b.c(j6.a.b(this.guestReviews, (this.pricing.hashCode() + p.a.c(this.name.hashCode() * 31, 31, this.image)) * 31, 31), this.guestReviewScore10Scale, 31);
        }
    }

    /* JADX INFO: renamed from: v8g.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000e"}, d2 = {"Lv8g/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "getType", "type", "c", "name", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1585b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1585b)) {
                return false;
            }
            C1585b c1585b = (C1585b) obj2;
            return Intrinsics.f(this.id, c1585b.id) && Intrinsics.f(this.type, c1585b.type) && Intrinsics.f(this.name, c1585b.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.type);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lv8g/b$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "amount", "b", "Ljava/lang/String;", "currency", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.amount == cVar.amount && Intrinsics.f(this.currency, cVar.currency);
        }

        public final int hashCode() {
            return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCheckIn() {
        return this.checkIn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheckOut() {
        return this.checkOut;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getHotels() {
        return this.hotels;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C1585b getLocation() {
        return this.location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.checkIn, bVar.checkIn) && Intrinsics.f(this.checkOut, bVar.checkOut) && Intrinsics.f(this.validUntil, bVar.validUntil) && Intrinsics.f(this.deeplink, bVar.deeplink) && Intrinsics.f(this.location, bVar.location) && Intrinsics.f(this.hotels, bVar.hotels);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getValidUntil() {
        return this.validUntil;
    }

    public final int hashCode() {
        return this.hotels.hashCode() + ((this.location.hashCode() + p.a.c(p.a.c(p.a.c(this.checkIn.hashCode() * 31, 31, this.checkOut), 31, this.validUntil), 31, this.deeplink)) * 31);
    }
}
