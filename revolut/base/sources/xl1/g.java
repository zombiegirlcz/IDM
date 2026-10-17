package xl1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f306906a;

    public g(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f306906a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f306906a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f306906a, ((g) obj2).f306906a);
    }

    public final int hashCode() {
        return this.f306906a.hashCode();
    }
}
