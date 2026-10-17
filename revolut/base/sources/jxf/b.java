package jxf;

import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f179195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f179196c;
    public final Integer d;
    public final ArrayList e;
    public final e f;

    public b(String id10, LocalDate startDate, LocalDate localDate, Integer num, ArrayList destinations, e recommendations) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        Intrinsics.checkNotNullParameter(recommendations, "recommendations");
        this.f179194a = id10;
        this.f179195b = startDate;
        this.f179196c = localDate;
        this.d = num;
        this.e = destinations;
        this.f = recommendations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f179194a, bVar.f179194a) && Intrinsics.f(this.f179195b, bVar.f179195b) && Intrinsics.f(this.f179196c, bVar.f179196c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e) && this.f.equals(bVar.f);
    }

    public final int hashCode() {
        int iA = y.a(this.f179194a.hashCode() * 31, 31, this.f179195b);
        LocalDate localDate = this.f179196c;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.d;
        return this.f.f179200a.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31);
    }
}
