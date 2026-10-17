package eig;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f126635a;

    public m(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f126635a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f126635a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f126635a, ((m) obj2).f126635a);
    }

    public final int hashCode() {
        return this.f126635a.hashCode();
    }
}
