package m66;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f203020a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f203020a, ((d) obj2).f203020a);
    }

    public final int hashCode() {
        xi0.b bVar = this.f203020a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public d(xi0.b bVar) {
        this.f203020a = bVar;
    }
}
