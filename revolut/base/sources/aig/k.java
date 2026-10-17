package aig;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5266a;

    public k(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5266a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f5266a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f5266a, ((k) obj2).f5266a);
    }

    public final int hashCode() {
        return this.f5266a.hashCode();
    }
}
