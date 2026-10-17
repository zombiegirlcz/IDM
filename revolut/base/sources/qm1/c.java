package qm1;

import aw0.c7;
import aw0.ka;
import aw0.o9;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import qua.l;
import qua.n;
import qua.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements nm1.b {
    public static LayeredImage a() {
        return LayeredImage.Companion.c(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_documents_pair, Integer.valueOf(R$attr.uikit_colorAccent), new Color.Opaque(R$attr.uikit_colorAccent, 0.1f), 8.0f, Float.valueOf(24.0f), 32);
    }

    public static RowDelegate.Model b(c cVar, String str, String str2, dj0.d dVar, LocalDate localDate, int i, int i2, p pVar, CircleIconBadge circleIconBadge, int i3, int i5) {
        CircleIconBadge circleIconBadge2 = (i5 & 128) != 0 ? null : circleIconBadge;
        int i6 = (i5 & 256) != 0 ? R$attr.uikit_colorGreyTone50 : i3;
        boolean z = (i5 & 1024) == 0;
        Clause clauseB = j.b(c7.Companion, jli.b.e(localDate), new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT));
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(a(), circleIconBadge2, null, false, null, false, 60);
        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i21 = R$string.pay_bills_taxes_country_br_boleto_item_status_placeholder;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(i2), false, null, false, null, 254), 10);
        if (z) {
            clauseB = new TextLocalisedClause(R$string.pay_bills_taxes_country_br_boleto_item_status_on_placeholder, u.c(clauseB), null, 12);
        }
        return new RowDelegate.Model(str, image40, textClause, null, 2, new TextLocalisedClause(i21, v.k(textLocalisedClause, clauseB), null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dj0.d.c(dVar, -dVar.f115082a, null, 2), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(i6), false, null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8), null, null, false, 126), false, null, false, null, null, null, null, null, null, pVar, null, 0, 0, 0, 0, 532675528);
    }

    public final RowDelegate.Model c(p paymentItem) {
        Intrinsics.checkNotNullParameter(paymentItem, "item");
        n nVar = paymentItem.Y;
        if (nVar == null) {
            throw new IllegalStateException("Bill details must not be null");
        }
        String id10 = paymentItem.f249314a.f160150a;
        l lVar = nVar.f249308g;
        String str = lVar != null ? lVar.f249302a : null;
        if (str == null) {
            str = "";
        }
        String payeeName = str;
        dj0.d value = qua.u.f(paymentItem);
        LocalDate dueDate = nVar.d;
        if (dueDate == null) {
            throw new IllegalStateException("Due date must not be null");
        }
        if (nVar.f != null) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(payeeName, "payeeName");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(dueDate, "dueDate");
            Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
            return b(this, id10, payeeName, value, dueDate, R$string.pay_bills_taxes_country_br_boleto_item_status_scheduled, R$attr.uikit_colorGreyTone50, paymentItem, new AccentCircleBadge(dw0.a.Pending), R$attr.uikit_colorForeground, 512);
        }
        if (LocalDate.now().isAfter(dueDate)) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(payeeName, "payeeName");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(dueDate, "dueDate");
            Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
            return b(this, id10, payeeName, value, dueDate, R$string.pay_bills_taxes_country_br_boleto_item_status_overdue, R$attr.uikit_colorOrange, paymentItem, new WarningCircleBadge(dw0.a.Suspicious), 0, ViewUtils.EDGE_TO_EDGE_FLAGS);
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(payeeName, "payeeName");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        return b(this, id10, payeeName, value, dueDate, R$string.pay_bills_taxes_country_br_boleto_item_status_default, R$attr.uikit_colorAccent, paymentItem, null, 0, 1920);
    }
}
