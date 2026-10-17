package yfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f313303a;

    public s0(y0 icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f313303a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f313303a, ((s0) obj2).f313303a);
    }

    public final int hashCode() {
        return this.f313303a.hashCode();
    }
}
