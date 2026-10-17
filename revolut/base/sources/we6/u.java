package we6;

import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data f296682a;

    public u(EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data preselectedInstitutionInfo) {
        Intrinsics.checkNotNullParameter(preselectedInstitutionInfo, "preselectedInstitutionInfo");
        this.f296682a = preselectedInstitutionInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f296682a.equals(((u) obj2).f296682a);
    }

    public final int hashCode() {
        return this.f296682a.hashCode();
    }
}
