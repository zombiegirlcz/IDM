package s06;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f258873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258874b;

    public q(List templateSegments, List pathSegments) {
        Intrinsics.checkNotNullParameter(templateSegments, "templateSegments");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        this.f258873a = templateSegments;
        this.f258874b = pathSegments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f258873a, qVar.f258873a) && Intrinsics.f(this.f258874b, qVar.f258874b);
    }

    public final int hashCode() {
        return this.f258874b.hashCode() + (this.f258873a.hashCode() * 31);
    }
}
