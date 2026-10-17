package vjj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType f289784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimGiftRecipient f289785c;
    public final String d;

    public s(String subscriptionId, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType, EsimGiftRecipient esimGiftRecipient, String str) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
        this.f289783a = subscriptionId;
        this.f289784b = cancellationType;
        this.f289785c = esimGiftRecipient;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f289783a, sVar.f289783a) && Intrinsics.f(this.f289784b, sVar.f289784b) && Intrinsics.f(this.f289785c, sVar.f289785c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f289784b.hashCode() + (this.f289783a.hashCode() * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f289785c;
        int iHashCode2 = (iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
