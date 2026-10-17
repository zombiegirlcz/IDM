package uv;

import kotlin.jvm.internal.Intrinsics;
import xv.l;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f283250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv.e f283251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f283252c;

    public b(long j2, gv.e captureReason, l lVar) {
        Intrinsics.checkNotNullParameter(captureReason, "captureReason");
        this.f283250a = j2;
        this.f283251b = captureReason;
        this.f283252c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f283250a == bVar.f283250a && this.f283251b == bVar.f283251b && Intrinsics.f(this.f283252c, bVar.f283252c);
    }

    public final int hashCode() {
        int iHashCode = (this.f283251b.hashCode() + (Long.hashCode(this.f283250a) * 31)) * 31;
        l lVar = this.f283252c;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
