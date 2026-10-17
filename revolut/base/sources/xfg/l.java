package xfg;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xfg.d0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lxfg/l;", "", "", "toString", "()Ljava/lang/String;", "Lxfg/d0$b;", "a", "Lxfg/d0$b;", "getOrigin", "()Lxfg/d0$b;", "origin", "b", "getDestination", "destination", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "getDate", "()Ljava/time/LocalDate;", "date", "Lxfg/d0$a;", "d", "Lxfg/d0$a;", "getFilters", "()Lxfg/d0$a;", "filters", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("origin")
    @NotNull
    private final d0.b origin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("destination")
    @NotNull
    private final d0.b destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("date")
    @NotNull
    private final LocalDate date;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("filters")
    private final d0.a filters;

    public l(d0.b origin, d0.b destination, LocalDate date, d0.a aVar) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(date, "date");
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.filters = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.origin, lVar.origin) && Intrinsics.f(this.destination, lVar.destination) && Intrinsics.f(this.date, lVar.date) && Intrinsics.f(this.filters, lVar.filters);
    }

    public final int hashCode() {
        int iA = wp5.y.a((this.destination.hashCode() + (this.origin.hashCode() * 31)) * 31, 31, this.date);
        d0.a aVar = this.filters;
        return iA + (aVar == null ? 0 : aVar.hashCode());
    }
}
