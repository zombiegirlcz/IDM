package et3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f129181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f129182b;

    public b(d state, List items) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f129181a = state;
        this.f129182b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f129181a == bVar.f129181a && Intrinsics.f(this.f129182b, bVar.f129182b);
    }

    public final int hashCode() {
        return this.f129182b.hashCode() + (this.f129181a.hashCode() * 31);
    }
}
