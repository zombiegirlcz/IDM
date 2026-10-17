package g06;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.customer_present.tips.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listO0 = d0.O0(domainState.f139352a);
        ArrayList arrayList = new ArrayList(w.t(listO0, 10));
        int i = 0;
        for (Object obj2 : listO0) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            int iIntValue = ((Number) obj2).intValue();
            dj0.d dVarN = pyd.c.N(domainState.f139353b, iIntValue / 100.0f);
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(String.valueOf(i), LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.customer_present_tipping_tip_percent_button_title, v.k(Integer.valueOf(iIntValue), new MoneyClause(dVarN, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12)), null, 12), false, null, null, dVarN, null, 744);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            domainState = domainState;
            i = i2;
        }
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("custom_tip", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.customer_present_tipping_custom_tip_button_title, null, null, 14), false, null, null, "custom_tip", null, 744);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new i(d0.F0(model2, arrayList));
    }
}
