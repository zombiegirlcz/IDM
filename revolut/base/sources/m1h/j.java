package m1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f201501a;

    public j(i iVar) {
        this.f201501a = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f201501a, ((j) obj2).f201501a);
    }

    public final int hashCode() {
        i iVar = this.f201501a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }
}
