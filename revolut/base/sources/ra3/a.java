package ra3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f252778a;

    public a(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f252778a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f252778a, ((a) obj2).f252778a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f252778a.hashCode() * 31);
    }
}
