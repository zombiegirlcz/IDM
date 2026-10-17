package e0a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f121489a;

    public e0(dj0.d dVar) {
        this.f121489a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f121489a, ((e0) obj2).f121489a);
    }

    public final int hashCode() {
        dj0.d dVar = this.f121489a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
