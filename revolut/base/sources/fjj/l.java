package fjj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType f135661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimGiftRecipient f135662c;
    public final String d;

    public l(String subscriptionId, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType, EsimGiftRecipient esimGiftRecipient, String str) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
        this.f135660a = subscriptionId;
        this.f135661b = cancellationType;
        this.f135662c = esimGiftRecipient;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f135660a, lVar.f135660a) && Intrinsics.f(this.f135661b, lVar.f135661b) && Intrinsics.f(this.f135662c, lVar.f135662c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f135661b.hashCode() + (this.f135660a.hashCode() * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f135662c;
        int iHashCode2 = (iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
