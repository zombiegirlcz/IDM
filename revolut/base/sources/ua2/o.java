package ua2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278528a;

    public o(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f278528a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f278528a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f278528a, ((o) obj2).f278528a);
    }

    public final int hashCode() {
        return this.f278528a.hashCode();
    }
}
