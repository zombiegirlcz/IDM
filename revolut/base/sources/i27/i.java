package i27;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f157879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157880b;

    public i(h toolbarState, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f157879a = toolbarState;
        this.f157880b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f157880b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f157879a, iVar.f157879a) && Intrinsics.f(this.f157880b, iVar.f157880b);
    }

    public final int hashCode() {
        return this.f157880b.hashCode() + (this.f157879a.hashCode() * 31);
    }
}
