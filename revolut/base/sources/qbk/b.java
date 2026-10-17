package qbk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import java.util.List;
import kbk.g;
import kbk.h;
import kbk.i;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import nii.u0;
import nii.y0;
import nii.z;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static y0 a(String receiverDisplayedName, i eligibility) {
        a aVar;
        g gVar = eligibility.f182626c;
        Intrinsics.checkNotNullParameter(receiverDisplayedName, "receiverDisplayedName");
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        g[] gVarArr = {g.PRICING_PLAN_REVEALING_DISABLED};
        g gVar2 = eligibility.f182625b;
        h hVar = eligibility.f182624a;
        if (d.I(gVarArr, gVar2)) {
            aVar = new a(new TextLocalisedClause(R$string.plan_gifting_dialog_plan_revealing_disabled_title, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.plan_gifting_dialog_plan_revealing_disabled_subtitle, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        } else {
            g gVar3 = g.NOT_TRUSTED_CONTACT;
            if (gVar == gVar3 || gVar2 == gVar3) {
                aVar = new a(new TextLocalisedClause(R$string.plan_gifting_dialog_not_trusted_title, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.plan_gifting_dialog_not_trusted_subtitle, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
            } else if (d.I(new g[]{g.KYC_NOT_PASSED, g.IDENTITY_NOT_ACTIVE}, gVar2)) {
                aVar = new a(new TextLocalisedClause(R$string.plan_gifting_dialog_kyc_not_passed_title, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.plan_gifting_dialog_kyc_not_passed_subtitle, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
            } else {
                g gVar4 = g.PENDING_GIFT_ALREADY_EXISTS;
                if (gVar == gVar4 || gVar2 == gVar4) {
                    aVar = new a(new TextLocalisedClause(R$string.plan_gifting_dialog_pending_gift_title, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.plan_gifting_dialog_pending_gift_subtitle, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
                } else {
                    g gVar5 = g.PRICING_PLAN_GIFTING_DISABLED;
                    if (gVar == gVar5 || gVar2 == gVar5) {
                        aVar = new a(new TextLocalisedClause(R$string.plan_gifting_dialog_unavailable_disabled_title, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.plan_gifting_dialog_unavailable_disabled_subtitle, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
                    } else if (hVar == h.RECEIVER_PRIVACY_BLOCK) {
                        aVar = new a(new TextLocalisedClause(R$string.plan_gifting_dialog_unavailable_blocked_title, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.plan_gifting_dialog_unavailable_blocked_subtitle, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
                    } else {
                        if (hVar != h.DISABLED) {
                            throw new IllegalStateException(("PlanGiftingEligibilityErrorDialogProviderImpl: can not build error dialog for eligibility: " + hVar).toString());
                        }
                        aVar = new a(new TextLocalisedClause(R$string.plan_gifting_dialog_unavailable_disabled_title, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.plan_gifting_dialog_error_subtitle, u.c(new TextClause(receiverDisplayedName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
                    }
                }
            }
        }
        return new y0(null, new z(aVar.f244371a, aVar.f244372b, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, u0.SOFT_FAIL, null, null, 28660), false, 5);
    }
}
