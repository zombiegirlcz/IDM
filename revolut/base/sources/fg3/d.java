package fg3;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134889a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f134889a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f134889a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f134889a, ((d) obj2).f134889a);
    }

    public final int hashCode() {
        return this.f134889a.hashCode();
    }
}
