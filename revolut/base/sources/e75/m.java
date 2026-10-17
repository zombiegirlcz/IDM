package e75;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123074a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f123074a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f123074a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f123074a, ((m) obj2).f123074a);
    }

    public final int hashCode() {
        return this.f123074a.hashCode();
    }
}
