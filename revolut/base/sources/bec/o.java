package bec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6c.h f14804a;

    public o(w6c.h hVar) {
        this.f14804a = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f14804a, ((o) obj2).f14804a);
    }

    public final int hashCode() {
        w6c.h hVar = this.f14804a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
