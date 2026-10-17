package d6d;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001a\u0010\"R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b\u0005\u0010*¨\u0006,"}, d2 = {"Ld6d/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "", "b", "Z", "c", "()Z", "enabled", "Ld6d/e;", "Ld6d/e;", "j", "()Ld6d/e;", "target", "Ld6d/d;", "Ld6d/d;", "i", "()Ld6d/d;", "strategy", "Ljo3/a;", "e", "Ljo3/a;", "()Ljo3/a;", "dailyAmount", "", "f", "Ljava/lang/Float;", "g", "()Ljava/lang/Float;", "percentage", "multiplier", "h", "ownerId", "scope", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "createdDate", "feature_shared_autoinvest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("target")
    private final e target;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("strategy")
    private final d strategy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dailyAmount")
    private final jo3.a dailyAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("percentage")
    private final Float percentage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("multiplier")
    private final Float multiplier;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerId")
    @NotNull
    private final String ownerId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("scope")
    @NotNull
    private final String scope;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getDailyAmount() {
        return this.dailyAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getMultiplier() {
        return this.multiplier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && this.enabled == bVar.enabled && Intrinsics.f(this.target, bVar.target) && this.strategy == bVar.strategy && Intrinsics.f(this.dailyAmount, bVar.dailyAmount) && Intrinsics.f(this.percentage, bVar.percentage) && Intrinsics.f(this.multiplier, bVar.multiplier) && Intrinsics.f(this.ownerId, bVar.ownerId) && Intrinsics.f(this.scope, bVar.scope) && Intrinsics.f(this.createdDate, bVar.createdDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Float getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.enabled);
        e eVar = this.target;
        int iHashCode = (iC + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.strategy;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        jo3.a aVar = this.dailyAmount;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Float f = this.percentage;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.multiplier;
        int iC2 = p.a.c(p.a.c((iHashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31, 31, this.ownerId), 31, this.scope);
        Long l2 = this.createdDate;
        return iC2 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getStrategy() {
        return this.strategy;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e getTarget() {
        return this.target;
    }
}
