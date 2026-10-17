package uug;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f283232a;

    public f() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f283232a, ((f) obj2).f283232a);
    }

    public final int hashCode() {
        kel.b bVar = this.f283232a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public f(kel.b bVar) {
        this.f283232a = bVar;
    }
}
