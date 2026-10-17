package t0l;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f267045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f267046b;

    public g(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f267045a = z;
        this.f267046b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f267046b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f267045a == gVar.f267045a && this.f267046b.equals(gVar.f267046b);
    }

    public final int hashCode() {
        return this.f267046b.hashCode() + (Boolean.hashCode(this.f267045a) * 31);
    }
}
