package com.revolut.feature.referrals.shared.ui.impl.ui.invites_list;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowInviteListPaginated;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListScreenCampaignType;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import cya.f;
import cya.g;
import cya.k;
import hx7.e;
import jya.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pwa.n;
import rya.r;
import rya.s;
import rya.t;
import uwa.q;
import w4l.i;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements rya.h {

    @NotNull
    public static final r Companion = new r();
    public final InvitesListContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wwa.b f81896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f81897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f81898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f81899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f81900t;
    public final boolean u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f81901w;

    public a(InvitesListContract$InputData inputData, wwa.b interactor, d invitesPagingSource, gte.a featureToggleInteractor, g ineligibilityBottomSheetControllerProvider, k shareDestinationControllerModelExtension, f deeplinkControllerModelExtension, b stateMapper) {
        rya.b bVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(invitesPagingSource, "invitesPagingSource");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(ineligibilityBottomSheetControllerProvider, "ineligibilityBottomSheetControllerProvider");
        Intrinsics.checkNotNullParameter(shareDestinationControllerModelExtension, "shareDestinationControllerModelExtension");
        Intrinsics.checkNotNullParameter(deeplinkControllerModelExtension, "deeplinkControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f81896p = interactor;
        this.f81897q = invitesPagingSource;
        this.f81898r = ineligibilityBottomSheetControllerProvider;
        this.f81899s = shareDestinationControllerModelExtension;
        this.f81900t = deeplinkControllerModelExtension;
        boolean zC = ((jte.d) featureToggleInteractor).c(SharedReferralsUiApi$Toggles$ShowInviteListPaginated.f81821c);
        this.u = zC;
        if (zC) {
            bVar = new rya.b(1, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
        } else {
            bVar = new rya.b(6, new Data(null, null, true, 3, null), null, null);
        }
        this.v = mra.d.b(this, bVar, stateMapper, null, false, 12);
        this.f81901w = e.a(this, new rl8.d(this, 22));
    }

    @Override // yji.l
    public final void I1() {
        if (this.u) {
            n campaignType = this.o.f81888b;
            wwa.b bVar = this.f81896p;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(campaignType, "referralCampaignV4Type");
            q qVar = (q) bVar.f300637a;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(campaignType, "campaignType");
            i loadingStrategy = i.f294643c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Continuation continuation = null;
            l.a1(this, qVar.o.b(campaignType, loadingStrategy), null, null, new s(this, continuation, 1), 3);
            l.a1(this, this.f81897q.j(250L), null, null, new s(this, continuation, 2), 3);
            l2(new t(this, null, 0), new yi5.b(26));
        }
    }

    public final void I2() {
        l.a1(this, X1(new y0("ERROR_STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.referrals_invite_campaign_error_title, null, null, 14), new TextLocalisedClause(R$string.referrals_invite_campaign_error_failed_to_load, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new s(this, null, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f81901w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        efm.r rVarB;
        if (this.u) {
            return;
        }
        InvitesListContract$InputData invitesListContract$InputData = this.o;
        InvitesListScreenCampaignType invitesListScreenCampaignType = invitesListContract$InputData.f81887a;
        n nVar = invitesListContract$InputData.f81888b;
        boolean z = invitesListScreenCampaignType instanceof InvitesListScreenCampaignType.General;
        wwa.b bVar = this.f81896p;
        if (z) {
            rVarB = wwa.b.a(bVar, ((InvitesListScreenCampaignType.General) invitesListScreenCampaignType).f81894a, nVar, 12);
        } else {
            if (!(invitesListScreenCampaignType instanceof InvitesListScreenCampaignType.SeparateDeadline)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarB = bVar.b(nVar);
        }
        efm.r rVarDoOnError = rVarB.doOnError(new rxb.f(19, new rrd.l(this, 27)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnError, "doOnError(...)");
        l.b1(this, rd0.e.b(rVarDoOnError), null, new s(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
