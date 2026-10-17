package a02;

import com.revolut.feature.apm.core.models.alias.beneficiary.AliasMerchant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AliasMerchant f108c;

    public b(String aliasBeneficiaryId, String counterpartyId, AliasMerchant aliasMerchant) {
        Intrinsics.checkNotNullParameter(aliasBeneficiaryId, "aliasBeneficiaryId");
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        this.f106a = aliasBeneficiaryId;
        this.f107b = counterpartyId;
        this.f108c = aliasMerchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f106a, bVar.f106a) && Intrinsics.f(this.f107b, bVar.f107b) && Intrinsics.f(this.f108c, bVar.f108c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f106a.hashCode() * 31, 31, this.f107b);
        AliasMerchant aliasMerchant = this.f108c;
        return iC + (aliasMerchant == null ? 0 : aliasMerchant.hashCode());
    }
}
