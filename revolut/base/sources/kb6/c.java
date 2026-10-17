package kb6;

import android.os.Parcelable;
import aw0.o9;
import ba6.d0;
import ba6.g0;
import ba6.l;
import ba6.r;
import ba6.u;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.mapper.DonateSuccessStatusDialogMapper;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import dj0.d;
import im9.h;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import yji.n;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ua6.a f182523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DonateSuccessStatusDialogMapper f182524m;

    public c(ua6.a donationsNaviCommandsProvider, DonateSuccessStatusDialogMapper donateSuccessStatusDialogMapper) {
        Intrinsics.checkNotNullParameter(donationsNaviCommandsProvider, "donationsNaviCommandsProvider");
        Intrinsics.checkNotNullParameter(donateSuccessStatusDialogMapper, "donateSuccessStatusDialogMapper");
        this.f182523l = donationsNaviCommandsProvider;
        this.f182524m = donateSuccessStatusDialogMapper;
    }

    public final void Z2(d0 result, String str) {
        y0 y0Var;
        j jVar;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f182524m.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        g0 g0Var = result.f13928b;
        wi0.b bVar = result.e;
        d dVar = result.f13927a;
        u uVar = result.f;
        l lVar = result.d;
        int i = sc6.c.f261638a[g0Var.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            r rVar = result.f13929c;
            if (rVar != null) {
                String str2 = lVar.f13939b;
                b93.b bVar2 = rVar.f13956c.f13952a;
                Clause clauseK = v04.b.k(bVar2, null);
                y0Var = new y0("CARD_UNLOCK_DONATION_SUCCESS_STATUS_VIEW_ID", new j0((Clause) DonateSuccessStatusDialogMapper.a(dVar, str2, bVar), (Clause) (clauseK != null ? new TextLocalisedClause(R$string.donations_order_card_donation_set_amount_confirmation_info_screen_subtitle, zhm.u.c(clauseK), null, 12) : new TextLocalisedClause(R$string.donations_order_card_donation_set_amount_confirmation_info_screen_subtitle_simple, null, null, 14)), (StatusDialogDescriptionProgress) null, (Parcelable) new DonateSuccessStatusDialogMapper.CampaignUnlocked(bVar2), (u1) new w1(2, new TextLocalisedClause(R$string.donations_actions_order_card, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_not_now, null, null, 14)), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4068), false, 4);
            } else {
                TextLocalisedClause textLocalisedClauseA = DonateSuccessStatusDialogMapper.a(dVar, lVar.f13939b, bVar);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.charity_donation_success_subtitle, null, null, 14);
                wi0.b.Companion.getClass();
                TextLocalisedClause textLocalisedClause2 = !Intrinsics.f(bVar, wi0.b.X0) ? textLocalisedClause : null;
                u uVar2 = u.MAJOR_EVENT;
                y0Var = new y0("REGULAR_DONATION_SUCCESS_STATUS_VIEW_ID", new j0((Clause) textLocalisedClauseA, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) ((uVar != uVar2 || str == null) ? null : new DonateSuccessStatusDialogMapper.SuccessUrl(str)), uVar == uVar2 ? new w1(6, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null) : u1.b.f216225a, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4068), false, 4);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.charity_donation_pending_title, v.k(new MoneyClause(result.f13927a, new MoneyClause.Format.Shorts(false, 63), null, null, 12), new TextClause(lVar.f13939b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.charity_donation_pending_subtitle, null, null, 14);
            int i2 = sc6.c.f261639b[uVar.ordinal()];
            if (i2 == 1) {
                jVar = j.a.f216169a;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar = j.b.f216170a;
            }
            j jVar2 = jVar;
            u uVar3 = u.MAJOR_EVENT;
            y0Var = new y0("REGULAR_DONATION_SUCCESS_STATUS_VIEW_ID", new nii.g0(textLocalisedClause3, textLocalisedClause4, null, uVar == uVar3 ? new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14) : null, null, null, (uVar != uVar3 || str == null) ? null : new DonateSuccessStatusDialogMapper.SuccessUrl(str), jVar2, false, null, false, null, 16180), false, 4);
        }
        n.j2(this, L2(y0Var), null, new h(y0Var, this, continuation, 12), 3);
    }
}
