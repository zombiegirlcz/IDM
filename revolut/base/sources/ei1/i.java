package ei1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f126348a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f126348a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f126348a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f126348a, ((i) obj2).f126348a);
    }

    public final int hashCode() {
        return this.f126348a.hashCode();
    }
}
