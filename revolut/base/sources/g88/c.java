package g88;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior.accounts.impl.R$string;
import eb8.n;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sf8.m;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static a a(m accountInfo, List list, boolean z, n pendingGraduation) {
        AccentCircleBadge accentCircleBadge;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        Intrinsics.checkNotNullParameter(pendingGraduation, "pendingGraduation");
        boolean z3 = accountInfo.i;
        sf8.h hVar = accountInfo.e;
        boolean z4 = accountInfo.f262365j;
        sf8.e eVar = sf8.e.f262354a;
        sf8.a aVar = sf8.a.f262350a;
        AccentCircleBadge accentCircleBadge2 = null;
        boolean z6 = true;
        if (z4 && z3) {
            if (!Intrinsics.f(hVar, aVar) && !Intrinsics.f(hVar, eVar)) {
                z6 = false;
            }
            return new a(new WarningCircleBadge(dw0.a.Info), new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_account_termination, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10), z6);
        }
        if (Intrinsics.f(hVar, aVar)) {
            if (z3) {
                if (pendingGraduation instanceof eb8.m) {
                    accentCircleBadge = new AccentCircleBadge(dw0.a.Info);
                    textLocalisedClause = new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_graduating, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                } else if (z) {
                    accentCircleBadge = new AccentCircleBadge(dw0.a.Info);
                    textLocalisedClause = new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_card_request, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                } else {
                    if (list != null && list.isEmpty()) {
                        accentCircleBadge = new AccentCircleBadge(dw0.a.Info);
                        textLocalisedClause = new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_order_card, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                    }
                    textLocalisedClause = null;
                }
                accentCircleBadge2 = accentCircleBadge;
            } else {
                textLocalisedClause = null;
            }
            return new a(accentCircleBadge2, textLocalisedClause, true);
        }
        if (Intrinsics.f(hVar, sf8.b.f262351a)) {
            a aVar2 = new a(new WarningCircleBadge(dw0.a.Info), new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_ssu_created, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10), false);
            if (!z3) {
                IllegalStateException illegalStateException = new IllegalStateException("Kid shouldn't be created for a coparent.");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            }
            return aVar2;
        }
        if (Intrinsics.f(hVar, sf8.d.f262353a)) {
            return new a(new AccentCircleBadge(dw0.a.Info), new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_locked, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false);
        }
        if (Intrinsics.f(hVar, eVar)) {
            return new a(new DangerCircleBadge(dw0.a.Error), new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_offboarding, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), true);
        }
        if (Intrinsics.f(hVar, sf8.f.f262355a)) {
            return new a(new WarningCircleBadge(dw0.a.Info), new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_parent_kyc_failed, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10), false);
        }
        if (!(hVar instanceof sf8.g)) {
            if (Intrinsics.f(hVar, sf8.c.f262352a)) {
                return new a(new WarningCircleBadge(dw0.a.Info), new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_kid_kyc_failed, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10), false);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = b.f141292a[((sf8.g) hVar).f262356a.ordinal()];
        if (i == 1) {
            return new a(new AccentCircleBadge(dw0.a.Pending), new TextLocalisedClause(R$string.junior_account_switcher_account_cell_subtitle_reviewing_documents, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), false);
        }
        if (i == 2) {
            return new a(new WarningCircleBadge(dw0.a.Info), new TextLocalisedClause(R$string.junior_account_switcher_account_cell_data_points_missing, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10), false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
