package afa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3992a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f3992a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f3992a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f3992a, ((i) obj2).f3992a);
    }

    public final int hashCode() {
        return this.f3992a.hashCode();
    }
}
