package f1k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rzj.b f131285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vel.a f131286b;

    public a(rzj.b symbol, vel.a performance) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f131285a = symbol;
        this.f131286b = performance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f131285a, aVar.f131285a) && Intrinsics.f(this.f131286b, aVar.f131286b);
    }

    public final int hashCode() {
        return this.f131286b.hashCode() + (this.f131285a.hashCode() * 31);
    }
}
