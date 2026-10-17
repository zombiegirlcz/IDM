package vmf;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f290569b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290568a = items;
        this.f290569b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f290568a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f290568a, hVar.f290568a) && this.f290569b == hVar.f290569b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f290569b) + (this.f290568a.hashCode() * 31);
    }
}
