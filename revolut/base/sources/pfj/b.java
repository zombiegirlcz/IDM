package pfj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumberPorting f235601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f235602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPorting f235603c;

    public b(EsimSubscriptionPhoneNumberPorting porting, a aVar, EsimPhoneNumberPorting esimPhoneNumberPorting) {
        Intrinsics.checkNotNullParameter(porting, "porting");
        this.f235601a = porting;
        this.f235602b = aVar;
        this.f235603c = esimPhoneNumberPorting;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f235601a, bVar.f235601a) && Intrinsics.f(this.f235602b, bVar.f235602b) && Intrinsics.f(this.f235603c, bVar.f235603c);
    }

    public final int hashCode() {
        int iHashCode = this.f235601a.hashCode() * 31;
        a aVar = this.f235602b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        EsimPhoneNumberPorting esimPhoneNumberPorting = this.f235603c;
        return iHashCode2 + (esimPhoneNumberPorting != null ? esimPhoneNumberPorting.hashCode() : 0);
    }
}
