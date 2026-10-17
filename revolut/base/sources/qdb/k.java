package qdb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 22\u00020\u0001:\u0003\f\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0005\u0010\u001fR\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0012\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b\u0018\u0010'R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b\t\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u00063"}, d2 = {"Lqdb/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "id", "b", "l", "state", "c", "date", "d", "m", "time", "Lqdb/d;", "e", "Lqdb/d;", "i", "()Lqdb/d;", "location", "", "f", "I", "g", "()I", "guestsTotal", "Lqdb/g;", "Lqdb/g;", "()Lqdb/g;", "area", "Lqdb/k$b;", "Lqdb/k$b;", "()Lqdb/k$b;", "freeCancellationUntil", "Lqdb/k$c;", "Lqdb/k$c;", "()Lqdb/k$c;", "guarantee", "j", "k", "reservationPageId", "Lqdb/a;", "Lqdb/a;", "()Lqdb/a;", "customer", "note", "expiresIn", "Companion", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("date")
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("time")
    @NotNull
    private final String time;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("location")
    @NotNull
    private final d location;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("guestsTotal")
    private final int guestsTotal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("area")
    private final g area;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeCancellationUntil")
    private final b freeCancellationUntil;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("guarantee")
    private final c guarantee;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("reservationPageId")
    private final String reservationPageId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("customer")
    private final a customer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("note")
    private final String note;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiresIn")
    private final String expiresIn;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lqdb/k$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "date", "b", "time", "Companion", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("date")
        @NotNull
        private final String date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("time")
        @NotNull
        private final String time;

        public b(String date, String time) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            this.date = date;
            this.time = time;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTime() {
            return this.time;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.date, bVar.date) && Intrinsics.f(this.time, bVar.time);
        }

        public final int hashCode() {
            return this.time.hashCode() + (this.date.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u0010"}, d2 = {"Lqdb/k$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "state", "c", "type", "Lqdb/k$c$b;", "Lqdb/k$c$b;", "()Lqdb/k$c$b;", "order", "Companion", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        private final String state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("order")
        private final b order;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u0012"}, d2 = {"Lqdb/k$c$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "state", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "d", "token", "key", "Companion", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("state")
            private final String state;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("amount")
            private final jo3.a amount;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("token")
            private final String token;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("key")
            private final String key;

            public b(String str, String str2, String str3, jo3.a aVar) {
                this.state = str;
                this.amount = aVar;
                this.token = str2;
                this.key = str3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jo3.a getAmount() {
                return this.amount;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getState() {
                return this.state;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getToken() {
                return this.token;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.token, bVar.token) && Intrinsics.f(this.key, bVar.key);
            }

            public final int hashCode() {
                String str = this.state;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                jo3.a aVar = this.amount;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str2 = this.token;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.key;
                return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
            }
        }

        public c(String str, String str2, b bVar) {
            this.state = str;
            this.type = str2;
            this.order = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getOrder() {
            return this.order;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.state, cVar.state) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.order, cVar.order);
        }

        public final int hashCode() {
            String str = this.state;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.type;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            b bVar = this.order;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }
    }

    public k(String id10, String state, String date, String time, d location, int i, g gVar, b bVar, c cVar, String str, a aVar, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(location, "location");
        this.id = id10;
        this.state = state;
        this.date = date;
        this.time = time;
        this.location = location;
        this.guestsTotal = i;
        this.area = gVar;
        this.freeCancellationUntil = bVar;
        this.guarantee = cVar;
        this.reservationPageId = str;
        this.customer = aVar;
        this.note = str2;
        this.expiresIn = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getArea() {
        return this.area;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getCustomer() {
        return this.customer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getFreeCancellationUntil() {
        return this.freeCancellationUntil;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.id, kVar.id) && Intrinsics.f(this.state, kVar.state) && Intrinsics.f(this.date, kVar.date) && Intrinsics.f(this.time, kVar.time) && Intrinsics.f(this.location, kVar.location) && this.guestsTotal == kVar.guestsTotal && Intrinsics.f(this.area, kVar.area) && Intrinsics.f(this.freeCancellationUntil, kVar.freeCancellationUntil) && Intrinsics.f(this.guarantee, kVar.guarantee) && Intrinsics.f(this.reservationPageId, kVar.reservationPageId) && Intrinsics.f(this.customer, kVar.customer) && Intrinsics.f(this.note, kVar.note) && Intrinsics.f(this.expiresIn, kVar.expiresIn);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c getGuarantee() {
        return this.guarantee;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getGuestsTotal() {
        return this.guestsTotal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.guestsTotal, (this.location.hashCode() + p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.date), 31, this.time)) * 31, 31);
        g gVar = this.area;
        int iHashCode = (iB + (gVar == null ? 0 : gVar.hashCode())) * 31;
        b bVar = this.freeCancellationUntil;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.guarantee;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.reservationPageId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.customer;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.note;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiresIn;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getReservationPageId() {
        return this.reservationPageId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTime() {
        return this.time;
    }
}
