package ttl;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4l.k f274445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f274446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f274447c;

    public g(k4l.k expiryDateType, LocalDate localDate, Data dateTypesMap) {
        Intrinsics.checkNotNullParameter(expiryDateType, "expiryDateType");
        Intrinsics.checkNotNullParameter(dateTypesMap, "dateTypesMap");
        this.f274445a = expiryDateType;
        this.f274446b = localDate;
        this.f274447c = dateTypesMap;
    }

    public static g a(g gVar, k4l.k expiryDateType, LocalDate localDate, Data dateTypesMap, int i) {
        if ((i & 1) != 0) {
            expiryDateType = gVar.f274445a;
        }
        if ((i & 2) != 0) {
            localDate = gVar.f274446b;
        }
        if ((i & 4) != 0) {
            dateTypesMap = gVar.f274447c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(expiryDateType, "expiryDateType");
        Intrinsics.checkNotNullParameter(dateTypesMap, "dateTypesMap");
        return new g(expiryDateType, localDate, dateTypesMap);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f274445a == gVar.f274445a && Intrinsics.f(this.f274446b, gVar.f274446b) && Intrinsics.f(this.f274447c, gVar.f274447c);
    }

    public final int hashCode() {
        int iHashCode = this.f274445a.hashCode() * 31;
        LocalDate localDate = this.f274446b;
        return this.f274447c.hashCode() + ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}
