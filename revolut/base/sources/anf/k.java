package anf;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends h implements thf.g {
    public final j e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lfm.c appCompositeDisposable, thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper, thf.b transactionAmountMapper, wa7.p hiddenAccountsTransactionInteractor, sj5.a cryptoDepositTransactionStateChecker) {
        super(transactionIconResourcesMapper, transactionTextResourcesMapper, transactionAmountMapper, hiddenAccountsTransactionInteractor, cryptoDepositTransactionStateChecker);
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionAmountMapper, "transactionAmountMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositTransactionStateChecker, "cryptoDepositTransactionStateChecker");
        this.e = new j(this);
        te0.w.j0(appCompositeDisposable, new ifm.a(new a08.d(this, 2), 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [mx0.i1] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    public final RowDelegate.Model p(a3 transaction, k71.q extraData, thf.f formattingOptions) {
        Address address;
        boolean z = formattingOptions.f271370a;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        v61.h hVar = (v61.h) extraData.f181797g.get(transaction.f272581b);
        Map map = extraData.i;
        String str = transaction.f272581b;
        Object obj2 = map.get(str);
        String strQ = j6.a.q("TransactionListItem_", transaction.f272579a);
        wi0.b bVarG = 0;
        bVarG = 0;
        RowDelegate.Model.MainImage.Avatar avatar = new RowDelegate.Model.MainImage.Avatar(h.j(this, transaction, extraData), (i1) bVarG, 6);
        TextLocalisedClause textLocalisedClauseO = o(transaction, extraData);
        CompositeClause compositeClauseM = h.m(this, transaction, extraData, hVar != null, obj2 != null, false, false, formattingOptions.f271371b, 16);
        MoneyClause moneyClauseH = h.h(this, transaction, z, 2);
        do3.n nVar = extraData.f181794a;
        if (nVar != null && (address = nVar.k) != null) {
            Intrinsics.checkNotNullParameter(address, "<this>");
            bVarG = nz8.d.g(address);
        }
        return new RowDelegate.Model(strQ, avatar, textLocalisedClauseO, null, 0, compositeClauseM, null, null, 0, new RowDelegate.Model.c.b(moneyClauseH, h.i(this, transaction, hVar, z, bVarG), null, false, 124), false, null, false, null, null, null, null, null, null, transaction, new AnalyticsContext(v0.a.b(str, AnalyticsContext.INSTANCE)), 0, 0, 0, 0, 524286936);
    }

    public final ArrayList q(List transactions, k71.q extraData, thf.f formattingOptions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        List list = transactions;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(RowDelegate.Model.x((RowDelegate.Model) this.e.c((a3) it8.next(), new i(extraData, formattingOptions)), null, null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -1, 15));
        }
        return arrayList;
    }
}
