package sw2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266085a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f266085a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f266085a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f266085a, ((m) obj2).f266085a);
    }

    public final int hashCode() {
        return this.f266085a.hashCode();
    }
}
