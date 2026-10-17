package ft1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f137775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137776b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f137775a = items;
        this.f137776b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f137775a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137775a, fVar.f137775a) && this.f137776b == fVar.f137776b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137776b) + (this.f137775a.hashCode() * 31);
    }
}
