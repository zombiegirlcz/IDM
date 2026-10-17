package hz6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f157047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f157048b;

    public j(i navBarState, List items) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f157047a = navBarState;
        this.f157048b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f157048b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f157047a, jVar.f157047a) && Intrinsics.f(this.f157048b, jVar.f157048b);
    }

    public final int hashCode() {
        return this.f157048b.hashCode() + (this.f157047a.hashCode() * 31);
    }
}
