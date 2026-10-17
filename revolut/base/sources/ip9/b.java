package ip9;

import jp9.o;
import jp9.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f167685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f167686b;

    public b(o result, r task) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f167685a = result;
        this.f167686b = task;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f167685a, bVar.f167685a) && Intrinsics.f(this.f167686b, bVar.f167686b);
    }

    public final int hashCode() {
        return this.f167686b.hashCode() + (this.f167685a.hashCode() * 31);
    }
}
