package vqj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0005\u0010\u001a¨\u0006\u001c"}, d2 = {"Lvqj/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "effectiveFrom", "b", "e", "effectiveTo", "Lhqj/c;", "c", "Lhqj/c;", "()Lhqj/c;", "cycle", "currency", "Lvqj/e;", "Lvqj/e;", "f", "()Lvqj/e;", "overall", "", "Lvqj/b;", "Ljava/util/List;", "()Ljava/util/List;", "categories", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("effectiveFrom")
    @NotNull
    private final String effectiveFrom;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("effectiveTo")
    private final String effectiveTo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cycle")
    @NotNull
    private final hqj.c cycle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("overall")
    @NotNull
    private final e overall;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("categories")
    @NotNull
    private final List<b> categories;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hqj.c getCycle() {
        return this.cycle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEffectiveFrom() {
        return this.effectiveFrom;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEffectiveTo() {
        return this.effectiveTo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.effectiveFrom, fVar.effectiveFrom) && Intrinsics.f(this.effectiveTo, fVar.effectiveTo) && Intrinsics.f(this.cycle, fVar.cycle) && Intrinsics.f(this.currency, fVar.currency) && Intrinsics.f(this.overall, fVar.overall) && Intrinsics.f(this.categories, fVar.categories);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getOverall() {
        return this.overall;
    }

    public final int hashCode() {
        int iHashCode = this.effectiveFrom.hashCode() * 31;
        String str = this.effectiveTo;
        return this.categories.hashCode() + ((this.overall.hashCode() + p.a.c((this.cycle.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.currency)) * 31);
    }
}
