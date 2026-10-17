package kn5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f185999a;

    public b() {
        this(null);
    }

    @Override // kn5.f
    public final n a() {
        return this.f185999a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f185999a, ((b) obj2).f185999a);
    }

    public final int hashCode() {
        n nVar = this.f185999a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public b(n nVar) {
        this.f185999a = nVar;
    }
}
