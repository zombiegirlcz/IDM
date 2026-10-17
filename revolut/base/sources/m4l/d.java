package m4l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f202762a;

    public d(c mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f202762a = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f202762a == ((d) obj2).f202762a;
    }

    public final int hashCode() {
        return this.f202762a.hashCode();
    }
}
