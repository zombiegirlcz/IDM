package mo2;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207538a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f207538a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f207538a, ((d) obj2).f207538a);
    }

    public final int hashCode() {
        return this.f207538a.hashCode();
    }
}
