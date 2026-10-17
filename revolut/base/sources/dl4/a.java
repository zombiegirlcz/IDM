package dl4;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f115699b;

    public a(d dVar, String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f115698a = pocketId;
        this.f115699b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f115698a, aVar.f115698a) && Intrinsics.f(this.f115699b, aVar.f115699b);
    }

    public final int hashCode() {
        int iHashCode = this.f115698a.hashCode() * 31;
        d dVar = this.f115699b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
