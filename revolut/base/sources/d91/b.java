package d91;

import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.account_name.impl.R$string;
import com.revolut.feature.tab.accounts.models.ProductId;
import io3.j;
import io3.l;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c91.a {
    public final Clause a(ProductId productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        switch (a.f112330a[productId.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.account_name_home_product_joint, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.account_name_home_product_pro, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.account_name_home_product_credit, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.account_name_home_product_current, null, null, 14);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                IllegalStateException illegalStateException = new IllegalStateException("Using unsupported productId: " + productId);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, illegalStateException, h0Var);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Clause b(AccountId accountId, io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if ((accountId instanceof AccountId.Joint) || pocket.f163148g == j.SHARED) {
            return new TextLocalisedClause(R$string.account_name_home_product_joint, null, null, 14);
        }
        l lVar = pocket.e;
        if (lVar == l.CURRENT) {
            return new TextLocalisedClause(R$string.account_name_home_product_current, null, null, 14);
        }
        if (lVar == l.CREDIT) {
            return new TextLocalisedClause(R$string.account_name_home_product_credit, null, null, 14);
        }
        if (lVar == l.MERCHANT) {
            return new TextLocalisedClause(R$string.account_name_home_product_pro, null, null, 14);
        }
        if (lVar == l.SAVINGS) {
            return new TextClause(pocket.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (lVar == l.REVX_FIAT) {
            return new TextLocalisedClause(R$string.account_name_home_product_revx, null, null, 14);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Using unsupported pocket");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, illegalStateException, h0Var);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
