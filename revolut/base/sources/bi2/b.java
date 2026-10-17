package bi2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15376b;

    public b(List aliases, List availableAliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        Intrinsics.checkNotNullParameter(availableAliases, "availableAliases");
        this.f15375a = aliases;
        this.f15376b = availableAliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f15375a, bVar.f15375a) && Intrinsics.f(this.f15376b, bVar.f15376b);
    }

    public final int hashCode() {
        return this.f15376b.hashCode() + (this.f15375a.hashCode() * 31);
    }
}
