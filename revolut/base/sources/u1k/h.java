package u1k;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f276423b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f276422a = items;
        this.f276423b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f276422a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f276422a, hVar.f276422a) && this.f276423b == hVar.f276423b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f276423b) + (this.f276422a.hashCode() * 31);
    }
}
