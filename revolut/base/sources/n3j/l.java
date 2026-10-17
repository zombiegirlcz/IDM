package n3j;

import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryInfoState f212142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f212143b;

    public l(BeneficiaryInfoState beneficiaryInfo, o extra) {
        Intrinsics.checkNotNullParameter(beneficiaryInfo, "beneficiaryInfo");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.f212142a = beneficiaryInfo;
        this.f212143b = extra;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f212142a, lVar.f212142a) && Intrinsics.f(this.f212143b, lVar.f212143b);
    }

    public final int hashCode() {
        return this.f212143b.f212149a.hashCode() + (this.f212142a.hashCode() * 31);
    }
}
