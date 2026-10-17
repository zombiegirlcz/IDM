package cm6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25152a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f25152a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f25152a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f25152a, ((g) obj2).f25152a);
    }

    public final int hashCode() {
        return this.f25152a.hashCode();
    }
}
