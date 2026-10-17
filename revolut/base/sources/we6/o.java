package we6;

import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData f296658a;

    public o(CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData preselectedInstitutionData) {
        Intrinsics.checkNotNullParameter(preselectedInstitutionData, "preselectedInstitutionData");
        this.f296658a = preselectedInstitutionData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f296658a, ((o) obj2).f296658a);
    }

    public final int hashCode() {
        return this.f296658a.hashCode();
    }
}
