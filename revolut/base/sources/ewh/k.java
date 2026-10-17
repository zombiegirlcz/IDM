package ewh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba6.l f130272a;

    public k(ba6.l lVar) {
        this.f130272a = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f130272a, ((k) obj2).f130272a);
    }

    public final int hashCode() {
        ba6.l lVar = this.f130272a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }
}
