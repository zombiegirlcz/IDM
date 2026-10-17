package kgh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f183998a;

    public n(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f183998a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f183998a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f183998a, ((n) obj2).f183998a);
    }

    public final int hashCode() {
        return this.f183998a.hashCode();
    }
}
