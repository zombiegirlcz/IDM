package ep2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128070b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f128069a = items;
        this.f128070b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f128069a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f128069a, hVar.f128069a) && this.f128070b == hVar.f128070b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128070b) + (this.f128069a.hashCode() * 31);
    }
}
