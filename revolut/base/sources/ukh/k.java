package ukh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f280760a;

    public k(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f280760a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f280760a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f280760a.equals(((k) obj2).f280760a);
    }

    public final int hashCode() {
        return this.f280760a.hashCode();
    }
}
