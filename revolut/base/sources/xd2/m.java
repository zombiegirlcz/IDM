package xd2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304241a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304241a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f304241a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f304241a, ((m) obj2).f304241a);
    }

    public final int hashCode() {
        return this.f304241a.hashCode();
    }
}
