package igk;

import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f161246a;

    public f0(w0 tier) {
        Intrinsics.checkNotNullParameter(tier, "tier");
        this.f161246a = tier;
    }

    public final w0 a() {
        return this.f161246a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && this.f161246a == ((f0) obj2).f161246a;
    }

    public final int hashCode() {
        return this.f161246a.hashCode();
    }
}
