package anf;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.transactions.api.ui.action.TransactionParcel;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import tof.a3;
import tof.i7;
import tof.t4;
import tof.v6;
import tof.y6;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends h implements thf.l {
    public final qhf.a e;
    public final n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lfm.c appCompositeDisposable, thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper, thf.b transactionAmountMapper, qhf.a actionsMapper, wa7.p hiddenAccountsTransactionInteractor, sj5.a cryptoDepositTransactionStateChecker) {
        super(transactionIconResourcesMapper, transactionTextResourcesMapper, transactionAmountMapper, hiddenAccountsTransactionInteractor, cryptoDepositTransactionStateChecker);
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionAmountMapper, "transactionAmountMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositTransactionStateChecker, "cryptoDepositTransactionStateChecker");
        this.e = actionsMapper;
        this.f = new n(this);
        te0.w.j0(appCompositeDisposable, new ifm.a(new a08.d(this, 3), 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r5v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    public final wh p(a3 transaction, k71.q extraData, thf.k formattingOptions, i7 i7Var, TransactionContext transactionContext) {
        Object obj2;
        ?? arrayList;
        thf.b bVar;
        wi0.b bVarG;
        Object transactionParcel;
        Address address;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        Map map = extraData.f181797g;
        String str = transaction.f272581b;
        v6 v6Var = transaction.f;
        String str2 = transaction.f272579a;
        v61.h hVar = (v61.h) map.get(str);
        Map map2 = extraData.i;
        String str3 = transaction.f272581b;
        Object obj3 = map2.get(str3);
        boolean z = formattingOptions.f271376a;
        qhf.a aVar = this.e;
        if (z) {
            thf.j jVar = formattingOptions.f271381j;
            ((d) aVar).getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            Intrinsics.checkNotNullParameter(extraData, "extraData");
            if (jVar == null) {
                String str4 = extraData.f;
                Map map3 = extraData.f181797g;
                dj0.d dVar = transaction.k;
                boolean z3 = map3.get(str3) != null;
                boolean z4 = extraData.f181803p && extraData.f181801m;
                obj2 = obj3;
                dj0.d dVar2 = (dj0.d) extraData.f181802n.get(dVar.f115083b);
                boolean z6 = z3;
                dj0.d dVar3 = (dj0.d) extraData.o.get(dVar.f115083b);
                if (!Intrinsics.f(transaction.f272584c, str4) || transaction.f272624y.f273145c == io3.i.EXTERNAL) {
                    arrayList = f0.f322471a;
                } else {
                    arrayList = new ArrayList();
                    if (k71.k.k(transaction)) {
                        arrayList.add(uhf.c.SHARE_PAYMENT_LINK);
                        arrayList.add(uhf.c.CANCEL_TRANSFER_LINK);
                    } else {
                        boolean z11 = map2.get(str3) != null;
                        if (extraData.f181798h && transaction.M1 && !z6 && !z11) {
                            arrayList.add(uhf.c.OPEN_SPLIT_BILL);
                        }
                    }
                    y6 y6Var = transaction.e;
                    if ((y6Var == y6.ATM || y6Var == y6.CARD_PAYMENT) && !k71.k.C(transaction) && v6Var == v6.DECLINED && z4 && dVar2 != null && dVar2.compareTo(dVar.a()) >= 0 && dVar3 != null && dVar3.compareTo(dVar.a()) <= 0) {
                        arrayList.add(uhf.c.LOAN);
                    }
                    if (!k71.k.k(transaction)) {
                        Intrinsics.checkNotNullParameter(transaction, "<this>");
                        if ((transaction.I.f273161a == null || v6Var != v6.REVERTED) && !z6) {
                            arrayList.add(transaction.f272621x ? uhf.c.UNHIDE : uhf.c.HIDE);
                        }
                    }
                }
            } else {
                if (!jVar.equals(thf.j.f271375a)) {
                    throw new NoWhenBranchMatchedException();
                }
                uhf.c cVar = Intrinsics.f(transaction.u, t4.f273086a) ? uhf.c.INCLUDE_IN_ANALYTICS : k71.k.j(transaction) ? uhf.c.EXCLUDE_FROM_ANALYTICS : null;
                arrayList = cVar != null ? zhm.u.c(cVar) : 0;
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                obj2 = obj3;
            }
        } else {
            obj2 = obj3;
            arrayList = f0.f322471a;
        }
        ?? r152 = arrayList;
        String strQ = j6.a.q("TransactionListItem_", str2);
        String strQ2 = j6.a.q("TransactionListItem_", str2);
        RowDelegate.Model.MainImage.Avatar avatar = new RowDelegate.Model.MainImage.Avatar(h.j(this, transaction, extraData), (i1) null, 6);
        TextLocalisedClause textLocalisedClauseO = o(transaction, extraData);
        CompositeClause compositeClauseM = h.m(this, transaction, extraData, hVar != null, obj2 != null, formattingOptions.d, formattingOptions.f271380h, false, 32);
        boolean z12 = formattingOptions.f271379g;
        boolean z29 = formattingOptions.i;
        Intrinsics.checkNotNullParameter(transaction, "<this>");
        thf.b bVar2 = this.f7737c;
        bnf.e eVar = (bnf.e) bVar2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        MoneyClause moneyClauseE = eVar.e(transaction, z12, eVar.a(transaction), z29, false);
        boolean z31 = formattingOptions.e;
        boolean z41 = formattingOptions.f271379g;
        boolean z49 = formattingOptions.i;
        do3.n nVar = extraData.f181794a;
        if (nVar == null || (address = nVar.k) == null) {
            bVar = bVar2;
            bVarG = null;
        } else {
            Intrinsics.checkNotNullParameter(address, "<this>");
            bVarG = nz8.d.g(address);
            bVar = bVar2;
        }
        Intrinsics.checkNotNullParameter(transaction, "<this>");
        RowDelegate.Model.c.b bVar3 = new RowDelegate.Model.c.b(moneyClauseE, ((bnf.e) bVar).f(transaction, hVar, z31, z41, z49, bVarG), null, false, 124);
        boolean z54 = formattingOptions.f271377b;
        boolean z74 = formattingOptions.f271378c;
        if (z54 || z74) {
            ?? r56 = z54 ? r152 : 0;
            if (r56 == 0) {
                r56 = f0.f322471a;
            }
            transactionParcel = new TransactionParcel(transaction, r56, z74 ? i7Var : null, z74 ? transactionContext : null);
        } else {
            transactionParcel = transaction;
        }
        RowDelegate.Model model = new RowDelegate.Model(strQ2, avatar, textLocalisedClauseO, null, 0, compositeClauseM, null, null, 0, bVar3, false, null, false, null, formattingOptions.f ? h.n(transaction, extraData) : f0.f322471a, null, null, null, null, transactionParcel, new AnalyticsContext(v0.a.b(str3, AnalyticsContext.INSTANCE)), 0, 0, 0, 0, 524254168);
        Iterable iterable = (Iterable) r152;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((d) aVar).a((uhf.c) it8.next(), transaction));
        }
        return new wh(strQ, model, arrayList2, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final ArrayList q(List transactions, k71.q extraData, thf.k formattingOptions, i7 i7Var, TransactionContext transactionContext) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        List list = transactions;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(wh.a((wh) this.f.c((a3) it8.next(), new m(extraData, formattingOptions, i7Var, transactionContext)), null, null, null, 16383));
        }
        return arrayList;
    }
}
