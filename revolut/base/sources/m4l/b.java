package m4l;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f202760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f202761b;

    public b(a mode, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f202760a = mode;
        this.f202761b = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f202760a == bVar.f202760a && Intrinsics.f(this.f202761b, bVar.f202761b);
    }

    public final int hashCode() {
        int iHashCode = this.f202760a.hashCode() * 31;
        List list = this.f202761b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
