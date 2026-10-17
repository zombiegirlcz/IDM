package l7g;

import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192587c;
    public final q d;
    public final String e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f192588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f192589h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f192590j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f192591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f192592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f192593n;
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f192594p;

    public b0(String id10, String origin, String destination, q status, String customerOrderReference, s tripType, LocalDate departureDate, LocalDate localDate, String destinationImageUrl, k kVar, ArrayList bounds, ArrayList travellers, o oVar, ArrayList checkInInstructions, ArrayList itineraryTraits, ArrayList boundsDetails) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(customerOrderReference, "customerOrderReference");
        Intrinsics.checkNotNullParameter(tripType, "tripType");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(destinationImageUrl, "destinationImageUrl");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(travellers, "travellers");
        Intrinsics.checkNotNullParameter(checkInInstructions, "checkInInstructions");
        Intrinsics.checkNotNullParameter(itineraryTraits, "itineraryTraits");
        Intrinsics.checkNotNullParameter(boundsDetails, "boundsDetails");
        this.f192585a = id10;
        this.f192586b = origin;
        this.f192587c = destination;
        this.d = status;
        this.e = customerOrderReference;
        this.f = tripType;
        this.f192588g = departureDate;
        this.f192589h = localDate;
        this.i = destinationImageUrl;
        this.f192590j = kVar;
        this.k = bounds;
        this.f192591l = travellers;
        this.f192592m = oVar;
        this.f192593n = checkInInstructions;
        this.o = itineraryTraits;
        this.f192594p = boundsDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f192585a, b0Var.f192585a) && Intrinsics.f(this.f192586b, b0Var.f192586b) && Intrinsics.f(this.f192587c, b0Var.f192587c) && this.d == b0Var.d && Intrinsics.f(this.e, b0Var.e) && this.f == b0Var.f && Intrinsics.f(this.f192588g, b0Var.f192588g) && Intrinsics.f(this.f192589h, b0Var.f192589h) && Intrinsics.f(this.i, b0Var.i) && Intrinsics.f(this.f192590j, b0Var.f192590j) && this.k.equals(b0Var.k) && this.f192591l.equals(b0Var.f192591l) && Intrinsics.f(this.f192592m, b0Var.f192592m) && this.f192593n.equals(b0Var.f192593n) && this.o.equals(b0Var.o) && this.f192594p.equals(b0Var.f192594p);
    }

    public final int hashCode() {
        int iA = wp5.y.a((this.f.hashCode() + p.a.c((this.d.hashCode() + p.a.c(p.a.c(this.f192585a.hashCode() * 31, 31, this.f192586b), 31, this.f192587c)) * 31, 31, this.e)) * 31, 31, this.f192588g);
        LocalDate localDate = this.f192589h;
        int iC = p.a.c((iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.i);
        k kVar = this.f192590j;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f192591l, com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, (iC + (kVar == null ? 0 : kVar.hashCode())) * 31, 31), 31);
        o oVar = this.f192592m;
        return this.f192594p.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.o, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f192593n, (iB + (oVar != null ? oVar.hashCode() : 0)) * 31, 31), 31);
    }
}
