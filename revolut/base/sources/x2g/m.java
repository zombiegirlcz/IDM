package x2g;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f302559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f302560b;

    public m(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f302559a = items;
        this.f302560b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f302559a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f302559a.equals(mVar.f302559a) && this.f302560b == mVar.f302560b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f302560b) + (this.f302559a.hashCode() * 31);
    }
}
