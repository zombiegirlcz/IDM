package u7k;

import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferLinkDetails.Active f277945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do3.n f277946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm3.a f277947c;

    public b(TransferLinkDetails.Active transferLink, do3.n nVar, zm3.a aVar) {
        Intrinsics.checkNotNullParameter(transferLink, "transferLink");
        this.f277945a = transferLink;
        this.f277946b = nVar;
        this.f277947c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f277945a, bVar.f277945a) && Intrinsics.f(this.f277946b, bVar.f277946b) && Intrinsics.f(this.f277947c, bVar.f277947c);
    }

    public final int hashCode() {
        int iHashCode = this.f277945a.hashCode() * 31;
        do3.n nVar = this.f277946b;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        zm3.a aVar = this.f277947c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
