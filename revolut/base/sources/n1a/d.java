package n1a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f211301a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f211301a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f211301a, ((d) obj2).f211301a);
    }

    public final int hashCode() {
        return this.f211301a.hashCode();
    }
}
