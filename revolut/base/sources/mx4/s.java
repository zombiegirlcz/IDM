package mx4;

import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip;
import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$Toggle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import ip0.kc;
import ip0.mc;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {
    public static List a(dx4.x0 item) {
        qv0.p conditionalAmountDelegate$ConditionalAmountItem$Toggle;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120824a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_conditional_input_text, zhm.u.c(item.f120825b), null, 12);
        LinkedHashMap linkedHashMap = item.f120826c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zhm.q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) entry.getKey();
            dx4.w0 w0Var = (dx4.w0) entry.getValue();
            if (w0Var instanceof dx4.u0) {
                dx4.u0 u0Var = (dx4.u0) w0Var;
                conditionalAmountDelegate$ConditionalAmountItem$Toggle = new ConditionalAmountDelegate$ConditionalAmountItem$ActionChip(str2, null, new TextLocalisedClause(R$string.credit_application_constructor_conditional_input_attachment_switcher_label, zhm.u.c(u0Var.f120781a), null, 12), null, u0Var.f120782b, 26);
            } else {
                if (!(w0Var instanceof dx4.v0)) {
                    throw new NoWhenBranchMatchedException();
                }
                dx4.v0 v0Var = (dx4.v0) w0Var;
                conditionalAmountDelegate$ConditionalAmountItem$Toggle = new ConditionalAmountDelegate$ConditionalAmountItem$Toggle(str2, new TextLocalisedClause(R$string.credit_application_constructor_conditional_input_attachment_toggle_label, zhm.u.c(v0Var.f120797a), null, 12), null, false, v0Var.f120798b, 24);
            }
            linkedHashMap2.put(key, conditionalAmountDelegate$ConditionalAmountItem$Toggle);
        }
        return zhm.u.c(new kc(str, new mc(textLocalisedClause, linkedHashMap2), null));
    }
}
