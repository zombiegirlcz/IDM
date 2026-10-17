package il4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162077c;
    public final String d;
    public final String e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f162078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f162079h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f162080j;

    public f(String categoryPocketId, String promoPocketId, String categoryRate, String promoRate, String defaultRate, LocalDate startDate, LocalDate endDate, LocalDate disbursalDate, dj0.d categoryEarnsCap, dj0.d promoEarnsCap) {
        Intrinsics.checkNotNullParameter(categoryPocketId, "categoryPocketId");
        Intrinsics.checkNotNullParameter(promoPocketId, "promoPocketId");
        Intrinsics.checkNotNullParameter(categoryRate, "categoryRate");
        Intrinsics.checkNotNullParameter(promoRate, "promoRate");
        Intrinsics.checkNotNullParameter(defaultRate, "defaultRate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(categoryEarnsCap, "categoryEarnsCap");
        Intrinsics.checkNotNullParameter(promoEarnsCap, "promoEarnsCap");
        this.f162075a = categoryPocketId;
        this.f162076b = promoPocketId;
        this.f162077c = categoryRate;
        this.d = promoRate;
        this.e = defaultRate;
        this.f = startDate;
        this.f162078g = endDate;
        this.f162079h = disbursalDate;
        this.i = categoryEarnsCap;
        this.f162080j = promoEarnsCap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f162075a, fVar.f162075a) && Intrinsics.f(this.f162076b, fVar.f162076b) && Intrinsics.f(this.f162077c, fVar.f162077c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f162078g, fVar.f162078g) && Intrinsics.f(this.f162079h, fVar.f162079h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f162080j, fVar.f162080j);
    }

    public final int hashCode() {
        return this.f162080j.hashCode() + v7.c(y.a(y.a(y.a(p.a.c(p.a.c(p.a.c(p.a.c(this.f162075a.hashCode() * 31, 31, this.f162076b), 31, this.f162077c), 31, this.d), 31, this.e), 31, this.f), 31, this.f162078g), 31, this.f162079h), 31, this.i);
    }
}
