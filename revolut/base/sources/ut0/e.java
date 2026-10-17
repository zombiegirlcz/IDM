package ut0;

import aw0.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f283014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f283015b;

    public e(d0 ratio, a strategy) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f283014a = ratio;
        this.f283015b = strategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f283014a, eVar.f283014a) && this.f283015b == eVar.f283015b;
    }

    public final int hashCode() {
        return this.f283015b.hashCode() + (this.f283014a.hashCode() * 31);
    }
}
