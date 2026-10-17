package gtd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f146585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f146586b;

    public h(List items, g toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f146585a = items;
        this.f146586b = toolbarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f146585a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f146585a, hVar.f146585a) && Intrinsics.f(this.f146586b, hVar.f146586b);
    }

    public final int hashCode() {
        return this.f146586b.hashCode() + (this.f146585a.hashCode() * 31);
    }
}
