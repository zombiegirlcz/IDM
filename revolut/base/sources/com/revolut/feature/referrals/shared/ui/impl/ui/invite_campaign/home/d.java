package com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MultilevelDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowInviteListPaginated;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.a;
import com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.MultilevelCampaignModalInputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.multilevel_modal.MultilevelCampaignModalScreen;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import cya.k;
import efm.r;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import jxa.f;
import jxa.g;
import jxa.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import lya.c;
import n1g.p;
import nii.y0;
import nii.z;
import nxa.v;
import nya.b0;
import nya.d0;
import nya.f0;
import nya.g0;
import nya.j;
import nya.j0;
import nya.k0;
import nya.n0;
import nya.o0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pwa.l;
import pwa.m;
import pwa.n;
import skm.a2;
import vkm.j2;
import vkm.q;
import wli.x;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h implements j {

    @NotNull
    public static final d0 Companion = new d0();
    public final jxa.h A;
    public final i B;
    public final g C;
    public final boolean D;
    public final y E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public a2 G;
    public final InviteCampaignHomeControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f81856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wwa.b f81857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f81858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n5j.i f81859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f81860t;
    public final gte.a u;
    public final cya.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cya.h f81861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f81862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f81863y;
    public final cya.f z;

    public d(InviteCampaignHomeControllerContract$InputData inputData, e dateProvider, wwa.b interactor, o0 refBlockStateProvider, n5j.i c2BReferralProvider, f sharedCryptoInteractor, gte.a featureToggleInteractor, cya.g ineligibilityBottomSheetControllerProvider, cya.h learnMoreControllerProvider, k shareDestinationControllerModelExtension, x deeplinkHandler, cya.f deeplinkControllerModelExtension, jxa.h inviteTextProvider, i sharedProInteractor, g inviteBottomSheetActionsProvider, n0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(refBlockStateProvider, "refBlockStateProvider");
        Intrinsics.checkNotNullParameter(c2BReferralProvider, "c2BReferralProvider");
        Intrinsics.checkNotNullParameter(sharedCryptoInteractor, "sharedCryptoInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(ineligibilityBottomSheetControllerProvider, "ineligibilityBottomSheetControllerProvider");
        Intrinsics.checkNotNullParameter(learnMoreControllerProvider, "learnMoreControllerProvider");
        Intrinsics.checkNotNullParameter(shareDestinationControllerModelExtension, "shareDestinationControllerModelExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkControllerModelExtension, "deeplinkControllerModelExtension");
        Intrinsics.checkNotNullParameter(inviteTextProvider, "inviteTextProvider");
        Intrinsics.checkNotNullParameter(sharedProInteractor, "sharedProInteractor");
        Intrinsics.checkNotNullParameter(inviteBottomSheetActionsProvider, "inviteBottomSheetActionsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f81856p = dateProvider;
        this.f81857q = interactor;
        this.f81858r = refBlockStateProvider;
        this.f81859s = c2BReferralProvider;
        this.f81860t = sharedCryptoInteractor;
        this.u = featureToggleInteractor;
        this.v = ineligibilityBottomSheetControllerProvider;
        this.f81861w = learnMoreControllerProvider;
        this.f81862x = shareDestinationControllerModelExtension;
        this.f81863y = deeplinkHandler;
        this.z = deeplinkControllerModelExtension;
        this.A = inviteTextProvider;
        this.B = sharedProInteractor;
        this.C = inviteBottomSheetActionsProvider;
        this.D = ((jte.d) featureToggleInteractor).c(SharedReferralsUiApi$Toggles$ShowInviteListPaginated.f81821c);
        this.E = mra.d.b(this, new nya.k(a.b.f81853a, new nya.i(3), false, false, false), stateMapper, new j0(), false, 8);
        this.F = hx7.e.a(this, new nx2.f(this, 4));
    }

    public static final void I2(d dVar, final m homeScreenData, boolean z) {
        d dVar2;
        y yVar = dVar.E;
        if (homeScreenData != null) {
            ReferralCampaignV4 referralCampaignV4 = homeScreenData.f240371a;
            dVar.f81858r.getClass();
            Intrinsics.checkNotNullParameter(homeScreenData, "homeScreenData");
            String str = referralCampaignV4.i;
            final boolean zJ = str != null ? kotlin.text.d0.J(str, "REFBLOCK", true) : false;
            if (referralCampaignV4.d == null || l.c(dVar.o.f81844c)) {
                Instant instant = referralCampaignV4.f81759m;
                if (instant != null) {
                    Duration durationBetween = Duration.between(((l80.f) dVar.f81856p).b(), instant);
                    if (durationBetween.toMillis() <= 0) {
                        final int i = 0;
                        dVar.H2(yVar, new Function1() { // from class: nya.c0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i) {
                                    case 0:
                                        k update = (k) obj2;
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return k.a(update, new l(homeScreenData, new lya.d(c.a.f200769a), zJ), null, false, false, false, 30);
                                    default:
                                        k update2 = (k) obj2;
                                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                                        return k.a(update2, new l(homeScreenData, new lya.d(null), zJ), null, false, false, false, 30);
                                }
                            }
                        });
                    } else if (durationBetween.toHours() < 48) {
                        a2 a2Var = dVar.G;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        dVar2 = dVar;
                        dVar2.G = yji.l.a1(dVar2, ta6.a.H(durationBetween.getSeconds(), 1L, TimeUnit.SECONDS), null, null, new k0(dVar, homeScreenData, zJ, null), 3);
                    } else {
                        dVar2 = dVar;
                        dVar2.H2(yVar, new l1.e(homeScreenData, durationBetween, zJ, 20));
                    }
                } else {
                    dVar2 = dVar;
                    final int i2 = 1;
                    dVar2.H2(yVar, new Function1() { // from class: nya.c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    k update = (k) obj2;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    return k.a(update, new l(homeScreenData, new lya.d(c.a.f200769a), zJ), null, false, false, false, 30);
                                default:
                                    k update2 = (k) obj2;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    return k.a(update2, new l(homeScreenData, new lya.d(null), zJ), null, false, false, false, 30);
                            }
                        }
                    });
                }
                dVar2.M2();
            }
            MultilevelDetails multilevelDetails = referralCampaignV4.f;
            dVar.H2(yVar, new l1.e(homeScreenData, multilevelDetails != null ? new lya.f(multilevelDetails) : lya.e.f200771a, zJ, 21));
            if (z) {
                dVar.L2();
            }
            dVar2 = dVar;
            dVar2.M2();
        }
    }

    @Override // yji.l
    public final void I1() {
        InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData = this.o;
        int i = 2;
        r rVarDoOnError = wwa.b.e(this.f81857q, inviteCampaignHomeControllerContract$InputData.f81844c, 2).doOnError(new ny7.j(new b0(this, 0), 11));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnError, "doOnError(...)");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(rVarDoOnError), null, null, new c(this, null), 3);
        if (inviteCampaignHomeControllerContract$InputData.f81844c == n.CRYPTO_INTERNAL) {
            H2(this.E, new v(16));
        } else {
            n5j.i iVar = this.f81859s;
            yji.l.a1(this, q.Q(new p(nim.a.y(rd0.e.b(mwa.b.b(iVar.f212624a, n.RETAIL_TO_BUSINESS, false, 2)), new n5i.g(24)), iVar, 8), new ns9.h(continuation, this, 7)), new m84.c(i, 9, continuation), null, new g0(this, continuation, 0), 2);
        }
    }

    public final void J2() {
        yji.l.a1(this, X1(new y0("ERROR_STATUS_DIALOG_ID", new z(new TextLocalisedClause(R$string.referrals_invite_campaign_error_title, null, null, 14), new TextLocalisedClause(R$string.referrals_invite_campaign_error_failed_to_load, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new g0(this, null, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K2(com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListScreenCampaignType r15) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d.K2(com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListScreenCampaignType):void");
    }

    public final void L2() {
        a aVar = ((nya.k) ((j2) this.E.f22677a).getValue()).f220738a;
        if (aVar instanceof nya.l) {
            nya.l lVar = (nya.l) aVar;
            lya.i iVar = lVar.f220744b;
            if (iVar instanceof lya.h) {
                lya.g gVar = ((lya.h) iVar).f200773a;
                if (gVar instanceof lya.f) {
                    yji.l.g2(this, new MultilevelCampaignModalScreen(new MultilevelCampaignModalInputData(((lya.f) gVar).f200772a.f81748b.f81749a, ((lya.f) gVar).f200772a.f81748b.f81750b, lVar.f220743a.f240371a.f81766w)), null, null, 3);
                }
            }
        }
    }

    public final void M2() {
        if (this.o.f81843b) {
            y yVar = this.E;
            if (((nya.k) ((j2) yVar.f22677a).getValue()).f220740c || !((nya.k) ((j2) yVar.f22677a).getValue()).d) {
                return;
            }
            l2(new f0(this, null, 2), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
