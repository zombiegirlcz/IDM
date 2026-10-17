package jlg;

import com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendChecksBeneficiaryParams f175758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f175759b;

    public a(SendChecksBeneficiaryParams beneficiaryParams, co3.a aVar) {
        Intrinsics.checkNotNullParameter(beneficiaryParams, "beneficiaryParams");
        this.f175758a = beneficiaryParams;
        this.f175759b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f175758a, aVar.f175758a) && Intrinsics.f(this.f175759b, aVar.f175759b);
    }

    public final int hashCode() {
        int iHashCode = this.f175758a.hashCode() * 31;
        co3.a aVar = this.f175759b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
