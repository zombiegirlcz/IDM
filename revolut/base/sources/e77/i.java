package e77;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123096a;

    public i(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f123096a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f123096a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f123096a, ((i) obj2).f123096a);
    }

    public final int hashCode() {
        return this.f123096a.hashCode();
    }
}
