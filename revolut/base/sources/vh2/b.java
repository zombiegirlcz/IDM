package vh2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.p f289269a;

    public b(whf.p pVar) {
        this.f289269a = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f289269a, ((b) obj2).f289269a);
    }

    public final int hashCode() {
        whf.p pVar = this.f289269a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }
}
