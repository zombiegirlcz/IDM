package xo8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307706a;

    public i(List list) {
        this.f307706a = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f307706a, ((i) obj2).f307706a);
    }

    public final int hashCode() {
        List list = this.f307706a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
