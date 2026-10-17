package yvk;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317221a;

    public j(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317221a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f317221a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f317221a, ((j) obj2).f317221a);
    }

    public final int hashCode() {
        return this.f317221a.hashCode();
    }
}
