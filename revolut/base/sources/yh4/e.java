package yh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz3.a f313753a;

    public e(dz3.a popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f313753a = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f313753a, ((e) obj2).f313753a);
    }

    public final int hashCode() {
        return this.f313753a.hashCode();
    }
}
