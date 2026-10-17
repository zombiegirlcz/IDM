package qdb;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R,\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u0014\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006 "}, d2 = {"Lqdb/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "g", "title", "Lqdb/d;", "c", "Lqdb/d;", "()Lqdb/d;", "location", "d", "f", "reservationInterval", "", "e", "I", "()I", "maxGuests", "", "", "Lqdb/f;", "Ljava/util/Map;", "()Ljava/util/Map;", "reservationHours", "headerImageUrl", "Companion", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("location")
    @NotNull
    private final d location;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("reservationInterval")
    @NotNull
    private final String reservationInterval;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("maxGuests")
    private final int maxGuests;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reservationHours")
    @NotNull
    private final Map<String, List<f>> reservationHours;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("headerImageUrl")
    private final String headerImageUrl;

    public m(String id10, String title, d location, String reservationInterval, int i, LinkedHashMap reservationHours, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(reservationInterval, "reservationInterval");
        Intrinsics.checkNotNullParameter(reservationHours, "reservationHours");
        this.id = id10;
        this.title = title;
        this.location = location;
        this.reservationInterval = reservationInterval;
        this.maxGuests = i;
        this.reservationHours = reservationHours;
        this.headerImageUrl = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxGuests() {
        return this.maxGuests;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Map getReservationHours() {
        return this.reservationHours;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.id, mVar.id) && Intrinsics.f(this.title, mVar.title) && Intrinsics.f(this.location, mVar.location) && Intrinsics.f(this.reservationInterval, mVar.reservationInterval) && this.maxGuests == mVar.maxGuests && Intrinsics.f(this.reservationHours, mVar.reservationHours) && Intrinsics.f(this.headerImageUrl, mVar.headerImageUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getReservationInterval() {
        return this.reservationInterval;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iE = p.a.e(j6.a.b(this.maxGuests, p.a.c((this.location.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.title)) * 31, 31, this.reservationInterval), 31), 31, this.reservationHours);
        String str = this.headerImageUrl;
        return iE + (str == null ? 0 : str.hashCode());
    }
}
