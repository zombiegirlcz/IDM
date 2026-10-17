package xdb;

import com.revolut.feature.retail.restaurants.impl.domain.model.LocationInfo;
import java.time.LocalTime;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationInfo f304411c;
    public final LocalTime d;
    public final int e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f304412g;

    public v(String id10, String title, LocationInfo location, LocalTime reservationInterval, int i, Map reservationHours, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(reservationInterval, "reservationInterval");
        Intrinsics.checkNotNullParameter(reservationHours, "reservationHours");
        this.f304409a = id10;
        this.f304410b = title;
        this.f304411c = location;
        this.d = reservationInterval;
        this.e = i;
        this.f = reservationHours;
        this.f304412g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f304409a, vVar.f304409a) && Intrinsics.f(this.f304410b, vVar.f304410b) && Intrinsics.f(this.f304411c, vVar.f304411c) && Intrinsics.f(this.d, vVar.d) && this.e == vVar.e && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f304412g, vVar.f304412g);
    }

    public final int hashCode() {
        int iE = p.a.e(j6.a.b(this.e, (this.d.hashCode() + ((this.f304411c.hashCode() + p.a.c(this.f304409a.hashCode() * 31, 31, this.f304410b)) * 31)) * 31, 31), 31, this.f);
        String str = this.f304412g;
        return iE + (str == null ? 0 : str.hashCode());
    }
}
