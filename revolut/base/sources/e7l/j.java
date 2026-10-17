package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7l.b f123411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f123412b;

    public j(b7l.b processor, k kVar) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.f123411a = processor;
        this.f123412b = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f123411a == jVar.f123411a && Intrinsics.f(this.f123412b, jVar.f123412b);
    }

    public final int hashCode() {
        int iHashCode = this.f123411a.hashCode() * 31;
        k kVar = this.f123412b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
