package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ga extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f272771a;

    public ga(wi0.b bVar) {
        this.f272771a = bVar;
    }

    public final wi0.b a() {
        return this.f272771a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ga) && Intrinsics.f(this.f272771a, ((ga) obj2).f272771a);
    }

    public final int hashCode() {
        wi0.b bVar = this.f272771a;
        if (bVar == null) {
            return 0;
        }
        return bVar.f297794a.hashCode();
    }
}
