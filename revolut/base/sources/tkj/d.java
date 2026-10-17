package tkj;

import cli.j;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingContractType f271963a;

    public d(EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType) {
        this.f271963a = esimPhoneNumberPortingContractType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f271963a, ((d) obj2).f271963a);
    }

    public final int hashCode() {
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = this.f271963a;
        if (esimPhoneNumberPortingContractType == null) {
            return 0;
        }
        return esimPhoneNumberPortingContractType.hashCode();
    }
}
