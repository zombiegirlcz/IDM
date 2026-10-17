package rei;

import com.revolut.feature_travel_hotels_models.property.HotelsPropertyBrief;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tei.b f253605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f253606c;
    public final q d;
    public final e e;
    public final HotelsPropertyBrief f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Pricing f253607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f253608h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f253609j;
    public final s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DateTime f253610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f253611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f253612n;
    public final c o;

    public g(String id10, tei.b status, String bookingReference, q traveller, e dates, HotelsPropertyBrief property, Pricing pricing, b bVar, ArrayList rooms, i payment, s sVar, DateTime dateTime, ArrayList transactions, f fVar, c cVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(bookingReference, "bookingReference");
        Intrinsics.checkNotNullParameter(traveller, "traveller");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f253604a = id10;
        this.f253605b = status;
        this.f253606c = bookingReference;
        this.d = traveller;
        this.e = dates;
        this.f = property;
        this.f253607g = pricing;
        this.f253608h = bVar;
        this.i = rooms;
        this.f253609j = payment;
        this.k = sVar;
        this.f253610l = dateTime;
        this.f253611m = transactions;
        this.f253612n = fVar;
        this.o = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f253604a, gVar.f253604a) && this.f253605b == gVar.f253605b && Intrinsics.f(this.f253606c, gVar.f253606c) && this.d.equals(gVar.d) && this.e.equals(gVar.e) && this.f.equals(gVar.f) && this.f253607g.equals(gVar.f253607g) && Intrinsics.f(this.f253608h, gVar.f253608h) && this.i.equals(gVar.i) && this.f253609j.equals(gVar.f253609j) && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f253610l, gVar.f253610l) && this.f253611m.equals(gVar.f253611m) && this.f253612n == gVar.f253612n && Intrinsics.f(this.o, gVar.o);
    }

    public final int hashCode() {
        int iHashCode = (this.f253607g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + p.a.c((this.f253605b.hashCode() + (this.f253604a.hashCode() * 31)) * 31, 31, this.f253606c)) * 31)) * 31)) * 31)) * 31;
        b bVar = this.f253608h;
        int iHashCode2 = (this.f253609j.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31)) * 31;
        s sVar = this.k;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.f253634a.hashCode())) * 31;
        DateTime dateTime = this.f253610l;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f253611m, (iHashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31);
        f fVar = this.f253612n;
        int iHashCode4 = (iB + (fVar == null ? 0 : fVar.hashCode())) * 31;
        c cVar = this.o;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }
}
