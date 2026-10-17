package fz4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f139095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f139096b;

    public j(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f139095a = z;
        this.f139096b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f139096b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f139095a == jVar.f139095a && this.f139096b.equals(jVar.f139096b);
    }

    public final int hashCode() {
        return this.f139096b.hashCode() + (Boolean.hashCode(this.f139095a) * 31);
    }
}
