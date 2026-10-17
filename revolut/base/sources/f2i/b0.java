package f2i;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.recurringbuys.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements k {

    @NotNull
    public static final a0 Companion = new a0();

    public static LargeActionButtonDelegate.Model c(String str) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_set, null, null, 14);
        int i = R$attr.uikit_dp32;
        int i2 = R$attr.uikit_dp16;
        return new LargeActionButtonDelegate.Model(str, defaultFilledButton, null, textLocalisedClause, false, null, null, i, i2, i2, i2, 496);
    }

    public final rp0.y a(g selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        g[] gVarArrValues = g.values();
        ArrayList arrayList = new ArrayList(gVarArrValues.length);
        int length = gVarArrValues.length;
        for (int i = 0; i < length; i++) {
            g gVar = gVarArrValues[i];
            arrayList.add(new SingleChoiceDelegate.Model(a0.d.h(gVar.b(), "_REPEAT_PICKER_ITEM_ID"), new TextLocalisedClause(gVar.b(), null, null, 14), gVar == selectedPeriod, null, gVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new rp0.y(d0.F0(c("SET_REPEAT_BUTTON_ITEM_ID"), arrayList), new rp0.t(new TextLocalisedClause(R$string.wealthcore_recurringbuys_order_period_repeat_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, "REPEAT_DIALOG_TAG", null, 984);
    }

    public final rp0.y b(LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Date date = selectedDate.toDate();
        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
        java.time.LocalDate localDateN = ebm.a.N(date);
        Date date2 = LocalDate.now().toDate();
        Intrinsics.checkNotNullExpressionValue(date2, "toDate(...)");
        java.time.LocalDate localDateN2 = ebm.a.N(date2);
        Date date3 = selectedDate.toDate();
        Intrinsics.checkNotNullExpressionValue(date3, "toDate(...)");
        return new rp0.y(zhm.v.k(new g5("START_DATE_PICKER_ITEM_ID", localDateN, ebm.a.N(date3), false, null, localDateN2, null, null, null, null, 0, 0, 1048504), c("SET_START_DATE_BUTTON_ITEM_ID")), new rp0.t(new TextLocalisedClause(com.revolut.feature_exchange.impl.R$string.fx_orders_recurring_start_date, null, null, 14), null, new rp0.w(new TextLocalisedClause(R.string.common_action_clear, null, null, 14), ""), 26), rp0.l.WINDOW, null, "START_DATE_DIALOG_TAG", null, 984);
    }
}
