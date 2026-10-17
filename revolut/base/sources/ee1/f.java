package ee1;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f125063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f125064b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f125063a = items;
        this.f125064b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f125063a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f125063a, fVar.f125063a) && this.f125064b == fVar.f125064b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125064b) + (this.f125063a.hashCode() * 31);
    }
}
