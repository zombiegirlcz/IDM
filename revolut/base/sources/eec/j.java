package eec;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.shared.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import u6c.z;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        int i2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        z zVar = domainState.f125168a;
        int[] iArr = i.f125174a;
        int i3 = iArr[zVar.ordinal()];
        if (i3 == 1) {
            i = R$string.revolut_pay_order_summary_gambling_high_risk_screen_title;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.revolut_pay_order_summary_gambling_low_risk_screen_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i5 = iArr[zVar.ordinal()];
        if (i5 == 1) {
            i2 = R$string.revolut_pay_order_summary_gambling_high_risk_screen_description;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.revolut_pay_order_summary_gambling_low_risk_screen_description;
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i2, null, null, 14), new lw0.b(new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, 17, 50, 50, 15), (Clause) null, 190), null), null, false, 24);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_pay_order_summary_gambling_risk_screen_action_proceed, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.revolut_pay_order_summary_gambling_risk_screen_action_cancel, null, null, 14);
        List listK = v.k(new RowDelegate.Model("THINK_ROW_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_order_summary_gambling_risk_screen_think_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_order_summary_gambling_risk_screen_think_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("MONITOR_ROW_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_order_summary_gambling_risk_screen_monitor_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_order_summary_gambling_risk_screen_monitor_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LIMIT_ROW_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lock, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_order_summary_gambling_risk_screen_limit_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_order_summary_gambling_risk_screen_limit_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new h(aVar, textLocalisedClause2, textLocalisedClause3, listK);
    }
}
