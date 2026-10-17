package com.revolut.feature.referrals.shared.ui.impl.ui.invites_details;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.AdditionalInfo;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowInviteDetailsConfetti;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$ModalStep;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import cya.g;
import g48.r;
import gya.c;
import hg0.p;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jxa.e;
import jxa.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pth.m;
import pwa.n;
import pwa.o;
import pya.a0;
import pya.s;
import pya.v;
import pya.w;
import skm.a2;
import uwa.q;
import w4l.j;
import w4l.k;
import wf0.z0;
import wli.x;
import wwa.b;
import wwa.f;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements pya.a {

    @NotNull
    public static final s Companion = new s();
    public final g A;
    public final gte.a B;
    public a2 C;
    public a2 D;
    public a2 E;
    public boolean F;
    public final y G;
    public final com.revolut.kompot.navigable.vc.modal.a H;
    public final InvitesDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f81879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f81880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f81881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f81882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f81883t;
    public final jx0.a u;
    public final jxa.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f81884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jxa.f f81885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f81886y;
    public final cya.h z;

    public a(InvitesDetailsContract$InputData inputData, b inviteCampaignHomeInteractor, p troubleshooterInteractor, x deeplinkHandler, c inviteeRewardTransactionsProvider, f messagingInteractor, jx0.a inviteDetailsConfettiViewedProvider, jxa.c sharedChatInteractor, e sharedContactsInteractor, jxa.f sharedCryptoInteractor, i sharedProInteractor, cya.h learnMoreControllerProvider, g ineligibilityBottomSheetControllerProvider, gte.a toggleInteractor, a0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(troubleshooterInteractor, "troubleshooterInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inviteeRewardTransactionsProvider, "inviteeRewardTransactionsProvider");
        Intrinsics.checkNotNullParameter(messagingInteractor, "messagingInteractor");
        Intrinsics.checkNotNullParameter(inviteDetailsConfettiViewedProvider, "inviteDetailsConfettiViewedProvider");
        Intrinsics.checkNotNullParameter(sharedChatInteractor, "sharedChatInteractor");
        Intrinsics.checkNotNullParameter(sharedContactsInteractor, "sharedContactsInteractor");
        Intrinsics.checkNotNullParameter(sharedCryptoInteractor, "sharedCryptoInteractor");
        Intrinsics.checkNotNullParameter(sharedProInteractor, "sharedProInteractor");
        Intrinsics.checkNotNullParameter(learnMoreControllerProvider, "learnMoreControllerProvider");
        Intrinsics.checkNotNullParameter(ineligibilityBottomSheetControllerProvider, "ineligibilityBottomSheetControllerProvider");
        Intrinsics.checkNotNullParameter(toggleInteractor, "toggleInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f81879p = inviteCampaignHomeInteractor;
        this.f81880q = troubleshooterInteractor;
        this.f81881r = deeplinkHandler;
        this.f81882s = inviteeRewardTransactionsProvider;
        this.f81883t = messagingInteractor;
        this.u = inviteDetailsConfettiViewedProvider;
        this.v = sharedChatInteractor;
        this.f81884w = sharedContactsInteractor;
        this.f81885x = sharedCryptoInteractor;
        this.f81886y = sharedProInteractor;
        this.z = learnMoreControllerProvider;
        this.A = ineligibilityBottomSheetControllerProvider;
        this.B = toggleInteractor;
        this.G = d.b(this, pya.d.f240712a, stateMapper, null, false, 12);
        this.H = hx7.e.a(this, new pu4.d(this, 12));
    }

    public static final String I2(a aVar, InvitesDetailsContract$InputData invitesDetailsContract$InputData) {
        if (invitesDetailsContract$InputData instanceof InvitesDetailsContract$InputData.ByInviteeDetails) {
            return ((InvitesDetailsContract$InputData.ByInviteeDetails) invitesDetailsContract$InputData).f81871a.e;
        }
        if (invitesDetailsContract$InputData instanceof InvitesDetailsContract$InputData.ByInviteId) {
            return ((InvitesDetailsContract$InputData.ByInviteId) invitesDetailsContract$InputData).f81868a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        InvitesDetailsContract$InputData invitesDetailsContract$InputData = this.o;
        if (!(invitesDetailsContract$InputData instanceof InvitesDetailsContract$InputData.ByInviteId)) {
            if (!(invitesDetailsContract$InputData instanceof InvitesDetailsContract$InputData.ByInviteeDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            M2(((InvitesDetailsContract$InputData.ByInviteeDetails) invitesDetailsContract$InputData).f81871a);
            return;
        }
        InvitesDetailsContract$InputData.ByInviteId byInviteId = (InvitesDetailsContract$InputData.ByInviteId) invitesDetailsContract$InputData;
        String inviteId = byInviteId.f81868a;
        k loadingStrategy = byInviteId.f81869b ? w4l.i.f294643c : j.f294644c;
        b bVar = this.f81879p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        q qVar = (q) bVar.f300637a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, rd0.e.b(qVar.f283595l.e(new uwa.i(inviteId), loadingStrategy)), null, null, new w(this, null, 1), 3);
    }

    public final void J2(Object obj2, String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "LEARN_MORE_ID")) {
            AdditionalInfo additionalInfo = obj2 instanceof AdditionalInfo ? (AdditionalInfo) obj2 : null;
            if (additionalInfo != null) {
                h.v2(this.H, new InvitesDetailsContract$ModalStep.LearnMore(additionalInfo), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "InviteDetailsControllerModel", "incorrect parcel", null, h0Var);
            return;
        }
        if (Intrinsics.f(itemId, "TERMS_CLICK_ITEM_ID")) {
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str != null) {
                C1(new ExternalDestination.Browser(str, null));
                return;
            }
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "InviteDetailsControllerModel", "incorrect parcel", null, h0Var2);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.H;
    }

    public final void K2() {
        l.a1(this, X1(new y0("ERROR_STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.referrals_invite_campaign_error_title, null, null, 14), new TextLocalisedClause(R$string.referrals_invite_campaign_error_failed_to_load, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new w(this, null, 2), 3);
    }

    public final boolean L2(ActiveOrPastInviteeDetails inviteeDetails) {
        boolean zF;
        boolean zC = ((jte.d) this.B).c(SharedReferralsUiApi$Toggles$ShowInviteDetailsConfetti.f81820c);
        jx0.a aVar = this.u;
        InvitesDetailsContract$InputData invitesDetailsContract$InputData = (InvitesDetailsContract$InputData) aVar.f179038b;
        Intrinsics.checkNotNullParameter(inviteeDetails, "inviteeDetails");
        if ((inviteeDetails.k == o.TIERED || invitesDetailsContract$InputData.getD() == n.CRYPTO_INTERNAL || invitesDetailsContract$InputData.getD() == n.JUNIOR_TO_JUNIOR || invitesDetailsContract$InputData.getD() == n.PRO_INTERNAL) && inviteeDetails.f81695m == pwa.b.REDEEMED) {
            if (zC) {
                zF = Intrinsics.f(inviteeDetails.f81704y, Boolean.FALSE);
            } else {
                b bVar = (b) aVar.f179039c;
                String inviteId = inviteeDetails.e;
                Intrinsics.checkNotNullParameter(inviteId, "inviteId");
                q qVar = (q) bVar.f300637a;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(inviteId, "inviteId");
                List list = (List) kii.e.n("INVITE_DETAILS_CONFETTI", qVar.f283592g);
                if (list == null) {
                    list = f0.f322471a;
                }
                zF = !list.contains(inviteId);
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    public final void M2(ActiveOrPastInviteeDetails inviteeDetails) {
        a aVar;
        Flow flowD;
        pwa.b bVar = inviteeDetails.f81695m;
        String str = inviteeDetails.e;
        if (bVar == pwa.b.INELIGIBLE) {
            String str2 = inviteeDetails.u;
            if (this.F) {
                return;
            }
            this.F = true;
            h.v2(this.H, new InvitesDetailsContract$ModalStep.IneligibilityDialog(str2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        pwa.b bVar2 = pwa.b.IGNORED;
        InvitesDetailsContract$InputData invitesDetailsContract$InputData = this.o;
        Continuation continuation = null;
        if (bVar == bVar2 || (bVar == pwa.b.MAX_REACHED && inviteeDetails.k != o.TIERED)) {
            a2 a2Var = this.C;
            if (a2Var != null) {
                a2Var.f(null);
            }
            a2 a2Var2 = this.E;
            if (a2Var2 != null) {
                a2Var2.f(null);
            }
            a2 a2Var3 = this.D;
            if (a2Var3 != null) {
                a2Var3.f(null);
            }
            n referralCampaignV4Type = invitesDetailsContract$InputData.getD();
            b bVar3 = this.f81879p;
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
            q qVar = (q) bVar3.f300637a;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
            this.D = l.a1(this, rd0.e.b(qVar.f283596m.f(referralCampaignV4Type, true)), null, null, new v(this, inviteeDetails, null, 0), 3);
            return;
        }
        a2 a2Var4 = this.D;
        if (a2Var4 != null) {
            a2Var4.f(null);
        }
        a2 a2Var5 = this.E;
        if (a2Var5 != null) {
            a2Var5.f(null);
        }
        String faqKey = inviteeDetails.f81692h;
        if (!(invitesDetailsContract$InputData.getF81872b() instanceof DetailsScope.HelpCenter) || faqKey == null) {
            aVar = this;
            H2(aVar.G, new m(inviteeDetails, this, 10));
        } else {
            p pVar = this.f81880q;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(faqKey, "faqKey");
            z0 z0Var = pVar.f152063a;
            z0Var.getClass();
            Intrinsics.checkNotNullParameter(faqKey, "faqKey");
            aVar = this;
            aVar.E = l.a1(aVar, rd0.e.b(z0Var.e.f(faqKey, true)), null, null, new v(this, inviteeDetails, null, 1), 3);
        }
        a2 a2Var6 = aVar.C;
        if (a2Var6 != null) {
            a2Var6.f(null);
        }
        DetailsScope scope = invitesDetailsContract$InputData.getF81872b();
        boolean zC = pwa.l.c(invitesDetailsContract$InputData.getD());
        c cVar = aVar.f81882s;
        jxa.l lVar = cVar.f147841a;
        Intrinsics.checkNotNullParameter(inviteeDetails, "inviteeDetails");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (zC) {
            flowD = rd0.e.d(mo3.a.g(nim.a.v(lVar.b(str), new gvi.p(17)), null, null, 3), h0.f322473a);
        } else if (scope instanceof DetailsScope.Default) {
            flowD = vkm.i.f290039a;
        } else {
            if (!(scope instanceof DetailsScope.HelpCenter)) {
                throw new NoWhenBranchMatchedException();
            }
            flowD = rd0.e.d(new r(mo3.a.g(nim.a.v(lVar.b(str), new gwe.d(cVar, 7)), null, null, 3), 2), h0.f322473a);
        }
        aVar.C = l.a1(aVar, flowD, null, null, new w(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.G;
    }
}
