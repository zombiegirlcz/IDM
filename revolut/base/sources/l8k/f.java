package l8k;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f193006b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193005a = items;
        this.f193006b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f193005a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f193005a, fVar.f193005a) && this.f193006b == fVar.f193006b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193006b) + (this.f193005a.hashCode() * 31);
    }
}
