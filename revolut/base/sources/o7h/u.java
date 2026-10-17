package o7h;

import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f222843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzg.n f222844c;

    public u(String ref2, z instrumentType) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f222842a = ref2;
        this.f222843b = instrumentType;
        this.f222844c = new zzg.n(ref2, instrumentType);
    }

    @Override // o7h.x
    public final zzg.q M0() {
        return this.f222844c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f222842a, uVar.f222842a) && this.f222843b == uVar.f222843b;
    }

    @Override // o7h.x
    public final String getCacheKey() {
        return this.f222844c.toString();
    }

    public final int hashCode() {
        return this.f222843b.hashCode() + (this.f222842a.hashCode() * 31);
    }
}
