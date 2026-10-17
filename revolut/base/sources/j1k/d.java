package j1k;

import jki.i;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f170623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk0.g f170624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0h.b f170625c;

    public d(DateTime date, lk0.g gVar, n0h.b bVar) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f170623a = date;
        this.f170624b = gVar;
        this.f170625c = bVar;
    }

    public static d a(d dVar, lk0.g gVar, n0h.b bVar, int i) {
        DateTime date = dVar.f170623a;
        if ((i & 2) != 0) {
            gVar = dVar.f170624b;
        }
        if ((i & 4) != 0) {
            bVar = dVar.f170625c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(date, "date");
        return new d(date, gVar, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f170623a, dVar.f170623a) && Intrinsics.f(this.f170624b, dVar.f170624b) && Intrinsics.f(this.f170625c, dVar.f170625c);
    }

    public final int hashCode() {
        int iHashCode = this.f170623a.hashCode() * 31;
        lk0.g gVar = this.f170624b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.f196174a.hashCode())) * 31;
        n0h.b bVar = this.f170625c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
