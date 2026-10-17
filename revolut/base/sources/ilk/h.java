package ilk;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162257b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f162256a = items;
        this.f162257b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f162256a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f162256a, hVar.f162256a) && this.f162257b == hVar.f162257b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162257b) + (this.f162256a.hashCode() * 31);
    }
}
