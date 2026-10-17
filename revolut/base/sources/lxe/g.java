package lxe;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f200563b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f200562a = items;
        this.f200563b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f200562a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f200562a, gVar.f200562a) && this.f200563b == gVar.f200563b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200563b) + (this.f200562a.hashCode() * 31);
    }
}
