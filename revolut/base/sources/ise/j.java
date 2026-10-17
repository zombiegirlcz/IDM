package ise;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.domain.models.transactions.InsufficientFunds;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationController;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ThreeDsVerificationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ThreeDsVerificationController threeDsVerificationController, Continuation continuation) {
        super(2, continuation);
        this.v = threeDsVerificationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AccountWrapper accountWrapper;
        ThreeDSTransaction threeDSTransaction;
        InsufficientFunds insufficientFunds;
        OrderQuote orderQuote;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i0 i0VarE3 = this.v.R2();
        String listId = model.f51781a;
        com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) i0VarE3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "MOVE_MONEY_EXCHANGE_AMOUNT_LIST_ID")) {
            cli.y yVar = dVar.M;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            AccountWrapper accountWrapper2 = (AccountWrapper) ((j0) j2Var.getValue()).f168204h.getContent();
            if (accountWrapper2 != null) {
                Object content = ((j0) j2Var2.getValue()).f.getContent();
                AddMoneyMethod.MoveMoney moveMoney = content instanceof AddMoneyMethod.MoveMoney ? (AddMoneyMethod.MoveMoney) content : null;
                if (moveMoney != null && (accountWrapper = moveMoney.f65826b) != null && (threeDSTransaction = (ThreeDSTransaction) ((j0) j2Var2.getValue()).f168201b.getContent()) != null && (insufficientFunds = threeDSTransaction.o) != null && (orderQuote = (OrderQuote) ((j0) j2Var2.getValue()).f168203g.getContent()) != null) {
                    dVar.C1(u0.c(((c8i.z) dVar.f90435y).b(accountWrapper, accountWrapper2, insufficientFunds.f60531a.f115082a, false, orderQuote, c4i.a.EXCHANGE, new OrderMode.Market(null))));
                }
            }
        }
        return Unit.f186387a;
    }
}
