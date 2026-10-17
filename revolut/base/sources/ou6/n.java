package ou6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f229836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f229837b;

    public n(m toolbarState, List items) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f229836a = toolbarState;
        this.f229837b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f229837b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f229836a, nVar.f229836a) && Intrinsics.f(this.f229837b, nVar.f229837b);
    }

    public final int hashCode() {
        return this.f229837b.hashCode() + (this.f229836a.hashCode() * 31);
    }
}
