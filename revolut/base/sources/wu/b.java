package wu;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300041a;

    public b(List excludedDirs) {
        Intrinsics.checkNotNullParameter(excludedDirs, "excludedDirs");
        this.f300041a = excludedDirs;
    }

    public final boolean equals(Object obj2) {
        Object obj3 = 104857600L;
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof b) {
            return obj3.equals(obj3) && Intrinsics.f(this.f300041a, ((b) obj2).f300041a);
        }
        return false;
    }

    public final int hashCode() {
        Long l2 = 104857600L;
        return this.f300041a.hashCode() + (l2.hashCode() * 31);
    }
}
