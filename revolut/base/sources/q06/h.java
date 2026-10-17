package q06;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f241169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f241170b;

    public h(ParcelableDestination target, c cVar) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f241169a = target;
        this.f241170b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f241169a, hVar.f241169a) && Intrinsics.f(this.f241170b, hVar.f241170b);
    }

    public final int hashCode() {
        int iHashCode = this.f241169a.hashCode() * 31;
        c cVar = this.f241170b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
