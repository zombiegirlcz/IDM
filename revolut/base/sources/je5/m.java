package je5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f173224a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f173224a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f173224a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f173224a, ((m) obj2).f173224a);
    }

    public final int hashCode() {
        return this.f173224a.hashCode();
    }
}
