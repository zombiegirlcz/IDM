package tf2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f270211a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f270211a, ((d) obj2).f270211a);
    }

    public final int hashCode() {
        e eVar = this.f270211a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public d(e eVar) {
        this.f270211a = eVar;
    }
}
