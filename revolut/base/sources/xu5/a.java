package xu5;

import a0.d;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import ip0.iq;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.o;
import xi0.b;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final List a(List filters) {
        o model;
        Intrinsics.checkNotNullParameter(filters, "filters");
        List list = filters;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            CryptoTransactionFilter cryptoTransactionFilter = (CryptoTransactionFilter) obj2;
            if (cryptoTransactionFilter instanceof CryptoTransactionFilter.TransactionTypeFilter) {
                CryptoTransactionFilter.TransactionTypeFilter transactionTypeFilter = (CryptoTransactionFilter.TransactionTypeFilter) cryptoTransactionFilter;
                model = new InputChecklistDelegate.Model(d.n("LIST_ID_FILTER_TRANSACTION_TYPE_", i), new TextLocalisedClause(transactionTypeFilter.f71394a.b(), null, null, 14), transactionTypeFilter.f71395b, false, null, iq.CHECK_BUTTON, null, null, transactionTypeFilter, null, 0, 0, 0, 523992);
            } else if (cryptoTransactionFilter instanceof CryptoTransactionFilter.CurrencyFilter) {
                CryptoTransactionFilter.CurrencyFilter currencyFilter = (CryptoTransactionFilter.CurrencyFilter) cryptoTransactionFilter;
                b bVar = currencyFilter.f71391a;
                model = new SelectableDelegate.Model(d.n("LIST_ID_FILTER_CURRENCY_", i), new RowDelegate.Model(d.n("LIST_ID_FILTER_CURRENCY_INNER_", i), new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new CurrencyClause(bVar, null, null, 6), null, 0, new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4), null, null, 0, null, false, null, false, null, null, null, null, null, null, currencyFilter, null, 0, 0, 0, 0, 532676568), currencyFilter.f71392b ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
            } else {
                if (!(cryptoTransactionFilter instanceof CryptoTransactionFilter.AccountTypeFilter)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoTransactionFilter.AccountTypeFilter accountTypeFilter = (CryptoTransactionFilter.AccountTypeFilter) cryptoTransactionFilter;
                model = new InputChecklistDelegate.Model(d.n("LIST_ID_FILTER_ACCOUNT_TYPE_", i), new TextLocalisedClause(accountTypeFilter.f71388a.a(), null, null, 14), accountTypeFilter.f71389b, false, null, iq.CHECK_BUTTON, null, null, accountTypeFilter, null, 0, 0, 0, 523992);
            }
            arrayList.add(model);
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
