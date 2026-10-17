package fk4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135710a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f135710a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f135710a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f135710a, ((j) obj2).f135710a);
    }

    public final int hashCode() {
        return this.f135710a.hashCode();
    }
}
