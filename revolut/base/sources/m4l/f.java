package m4l;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f202763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f202764b;

    public f(e mode, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f202763a = mode;
        this.f202764b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f202763a == fVar.f202763a && Intrinsics.f(this.f202764b, fVar.f202764b);
    }

    public final int hashCode() {
        int iHashCode = this.f202763a.hashCode() * 31;
        List list = this.f202764b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
