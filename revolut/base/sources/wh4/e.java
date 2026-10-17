package wh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz3.a f297398a;

    public e(dz3.a popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f297398a = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f297398a, ((e) obj2).f297398a);
    }

    public final int hashCode() {
        return this.f297398a.hashCode();
    }
}
