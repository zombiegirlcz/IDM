package k8g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f182146b;

    public n(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f182145a = items;
        this.f182146b = z;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof n) {
            return new l(((n) oldState).f182146b != this.f182146b);
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f182145a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f182145a, nVar.f182145a) && this.f182146b == nVar.f182146b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182146b) + (this.f182145a.hashCode() * 31);
    }
}
