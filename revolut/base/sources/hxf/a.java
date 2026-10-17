package hxf;

import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156584c;
    public final e d;
    public final LocalDate e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalTime f156585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f156586h;
    public final b i;

    public a(String id10, String name, String image, e type, LocalDate date, d dVar, LocalTime localTime, LocalDate localDate, b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f156582a = id10;
        this.f156583b = name;
        this.f156584c = image;
        this.d = type;
        this.e = date;
        this.f = dVar;
        this.f156585g = localTime;
        this.f156586h = localDate;
        this.i = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f156582a, aVar.f156582a) && Intrinsics.f(this.f156583b, aVar.f156583b) && Intrinsics.f(this.f156584c, aVar.f156584c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && Intrinsics.f(this.f156585g, aVar.f156585g) && Intrinsics.f(this.f156586h, aVar.f156586h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iA = y.a((this.d.hashCode() + p.a.c(p.a.c(this.f156582a.hashCode() * 31, 31, this.f156583b), 31, this.f156584c)) * 31, 31, this.e);
        d dVar = this.f;
        int iHashCode = (iA + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalTime localTime = this.f156585g;
        int iHashCode2 = (iHashCode + (localTime == null ? 0 : localTime.hashCode())) * 31;
        LocalDate localDate = this.f156586h;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        b bVar = this.i;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}
