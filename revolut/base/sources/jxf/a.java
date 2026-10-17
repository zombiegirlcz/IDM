package jxf;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f179191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f179192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f179193c;
    public final Integer d;
    public final List e;

    public a(d destination, LocalDate startDate, LocalDate localDate, Integer num, List properties) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f179191a = destination;
        this.f179192b = startDate;
        this.f179193c = localDate;
        this.d = num;
        this.e = properties;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f179191a, aVar.f179191a) && Intrinsics.f(this.f179192b, aVar.f179192b) && Intrinsics.f(this.f179193c, aVar.f179193c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iA = y.a(this.f179191a.hashCode() * 31, 31, this.f179192b);
        LocalDate localDate = this.f179193c;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
