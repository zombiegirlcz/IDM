package cgi;

import com.revolut.feature_travel_hotels_models.property.Description;
import com.revolut.feature_travel_hotels_models.property.room.Area;
import com.revolut.feature_travel_hotels_models.property.room.MaxOccupancy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Description f24008c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Area f24010h;
    public final MaxOccupancy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f24011j;

    public n(String id10, String name, Description description, ArrayList images, ArrayList rates, ArrayList amenities, ArrayList views, Area area, MaxOccupancy maxOccupancy, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        Intrinsics.checkNotNullParameter(views, "views");
        this.f24006a = id10;
        this.f24007b = name;
        this.f24008c = description;
        this.d = images;
        this.e = rates;
        this.f = amenities;
        this.f24009g = views;
        this.f24010h = area;
        this.i = maxOccupancy;
        this.f24011j = arrayList;
    }

    @Override // cgi.p
    public final List a() {
        return this.e;
    }

    @Override // cgi.p
    public final List b() {
        return this.f;
    }

    @Override // cgi.p
    /* JADX INFO: renamed from: c */
    public final MaxOccupancy getI() {
        return this.i;
    }

    @Override // cgi.p
    public final List d() {
        return this.f24009g;
    }

    @Override // cgi.p
    /* JADX INFO: renamed from: e */
    public final Area getF98102h() {
        return this.f24010h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f24006a, nVar.f24006a) && Intrinsics.f(this.f24007b, nVar.f24007b) && this.f24008c.equals(nVar.f24008c) && this.d.equals(nVar.d) && this.e.equals(nVar.e) && this.f.equals(nVar.f) && this.f24009g.equals(nVar.f24009g) && Intrinsics.f(this.f24010h, nVar.f24010h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f24011j, nVar.f24011j);
    }

    @Override // cgi.p
    /* JADX INFO: renamed from: getId */
    public final String getF98098a() {
        return this.f24006a;
    }

    @Override // cgi.p
    /* JADX INFO: renamed from: getName */
    public final String getF98099b() {
        return this.f24007b;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f24009g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f24008c.hashCode() + p.a.c(this.f24006a.hashCode() * 31, 31, this.f24007b)) * 31, 31), 31), 31), 31);
        Area area = this.f24010h;
        int iHashCode = (iB + (area == null ? 0 : area.hashCode())) * 31;
        MaxOccupancy maxOccupancy = this.i;
        int iHashCode2 = (iHashCode + (maxOccupancy == null ? 0 : maxOccupancy.hashCode())) * 31;
        List list = this.f24011j;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // cgi.p
    public final List j() {
        return this.d;
    }
}
