package a9a;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2392b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f2391a = items;
        this.f2392b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f2391a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f2391a, hVar.f2391a) && this.f2392b == hVar.f2392b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2392b) + (this.f2391a.hashCode() * 31);
    }
}
