package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting;

import be4.d;
import c84.t;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentGroups;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingIntroScreenContent;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingSummary;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import e84.e;
import java.util.List;
import ju3.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n68.x;
import naf.j;
import nd4.c;
import nd4.f;
import nii.g0;
import nii.j;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.m;
import rp0.y;
import yji.l;
import yki.i;
import zd4.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements nd4.a {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f67912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ManualUnderwritingContract$InputData f67913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f67914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sp3.a f67915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f67916t;
    public final qki.d u;
    public final LargeActionButtonDelegate v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CellDetailsChevronDelegate f67917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ListCellDelegate f67918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f67919y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j60.a bottomDialogExtension, ManualUnderwritingContract$InputData inputData, b manualUnderwritingLinkDestinationResolver, sp3.a creditDataMonitoringFacade, d waitingBottomSheetControllerProvider, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(manualUnderwritingLinkDestinationResolver, "manualUnderwritingLinkDestinationResolver");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(waitingBottomSheetControllerProvider, "waitingBottomSheetControllerProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67912p = bottomDialogExtension;
        this.f67913q = inputData;
        this.f67914r = manualUnderwritingLinkDestinationResolver;
        this.f67915s = creditDataMonitoringFacade;
        this.f67916t = waitingBottomSheetControllerProvider;
        this.u = hx7.e.b(this, new ManualUnderwritingContract$State(inputData.f67888a.getF67893a(), 2, 0));
        this.v = new LargeActionButtonDelegate();
        this.f67917w = new CellDetailsChevronDelegate();
        this.f67918x = new ListCellDelegate();
        this.f67919y = d8l.d.a(this, new n8i.e(this, 8));
    }

    @Override // yji.l
    public final void I1() {
        LargeActionButtonDelegate largeActionButtonDelegate = this.v;
        Continuation continuation = null;
        l.a1(this, rd0.e.b(largeActionButtonDelegate.d.f121375b), null, null, new nd4.e(this, null), 3);
        CellDetailsChevronDelegate cellDetailsChevronDelegate = this.f67917w;
        l.a1(this, rd0.e.b(cellDetailsChevronDelegate.f51821c), null, null, new f(this, null), 3);
        ListCellDelegate listCellDelegate = this.f67918x;
        l.a1(this, rd0.e.b(listCellDelegate.d), null, null, new j(this, continuation, 5), 3);
        this.f67912p.d(v.k(listCellDelegate, cellDetailsChevronDelegate, largeActionButtonDelegate));
        l2(new x(this, continuation, 8), new yi5.b(26));
    }

    @Override // yki.j
    public final void M0() {
        ManualUnderwritingContract$InputData manualUnderwritingContract$InputData = this.f67913q;
        ManualUnderwritingContract$InputData.Config config = manualUnderwritingContract$InputData.f67888a;
        ManualUnderwritingContract$InputData.Config config2 = manualUnderwritingContract$InputData.f67888a;
        if (config instanceof ManualUnderwritingContract$InputData.Config.Waiting) {
            R2(config.getF67899a().f66371a, ((ManualUnderwritingContract$InputData.Config.Waiting) config2).f67900b);
            return;
        }
        boolean z = config instanceof ManualUnderwritingContract$InputData.Config.AdditionalInfoRequired;
        i iVar = this.f67919y;
        if (z) {
            if (((ManualUnderwritingContract$InputData.Config.AdditionalInfoRequired) config).f67890a.f66481b.isEmpty()) {
                R2(config2.getF67899a().f66371a, ((ManualUnderwritingContract$InputData.Config.AdditionalInfoRequired) config2).f67892c);
                return;
            } else {
                h.w2(iVar, ManualUnderwritingContract$Step.ModalStep.AdditionalInfoRequired.f67908a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            }
        }
        if (!(config instanceof ManualUnderwritingContract$InputData.Config.Intro)) {
            if (!(config instanceof ManualUnderwritingContract$InputData.Config.TicketorProgress)) {
                throw new NoWhenBranchMatchedException();
            }
            h.u2(this, iVar, new ManualUnderwritingContract$Step.TicketorProgress(((ManualUnderwritingContract$InputData.Config.TicketorProgress) config).f67896a), null, 6);
        } else if (((ManualUnderwritingContract$InputData.Config.Intro) config).f67893a.f66481b.isEmpty()) {
            R2(config2.getF67899a().f66371a, ((ManualUnderwritingContract$InputData.Config.Intro) config2).f67895c);
        } else {
            h.u2(this, iVar, P2(), null, 6);
        }
    }

    public final ManualUnderwritingContract$Step P2() {
        ManualUnderwritingSummary f67893a = this.f67913q.f67888a.getF67893a();
        if (f67893a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContent = f67893a.f66480a;
        return manualUnderwritingIntroScreenContent != null ? new ManualUnderwritingContract$Step.Intro(manualUnderwritingIntroScreenContent, f67893a.f66481b) : ManualUnderwritingContract$Step.Documents.f67905a;
    }

    public final void Q2(ManualUnderwritingReferralFlag referralFlag, jv3.b type) {
        List list;
        aim.e eVar;
        y yVarB;
        DocumentGroups documentGroups = referralFlag.f66478g;
        int i = nd4.d.f214326b[type.ordinal()];
        if (i == 1) {
            list = documentGroups.f66465a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            list = documentGroups.f66466b;
        }
        int size = list.size();
        j60.a aVar = this.f67912p;
        if (size > 3) {
            j60.a.v(aVar, false, null, 3);
            h.t2(this, this.f67919y, new ManualUnderwritingContract$Step.DocumentOptions(referralFlag, type), true, null, false, 12);
            return;
        }
        wi0.b countryCode = this.f67913q.f67889b.f;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(referralFlag, "referralFlag");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        int i2 = td4.b.f269923a[type.ordinal()];
        if (i2 == 1) {
            List list2 = documentGroups.f66465a;
            List list3 = documentGroups.f66466b;
            aim.e eVarB = u.b();
            eVarB.addAll(td4.c.b(list2));
            if (list3.isEmpty()) {
                eVar = eVarB;
            } else {
                eVar = eVarB;
                CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("view-id-show-additional-documents", td4.c.a(documentGroups.f66467c).f269922c, 0, false, referralFlag, null, null, 2028);
                yp0.b.l(model, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
                eVar.add(model);
            }
            eVar.add(td4.c.c());
            aim.e eVarA = u.a(eVar);
            wi0.b.Companion.getClass();
            yVarB = dy4.b.b(m.Companion, eVarA, new rp0.t(new TextLocalisedClause(R$string.credit_manual_underwriting_upload_screen_bottom_sheet_title, null, null, 14), new TextLocalisedClause(Intrinsics.f(countryCode, wi0.b.p0) ? R$string.credit_manual_underwriting_upload_screen_bottom_sheet_uk_description : list2.size() > 1 ? R$string.credit_manual_underwriting_upload_screen_bottom_sheet_multiple_documents_description : R$string.credit_manual_underwriting_upload_screen_bottom_sheet_single_document_description, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List list4 = documentGroups.f66466b;
            td4.a aVarA = td4.c.a(documentGroups.f66467c);
            aim.e eVarB2 = u.b();
            eVarB2.addAll(td4.c.b(list4));
            eVarB2.add(td4.c.c());
            yVarB = dy4.b.b(m.Companion, u.a(eVarB2), new rp0.t(aVarA.f269920a, aVarA.f269921b, null, 28), rp0.l.WINDOW, null, null, null, 1016);
        }
        aVar.x(yVarB);
    }

    public final void R2(WaitingPopupScreenConfig waitingPopupScreenConfig, g gVar) {
        int i = nd4.d.f214325a[gVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            l.a1(this, X1(new y0(null, new g0(waitingPopupScreenConfig.f66427a, waitingPopupScreenConfig.f66428b, null, waitingPopupScreenConfig.f66429c, null, null, null, j.b.f216170a, true, null, false, null, 15988), false, 5)), null, null, new mta.c(this, null, 24), 3);
            return;
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        CreditApplicationCommonContext creditApplicationCommonContextO = t1.O(this.f67913q);
        companion.getClass();
        h.w2(this.f67919y, new ManualUnderwritingContract$Step.ModalStep.Waiting(waitingPopupScreenConfig, AnalyticsContext.Companion.a(creditApplicationCommonContextO)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67919y;
    }
}
