package i93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f159568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f159569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f159570c;
    public final boolean d;

    public l(xi0.b currency, dj0.d dVar, dj0.d dVar2, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f159568a = currency;
        this.f159569b = dVar;
        this.f159570c = dVar2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f159568a, lVar.f159568a) && Intrinsics.f(this.f159569b, lVar.f159569b) && Intrinsics.f(this.f159570c, lVar.f159570c) && this.d == lVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f159568a.hashCode() * 31;
        dj0.d dVar = this.f159569b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f159570c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }
}
