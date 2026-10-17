package pya;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.referrals.common.data.api.domain.model.BenefitItem;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InviteDetailsCampaignType;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jxa.e f240702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvitesDetailsContract$InputData f240703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f240704c;
    public final gte.a d;

    public a0(jxa.e sharedContactsInteractor, InvitesDetailsContract$InputData inputData, c0 scratchCardParamsProvider, gte.a featureToggleInteractor, jxa.c sharedChatInteractor) {
        Intrinsics.checkNotNullParameter(sharedContactsInteractor, "sharedContactsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(scratchCardParamsProvider, "scratchCardParamsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(sharedChatInteractor, "sharedChatInteractor");
        this.f240702a = sharedContactsInteractor;
        this.f240703b = inputData;
        this.f240704c = scratchCardParamsProvider;
        this.d = featureToggleInteractor;
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            BenefitItem benefitItem = (BenefitItem) obj2;
            arrayList2.add(new RowDelegate.Model(a0.d.n("BENEFIT_ITEM_LIST_ID_PREFIX", i), new RowDelegate.Model.MainImage.Image24(c8g.c.B(benefitItem.f81685a), false, false, 6), new TextClause(benefitItem.f81686b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(benefitItem.f81687c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("BENEFITS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.referrals_invite_campaign_benefits_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
    }

    public static CellDetailsChevronDelegate.Model d(boolean z) {
        if (!z) {
            return null;
        }
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("NEED_MORE_HELP_LIST_ID", new TextLocalisedClause(R$string.referrals_invite_campaign_faq_title, null, null, 14), f2.INTERNAL, 0, null, null, 2040);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static TextLocalisedClause e(Instant instant) {
        return new TextLocalisedClause(R$string.referrals_invite_details_steps_section_left_header_required_by, zhm.u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
    }

    public static ListSubheaderDelegate.Model f(boolean z) {
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.referrals_invite_campaign_reward_section_header, null, null, 14) : new TextLocalisedClause(R$string.referrals_invite_campaign_potential_reward_section_header, null, null, 14);
        int i = R$attr.uikit_dp16;
        return new ListSubheaderDelegate.Model("YOUR_REWARD_HEADER_LIST_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, i, i, 16378);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08d7 A[PHI: r24
      0x08d7: PHI (r24v3 java.util.Iterator) = (r24v2 java.util.Iterator), (r24v6 java.util.Iterator) binds: [B:202:0x08d5, B:199:0x08ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b41  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x039f  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r63) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pya.a0.c(cli.j):cli.o");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList g(com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails r49) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pya.a0.g(com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails):java.util.ArrayList");
    }

    public final ListSubheaderDelegate.Model h(ActiveOrPastInviteeDetails activeOrPastInviteeDetails, InviteDetailsCampaignType inviteDetailsCampaignType) {
        TextLocalisedClause textLocalisedClauseE;
        if (pwa.l.c(this.f240703b.getD())) {
            switch (z.f240736a[activeOrPastInviteeDetails.f81695m.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    textLocalisedClauseE = e(activeOrPastInviteeDetails.f81696n);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    textLocalisedClauseE = new TextLocalisedClause(R$string.referrals_invite_details_steps_section_deadline_missed, null, null, 14);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            textLocalisedClauseE = inviteDetailsCampaignType instanceof InviteDetailsCampaignType.SeparateDeadline ? e(activeOrPastInviteeDetails.f81696n) : new TextLocalisedClause(R$string.referrals_invite_details_steps_section_left_header, null, null, 14);
        }
        return new ListSubheaderDelegate.Model("STEPS_SUBHEADER_LIST_ID", (Image) null, (Clause) textLocalisedClauseE, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
    }
}
