package rpb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f256312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f256313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f256314c;
    public final djb.d d;

    public e(g period, ej0.b currentPeriod, ej0.b allTime, djb.d dVar) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(currentPeriod, "currentPeriod");
        Intrinsics.checkNotNullParameter(allTime, "allTime");
        this.f256312a = period;
        this.f256313b = currentPeriod;
        this.f256314c = allTime;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f256312a, eVar.f256312a) && this.f256313b.equals(eVar.f256313b) && this.f256314c.equals(eVar.f256314c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + org.bouncycastle.jcajce.provider.digest.a.d(this.f256314c, org.bouncycastle.jcajce.provider.digest.a.d(this.f256313b, this.f256312a.hashCode() * 31, 31), 31);
    }
}
