package b8f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1h.g f13250a;

    public t() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f13250a, ((t) obj2).f13250a);
    }

    public final int hashCode() {
        d1h.g gVar = this.f13250a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public t(d1h.g gVar) {
        this.f13250a = gVar;
    }
}
