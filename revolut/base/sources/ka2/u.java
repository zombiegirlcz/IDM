package ka2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182406a;

    public u(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f182406a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f182406a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f182406a, ((u) obj2).f182406a);
    }

    public final int hashCode() {
        return this.f182406a.hashCode();
    }
}
