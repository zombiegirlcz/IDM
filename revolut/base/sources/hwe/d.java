package hwe;

import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data f156135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156136b;

    public d(EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data preselectedInstitutionInfo, String currencyCode) {
        Intrinsics.checkNotNullParameter(preselectedInstitutionInfo, "preselectedInstitutionInfo");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f156135a = preselectedInstitutionInfo;
        this.f156136b = currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f156135a.equals(dVar.f156135a) && Intrinsics.f(this.f156136b, dVar.f156136b);
    }

    public final int hashCode() {
        return this.f156136b.hashCode() + (this.f156135a.hashCode() * 31);
    }
}
