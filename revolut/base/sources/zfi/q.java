package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f321991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f321992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f321993c;

    public q(p config, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f321991a = config;
        this.f321992b = dVar;
        this.f321993c = dVar2;
    }

    public static q a(q qVar, dj0.d dVar, dj0.d dVar2) {
        p config = qVar.f321991a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        return new q(config, dVar, dVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f321991a, qVar.f321991a) && Intrinsics.f(this.f321992b, qVar.f321992b) && Intrinsics.f(this.f321993c, qVar.f321993c);
    }

    public final int hashCode() {
        int iHashCode = this.f321991a.hashCode() * 31;
        dj0.d dVar = this.f321992b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f321993c;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
