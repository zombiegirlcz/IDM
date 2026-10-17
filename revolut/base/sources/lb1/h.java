package lb1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193578a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193578a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f193578a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f193578a, ((h) obj2).f193578a);
    }

    public final int hashCode() {
        return this.f193578a.hashCode();
    }
}
