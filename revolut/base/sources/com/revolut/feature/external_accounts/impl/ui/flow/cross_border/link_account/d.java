package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account;

import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderCountryDepartmentUiModel;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xg6.l;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements gm6.b {
    public final CrossBorderLinkAccountFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oe6.a f72893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f72894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f72895r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final do6.b f72896s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final le6.c f72897t;
    public final hm6.a u;
    public final fm6.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final le6.a f72898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final im6.a f72899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yki.a f72900y;

    public d(CrossBorderLinkAccountFlowContract$InputData inputData, oe6.a externalInstitutionsInteractor, l linkExternalInstitutionsInteractor, wj0.a idempotencyKeyHolder, do6.b customLinkResultDestinationStorage, le6.c dialogModelBuilder, hm6.a linkInstitutionNotListedDialogProvider, fm6.a crossBorderTransferSuggestionsDialogProvider, le6.a institutionAvailabilityDialogProvider, im6.a crossBorderInstitutionUiModelMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(linkExternalInstitutionsInteractor, "linkExternalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(customLinkResultDestinationStorage, "customLinkResultDestinationStorage");
        Intrinsics.checkNotNullParameter(dialogModelBuilder, "dialogModelBuilder");
        Intrinsics.checkNotNullParameter(linkInstitutionNotListedDialogProvider, "linkInstitutionNotListedDialogProvider");
        Intrinsics.checkNotNullParameter(crossBorderTransferSuggestionsDialogProvider, "crossBorderTransferSuggestionsDialogProvider");
        Intrinsics.checkNotNullParameter(institutionAvailabilityDialogProvider, "institutionAvailabilityDialogProvider");
        Intrinsics.checkNotNullParameter(crossBorderInstitutionUiModelMapper, "crossBorderInstitutionUiModelMapper");
        this.o = inputData;
        this.f72893p = externalInstitutionsInteractor;
        this.f72894q = linkExternalInstitutionsInteractor;
        this.f72895r = idempotencyKeyHolder;
        this.f72896s = customLinkResultDestinationStorage;
        this.f72897t = dialogModelBuilder;
        this.u = linkInstitutionNotListedDialogProvider;
        this.v = crossBorderTransferSuggestionsDialogProvider;
        this.f72898w = institutionAvailabilityDialogProvider;
        this.f72899x = crossBorderInstitutionUiModelMapper;
        CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution preselectedInstitution = inputData.f72859a;
        this.f72900y = cp5.d.a(this, preselectedInstitution == null ? CrossBorderLinkAccountFlowContract$Step.Institutions.f72883a : new CrossBorderLinkAccountFlowContract$Step.ConsentForPreselectedInstitution(preselectedInstitution), f0.f322471a, new ghl.c(this, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d r7, com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.c
            if (r0 == 0) goto L13
            r0 = r9
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.c r0 = (com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.c) r0
            int r1 = r0.f72892x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72892x = r1
            goto L18
        L13:
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.c r0 = new com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f72892x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData$PreselectedInstitution r8 = r0.u
            yhm.o.b(r9)
            goto La0
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData$PreselectedInstitution r8 = r0.u
            yhm.o.b(r9)
            goto L51
        L3b:
            yhm.o.b(r9)
            boolean r9 = r8.f72866c
            java.lang.String r2 = r8.f72864a
            if (r9 == 0) goto L87
            xg6.l r9 = r7.f72894q
            r0.u = r8
            r0.f72892x = r4
            java.lang.Object r9 = xg6.l.c(r9, r2, r0)
            if (r9 != r1) goto L51
            goto L9f
        L51:
            qe6.f r9 = (qe6.f) r9
            boolean r0 = r9 instanceof qe6.e
            if (r0 == 0) goto L64
            gm6.d r8 = new gm6.d
            qe6.e r9 = (qe6.e) r9
            java.lang.String r9 = r9.f245088a
            r8.<init>(r9)
            r7.C2(r8)
            goto Lba
        L64:
            boolean r0 = r9 instanceof qe6.f.a
            if (r0 == 0) goto L73
            gm6.e r9 = new gm6.e
            java.lang.String r8 = r8.f72864a
            r9.<init>(r8)
            r7.C2(r9)
            goto Lba
        L73:
            boolean r8 = r9 instanceof qe6.f.b
            if (r8 == 0) goto L81
            yki.a r7 = r7.f72900y
            com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step$InstitutionOffLineErrorDialog r8 = com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step.InstitutionOffLineErrorDialog.f72882a
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r9 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r7, r8, r9)
            goto Lba
        L81:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L87:
            oe6.a r9 = r7.f72893p
            w4l.j r4 = w4l.j.f294644c
            xg6.j r9 = (xg6.j) r9
            efm.d0 r9 = r9.d(r2, r4)
            rfm.f0 r9 = zi0.c.t(r9)
            r0.u = r8
            r0.f72892x = r3
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto La0
        L9f:
            return r1
        La0:
            com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution r9 = (com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution) r9
            java.lang.String r3 = r9.f66107a
            java.lang.String r5 = r9.f66108b
            java.lang.String r4 = r8.f72865b
            g0a.e r0 = new g0a.e
            r6 = 0
            r1 = 10
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            whi.b r7 = new whi.b
            r8 = 6
            r7.<init>(r8)
            r2.n2(r0, r7)
        Lba:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d.I2(com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.d, com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData$PreselectedInstitution, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f72859a != null) {
            this.f72895r.a("RELINK_EXTERNAL_INSTITUTION_IDEMPOTENCY_KEY");
        }
    }

    public final void J2(CrossBorderCountryDepartmentUiModel crossBorderCountryDepartmentUiModel, String str) {
        CrossBorderCountryDepartmentUiModel.Outage outage = crossBorderCountryDepartmentUiModel.f72905h;
        yki.a aVar = this.f72900y;
        if (outage != null) {
            h.w2(aVar, new CrossBorderLinkAccountFlowContract$Step.InstitutionNotAvailableDialog(outage.f72906a, outage.f72907b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        boolean z = crossBorderCountryDepartmentUiModel.d;
        String str2 = crossBorderCountryDepartmentUiModel.f72901a;
        if (z) {
            h.t2(this, aVar, new CrossBorderLinkAccountFlowContract$Step.Branches(str2, str), true, null, false, 12);
        } else {
            h.t2(this, aVar, new CrossBorderLinkAccountFlowContract$Step.Consent(str2, str, null), true, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72900y;
    }
}
