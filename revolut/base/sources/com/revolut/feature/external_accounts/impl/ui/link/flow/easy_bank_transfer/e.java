package com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer;

import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oe6.k;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements cn6.b {
    public final EasyBankTransferFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final le6.a f72985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f72986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oe6.a f72987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i90.b f72988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r10.a f72989t;
    public final gte.a u;
    public final i v;

    public e(EasyBankTransferFlowContract$InputData inputData, le6.a institutionAvailabilityDialogProvider, k mandateProposalInteractor, oe6.a externalInstitutionsInteractor, i90.b uuidUtils, r10.a ibanScreenDataLoader, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(institutionAvailabilityDialogProvider, "institutionAvailabilityDialogProvider");
        Intrinsics.checkNotNullParameter(mandateProposalInteractor, "mandateProposalInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(ibanScreenDataLoader, "ibanScreenDataLoader");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f72985p = institutionAvailabilityDialogProvider;
        this.f72986q = mandateProposalInteractor;
        this.f72987r = externalInstitutionsInteractor;
        this.f72988s = uuidUtils;
        this.f72989t = ibanScreenDataLoader;
        this.u = featureToggleInteractor;
        this.v = d8l.d.a(this, new c9f.c(this, 29));
    }

    public final void I2(String str, String str2, String str3, boolean z) {
        if (z) {
            n2(new cn6.e(this, str, str3, str2, null, 0), new whi.b(6));
        } else {
            J2(str, str3, null);
        }
    }

    public final void J2(String str, String str2, String str3) {
        n2(new cn6.e(this, str, str2, str3, null, 1), new whi.b(6));
    }

    @Override // yki.j
    public final void M0() {
        EasyBankTransferDescriptor$PreselectedInstitutionInfo easyBankTransferDescriptor$PreselectedInstitutionInfo = this.o.e;
        if (easyBankTransferDescriptor$PreselectedInstitutionInfo == null) {
            h.t2(this, this.v, EasyBankTransferFlowContract$Step.Institutions.f72972a, true, null, false, 12);
            return;
        }
        if (easyBankTransferDescriptor$PreselectedInstitutionInfo instanceof EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Institution) {
            EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Institution institution = (EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Institution) easyBankTransferDescriptor$PreselectedInstitutionInfo;
            n2(new d(this, institution.f72267a, institution.f72268b, institution.f, institution.e, null), new whi.b(6));
            return;
        }
        if (easyBankTransferDescriptor$PreselectedInstitutionInfo instanceof EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch) {
            EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch branch = (EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch) easyBankTransferDescriptor$PreselectedInstitutionInfo;
            I2(branch.e, branch.f, branch.f72263a, branch.f72266g);
        } else {
            if (!(easyBankTransferDescriptor$PreselectedInstitutionInfo instanceof EasyBankTransferDescriptor$PreselectedInstitutionInfo.Id)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new cn0.d(this, easyBankTransferDescriptor$PreselectedInstitutionInfo, (Continuation) null, 1), new yi5.b(26));
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        i iVar = this.v;
        if (iVar.d() != null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.n();
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
