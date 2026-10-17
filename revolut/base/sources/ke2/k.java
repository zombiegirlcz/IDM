package ke2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182961a;

    public k(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f182961a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f182961a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f182961a, ((k) obj2).f182961a);
    }

    public final int hashCode() {
        return this.f182961a.hashCode();
    }
}
