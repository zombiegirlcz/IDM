package rs;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256895a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f256895a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f256895a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f256895a, ((m) obj2).f256895a);
    }

    public final int hashCode() {
        return this.f256895a.hashCode();
    }
}
