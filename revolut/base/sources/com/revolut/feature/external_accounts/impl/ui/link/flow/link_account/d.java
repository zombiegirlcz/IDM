package com.revolut.feature.external_accounts.impl.ui.link.flow.link_account;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.y0;
import oki.h;
import xg6.l;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements dn6.b {
    public final oe6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f73016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f73017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final le6.c f73018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final le6.a f73019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkAccountFlowContract$InputData f73020t;
    public final wj0.a u;
    public final do6.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f73021w;

    public d(oe6.a externalInstitutionsInteractor, gte.a featureToggleInteractor, l linkExternalInstitutionsInteractor, le6.c dialogModelBuilder, le6.a institutionAvailabilityDialogProvider, LinkAccountFlowContract$InputData inputData, wj0.a idempotencyKeyHolder, do6.b customLinkResultDestinationStorage) {
        FlowStep reviewAccountLinkingDetails;
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(dialogModelBuilder, "dialogModelBuilder");
        Intrinsics.checkNotNullParameter(institutionAvailabilityDialogProvider, "institutionAvailabilityDialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(customLinkResultDestinationStorage, "customLinkResultDestinationStorage");
        this.o = externalInstitutionsInteractor;
        this.f73016p = featureToggleInteractor;
        this.f73017q = linkExternalInstitutionsInteractor;
        this.f73018r = dialogModelBuilder;
        this.f73019s = institutionAvailabilityDialogProvider;
        this.f73020t = inputData;
        this.u = idempotencyKeyHolder;
        this.v = customLinkResultDestinationStorage;
        LinkAccountFlowContract$InputData.PreselectedInstitution preselectedInstitution = inputData.f72990a;
        if (preselectedInstitution == null) {
            reviewAccountLinkingDetails = LinkAccountFlowContract$Step.Institutions.f73007a;
        } else {
            reviewAccountLinkingDetails = preselectedInstitution.d ? new LinkAccountFlowContract$Step.ReviewAccountLinkingDetails(preselectedInstitution.f72996a, preselectedInstitution.e, preselectedInstitution.f72997b, preselectedInstitution.f72998c) : new LinkAccountFlowContract$Step.ConsentForPreselectedInstitution(preselectedInstitution);
        }
        this.f73021w = cp5.d.a(this, reviewAccountLinkingDetails, f0.f322471a, new dgj.h(this, 12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d r6, com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData.PreselectedInstitution r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.c
            if (r0 == 0) goto L13
            r0 = r8
            com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.c r0 = (com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.c) r0
            int r1 = r0.f73015x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73015x = r1
            goto L18
        L13:
            com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.c r0 = new com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f73015x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData$PreselectedInstitution r7 = r0.u
            yhm.o.b(r8)
            goto La0
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData$PreselectedInstitution r7 = r0.u
            yhm.o.b(r8)
            goto L51
        L3b:
            yhm.o.b(r8)
            boolean r8 = r7.f72998c
            java.lang.String r2 = r7.f72996a
            if (r8 == 0) goto L87
            xg6.l r8 = r6.f73017q
            r0.u = r7
            r0.f73015x = r4
            java.lang.Object r8 = xg6.l.c(r8, r2, r0)
            if (r8 != r1) goto L51
            goto L9f
        L51:
            qe6.f r8 = (qe6.f) r8
            boolean r0 = r8 instanceof qe6.e
            if (r0 == 0) goto L64
            dn6.e r7 = new dn6.e
            qe6.e r8 = (qe6.e) r8
            java.lang.String r8 = r8.f245088a
            r7.<init>(r8)
            r6.C2(r7)
            goto Lba
        L64:
            boolean r0 = r8 instanceof qe6.f.a
            if (r0 == 0) goto L73
            dn6.f r8 = new dn6.f
            java.lang.String r7 = r7.f72996a
            r8.<init>(r7)
            r6.C2(r8)
            goto Lba
        L73:
            boolean r7 = r8 instanceof qe6.f.b
            if (r7 == 0) goto L81
            yki.a r6 = r6.f73021w
            com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$Step$InstitutionOffLineErrorDialog r7 = com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$Step.InstitutionOffLineErrorDialog.f73006a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r8 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r6, r7, r8)
            goto Lba
        L81:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L87:
            oe6.a r8 = r6.o
            w4l.j r4 = w4l.j.f294644c
            xg6.j r8 = (xg6.j) r8
            efm.d0 r8 = r8.d(r2, r4)
            rfm.f0 r8 = zi0.c.t(r8)
            r0.u = r7
            r0.f73015x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto La0
        L9f:
            return r1
        La0:
            r2 = r8
            com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution r2 = (com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution) r2
            kotlin.jvm.internal.Intrinsics.h(r2)
            java.lang.String r3 = r7.f72997b
            dce.s0 r0 = new dce.s0
            r5 = 8
            r4 = 0
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            whi.b r6 = new whi.b
            r7 = 6
            r6.<init>(r7)
            r1.n2(r0, r6)
        Lba:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d.I2(com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d, com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData$PreselectedInstitution, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        if (this.f73020t.f72990a != null) {
            this.u.a("RELINK_EXTERNAL_INSTITUTION_IDEMPOTENCY_KEY");
        }
    }

    public final void J2(String str, String str2) {
        NaviCommand naviCommand = this.f73020t.f72993g;
        do6.b bVar = this.v;
        if (naviCommand == null) {
            bVar.a();
        } else {
            bVar.c(naviCommand);
        }
        yji.l.b1(this, X1(new y0(null, new g0(new TextLocalisedClause(R$string.external_institutions_out_of_process_linking_title, u.c(str2), null, 12), new TextLocalisedClause(R$string.external_institutions_out_of_process_linking_description, u.c(str2), null, 12), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, new d8j.c(this, str, (Continuation) null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f73021w;
    }
}
