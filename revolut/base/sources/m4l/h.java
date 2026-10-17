package m4l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f202765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f202766b;

    public h(g mode, List list) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f202765a = mode;
        this.f202766b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f202765a == hVar.f202765a && Intrinsics.f(this.f202766b, hVar.f202766b);
    }

    public final int hashCode() {
        int iHashCode = this.f202765a.hashCode() * 31;
        List list = this.f202766b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
