package tok;

import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$BottomSheet;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ox0.b0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements n {
    public static n6 a(PricingPlanWaitlistLayout$BottomSheet.Button button) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        TextClause textClause = new TextClause(button.f103658a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = i.f273241a[button.f103660c.ordinal()];
        if (i == 1) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        }
        String str = button.f103659b;
        return new n6(textClause, defaultFilledButton, null, null, str != null, null, str, 476);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextClause textClause;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List list = domainState.f273236a.d;
        aw0.i eVar = null;
        if (!list.isEmpty()) {
            List listV0 = d0.V0(list, 3);
            ArrayList arrayList = new ArrayList(w.t(listV0, 10));
            int i = 0;
            for (Object obj2 : listV0) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                PricingPlanWaitlistLayout$BottomSheet.Section section = (PricingPlanWaitlistLayout$BottomSheet.Section) obj2;
                CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
                String strN = a0.d.n("WaitlistInvitationBottomsheetStateMapper_items_", i);
                TextClause textClause2 = new TextClause(section.f103661a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause3 = new TextClause(section.f103662b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                PricingPlanWaitlistLayout$BottomSheet.Section.Action action = section.f103663c;
                if (action != null) {
                    String str = action.f103664a;
                    String str2 = action.f103665b;
                    textClause = new TextClause(str, (Style) (str2 != null ? new Click(30, (Integer) null, (Object) null, str2, false) : null), (Integer) null, false, (o9) null, (List) null, 124);
                } else {
                    textClause = null;
                }
                arrayList.add(CounterTextDelegate.Model.Companion.c(companion, strN, textClause2, textClause3, textClause, false, 2032));
                i = i2;
            }
            xk xkVar = new xk("WaitlistInvitationBottomsheetStateMapper_items", arrayList, Integer.valueOf(Math.min(list.size(), 3)), Float.valueOf(8.0f), null, 48);
            yp0.b.r(xkVar, 0, R$attr.uikit_dp16, 0, 0, 13);
            eVarB.add(xkVar);
        }
        aim.e eVarA = u.a(eVarB);
        PricingPlanWaitlistLayout$BottomSheet pricingPlanWaitlistLayout$BottomSheet = domainState.f273236a;
        String str3 = pricingPlanWaitlistLayout$BottomSheet.f103655a;
        String str4 = pricingPlanWaitlistLayout$BottomSheet.f103656b;
        List list2 = pricingPlanWaitlistLayout$BottomSheet.e;
        int size = d0.V0(list2, 2).size();
        if (size == 1) {
            eVar = new aw0.e(false, null, b0.BELOW_BUTTONS, a((PricingPlanWaitlistLayout$BottomSheet.Button) d0.b0(list2)), null, null, 49);
        } else if (size == 2) {
            eVar = new aw0.h(false, a((PricingPlanWaitlistLayout$BottomSheet.Button) list2.get(0)), a((PricingPlanWaitlistLayout$BottomSheet.Button) list2.get(1)), null, b0.BELOW_BUTTONS, null, 97);
        }
        return new g(str3, str4, eVar, eVarA);
    }
}
