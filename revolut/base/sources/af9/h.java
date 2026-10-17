package af9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3970b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f3969a = items;
        this.f3970b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f3969a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f3969a, hVar.f3969a) && this.f3970b == hVar.f3970b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3970b) + (this.f3969a.hashCode() * 31);
    }
}
