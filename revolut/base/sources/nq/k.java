package nq;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class k implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv.o f218305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218306c;
    public final Integer d;

    public k(List frameStatistics, gv.o modelsVersions, String str, Integer num) {
        Intrinsics.checkNotNullParameter(frameStatistics, "frameStatistics");
        Intrinsics.checkNotNullParameter(modelsVersions, "modelsVersions");
        this.f218304a = frameStatistics;
        this.f218305b = modelsVersions;
        this.f218306c = str;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f218304a, kVar.f218304a) && Intrinsics.f(this.f218305b, kVar.f218305b) && Intrinsics.f(this.f218306c, kVar.f218306c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f218305b.hashCode() + (this.f218304a.hashCode() * 31)) * 31;
        String str = this.f218306c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
