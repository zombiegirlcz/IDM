package r8e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f252410a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f252410a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f252410a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f252410a, ((j) obj2).f252410a);
    }

    public final int hashCode() {
        return this.f252410a.hashCode();
    }
}
