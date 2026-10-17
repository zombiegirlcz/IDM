package b6i;

import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$ModalStep;
import com.revolut.feature_move_money.impl.amount.MoveAmountScreenContract$OrderContext;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MoveMoneyAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(MoveMoneyAmountScreen moveMoneyAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = moveMoneyAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x0(this.v, continuation, 0);
            case 1:
                return new x0(this.v, continuation, 1);
            case 2:
                return new x0(this.v, continuation, 2);
            case 3:
                return new x0(this.v, continuation, 3);
            case 4:
                return new x0(this.v, continuation, 4);
            case 5:
                return new x0(this.v, continuation, 5);
            case 6:
                return new x0(this.v, continuation, 6);
            case 7:
                return new x0(this.v, continuation, 7);
            default:
                return new x0(this.v, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((x0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x5i.a aVar;
        AccountWrapper accountWrapper;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        MoveMoneyAmountScreen moveMoneyAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d();
                s6i.e eVar = cVar.Q2().f12783a;
                AccountSource accountSource = (eVar == null || (aVar = eVar.f260363b) == null || (accountWrapper = aVar.f302980b) == null) ? null : accountWrapper.d;
                AccountSource.InvestCashHolding investCashHolding = accountSource instanceof AccountSource.InvestCashHolding ? (AccountSource.InvestCashHolding) accountSource : null;
                TradingAccount tradingAccount = investCashHolding != null ? investCashHolding.f97198a : null;
                TradingAccount.TaxAdvantage.JIsa jIsa = tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa ? (TradingAccount.TaxAdvantage.JIsa) tradingAccount : null;
                if (jIsa != null) {
                    oki.h.v2(cVar.X, new MoveAmountScreenContract$ModalStep.JisaCashHoldingAvailableToWithdrawInfoDialog(jIsa), bottom_dialog);
                } else {
                    cVar.H2(cVar.Y, new s(cVar, 3));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d()).V2(j.TOP);
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d()).V2(j.BOTTOM);
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar2 = (com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d();
                cVar2.getClass();
                cVar2.W2(j.TOP);
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar3 = (com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d();
                cVar3.getClass();
                cVar3.W2(j.BOTTOM);
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d()).f97292x.Q();
                moveMoneyAmountScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar4 = (com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d();
                s6i.e eVar2 = cVar4.Q2().f12783a;
                OrderQuote orderQuote = eVar2 != null ? eVar2.e : null;
                if (orderQuote == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                g6i.c cVar5 = (g6i.c) cVar4.F;
                cVar5.getClass();
                Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                cVar5.A2(zh9.u0.b(cVar5.f140946l.g(orderQuote)));
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar6 = (com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d();
                cVar6.f97292x.R();
                cVar6.N2();
                cVar6.l2(new g0(cVar6, null, 1), new yi5.b(26));
                return Unit.f186387a;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_move_money.impl.amount.c cVar7 = (com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d();
                com.revolut.kompot.navigable.vc.modal.a aVar11 = cVar7.X;
                e eVar3 = cVar7.Q2().f12786g;
                if (!Intrinsics.f(eVar3, b.f12760a)) {
                    if (Intrinsics.f(eVar3, c.f12763a)) {
                        Pair pairM2 = cVar7.M2();
                        MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext = (MoveAmountScreenContract$OrderContext) pairM2.f186385a;
                        OrderMode orderMode = (OrderMode) pairM2.f186386b;
                        cVar7.N2();
                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.OptionsSelector(moveAmountScreenContract$OrderContext, orderMode), bottom_dialog);
                    } else if (eVar3 instanceof d) {
                        TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(cVar7.Q2().f12787h);
                        if (transferScheduleDataB == null) {
                            transferScheduleDataB = new TransferScheduleData(0L, (jli.c) null, 7);
                        }
                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.SchedulingSettings(transferScheduleDataB, cVar7.B.d() ? m1l.a.SCHEDULE_REQUIRED : m1l.a.SCHEDULE_ENABLED), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                    } else {
                        if (!(eVar3 instanceof a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Pair pairM22 = cVar7.M2();
                        MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext2 = (MoveAmountScreenContract$OrderContext) pairM22.f186385a;
                        OrderMode orderMode2 = (OrderMode) pairM22.f186386b;
                        cVar7.N2();
                        a aVar12 = (a) eVar3;
                        oki.h.v2(aVar11, new MoveAmountScreenContract$ModalStep.OrderAutomations(moveAmountScreenContract$OrderContext2, orderMode2, aVar12.f12753a, aVar12.f12754b), bottom_dialog);
                    }
                }
                return Unit.f186387a;
        }
    }
}
