package hu1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155537a;

    public r(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f155537a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f155537a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f155537a, ((r) obj2).f155537a);
    }

    public final int hashCode() {
        return this.f155537a.hashCode();
    }
}
