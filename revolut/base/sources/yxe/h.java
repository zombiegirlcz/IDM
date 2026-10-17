package yxe;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317671b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317670a = items;
        this.f317671b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f317670a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f317670a, hVar.f317670a) && this.f317671b == hVar.f317671b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317671b) + (this.f317670a.hashCode() * 31);
    }
}
