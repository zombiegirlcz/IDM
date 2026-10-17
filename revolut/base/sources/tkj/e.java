package tkj;

import aii.r;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingContractType f271964a;

    public e(EsimPhoneNumberPortingContractType contractType) {
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        this.f271964a = contractType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f271964a, ((e) obj2).f271964a);
    }

    public final int hashCode() {
        return this.f271964a.hashCode();
    }
}
