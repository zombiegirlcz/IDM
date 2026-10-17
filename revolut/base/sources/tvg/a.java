package tvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f274765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274766b;

    public a(boolean z, String benchmarkRef) {
        Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
        this.f274765a = z;
        this.f274766b = benchmarkRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f274765a == aVar.f274765a && Intrinsics.f(this.f274766b, aVar.f274766b);
    }

    public final int hashCode() {
        return this.f274766b.hashCode() + (Boolean.hashCode(this.f274765a) * 31);
    }
}
