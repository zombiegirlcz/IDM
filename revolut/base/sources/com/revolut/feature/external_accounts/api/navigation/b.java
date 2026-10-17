package com.revolut.feature.external_accounts.api.navigation;

import aii.e;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data f72359a;

    public b(EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data preselectedInstitutionInfo) {
        Intrinsics.checkNotNullParameter(preselectedInstitutionInfo, "preselectedInstitutionInfo");
        this.f72359a = preselectedInstitutionInfo;
    }

    public final EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data b() {
        return this.f72359a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f72359a, ((b) obj2).f72359a);
    }

    public final int hashCode() {
        return this.f72359a.hashCode();
    }
}
