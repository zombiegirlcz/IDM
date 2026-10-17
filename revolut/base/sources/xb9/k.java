package xb9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304025a;

    public k(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304025a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f304025a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f304025a, ((k) obj2).f304025a);
    }

    public final int hashCode() {
        return this.f304025a.hashCode();
    }
}
