package fc8;

import aw0.ka;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.junior_allowance.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import do3.n;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f133661a;

    public c(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f133661a = dateProvider;
    }

    public static vd8.a a(nb8.b bVar, n nVar, List list) {
        Object obj2 = null;
        if (Intrinsics.f(bVar.f214010h.f214013a, nVar.f116408a)) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((vd8.a) next).f287813a, bVar.f214010h.f214014b)) {
                obj2 = next;
                break;
            }
        }
        return (vd8.a) obj2;
    }

    public static TextLocalisedClause d(nb8.e eVar) {
        int i;
        switch (eVar == null ? -1 : b.f133660a[eVar.ordinal()]) {
            case -1:
                i = R$string.junior_allowances_item_subtitle_one_time;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                i = R$string.junior_allowances_item_subtitle_daily;
                break;
            case 2:
            case 3:
                i = R$string.junior_allowances_item_subtitle_weekly;
                break;
            case 4:
            case 5:
                i = R$string.junior_allowances_item_subtitle_bi_weekly;
                break;
            case 6:
                i = R$string.junior_allowances_item_subtitle_monthly;
                break;
            case 7:
                i = R$string.junior_allowances_item_subtitle_yearly;
                break;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static RowDelegate.Model e(nb8.b bVar, TextLocalisedClause textLocalisedClause, Custom custom, CircleIconBadge circleIconBadge, JuniorBankingProfile juniorBankingProfile) {
        return new RowDelegate.Model(bVar.f214006a, new RowDelegate.Model.MainImage.Image40(new ContactImage(juniorBankingProfile.f77103j, (String) null, (String) null, (String) null, (String) null, ta6.a.t(juniorBankingProfile), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), circleIconBadge, null, false, null, false, 60), new TextLocalisedClause(R$string.junior_allowances_item_title, u.c(ta6.a.t(juniorBankingProfile)), null, 12), null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(bVar.f214011j, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8), null, null, false, 126), false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532675544);
    }

    public final a b(LocalDate localDate, int i, int i2, int i3) {
        f fVar = (f) this.f133661a;
        if (Intrinsics.f(localDate, fVar.e())) {
            return new a(i, f0.f322471a);
        }
        if (Intrinsics.f(localDate, fVar.e().plusDays(1L))) {
            return new a(i2, f0.f322471a);
        }
        return new a(i3, u.c(new TimeClause(oc.c.F(localDate), localDate.getYear() == fVar.e().getYear() ? new TimeClause.Format.DayAndMonth(ka.SHORT) : new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)));
    }

    public final RowDelegate.Model c(nb8.b allowance, n user, JuniorBankingProfile profile, List coparents) {
        a aVarB;
        TextLocalisedClause textLocalisedClause;
        a aVarB2;
        Intrinsics.checkNotNullParameter(allowance, "allowance");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(coparents, "coparents");
        vd8.a aVarA = a(allowance, user, coparents);
        LocalDate localDate = allowance.f214009g;
        nb8.e eVar = allowance.e;
        if (aVarA != null) {
            switch (eVar != null ? b.f133660a[eVar.ordinal()] : -1) {
                case -1:
                    aVarB2 = b(localDate, R$string.junior_allowances_item_subtitle_another_payer_due_today_one_time, R$string.junior_allowances_item_subtitle_another_payer_due_tomorrow_one_time, R$string.junior_allowances_item_subtitle_another_payer_due_future_one_time);
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    aVarB2 = b(localDate, R$string.junior_allowances_item_subtitle_another_payer_due_today_daily, R$string.junior_allowances_item_subtitle_another_payer_due_tomorrow_daily, R$string.junior_allowances_item_subtitle_another_payer_due_future_daily);
                    break;
                case 2:
                case 3:
                    aVarB2 = b(localDate, R$string.junior_allowances_item_subtitle_another_payer_due_today_weekly, R$string.junior_allowances_item_subtitle_another_payer_due_tomorrow_weekly, R$string.junior_allowances_item_subtitle_another_payer_due_future_weekly);
                    break;
                case 4:
                case 5:
                    aVarB2 = b(localDate, R$string.junior_allowances_item_subtitle_another_payer_due_today_bi_weekly, R$string.junior_allowances_item_subtitle_another_payer_due_tomorrow_bi_weekly, R$string.junior_allowances_item_subtitle_another_payer_due_future_bi_weekly);
                    break;
                case 6:
                    aVarB2 = b(localDate, R$string.junior_allowances_item_subtitle_another_payer_due_today_monthly, R$string.junior_allowances_item_subtitle_another_payer_due_tomorrow_monthly, R$string.junior_allowances_item_subtitle_another_payer_due_future_monthly);
                    break;
                case 7:
                    aVarB2 = b(localDate, R$string.junior_allowances_item_subtitle_another_payer_due_today_yearly, R$string.junior_allowances_item_subtitle_another_payer_due_tomorrow_yearly, R$string.junior_allowances_item_subtitle_another_payer_due_future_yearly);
                    break;
            }
            textLocalisedClause = new TextLocalisedClause(aVarB2.f133658a, d0.E0(aVarB2.f133659b, u.c(aVarA.f287814b)), null, 12);
        } else {
            switch (eVar != null ? b.f133660a[eVar.ordinal()] : -1) {
                case -1:
                    aVarB = b(localDate, R$string.junior_allowances_item_subtitle_due_today_one_time, R$string.junior_allowances_item_subtitle_due_tomorrow_one_time, R$string.junior_allowances_item_subtitle_due_future_one_time);
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    aVarB = b(localDate, R$string.junior_allowances_item_subtitle_due_today_daily, R$string.junior_allowances_item_subtitle_due_tomorrow_daily, R$string.junior_allowances_item_subtitle_due_future_daily);
                    break;
                case 2:
                case 3:
                    aVarB = b(localDate, R$string.junior_allowances_item_subtitle_due_today_weekly, R$string.junior_allowances_item_subtitle_due_tomorrow_weekly, R$string.junior_allowances_item_subtitle_due_future_weekly);
                    break;
                case 4:
                case 5:
                    aVarB = b(localDate, R$string.junior_allowances_item_subtitle_due_today_bi_weekly, R$string.junior_allowances_item_subtitle_due_tomorrow_bi_weekly, R$string.junior_allowances_item_subtitle_due_future_bi_weekly);
                    break;
                case 6:
                    aVarB = b(localDate, R$string.junior_allowances_item_subtitle_due_today_monthly, R$string.junior_allowances_item_subtitle_due_tomorrow_monthly, R$string.junior_allowances_item_subtitle_due_future_monthly);
                    break;
                case 7:
                    aVarB = b(localDate, R$string.junior_allowances_item_subtitle_due_today_yearly, R$string.junior_allowances_item_subtitle_due_tomorrow_yearly, R$string.junior_allowances_item_subtitle_due_future_yearly);
                    break;
            }
            textLocalisedClause = new TextLocalisedClause(aVarB.f133658a, aVarB.f133659b, null, 12);
        }
        return e(allowance, textLocalisedClause, null, null, profile);
    }
}
