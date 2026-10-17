package zek;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u0019"}, d2 = {"Lzek/e;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "d", "()Ljava/math/BigDecimal;", "smallPercent", "b", "c", "largePercent", "Lzek/d;", "Lzek/d;", "()Lzek/d;", "cap", "Ljava/lang/String;", "e", "userRegion", "Lzek/c;", "Lzek/c;", "()Lzek/c;", "boost", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("smallPcValue")
    private final BigDecimal smallPercent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("largePcValue")
    private final BigDecimal largePercent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cap")
    private final d cap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("userRegion")
    @NotNull
    private final String userRegion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("boost")
    private final c boost;

    public e(BigDecimal bigDecimal, BigDecimal bigDecimal2, d dVar, String userRegion, c cVar) {
        Intrinsics.checkNotNullParameter(userRegion, "userRegion");
        this.smallPercent = bigDecimal;
        this.largePercent = bigDecimal2;
        this.cap = dVar;
        this.userRegion = userRegion;
        this.boost = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getBoost() {
        return this.boost;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getCap() {
        return this.cap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getLargePercent() {
        return this.largePercent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getSmallPercent() {
        return this.smallPercent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUserRegion() {
        return this.userRegion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.smallPercent, eVar.smallPercent) && Intrinsics.f(this.largePercent, eVar.largePercent) && Intrinsics.f(this.cap, eVar.cap) && Intrinsics.f(this.userRegion, eVar.userRegion) && Intrinsics.f(this.boost, eVar.boost);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.smallPercent;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.largePercent;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        d dVar = this.cap;
        int iC = p.a.c((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.userRegion);
        c cVar = this.boost;
        return iC + (cVar != null ? cVar.hashCode() : 0);
    }
}
