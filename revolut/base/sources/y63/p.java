package y63;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import ip0.ck0;
import ip0.pb0;
import ip0.s7;
import ip0.yj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f311139a;

    public p(thf.g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f311139a = transactionsItemMapper;
    }

    public final List a(s63.f transactionsContent) {
        List list;
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        List list2 = transactionsContent.f260117a;
        k71.q qVar = transactionsContent.f260118b;
        boolean z = transactionsContent.f260119c;
        int i = 0;
        if (z && ((list = list2) == null || list.isEmpty() || qVar == null)) {
            return zhm.v.k(new s7("TRANSACTIONS_LOADING_ID", 0, 0, 0, 0, false, null, 126), new pb0("TRANSACTIONS_LOADING_ID"));
        }
        if (list2 == null || !(!list2.isEmpty()) || qVar == null) {
            if (z) {
                return f0.f322471a;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_transactions_empty, null, null, 14);
            ck0 ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
            int i2 = R$attr.uikit_dp24;
            return zhm.u.c(new TextDelegate.Model("CARD_TRANSACTIONS_PLACEHOLDER", textLocalisedClause, false, ck0Var, null, null, i2, i2, 0, 0, 1652));
        }
        aim.e eVarB = zhm.u.b();
        ArrayList arrayListQ = ((anf.k) this.f311139a).q(d0.V0(list2, 3), qVar, new thf.f(false, 3));
        ArrayList arrayList = new ArrayList(zhm.w.t(arrayListQ, 10));
        for (Object obj2 : arrayListQ) {
            int i3 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            arrayList.add(RowDelegate.Model.x((RowDelegate.Model) obj2, a0.d.n("CARD_TRANSACTION_LIST_ID@", i), null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2, 15));
            i = i3;
        }
        eVarB.addAll(arrayList);
        if (list2.size() > 3) {
            eVarB.add(new LargeActionButtonDelegate.Model("CARD_TRANSACTIONS_SEE_ALL_LIST_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.card_transactions_see_all, null, null, 14), false, null, null, null, null, 1000));
        }
        return zhm.u.a(eVarB);
    }
}
