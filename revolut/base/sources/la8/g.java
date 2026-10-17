package la8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f193350b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193349a = items;
        this.f193350b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f193349a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f193349a, gVar.f193349a) && this.f193350b == gVar.f193350b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193350b) + (this.f193349a.hashCode() * 31);
    }
}
