package akk;

import com.revolut.feature.checkout.models.CheckoutOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutOrder f5975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kha.d f5976b;

    public h(CheckoutOrder pendingOrder, kha.d dVar) {
        Intrinsics.checkNotNullParameter(pendingOrder, "pendingOrder");
        this.f5975a = pendingOrder;
        this.f5976b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f5975a, hVar.f5975a) && Intrinsics.f(this.f5976b, hVar.f5976b);
    }

    public final int hashCode() {
        int iHashCode = this.f5975a.hashCode() * 31;
        kha.d dVar = this.f5976b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
