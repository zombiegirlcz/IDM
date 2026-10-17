package nz2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f220942a;

    public k(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220942a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f220942a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f220942a, ((k) obj2).f220942a);
    }

    public final int hashCode() {
        return this.f220942a.hashCode();
    }
}
