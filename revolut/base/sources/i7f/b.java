package i7f;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f159283a;

    public b() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f159283a, ((b) obj2).f159283a);
    }

    public final int hashCode() {
        List list = this.f159283a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public b(List list) {
        this.f159283a = list;
    }
}
