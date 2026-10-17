package mb5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f204139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f204140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f204141c;
    public final String d;

    public i(h state, long j2, long j3, String sourceId) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        this.f204139a = state;
        this.f204140b = j2;
        this.f204141c = j3;
        this.d = sourceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f204139a == iVar.f204139a && this.f204140b == iVar.f204140b && this.f204141c == iVar.f204141c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.d.c(a0.d.c(this.f204139a.hashCode() * 31, 31, this.f204140b), 31, this.f204141c);
    }
}
