package yh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz3.a f313752a;

    public d(dz3.a popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f313752a = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f313752a, ((d) obj2).f313752a);
    }

    public final int hashCode() {
        return this.f313752a.hashCode();
    }
}
