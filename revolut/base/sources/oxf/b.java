package oxf;

import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f230805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f230807c;
    public final String d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalTime f230808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f230809h;
    public final a i;

    public b(String id10, String name, String image, String type, LocalDate date, String str, LocalTime localTime, LocalDate localDate, a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f230805a = id10;
        this.f230806b = name;
        this.f230807c = image;
        this.d = type;
        this.e = date;
        this.f = str;
        this.f230808g = localTime;
        this.f230809h = localDate;
        this.i = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f230805a, bVar.f230805a) && Intrinsics.f(this.f230806b, bVar.f230806b) && Intrinsics.f(this.f230807c, bVar.f230807c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f230808g, bVar.f230808g) && Intrinsics.f(this.f230809h, bVar.f230809h) && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iA = y.a(p.a.c(p.a.c(p.a.c(this.f230805a.hashCode() * 31, 31, this.f230806b), 31, this.f230807c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        LocalTime localTime = this.f230808g;
        int iHashCode2 = (iHashCode + (localTime == null ? 0 : localTime.hashCode())) * 31;
        LocalDate localDate = this.f230809h;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        a aVar = this.i;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
