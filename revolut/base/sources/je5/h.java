package je5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f173218a;

    public h(xi0.b bVar) {
        this.f173218a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f173218a, ((h) obj2).f173218a);
    }

    public final int hashCode() {
        xi0.b bVar = this.f173218a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }
}
