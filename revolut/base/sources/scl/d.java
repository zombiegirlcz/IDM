package scl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261764a;

    public d(List list) {
        this.f261764a = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f261764a, ((d) obj2).f261764a);
    }

    public final int hashCode() {
        List list = this.f261764a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
