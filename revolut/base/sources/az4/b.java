package az4;

import aim.e;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11390a;

    public b(e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f11390a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f11390a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f11390a, ((b) obj2).f11390a);
    }

    public final int hashCode() {
        return this.f11390a.hashCode();
    }
}
