package anf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import tof.a3;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends h implements thf.i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper, thf.b transactionAmountMapper, wa7.p hiddenAccountsTransactionInteractor, sj5.a cryptoDepositTransactionStateChecker) {
        super(transactionIconResourcesMapper, transactionTextResourcesMapper, transactionAmountMapper, hiddenAccountsTransactionInteractor, cryptoDepositTransactionStateChecker);
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionAmountMapper, "transactionAmountMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositTransactionStateChecker, "cryptoDepositTransactionStateChecker");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [mx0.i1] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    public final SelectableDelegate.Model p(a3 transaction, k71.q extraData, thf.h formattingOptions) {
        Address address;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        v61.h hVar = (v61.h) extraData.f181797g.get(transaction.f272581b);
        Object obj2 = extraData.i.get(transaction.f272581b);
        String str = transaction.f272579a;
        String strQ = j6.a.q("TransactionListItem_", str);
        String strQ2 = j6.a.q("TransactionListItem_", str);
        wi0.b bVarG = 0;
        bVarG = 0;
        RowDelegate.Model.MainImage.Avatar avatar = new RowDelegate.Model.MainImage.Avatar(h.j(this, transaction, extraData), (i1) bVarG, 6);
        TextLocalisedClause textLocalisedClauseO = o(transaction, extraData);
        boolean z = hVar != null;
        boolean z3 = obj2 != null;
        boolean z4 = formattingOptions.f271372a;
        boolean z6 = formattingOptions.f271374c;
        CompositeClause compositeClauseM = h.m(this, transaction, extraData, z, z3, z4, false, false, 48);
        MoneyClause moneyClauseH = h.h(this, transaction, z6, 2);
        do3.n nVar = extraData.f181794a;
        if (nVar != null && (address = nVar.k) != null) {
            Intrinsics.checkNotNullParameter(address, "<this>");
            bVarG = nz8.d.g(address);
        }
        return new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, avatar, textLocalisedClauseO, null, 0, compositeClauseM, null, null, 0, new RowDelegate.Model.c.b(moneyClauseH, h.i(this, transaction, hVar, z6, bVarG), null, false, 124), false, null, false, null, formattingOptions.f271373b ? h.n(transaction, extraData) : f0.f322471a, null, null, null, null, transaction, null, 0, 0, 0, 0, 532642776), false, SelectableDelegate.b.C0424b.f53319a, null, 131056);
    }
}
