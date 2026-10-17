package i6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f159040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final krf.c f159041b;

    public b(MoneyRequest moneyRequest, krf.c cVar) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f159040a = moneyRequest;
        this.f159041b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f159040a, bVar.f159040a) && Intrinsics.f(this.f159041b, bVar.f159041b);
    }

    public final int hashCode() {
        int iHashCode = this.f159040a.hashCode() * 31;
        krf.c cVar = this.f159041b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
