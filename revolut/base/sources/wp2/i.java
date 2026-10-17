package wp2;

import aw0.ka;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.DirectDebit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f299015a;

    public i(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f299015a = dateProvider;
    }

    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // cli.n
    public final o c(j jVar) {
        RowDelegate.Model.c.b bVar;
        TimeClause timeClause;
        ?? r92;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TimeClause.Format dayAndMonth;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f299011a.f64069b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        boolean z = false;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            DirectDebit directDebit = (DirectDebit) obj2;
            String strN = a0.d.n("ID_DIRECT_DEBIT_ITEM_", i);
            String str = directDebit.f64062b;
            LocalDate localDate = directDebit.f;
            Long l2 = directDebit.d;
            if (str == null) {
                str = "";
            }
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(str, null, null, null, 0L, null, null, null, null, LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorColdBlue, 8.0f, Float.valueOf(24.0f), null, 32), false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, z, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878), null, null, false, null, false, 62);
            TextClause textClause = new TextClause(directDebit.f64061a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (l2 == null || l2.longValue() == 0) {
                bVar = null;
            } else {
                long jLongValue = l2.longValue();
                xi0.a aVar = xi0.b.Companion;
                String str2 = directDebit.e;
                aVar.getClass();
                bVar = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(jLongValue, xi0.a.a(str2)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            }
            if (localDate != null) {
                long jF = oc.c.F(localDate);
                if (localDate.getYear() != ((l80.f) this.f299015a).g().getYear()) {
                    TimeClause.Format.INSTANCE.getClass();
                    dayAndMonth = TimeClause.Format.f57959a;
                } else {
                    dayAndMonth = new TimeClause.Format.DayAndMonth(ka.SHORT);
                }
                timeClause = new TimeClause(jF, dayAndMonth, null, null, 12);
            } else {
                timeClause = null;
            }
            fva.e eVar = directDebit.f64063c;
            switch (eVar == null ? -1 : h.f299014a[eVar.ordinal()]) {
                case -1:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    r92 = 0;
                    textLocalisedClause = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    r92 = 0;
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_weekly, null, null, 14);
                    break;
                case 2:
                    r92 = 0;
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_biweekly, null, null, 14);
                    break;
                case 3:
                    r92 = 0;
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_monthly, null, null, 14);
                    break;
                case 4:
                    r92 = 0;
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_quarterly, null, null, 14);
                    break;
                case 5:
                    r92 = 0;
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_halfyearly, null, null, 14);
                    break;
                case 6:
                    r92 = 0;
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_yearly, null, null, 14);
                    break;
            }
            if (timeClause == null || textLocalisedClause == null) {
                if (timeClause != null) {
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_unknown, u.c(timeClause), r92, 12);
                } else if (textLocalisedClause == null) {
                    textLocalisedClause = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_empty, r92, r92, 14);
                }
                textLocalisedClause2 = textLocalisedClause;
            } else {
                textLocalisedClause2 = new TextLocalisedClause(R$string.account_switch_direct_debit_list_frequency_known, v.k(textLocalisedClause, timeClause), r92, 12);
            }
            arrayList.add(new RowDelegate.Model(strN, image40, textClause, null, 0, textLocalisedClause2, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
            i = i2;
            z = false;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new e(new TextLocalisedClause(R$string.account_switch_direct_debit_list_subtitle, u.c(new TextClause(domainState.f299011a.f64068a.d.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), arrayList);
    }
}
