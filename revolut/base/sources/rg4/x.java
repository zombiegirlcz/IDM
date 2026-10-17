package rg4;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItemId;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tx0.j0;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mki.b f254038a;

    public x(mki.b environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.f254038a = environment;
    }

    public static void a(aim.e eVar, ArrayList arrayList, Integer num) {
        int iE;
        int i;
        String str;
        if (arrayList.isEmpty()) {
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            eVar.add(new ListSubheaderDelegate.Model(a0.d.n("PRE_APPLICATION_CHECK_HEADER_", iIntValue), (Image) null, (Clause) new TextLocalisedClause(iIntValue, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            PreApplicationCheckItem preApplicationCheckItem = (PreApplicationCheckItem) it8.next();
            TextLocalisedClause textLocalisedClauseG = g(preApplicationCheckItem.getF66254a());
            TextLocalisedClause textLocalisedClauseF = f(preApplicationCheckItem.getF66254a());
            boolean z = preApplicationCheckItem instanceof PreApplicationCheckItem.Remediable;
            if (z) {
                iE = R$drawable.uikit_icn_24_exclamation_triangle;
            } else if (preApplicationCheckItem instanceof PreApplicationCheckItem.Pending) {
                iE = R$drawable.uikit_icn_24_time;
            } else if (preApplicationCheckItem instanceof PreApplicationCheckItem.NonRemediable) {
                iE = R$drawable.uikit_icn_24_exclamation_mark;
            } else if (preApplicationCheckItem instanceof PreApplicationCheckItem.Completed) {
                iE = R$drawable.uikit_icn_24_check;
            } else {
                if (!(preApplicationCheckItem instanceof PreApplicationCheckItem.Informative)) {
                    throw new NoWhenBranchMatchedException();
                }
                iE = e(((PreApplicationCheckItem.Informative) preApplicationCheckItem).f66251a);
            }
            int i2 = iE;
            if (z || (preApplicationCheckItem instanceof PreApplicationCheckItem.NonRemediable)) {
                i = R$attr.uikit_colorStatusWarning;
            } else if ((preApplicationCheckItem instanceof PreApplicationCheckItem.Pending) || (preApplicationCheckItem instanceof PreApplicationCheckItem.Informative)) {
                i = R$attr.uikit_colorForeground;
            } else {
                if (!(preApplicationCheckItem instanceof PreApplicationCheckItem.Completed)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.uikit_colorStatusSuccess;
            }
            PreApplicationCheckItemId f66254a = preApplicationCheckItem.getF66254a();
            Intrinsics.checkNotNullParameter(f66254a, "<this>");
            if (f66254a instanceof PreApplicationCheckItemId.Age) {
                str = "PRE_APPLICATION_CHECK_AGE";
            } else if (f66254a instanceof PreApplicationCheckItemId.MinimumEmploymentDuration) {
                str = "PRE_APPLICATION_CHECK_EMPLOYMENT";
            } else if (f66254a instanceof PreApplicationCheckItemId.MinimumIncome) {
                str = "PRE_APPLICATION_CHECK_INCOME";
            } else if (f66254a instanceof PreApplicationCheckItemId.UpdatePhone) {
                str = "PRE_APPLICATION_CHECK_LOCAL_PHONE_NUMBER";
            } else if (f66254a instanceof PreApplicationCheckItemId.NegativeBalance) {
                str = "PRE_APPLICATION_CHECK_BALANCE";
            } else if (f66254a instanceof PreApplicationCheckItemId.MinimumAccountHistory) {
                str = "PRE_APPLICATION_CHECK_NEW_ACCOUNT";
            } else if (f66254a instanceof PreApplicationCheckItemId.DocumentsRemediation) {
                str = "PRE_APPLICATION_CHECK_DOCUMENTS";
            } else if (f66254a instanceof PreApplicationCheckItemId.Residency) {
                str = "PRE_APPLICATION_CHECK_RESIDENCY";
            } else {
                if (!(f66254a instanceof PreApplicationCheckItemId.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "PRE_APPLICATION_CHECK_UNKNOWN";
            }
            String str2 = str;
            ResourceImage resourceImage = new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246);
            boolean z3 = false;
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(resourceImage, z3, z3, 6);
            if (preApplicationCheckItem instanceof PreApplicationCheckItem.Completed) {
                textLocalisedClauseF = new TextLocalisedClause(R$string.credit_pre_application_checks_item_completed, null, null, 14);
            } else if (preApplicationCheckItem instanceof PreApplicationCheckItem.Pending) {
                textLocalisedClauseF = new TextLocalisedClause(R$string.credit_pre_application_checks_item_pending, null, null, 14);
            } else if (z) {
                textLocalisedClauseF = textLocalisedClauseF != null ? TextLocalisedClause.c(textLocalisedClauseF, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 27) : null;
            }
            arrayList2.add(new RowDelegate.Model(str2, image24, textLocalisedClauseG, null, 0, textLocalisedClauseF, null, null, 0, z ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false) : null, z, null, false, null, null, null, null, null, null, preApplicationCheckItem, null, 0, 0, 0, 0, 532673496));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVar.addAll(arrayList2);
    }

    public static TextLocalisedClause b(int i, et3.a aVar, boolean z) {
        return new TextLocalisedClause(z ? aVar == et3.a.DAYS ? R$string.credit_pre_application_checks_item_employment_duration_days : R$string.credit_pre_application_checks_item_employment_duration_months : aVar == et3.a.DAYS ? R$string.credit_pre_application_checks_item_account_history_days : R$string.credit_pre_application_checks_item_account_history_months, zhm.u.c(Integer.valueOf(i)), null, 12);
    }

    public static int e(PreApplicationCheckItemId preApplicationCheckItemId) {
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.Age) {
            return R$drawable.uikit_icn_24_calendar;
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumEmploymentDuration) {
            return R$drawable.uikit_icn_24_services;
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumIncome) {
            return R$drawable.uikit_icn_24_cash_income;
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.UpdatePhone) {
            return R$drawable.uikit_icn_24_phone_book;
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.NegativeBalance) {
            return R$drawable.uikit_icn_24_wallet;
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumAccountHistory) {
            return R$drawable.uikit_icn_24_calendar_quarter;
        }
        if (!(preApplicationCheckItemId instanceof PreApplicationCheckItemId.DocumentsRemediation) && !(preApplicationCheckItemId instanceof PreApplicationCheckItemId.Residency)) {
            if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.Unknown) {
                throw new IllegalStateException("Unknown pre-application check item");
            }
            throw new NoWhenBranchMatchedException();
        }
        return R$drawable.uikit_icn_24_document;
    }

    public static TextLocalisedClause f(PreApplicationCheckItemId preApplicationCheckItemId) {
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.Age) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_age_description, null, null, 14);
        }
        if ((preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumEmploymentDuration) || (preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumIncome)) {
            return null;
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.UpdatePhone) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_update_phone_description, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.NegativeBalance) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_negative_balance_description, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumAccountHistory) {
            PreApplicationCheckItemId.MinimumAccountHistory minimumAccountHistory = (PreApplicationCheckItemId.MinimumAccountHistory) preApplicationCheckItemId;
            return b(minimumAccountHistory.f66257a, minimumAccountHistory.f66258b, false);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.DocumentsRemediation) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_documents_description, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.Residency) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_residency_description, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.Unknown) {
            throw new IllegalStateException("Unknown pre-application check item");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause g(PreApplicationCheckItemId preApplicationCheckItemId) {
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.Age) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_age_title, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumEmploymentDuration) {
            PreApplicationCheckItemId.MinimumEmploymentDuration minimumEmploymentDuration = (PreApplicationCheckItemId.MinimumEmploymentDuration) preApplicationCheckItemId;
            return b(minimumEmploymentDuration.f66259a, minimumEmploymentDuration.f66260b, true);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumIncome) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_minimum_income, zhm.u.c(new MoneyClause(((PreApplicationCheckItemId.MinimumIncome) preApplicationCheckItemId).f66261a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.UpdatePhone) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_update_phone_title, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.NegativeBalance) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_negative_balance_title, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.MinimumAccountHistory) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_account_history_title, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.DocumentsRemediation) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_documents_title, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.Residency) {
            return new TextLocalisedClause(R$string.credit_pre_application_checks_item_residency_title, null, null, 14);
        }
        if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.Unknown) {
            throw new IllegalStateException("Unknown pre-application check item");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (t) iii.c.f(domainState.f254027a, new raf.o(this, 19), new r6f.i(this, 20), new qbg.j(this, 27));
    }

    public final hx4.c d(PreApplicationChecksScenario preApplicationChecksScenario) {
        if ((preApplicationChecksScenario instanceof PreApplicationChecksScenario.RejectedUndisclosed) || (preApplicationChecksScenario instanceof PreApplicationChecksScenario.ReadyWithInfo)) {
            return null;
        }
        Pair pair = preApplicationChecksScenario instanceof PreApplicationChecksScenario.Blocked ? new Pair(Integer.valueOf(R$string.credit_pre_application_checks_blocked_title), null) : preApplicationChecksScenario instanceof PreApplicationChecksScenario.RemediationRequired ? new Pair(Integer.valueOf(R$string.credit_pre_application_checks_remediation_title), null) : new Pair(Integer.valueOf(R$string.credit_pre_application_checks_informative_title), Integer.valueOf(R$string.credit_pre_application_checks_informative_description));
        int iIntValue = ((Number) pair.f186385a).intValue();
        Integer num = (Integer) pair.f186386b;
        return new hx4.c(new TextLocalisedClause(iIntValue, null, null, 14), num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, new ResourceImage(ofm.q.k(this.f254038a), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), j0.MULTILINE);
    }
}
