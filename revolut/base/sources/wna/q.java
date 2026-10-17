package wna;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298760a;

    public q(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298760a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f298760a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f298760a, ((q) obj2).f298760a);
    }

    public final int hashCode() {
        return this.f298760a.hashCode();
    }
}
