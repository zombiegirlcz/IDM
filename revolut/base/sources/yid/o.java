package yid;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f314313a;

    public o(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314313a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f314313a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f314313a, ((o) obj2).f314313a);
    }

    public final int hashCode() {
        return this.f314313a.hashCode();
    }
}
