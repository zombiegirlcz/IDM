package ise;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.models.transactions.InsufficientFunds;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f168241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f168242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.three_ds_verification.impl.ui.sceen.d f168243y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f168243y = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                x xVar = new x(0, this.f168243y, continuation);
                xVar.f168241w = flowCollector;
                xVar.f168242x = obj3;
                return xVar.invokeSuspend(Unit.f186387a);
            case 1:
                x xVar2 = new x(1, this.f168243y, continuation);
                xVar2.f168241w = flowCollector;
                xVar2.f168242x = obj3;
                return xVar2.invokeSuspend(Unit.f186387a);
            case 2:
                x xVar3 = new x(2, this.f168243y, continuation);
                xVar3.f168241w = flowCollector;
                xVar3.f168242x = obj3;
                return xVar3.invokeSuspend(Unit.f186387a);
            default:
                x xVar4 = new x(3, this.f168243y, continuation);
                xVar4.f168241w = flowCollector;
                xVar4.f168242x = obj3;
                return xVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InsufficientFunds insufficientFunds;
        Flow gVar;
        InsufficientFunds insufficientFunds2;
        n0 n0Var;
        h93.f0 f0Var;
        AccountWrapper accountWrapper;
        InsufficientFunds insufficientFunds3;
        AddMoneyMethod addMoneyMethod;
        AccountWrapper targetAccount;
        int i = this.u;
        com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar = this.f168243y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f168241w;
                    Data data = (Data) this.f168242x;
                    Data data2 = new Data(null, null, data.getLoading(), 3, null);
                    ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) data.getContent();
                    Flow gVar2 = (threeDSTransaction == null || (insufficientFunds = threeDSTransaction.o) == null) ? new go.g(data2, 2) : dVar.L2(insufficientFunds);
                    this.f168241w = null;
                    this.f168242x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, gVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f168241w;
                    yhm.r rVar = (yhm.r) this.f168242x;
                    Data data3 = (Data) rVar.f314201a;
                    Data data4 = (Data) rVar.f314202b;
                    Data data5 = (Data) rVar.f314203c;
                    Data data6 = new Data(null, null, data3.getLoading() || data4.getLoading() || data5.getLoading(), 3, null);
                    ThreeDSTransaction threeDSTransaction2 = (ThreeDSTransaction) data3.getContent();
                    if (threeDSTransaction2 == null || (insufficientFunds2 = threeDSTransaction2.o) == null || (n0Var = (n0) data4.getContent()) == null || (f0Var = n0Var.f168219a) == null || (accountWrapper = (AccountWrapper) data5.getContent()) == null) {
                        gVar = new go.g(data6, 2);
                    } else {
                        lh3.a aVar3 = dVar.f90433w;
                        dj0.d dVar2 = insufficientFunds2.f60531a;
                        h93.j0 j0Var = f0Var.H;
                        Set set = ase.a.f8926a;
                        Intrinsics.checkNotNullParameter(accountWrapper, "<this>");
                        gVar = nim.a.v(((oh3.f) aVar3).b(dVar2, j0Var, accountWrapper, ase.a.f8926a.contains(accountWrapper.f97224a), yte.n.THREE_DS, zhm.u.c(yte.p.INSTANT)), a0.f168188a);
                    }
                    this.f168241w = null;
                    this.f168242x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f168241w;
                    yhm.r rVar2 = (yhm.r) this.f168242x;
                    Data data7 = (Data) rVar2.f314201a;
                    Data data8 = (Data) rVar2.f314202b;
                    Data data9 = (Data) rVar2.f314203c;
                    Flow gVar3 = new go.g(new Data(null, null, false, 7, null), 2);
                    ThreeDSTransaction threeDSTransaction3 = (ThreeDSTransaction) data7.getContent();
                    Continuation continuation = null;
                    if (threeDSTransaction3 != null && (insufficientFunds3 = threeDSTransaction3.o) != null && (addMoneyMethod = (AddMoneyMethod) data8.getContent()) != null && (targetAccount = (AccountWrapper) data9.getContent()) != null && (addMoneyMethod instanceof AddMoneyMethod.MoveMoney)) {
                        AccountWrapper sourceAccount = ((AddMoneyMethod.MoveMoney) addMoneyMethod).f65826b;
                        if (!Intrinsics.f(targetAccount.getId(), sourceAccount.getId())) {
                            com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar3 = this.f168243y;
                            lh3.a aVar5 = dVar3.f90433w;
                            dj0.d originalAmount = insufficientFunds3.f60531a;
                            oh3.f fVar = (oh3.f) aVar5;
                            fVar.getClass();
                            Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
                            Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
                            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                            gVar3 = vkm.q.Q(Intrinsics.f(targetAccount.getCurrency(), sourceAccount.getCurrency()) ? new go.g(new Data(null, null, false, 3, null), 2) : rd0.e.e(new n33.r0(((c8i.z) fVar.e).d(sourceAccount, targetAccount, originalAmount.f115082a, false, new OrderMode.Market(null), false), 17), zhm.h0.f322473a, new n28.b(3, 16, null)), new a67.c(continuation, dVar3, sourceAccount, targetAccount, 22));
                        }
                    }
                    this.f168241w = null;
                    this.f168242x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f168241w;
                    AccountWrapper accountWrapper2 = (AccountWrapper) ((Data) this.f168242x).getContent();
                    Flow flowH = (accountWrapper2 != null ? accountWrapper2.f97224a : null) == j8l.a.JOINT ? mo3.a.h(dVar.f90432t.c(), c0.f168192a, null, 4) : new go.g(AccountId.Personal.f51414a, 2);
                    this.f168241w = null;
                    this.f168242x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowH, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
