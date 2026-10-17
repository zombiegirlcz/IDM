package ee5;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f125076a;

    public b(xi0.b bVar) {
        this.f125076a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f125076a, ((b) obj2).f125076a);
    }

    public final int hashCode() {
        xi0.b bVar = this.f125076a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
