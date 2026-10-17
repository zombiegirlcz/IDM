package djb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yvh.b f115285a;

    public r(yvh.b bVar) {
        this.f115285a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f115285a, ((r) obj2).f115285a);
    }

    public final int hashCode() {
        yvh.b bVar = this.f115285a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
