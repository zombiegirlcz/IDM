package o7h;

import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222839b;

    public r(String str, String str2) {
        this.f222838a = str;
        this.f222839b = str2;
    }

    @Override // o7h.x
    public final zzg.q M0() {
        return zzg.k.f326742a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f222838a, rVar.f222838a) && Intrinsics.f(this.f222839b, rVar.f222839b);
    }

    @Override // o7h.x
    public final String getCacheKey() {
        return d0.k0(zhm.v.k(zzg.k.f326742a, this.f222838a, this.f222839b), "_", null, null, 0, null, 62);
    }

    public final int hashCode() {
        String str = this.f222838a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f222839b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
