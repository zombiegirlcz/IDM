package zmj;

import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimGiftRecipient f323546b;

    public a0(String dataPlanId, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(dataPlanId, "dataPlanId");
        this.f323545a = dataPlanId;
        this.f323546b = esimGiftRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f323545a, a0Var.f323545a) && Intrinsics.f(this.f323546b, a0Var.f323546b);
    }

    public final int hashCode() {
        int iHashCode = this.f323545a.hashCode() * 31;
        EsimGiftRecipient esimGiftRecipient = this.f323546b;
        return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }
}
