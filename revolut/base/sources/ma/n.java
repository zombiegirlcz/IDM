package ma;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f203851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f203852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f203853c;

    public n(List items, m toolbarState, l lVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f203851a = items;
        this.f203852b = toolbarState;
        this.f203853c = lVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f203851a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f203851a, nVar.f203851a) && Intrinsics.f(this.f203852b, nVar.f203852b) && Intrinsics.f(this.f203853c, nVar.f203853c);
    }

    public final int hashCode() {
        int iHashCode = (this.f203852b.hashCode() + (this.f203851a.hashCode() * 31)) * 31;
        l lVar = this.f203853c;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "UIState(items=" + this.f203851a + ", toolbarState=" + this.f203852b + ", actionButtonState=" + this.f203853c + ")";
    }
}
