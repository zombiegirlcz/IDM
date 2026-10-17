package hw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f156019a;

    public s() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f156019a, ((s) obj2).f156019a);
    }

    public final int hashCode() {
        j jVar = this.f156019a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public s(j jVar) {
        this.f156019a = jVar;
    }
}
