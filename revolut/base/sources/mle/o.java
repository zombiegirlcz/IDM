package mle;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f206685a;

    public o(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f206685a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f206685a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f206685a, ((o) obj2).f206685a);
    }

    public final int hashCode() {
        return this.f206685a.hashCode();
    }
}
