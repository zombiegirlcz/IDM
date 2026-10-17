package bb2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14152a;

    public s(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f14152a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f14152a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f14152a, ((s) obj2).f14152a);
    }

    public final int hashCode() {
        return this.f14152a.hashCode();
    }
}
