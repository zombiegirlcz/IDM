package ov2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f229957a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f229957a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f229957a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f229957a, ((e) obj2).f229957a);
    }

    public final int hashCode() {
        return this.f229957a.hashCode();
    }
}
