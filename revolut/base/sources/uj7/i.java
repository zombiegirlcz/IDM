package uj7;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f280528a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f280528a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f280528a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f280528a, ((i) obj2).f280528a);
    }

    public final int hashCode() {
        return this.f280528a.hashCode();
    }
}
