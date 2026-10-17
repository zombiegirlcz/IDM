package wya;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f301191a;

    public m(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f301191a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f301191a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f301191a, ((m) obj2).f301191a);
    }

    public final int hashCode() {
        return this.f301191a.hashCode();
    }
}
