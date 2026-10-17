package i7c;

import java.math.BigDecimal;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0019"}, d2 = {"Li7c/d;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "e", "()Ljava/math/BigDecimal;", "points", "b", "d", "multiplier", "Ljava/time/Instant;", "c", "Ljava/time/Instant;", "()Ljava/time/Instant;", "boostedTil", "Li7c/e;", "Li7c/e;", "()Li7c/e;", "cardEarningRule", "multipliedEarningRule", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final BigDecimal points;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("multiplier")
    private final BigDecimal multiplier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("boostedTil")
    private final Instant boostedTil;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cardEarningRule")
    private final e cardEarningRule;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("multipliedEarningRule")
    private final e multipliedEarningRule;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Instant getBoostedTil() {
        return this.boostedTil;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getCardEarningRule() {
        return this.cardEarningRule;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getMultipliedEarningRule() {
        return this.multipliedEarningRule;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getMultiplier() {
        return this.multiplier;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getPoints() {
        return this.points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.points, dVar.points) && Intrinsics.f(this.multiplier, dVar.multiplier) && Intrinsics.f(this.boostedTil, dVar.boostedTil) && Intrinsics.f(this.cardEarningRule, dVar.cardEarningRule) && Intrinsics.f(this.multipliedEarningRule, dVar.multipliedEarningRule);
    }

    public final int hashCode() {
        int iHashCode = this.points.hashCode() * 31;
        BigDecimal bigDecimal = this.multiplier;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Instant instant = this.boostedTil;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        e eVar = this.cardEarningRule;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.multipliedEarningRule;
        return iHashCode4 + (eVar2 != null ? eVar2.hashCode() : 0);
    }
}
