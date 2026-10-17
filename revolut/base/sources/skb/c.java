package skb;

import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.vaults.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f263801a = new c();

    private c() {
    }

    public static LargeActionButtonDelegate.Model a(c cVar, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = R$attr.uikit_dp24;
        }
        if ((i3 & 2) != 0) {
            i2 = R$attr.uikit_dp24;
        }
        int i5 = R$attr.uikit_dp16;
        cVar.getClass();
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_SAVINGS_INTEREST_GOT_IT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.mmf_selecting_a_currency_explanation_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.p(model, i, i2, i5, i5);
        return model;
    }

    public static MoneyClause b(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(2, 2), false, false, 5), null, null, 12);
    }
}
