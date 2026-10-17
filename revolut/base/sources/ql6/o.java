package ql6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f247214a;

    public o(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f247214a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f247214a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f247214a, ((o) obj2).f247214a);
    }

    public final int hashCode() {
        return this.f247214a.hashCode();
    }
}
