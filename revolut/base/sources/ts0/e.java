package ts0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f273865a;

    public e(h plotBounds) {
        Intrinsics.checkNotNullParameter(plotBounds, "plotBounds");
        this.f273865a = plotBounds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f273865a, ((e) obj2).f273865a);
    }

    public final int hashCode() {
        return this.f273865a.hashCode();
    }
}
