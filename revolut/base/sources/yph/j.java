package yph;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.g f315902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final soh.f f315903b;

    public j(zel.g metric, soh.f limits) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f315902a = metric;
        this.f315903b = limits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f315902a == jVar.f315902a && Intrinsics.f(this.f315903b, jVar.f315903b);
    }

    public final int hashCode() {
        return this.f315903b.hashCode() + (this.f315902a.hashCode() * 31);
    }
}
