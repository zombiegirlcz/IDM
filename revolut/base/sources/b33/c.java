package b33;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f11987a;

    public c(wi0.b bVar) {
        this.f11987a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f11987a, ((c) obj2).f11987a);
    }

    public final int hashCode() {
        wi0.b bVar = this.f11987a;
        if (bVar == null) {
            return 0;
        }
        return bVar.f297794a.hashCode();
    }
}
