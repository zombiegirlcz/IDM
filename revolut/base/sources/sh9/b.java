package sh9;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f263442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f263443b;

    public b(d dVar, d dVar2) {
        this.f263442a = dVar;
        this.f263443b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f263442a, bVar.f263442a) && Intrinsics.f(this.f263443b, bVar.f263443b);
    }

    public final int hashCode() {
        d dVar = this.f263442a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f263443b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
