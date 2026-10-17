package wrj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f299598b;

    public g(List items, f toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f299597a = items;
        this.f299598b = toolbarState;
    }

    @Override // jki.n
    public final List c() {
        return this.f299597a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f299597a, gVar.f299597a) && Intrinsics.f(this.f299598b, gVar.f299598b);
    }

    public final int hashCode() {
        return this.f299598b.hashCode() + (this.f299597a.hashCode() * 31);
    }
}
