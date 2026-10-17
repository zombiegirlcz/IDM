package mz7;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.common.ui.R$string;
import java.time.LocalDate;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mx0.x8;
import org.joda.time.DateTime;
import rp0.l;
import rp0.t;
import rp0.y;
import te0.w;
import yp0.b;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f210720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f210721b;

    public a(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f210720a = dateProvider;
        this.f210721b = w.y0(new x8(this, 5));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final y a(Date date) {
        ?? r110 = this.f210721b;
        Date date2 = date == null ? ((DateTime) r110.getValue()).toDate() : date;
        Intrinsics.h(date2);
        LocalDate localDateN = ebm.a.N(date2);
        LocalDate localDateN2 = date != null ? ebm.a.N(date) : null;
        Date date3 = ((DateTime) r110.getValue()).toDate();
        Intrinsics.checkNotNullExpressionValue(date3, "toDate(...)");
        LocalDate localDateN3 = ebm.a.N(date3);
        Date date4 = ((DateTime) r110.getValue()).plusMonths(12).minusDays(1).toDate();
        Intrinsics.checkNotNullExpressionValue(date4, "toDate(...)");
        g5 g5Var = new g5("REMINDER_DATE_PICKER_CALENDAR_ITEM_LIST_ID", localDateN, localDateN2, false, null, localDateN3, ebm.a.N(date4), null, null, null, 0, 0, 1048376);
        b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_done, null, null, 14);
        boolean z = date != null;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("REMINDER_DATE_PICKER_LARGE_ACTION_BUTTON_ITEM_LIST_ID", defaultFilledButton, null, textLocalisedClause, z, null, date, i, i, i2, i2, 352);
        int i3 = R$attr.uikit_dp0;
        b.p(model, i3, R$attr.uikit_dp16, i3, i3);
        return new y(v.k(g5Var, model), new t(new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_purchase_reminder_date_picker_title, null, null, 14), null, null, 30), l.WINDOW, null, null, null, "REMINDER_DATE_PICKER_DIALOG_DELEGATE_KEY", null, null, null, 3832);
    }
}
