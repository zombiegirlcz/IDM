package xuc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309016a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309016a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f309016a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f309016a, ((j) obj2).f309016a);
    }

    public final int hashCode() {
        return this.f309016a.hashCode();
    }
}
