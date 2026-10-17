package x5b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidget;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidgetNextReward;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import r5b.r;
import w5b.u7;
import w5b.x7;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f302931a = q0.c(new Pair("WARNING", r.WARNING));

    public static final CobrandedCardsWidget a(u7 u7Var) {
        r rVar;
        Intrinsics.checkNotNullParameter(u7Var, "<this>");
        String str = u7Var.f295038a;
        String str2 = u7Var.f295039b;
        String str3 = u7Var.f295040c;
        CobrandedCardsWidgetNextReward cobrandedCardsWidgetNextReward = null;
        if (str3 != null) {
            r[] rVarArrValues = r.values();
            int length = rVarArrValues.length;
            for (int i = 0; i < length; i++) {
                rVar = rVarArrValues[i];
                if (a0.z(rVar.name(), str3, true)) {
                    break;
                }
            }
            rVar = null;
        } else {
            rVar = null;
        }
        String str4 = u7Var.d;
        String str5 = u7Var.e;
        x7 x7Var = u7Var.f;
        if (x7Var != null) {
            Intrinsics.checkNotNullParameter(x7Var, "<this>");
            cobrandedCardsWidgetNextReward = new CobrandedCardsWidgetNextReward(x7Var.f295075a, x7Var.f295076b, x7Var.f295077c, x7Var.d);
        }
        return new CobrandedCardsWidget(str, str2, rVar, str4, str5, cobrandedCardsWidgetNextReward);
    }
}
