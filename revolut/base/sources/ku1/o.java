package ku1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f189618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f189619b;

    public o(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f189618a = items;
        this.f189619b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f189618a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f189618a, oVar.f189618a) && this.f189619b == oVar.f189619b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189619b) + (this.f189618a.hashCode() * 31);
    }
}
