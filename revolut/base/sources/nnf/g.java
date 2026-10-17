package nnf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217618a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f217618a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f217618a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f217618a, ((g) obj2).f217618a);
    }

    public final int hashCode() {
        return this.f217618a.hashCode();
    }
}
