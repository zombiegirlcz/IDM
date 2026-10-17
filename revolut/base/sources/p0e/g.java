package p0e;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f231517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f231518b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f231517a = items;
        this.f231518b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f231517a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f231517a, gVar.f231517a) && this.f231518b == gVar.f231518b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231518b) + (this.f231517a.hashCode() * 31);
    }
}
