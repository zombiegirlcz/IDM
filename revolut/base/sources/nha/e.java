package nha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f215399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f215400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.d f215401c;

    public e(dj0.d minimumBalance, dj0.d dVar, hha.d plan) {
        Intrinsics.checkNotNullParameter(minimumBalance, "minimumBalance");
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f215399a = minimumBalance;
        this.f215400b = dVar;
        this.f215401c = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f215399a, eVar.f215399a) && Intrinsics.f(this.f215400b, eVar.f215400b) && Intrinsics.f(this.f215401c, eVar.f215401c);
    }

    public final int hashCode() {
        int iHashCode = this.f215399a.hashCode() * 31;
        dj0.d dVar = this.f215400b;
        return this.f215401c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
