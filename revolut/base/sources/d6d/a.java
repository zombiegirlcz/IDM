package d6d;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Ld6d/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getEnabled", "()Z", "enabled", "Ld6d/e;", "b", "Ld6d/e;", "getTarget", "()Ld6d/e;", "target", "Ld6d/d;", "c", "Ld6d/d;", "getStrategy", "()Ld6d/d;", "strategy", "Ljo3/a;", "d", "Ljo3/a;", "getDailyAmount", "()Ljo3/a;", "dailyAmount", "", "e", "Ljava/lang/Float;", "multiplier", "f", "percentage", "feature_shared_autoinvest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("target")
    private final e target;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("strategy")
    private final d strategy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dailyAmount")
    private final jo3.a dailyAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("multiplier")
    private final Float multiplier;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("percentage")
    private final Float percentage;

    public a(boolean z, e eVar, d dVar, jo3.a aVar, Float f, Float f4) {
        this.enabled = z;
        this.target = eVar;
        this.strategy = dVar;
        this.dailyAmount = aVar;
        this.multiplier = f;
        this.percentage = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.enabled == aVar.enabled && Intrinsics.f(this.target, aVar.target) && this.strategy == aVar.strategy && Intrinsics.f(this.dailyAmount, aVar.dailyAmount) && Intrinsics.f(this.multiplier, aVar.multiplier) && Intrinsics.f(this.percentage, aVar.percentage);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        e eVar = this.target;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.strategy;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        jo3.a aVar = this.dailyAmount;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Float f = this.multiplier;
        int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.percentage;
        return iHashCode5 + (f4 != null ? f4.hashCode() : 0);
    }
}
