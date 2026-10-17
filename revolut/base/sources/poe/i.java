package poe;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237968b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f237967a = items;
        this.f237968b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f237967a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f237967a, iVar.f237967a) && this.f237968b == iVar.f237968b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237968b) + (this.f237967a.hashCode() * 31);
    }
}
