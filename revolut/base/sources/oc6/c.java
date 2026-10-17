package oc6;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.period_chooser.R$string;
import java.util.ArrayList;
import java.util.List;
import jli.e;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {
    public final y a(Period currentPeriod) {
        ic6.a aVar;
        Intrinsics.checkNotNullParameter(currentPeriod, "currentPeriod");
        Intrinsics.checkNotNullParameter(currentPeriod, "<this>");
        if (Intrinsics.f(currentPeriod, e.f175845h)) {
            aVar = ic6.a.MONTHLY;
        } else if (Intrinsics.f(currentPeriod, e.f175843c) || Intrinsics.f(currentPeriod, e.d)) {
            aVar = ic6.a.WEEKLY;
        } else {
            if (!Intrinsics.f(currentPeriod, e.f175841a)) {
                throw new IllegalStateException("Unsupported donation period");
            }
            aVar = ic6.a.DAILY;
        }
        List<ic6.a> listV0 = d.v0(ic6.a.values());
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        for (ic6.a aVar2 : listV0) {
            boolean z = aVar2 == aVar;
            String string = aVar2.toString();
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            arrayList.add(new SingleChoiceDelegate.Model(string, ic6.c.b(ic6.c.c(aVar2)), z, null, ic6.c.c(aVar2), YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ITEM_ID_ACTION_BUTTON_PERIOD", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.period_chooser_common_action_set, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new y(d0.F0(model, arrayList), new t(new TextLocalisedClause(R$string.period_chooser_common_word_repeat, null, null, 14), null, null, 30), l.WINDOW, null, null, null, 1016);
    }
}
