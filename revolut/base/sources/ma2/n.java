package ma2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f203930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203931b;

    public n(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203930a = items;
        this.f203931b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f203930a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f203930a, nVar.f203930a) && this.f203931b == nVar.f203931b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203931b) + (this.f203930a.hashCode() * 31);
    }
}
