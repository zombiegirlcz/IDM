package ts1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273926a;

    public f(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f273926a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f273926a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f273926a, ((f) obj2).f273926a);
    }

    public final int hashCode() {
        return this.f273926a.hashCode();
    }
}
