package lb1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193579a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193579a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f193579a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f193579a, ((i) obj2).f193579a);
    }

    public final int hashCode() {
        return this.f193579a.hashCode();
    }
}
