package noc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f217983a;

    public g(c allocationSource) {
        Intrinsics.checkNotNullParameter(allocationSource, "allocationSource");
        this.f217983a = allocationSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f217983a, ((g) obj2).f217983a);
    }

    public final int hashCode() {
        return this.f217983a.hashCode();
    }
}
