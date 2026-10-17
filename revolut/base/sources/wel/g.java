package wel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f296826a;

    public g(h hVar) {
        this.f296826a = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f296826a, ((g) obj2).f296826a);
    }

    public final int hashCode() {
        h hVar = this.f296826a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
