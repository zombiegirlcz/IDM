package il2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f162057a;

    public h(g restrictions) {
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f162057a = restrictions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f162057a, ((h) obj2).f162057a);
    }

    public final int hashCode() {
        return this.f162057a.hashCode();
    }
}
