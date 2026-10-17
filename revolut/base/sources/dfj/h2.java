package dfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h2 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pfj.i f113989a;

    public h2(pfj.i iVar) {
        this.f113989a = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h2) && Intrinsics.f(this.f113989a, ((h2) obj2).f113989a);
    }

    public final int hashCode() {
        pfj.i iVar = this.f113989a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }
}
