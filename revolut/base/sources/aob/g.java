package aob;

import djb.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f7964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sfe.a f7965b;

    public g(k filter, sfe.a loadingMode) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingMode, "loadingMode");
        this.f7964a = filter;
        this.f7965b = loadingMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f7964a, gVar.f7964a) && this.f7965b == gVar.f7965b;
    }

    public final int hashCode() {
        return this.f7965b.hashCode() + (this.f7964a.hashCode() * 31);
    }
}
