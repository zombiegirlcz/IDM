package n8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0.m f213401a;

    public a0(bw0.m mVar) {
        this.f213401a = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f213401a, ((a0) obj2).f213401a);
    }

    public final int hashCode() {
        bw0.m mVar = this.f213401a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }
}
