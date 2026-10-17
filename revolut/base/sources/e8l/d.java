package e8l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Le8l/d;", "", "", "toString", "()Ljava/lang/String;", "Le8l/a;", "a", "Le8l/a;", "b", "()Le8l/a;", "total", "c", "totalConverted", "", "Le8l/c;", "Ljava/util/List;", "()Ljava/util/List;", "breakdown", "d", "totalInBaseCurrency", "Companion", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final a total;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalConverted")
    private final a totalConverted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("breakdown")
    @NotNull
    private final List<c> breakdown;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalInBaseCurrency")
    private final a totalInBaseCurrency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBreakdown() {
        return this.breakdown;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getTotalConverted() {
        return this.totalConverted;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getTotalInBaseCurrency() {
        return this.totalInBaseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.total, dVar.total) && Intrinsics.f(this.totalConverted, dVar.totalConverted) && Intrinsics.f(this.breakdown, dVar.breakdown) && Intrinsics.f(this.totalInBaseCurrency, dVar.totalInBaseCurrency);
    }

    public final int hashCode() {
        int iHashCode = this.total.hashCode() * 31;
        a aVar = this.totalConverted;
        int iD = p.a.d((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.breakdown);
        a aVar2 = this.totalInBaseCurrency;
        return iD + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
