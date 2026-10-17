package qph;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248417a;

    public q(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f248417a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f248417a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f248417a, ((q) obj2).f248417a);
    }

    public final int hashCode() {
        return this.f248417a.hashCode();
    }
}
