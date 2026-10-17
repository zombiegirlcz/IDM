package w56;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i56.i f294704a;

    public h(i56.i iVar) {
        this.f294704a = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f294704a, ((h) obj2).f294704a);
    }

    public final int hashCode() {
        i56.i iVar = this.f294704a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }
}
