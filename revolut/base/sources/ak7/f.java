package ak7;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5730b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5729a = items;
        this.f5730b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f5729a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f5729a, fVar.f5729a) && this.f5730b == fVar.f5730b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5730b) + (this.f5729a.hashCode() * 31);
    }
}
