package ve1;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f288105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f288106b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f288105a = items;
        this.f288106b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f288105a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f288105a, fVar.f288105a) && this.f288106b == fVar.f288106b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f288106b) + (this.f288105a.hashCode() * 31);
    }
}
