package zmj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimGiftRecipient f323595c;

    public v(String subscriptionId, String planId, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f323593a = subscriptionId;
        this.f323594b = planId;
        this.f323595c = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f323593a, vVar.f323593a) && Intrinsics.f(this.f323594b, vVar.f323594b) && Intrinsics.f(this.f323595c, vVar.f323595c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f323593a.hashCode() * 31, 31, this.f323594b);
        EsimGiftRecipient esimGiftRecipient = this.f323595c;
        return iC + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
