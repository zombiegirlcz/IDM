package nqd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218411a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218411a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f218411a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f218411a, ((e) obj2).f218411a);
    }

    public final int hashCode() {
        return this.f218411a.hashCode();
    }
}
