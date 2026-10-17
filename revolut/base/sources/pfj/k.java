package pfj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionsEmptyDisplay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimSubscriptionsEmptyDisplay f235618b;

    public k(List list, EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f235617a = list;
        this.f235618b = esimSubscriptionsEmptyDisplay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f235617a, kVar.f235617a) && Intrinsics.f(this.f235618b, kVar.f235618b);
    }

    public final int hashCode() {
        int iHashCode = this.f235617a.hashCode() * 31;
        EsimSubscriptionsEmptyDisplay esimSubscriptionsEmptyDisplay = this.f235618b;
        return iHashCode + (esimSubscriptionsEmptyDisplay == null ? 0 : esimSubscriptionsEmptyDisplay.hashCode());
    }
}
