package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h30 implements m30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f164502a;

    public h30(ty0.a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f164502a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h30) && Intrinsics.f(this.f164502a, ((h30) obj2).f164502a);
    }

    public final int hashCode() {
        return this.f164502a.hashCode();
    }
}
