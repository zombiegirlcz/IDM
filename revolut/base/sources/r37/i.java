package r37;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f251198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f251199b;

    public i(h headerState, List items) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f251198a = headerState;
        this.f251199b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f251199b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f251198a, iVar.f251198a) && Intrinsics.f(this.f251199b, iVar.f251199b);
    }

    public final int hashCode() {
        return this.f251199b.hashCode() + (this.f251198a.hashCode() * 31);
    }
}
