package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f273091a;

    public t8(wi0.b bVar) {
        this.f273091a = bVar;
    }

    public final wi0.b a() {
        return this.f273091a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t8) && Intrinsics.f(this.f273091a, ((t8) obj2).f273091a);
    }

    public final int hashCode() {
        wi0.b bVar = this.f273091a;
        if (bVar == null) {
            return 0;
        }
        return bVar.f297794a.hashCode();
    }
}
