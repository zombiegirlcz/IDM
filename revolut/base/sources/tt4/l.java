package tt4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f274222a;

    public l(j limitType) {
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        this.f274222a = limitType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f274222a, ((l) obj2).f274222a);
    }

    public final int hashCode() {
        return this.f274222a.hashCode();
    }
}
