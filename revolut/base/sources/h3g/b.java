package h3g;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f149118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149119c;

    public b(Date date, String id10, String rawValue) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f149117a = id10;
        this.f149118b = date;
        this.f149119c = rawValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f149117a, bVar.f149117a) && Intrinsics.f(this.f149118b, bVar.f149118b) && Intrinsics.f(this.f149119c, bVar.f149119c);
    }

    public final int hashCode() {
        int iHashCode = this.f149117a.hashCode() * 31;
        Date date = this.f149118b;
        return this.f149119c.hashCode() + ((iHashCode + (date == null ? 0 : date.hashCode())) * 31);
    }
}
