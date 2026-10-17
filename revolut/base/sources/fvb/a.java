package fvb;

import com.revolut.feature.rev_points.models.RevPoints;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f138407c;
    public final String d;
    public final ZonedDateTime e;
    public final RevPoints f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RevPoints f138408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RevPoints f138409h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f138410j;

    public a(String id10, String name, String description, String image, ZonedDateTime zonedDateTime, RevPoints revPoints, RevPoints revPoints2, RevPoints revPoints3, ArrayList nextBids, c usersBidStatus) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(nextBids, "nextBids");
        Intrinsics.checkNotNullParameter(usersBidStatus, "usersBidStatus");
        this.f138405a = id10;
        this.f138406b = name;
        this.f138407c = description;
        this.d = image;
        this.e = zonedDateTime;
        this.f = revPoints;
        this.f138408g = revPoints2;
        this.f138409h = revPoints3;
        this.i = nextBids;
        this.f138410j = usersBidStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f138405a, aVar.f138405a) && Intrinsics.f(this.f138406b, aVar.f138406b) && Intrinsics.f(this.f138407c, aVar.f138407c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f138408g, aVar.f138408g) && Intrinsics.f(this.f138409h, aVar.f138409h) && this.i.equals(aVar.i) && this.f138410j == aVar.f138410j;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f138405a.hashCode() * 31, 31, this.f138406b), 31, this.f138407c), 31, this.d);
        ZonedDateTime zonedDateTime = this.e;
        int iHashCode = (iC + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        RevPoints revPoints = this.f;
        int iHashCode2 = (iHashCode + (revPoints == null ? 0 : revPoints.f83960a.hashCode())) * 31;
        RevPoints revPoints2 = this.f138408g;
        int iHashCode3 = (iHashCode2 + (revPoints2 == null ? 0 : revPoints2.f83960a.hashCode())) * 31;
        RevPoints revPoints3 = this.f138409h;
        return this.f138410j.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, (iHashCode3 + (revPoints3 != null ? revPoints3.f83960a.hashCode() : 0)) * 31, 31);
    }
}
