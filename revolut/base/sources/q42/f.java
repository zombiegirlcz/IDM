package q42;

import kotlin.jvm.internal.Intrinsics;
import whf.p;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f241997a;

    public f(p pVar) {
        this.f241997a = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f241997a, ((f) obj2).f241997a);
    }

    public final int hashCode() {
        p pVar = this.f241997a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }
}
