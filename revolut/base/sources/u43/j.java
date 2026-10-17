package u43;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_payment_method.impl.R$string;
import h93.l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import s43.n;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends e {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s43.b f277042c;
    public final t43.c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s43.b pocketsMapper, t43.c pocketsTransformer, n searchMatcher, a visibilityPolicy) {
        super(searchMatcher, visibilityPolicy);
        Intrinsics.checkNotNullParameter(pocketsMapper, "pocketsMapper");
        Intrinsics.checkNotNullParameter(pocketsTransformer, "pocketsTransformer");
        Intrinsics.checkNotNullParameter(searchMatcher, "searchMatcher");
        Intrinsics.checkNotNullParameter(visibilityPolicy, "visibilityPolicy");
        this.f277042c = pocketsMapper;
        this.d = pocketsTransformer;
    }

    public static TextLocalisedClause e(AccountId accountId, l0 l0Var) {
        if (l0Var == l0.INDIA_GLOBAL || l0Var == l0.BRAZIL_GLOBAL || l0Var == l0.MEXICO_MCY) {
            return new TextLocalisedClause(R$string.card_payment_method_all_foreign_currency_accounts, null, null, 14);
        }
        if (accountId instanceof AccountId.Personal) {
            return new TextLocalisedClause(R$string.card_payment_method_all_accounts_cash, null, null, 14);
        }
        if (accountId instanceof AccountId.Joint) {
            return new TextLocalisedClause(R$string.card_payment_method_all_accounts_joint, null, null, 14);
        }
        throw new UnsupportedOperationException("AccountId should be Personal or Joint, but was " + accountId);
    }

    @Override // u43.e
    public final d a(s43.f input) {
        int i;
        Intrinsics.checkNotNullParameter(input, "input");
        x33.b bVar = input.f259736c;
        int size = 0;
        nkm.c cVarA = this.d.a(d0.Q(bVar.f302632a.f302636a), input.a().a(), bVar.f302635g, input.f259737g != null);
        AccountId accountId = input.f259734a;
        l0 l0Var = input.i;
        List listJ = y.J(cVarA);
        if (l0Var != null) {
            List list = listJ;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (this.f277039b.a(l0Var, ((x33.a) it8.next()).f302630a.f65523a.f163147c) && (size = size + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
        } else {
            size = listJ.size();
        }
        return new d(d0.Q(d0.G0(v.l((l0Var != null && ((i = i.f277041a[l0Var.ordinal()]) == 1 || (i == 2 ? size < 2 : i == 3 ? size < 2 : i == 4 && size < 1))) ? null : new s43.c(e(accountId, l0Var), "SEARCHABLE_ITEM_ID_ALL_BALANCES_FIAT")), y.x(cVarA, new u3a.g(23)))), null);
    }

    @Override // u43.e
    public final c d(s43.f input, d preprocessedPreviewContent) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(preprocessedPreviewContent, "preprocessedPreviewContent");
        return new c(e.c(new TextLocalisedClause(R$string.card_payment_method_cash_section_title, null, null, 14), input.f259735b.a(), true), y.x(preprocessedPreviewContent.f277036a, new twg.a(this, input, 21)));
    }
}
