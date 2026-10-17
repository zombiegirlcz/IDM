package dm2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f115821a;

    public b(wi0.b bVar) {
        this.f115821a = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f115821a, ((b) obj2).f115821a);
    }

    public final int hashCode() {
        wi0.b bVar = this.f115821a;
        if (bVar == null) {
            return 0;
        }
        return bVar.f297794a.hashCode();
    }
}
