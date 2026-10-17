package efi;

import kotlin.jvm.internal.Intrinsics;
import zfi.n;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f125327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f125328b;

    public a(boolean z, n nVar) {
        this.f125327a = z;
        this.f125328b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f125327a == aVar.f125327a && Intrinsics.f(this.f125328b, aVar.f125328b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f125327a) * 31;
        Object obj2 = this.f125328b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
