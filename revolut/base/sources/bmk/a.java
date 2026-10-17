package bmk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f16847a;

    public a(od0.i iVar) {
        this.f16847a = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f16847a, ((a) obj2).f16847a);
    }

    public final int hashCode() {
        od0.i iVar = this.f16847a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }
}
