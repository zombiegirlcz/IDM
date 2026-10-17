package kil;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Lkil/a;", "", "", "toString", "()Ljava/lang/String;", "Liil/a;", "a", "Liil/a;", "()Liil/a;", "projections", "b", "Ljava/lang/String;", "getStartDate", "startDate", "feature_shared_wealth_orders_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("projections")
    @NotNull
    private final iil.a projections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("startDate")
    @NotNull
    private final String startDate;

    public a(iil.a projections, String startDate) {
        Intrinsics.checkNotNullParameter(projections, "projections");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.projections = projections;
        this.startDate = startDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iil.a getProjections() {
        return this.projections;
    }

    public final LocalDate b() {
        LocalDate localDate = LocalDate.parse(this.startDate);
        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
        return localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.projections, aVar.projections) && Intrinsics.f(this.startDate, aVar.startDate);
    }

    public final int hashCode() {
        return this.startDate.hashCode() + (this.projections.hashCode() * 31);
    }
}
