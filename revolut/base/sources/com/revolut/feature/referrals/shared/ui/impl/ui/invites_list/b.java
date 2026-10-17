package com.revolut.feature.referrals.shared.ui.impl.ui.invites_list;

import cli.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListScreenCampaignType;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.i;
import rya.u;
import rya.w;
import tya.d;
import tya.e;
import tya.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvitesListContract$InputData f81902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cya.b f81903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rya.a f81904c;
    public final h d;

    public b(InvitesListContract$InputData inputData, cya.b activeOrPastInviteItemsProvider, c titleProvider, rya.a inviteSummaryItemMapper, h paginatedInvitesRenderer, tya.c inviteStatusUIMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(activeOrPastInviteItemsProvider, "activeOrPastInviteItemsProvider");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        Intrinsics.checkNotNullParameter(inviteSummaryItemMapper, "inviteSummaryItemMapper");
        Intrinsics.checkNotNullParameter(paginatedInvitesRenderer, "paginatedInvitesRenderer");
        Intrinsics.checkNotNullParameter(inviteStatusUIMapper, "inviteStatusUIMapper");
        this.f81902a = inputData;
        this.f81903b = activeOrPastInviteItemsProvider;
        this.f81904c = inviteSummaryItemMapper;
        this.d = paginatedInvitesRenderer;
    }

    public final d a() {
        InvitesListScreenCampaignType invitesListScreenCampaignType = this.f81902a.f81887a;
        if (!(invitesListScreenCampaignType instanceof InvitesListScreenCampaignType.General)) {
            if (invitesListScreenCampaignType instanceof InvitesListScreenCampaignType.SeparateDeadline) {
                return d.RECENT_UI_TYPE;
            }
            throw new NoWhenBranchMatchedException();
        }
        i iVar = ((InvitesListScreenCampaignType.General) invitesListScreenCampaignType).f81894a;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        int i = e.f275535a[iVar.ordinal()];
        if (i == 1) {
            return d.ACTIVE_UI_TYPE;
        }
        if (i == 2) {
            return d.PAST_UI_TYPE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause b() {
        InvitesListScreenCampaignType invitesListScreenCampaignType = this.f81902a.f81887a;
        Intrinsics.checkNotNullParameter(invitesListScreenCampaignType, "invitesListScreenCampaignType");
        if (!(invitesListScreenCampaignType instanceof InvitesListScreenCampaignType.General)) {
            if (invitesListScreenCampaignType instanceof InvitesListScreenCampaignType.SeparateDeadline) {
                return new TextLocalisedClause(R$string.referrals_invite_campaign_all_invites, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = w.f258287a[((InvitesListScreenCampaignType.General) invitesListScreenCampaignType).f81894a.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.referrals_invites_list_title_active, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.referrals_invites_list_title_past, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r15) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.b.c(cli.j):cli.o");
    }
}
