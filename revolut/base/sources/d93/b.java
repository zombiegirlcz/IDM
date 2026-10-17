package d93;

import c93.j;
import h93.f;
import h93.s;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f112335h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f112337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f112338c;
    public final f d;
    public final j e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f112339g;

    static {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        s sVar = s.NONE;
        j.Companion.getClass();
        f112335h = new b("", localDateNow, sVar, null, j.f22287c, null, null);
    }

    public b(String name, LocalDate estimatedDeliveryTime, s trackingChannel, f fVar, j pricing, dj0.d dVar, Long l2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(estimatedDeliveryTime, "estimatedDeliveryTime");
        Intrinsics.checkNotNullParameter(trackingChannel, "trackingChannel");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.f112336a = name;
        this.f112337b = estimatedDeliveryTime;
        this.f112338c = trackingChannel;
        this.d = fVar;
        this.e = pricing;
        this.f = dVar;
        this.f112339g = l2;
    }

    public final LocalDate a(boolean z) {
        boolean zF = Intrinsics.f(this.f112336a, "PRIORITY");
        LocalDate localDate = null;
        f fVar = this.d;
        if (zF && z) {
            if (fVar != null) {
                localDate = fVar.f150108a;
            }
        } else if (fVar != null) {
            localDate = fVar.f150109b;
        }
        return localDate == null ? this.f112337b : localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f112336a, bVar.f112336a) && Intrinsics.f(this.f112337b, bVar.f112337b) && this.f112338c == bVar.f112338c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f112339g, bVar.f112339g);
    }

    public final int hashCode() {
        int iHashCode = (this.f112338c.hashCode() + com.revolut.data.database.models.openbanking.d.g(this.f112337b, this.f112336a.hashCode() * 31, 31)) * 31;
        f fVar = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31;
        dj0.d dVar = this.f;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Long l2 = this.f112339g;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }
}
