package uv1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283291a;

    public x(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283291a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f283291a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f283291a, ((x) obj2).f283291a);
    }

    public final int hashCode() {
        return this.f283291a.hashCode();
    }
}
