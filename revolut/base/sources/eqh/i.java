package eqh;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128465a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f128465a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f128465a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f128465a, ((i) obj2).f128465a);
    }

    public final int hashCode() {
        return this.f128465a.hashCode();
    }
}
