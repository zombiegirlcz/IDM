package qc3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244541a;

    public e(List list) {
        this.f244541a = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f244541a, ((e) obj2).f244541a);
    }

    public final int hashCode() {
        List list = this.f244541a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
