package cn6;

import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f25367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BankFieldDefinition f25368b;

    public g(wi0.b countryCode, BankFieldDefinition beneficiaryDefinition) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(beneficiaryDefinition, "beneficiaryDefinition");
        this.f25367a = countryCode;
        this.f25368b = beneficiaryDefinition;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f25367a, gVar.f25367a) && Intrinsics.f(this.f25368b, gVar.f25368b);
    }

    public final int hashCode() {
        return this.f25368b.hashCode() + (this.f25367a.f297794a.hashCode() * 31);
    }
}
