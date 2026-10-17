package dg5;

import aw0.e;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto.exchange.fees.api.R$string;
import ip0.ck0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.crypto_exchange_fees_learn_more_title, null, null, 14), null, null, null, false, 30);
        String str = domainState.f114581a;
        TextDelegate.Model model = new TextDelegate.Model("LIST_ID_DESCRIPTION", (str == null || d0.W(str)) ? new TextLocalisedClause(R$string.crypto_exchange_fees_learn_more_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10) : new TextLocalisedClause(R$string.crypto_exchange_fees_learn_more_updated_dynamic_description, v.k(30, new TextLocalisedClause(R$string.crypto_exchange_fees_description_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_CLICK_ID", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new cii.b(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.crypto_exchange_fees_learn_more_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), u.c(model), aVar);
    }
}
