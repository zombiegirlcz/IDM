package com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$FaqReferralsFlowMigrationV4;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowInviteListPaginated;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowReferralsLearnMoreHelp;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import cya.f;
import g2e.t;
import hx7.e;
import jte.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import oki.h;
import pwa.j;
import pwa.n;
import vkm.q;
import wli.x;
import wtj.c;
import wvg.r1;
import wwa.b;
import wya.g;
import wya.i;
import wya.k;
import wya.r;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements g {
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f81913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f81914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f81915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cya.g f81916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f81917t;
    public final ReferralsTroubleshooterTopLevelScreenContract$InputData u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f81918w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f81919x;

    public a(r stateMapper, gte.a featureToggleInteractor, b inviteCampaignHomeInteractor, t referralsTroubleshooterInteractor, x deeplinkHandler, cya.g ineligibilityBottomSheetControllerProvider, f deeplinkControllerModelExtension, ReferralsTroubleshooterTopLevelScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(referralsTroubleshooterInteractor, "referralsTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(ineligibilityBottomSheetControllerProvider, "ineligibilityBottomSheetControllerProvider");
        Intrinsics.checkNotNullParameter(deeplinkControllerModelExtension, "deeplinkControllerModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = featureToggleInteractor;
        this.f81913p = inviteCampaignHomeInteractor;
        this.f81914q = referralsTroubleshooterInteractor;
        this.f81915r = deeplinkHandler;
        this.f81916s = ineligibilityBottomSheetControllerProvider;
        this.f81917t = deeplinkControllerModelExtension;
        this.u = inputData;
        d dVar = (d) featureToggleInteractor;
        boolean zC = dVar.c(SharedReferralsUiApi$Toggles$ShowInviteListPaginated.f81821c);
        this.v = zC;
        boolean zC2 = dVar.c(SharedReferralsUiApi$Toggles$ShowReferralsLearnMoreHelp.f81823c);
        this.f81918w = mra.d.b(this, new wya.h(zC ? null : new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), zC ? new Data(null, null, true, 3, null) : null, dVar.c(SharedReferralsUiApi$Toggles$FaqReferralsFlowMigrationV4.f81817c), zC2), stateMapper, null, false, 12);
        this.f81919x = e.a(this, new c(this, 19));
    }

    public final void I2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "ALL_REFERRALS_LIST_ID")) {
            C2(k.f301190a);
            Unit unit = Unit.f186387a;
            return;
        }
        boolean z = obj2 instanceof j;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f81919x;
        if (z) {
            j jVar = (j) obj2;
            if (jVar.e == pwa.b.INELIGIBLE) {
                h.v2(aVar, new ReferralsTroubleshooterTopLevelScreenContract$ModalStep.IneligibilityDialog(jVar.f240363g), bottom_dialog);
            } else {
                C2(new wya.j(jVar.f240360a));
            }
            Unit unit2 = Unit.f186387a;
            return;
        }
        if (a0.H(itemId, "INVITES_LIST_ID_", false)) {
            ActiveOrPastInviteeDetails activeOrPastInviteeDetails = obj2 instanceof ActiveOrPastInviteeDetails ? (ActiveOrPastInviteeDetails) obj2 : null;
            if (activeOrPastInviteeDetails == null) {
                r6.b.D("Wrong parcel");
            } else if (activeOrPastInviteeDetails.f81695m == pwa.b.INELIGIBLE) {
                h.v2(aVar, new ReferralsTroubleshooterTopLevelScreenContract$ModalStep.IneligibilityDialog(activeOrPastInviteeDetails.u), bottom_dialog);
            } else {
                C2(new i(activeOrPastInviteeDetails));
            }
            Unit unit3 = Unit.f186387a;
            return;
        }
        if (!a0.H(itemId, "TROUBLESHOOT_ACTION_ID_", false)) {
            r6.b.D("No handler for the clicked item");
            Unit unit4 = Unit.f186387a;
            return;
        }
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str != null) {
            n2(new wtj.f(this, str, null, 6), new whi.b(6));
        } else {
            r6.b.D("Wrong parcel");
            Unit unit5 = Unit.f186387a;
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f81919x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        vkm.d dVarB;
        boolean z = this.v;
        w4l.h loadingStrategy = w4l.h.f294642c;
        t tVar = this.f81914q;
        b bVar = this.f81913p;
        ReferralsTroubleshooterTopLevelScreenContract$InputData referralsTroubleshooterTopLevelScreenContract$InputData = this.u;
        if (z) {
            vkm.d dVarC = bVar.c(null, 4, referralsTroubleshooterTopLevelScreenContract$InputData.f81910b);
            kya.b bVar2 = (kya.b) tVar.f140031b;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            l.b1(this, q.q(yh5.b.d(dVarC, bVar2.d.b(Unit.f186387a, loadingStrategy))), null, new wya.f(this, null, 0), 3);
            return;
        }
        if (((d) this.o).c(SharedReferralsUiApi$Toggles$FaqReferralsFlowMigrationV4.f81817c)) {
            dVarB = rd0.e.b(nim.a.w(bVar.b(referralsTroubleshooterTopLevelScreenContract$InputData.f81910b), new r1(29)));
        } else {
            n nVar = referralsTroubleshooterTopLevelScreenContract$InputData.f81910b;
            dVarB = rd0.e.b(nim.a.w(kli.a.h(b.a(bVar, pwa.i.ACTIVE, nVar, 12), b.a(bVar, pwa.i.PAST, nVar, 12)), new r1(28)));
        }
        kya.b bVar3 = (kya.b) tVar.f140031b;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.b1(this, q.q(yh5.b.d(dVarB, bVar3.d.b(Unit.f186387a, loadingStrategy))), null, new wya.f(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f81918w;
    }
}
