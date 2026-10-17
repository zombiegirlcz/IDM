package jb1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172560a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172560a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f172560a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f172560a, ((m) obj2).f172560a);
    }

    public final int hashCode() {
        return this.f172560a.hashCode();
    }
}
