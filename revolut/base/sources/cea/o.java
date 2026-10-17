package cea;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f23453b;

    public o(List items, n navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f23452a = items;
        this.f23453b = navBarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f23452a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f23452a, oVar.f23452a) && Intrinsics.f(this.f23453b, oVar.f23453b);
    }

    public final int hashCode() {
        return this.f23453b.hashCode() + (this.f23452a.hashCode() * 31);
    }
}
