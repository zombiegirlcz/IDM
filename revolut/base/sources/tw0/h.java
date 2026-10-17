package tw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f274811b;

    public h(int i, g alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f274810a = i;
        this.f274811b = alignment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f274810a == hVar.f274810a && Intrinsics.f(this.f274811b, hVar.f274811b);
    }

    public final int hashCode() {
        return this.f274811b.hashCode() + (Integer.hashCode(this.f274810a) * 31);
    }

    public /* synthetic */ h(int i) {
        this(i, e.f274802a);
    }
}
