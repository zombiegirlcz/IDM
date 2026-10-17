package yv7;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317130b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317129a = items;
        this.f317130b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f317129a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f317129a, hVar.f317129a) && this.f317130b == hVar.f317130b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317130b) + (this.f317129a.hashCode() * 31);
    }
}
