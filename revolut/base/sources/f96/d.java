package f96;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f132838a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f132838a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f132838a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f132838a, ((d) obj2).f132838a);
    }

    public final int hashCode() {
        return this.f132838a.hashCode();
    }
}
