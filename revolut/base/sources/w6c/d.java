package w6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f295414a;

    public d(h hVar) {
        this.f295414a = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f295414a, ((d) obj2).f295414a);
    }

    public final int hashCode() {
        h hVar = this.f295414a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
