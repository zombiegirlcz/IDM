package n8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.h2;

/* JADX INFO: loaded from: classes10.dex */
public final class d1 extends gim.i implements Function1 {
    public AccountWrapper u;
    public AccountWrapper v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f213416w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f213417x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_move_money.impl.topup.a f213418y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.revolut.feature_move_money.impl.topup.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f213418y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d1(this.f213418y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        AccountWrapper targetAccount;
        AccountWrapper sourceAccount;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f213417x;
        com.revolut.feature_move_money.impl.topup.a aVar2 = this.f213418y;
        if (i == 0) {
            yhm.o.b(obj2);
            AccountWrapper accountWrapperR = c8g.a.r(aVar2.M2());
            AccountWrapper accountWrapperT = c8g.a.t(aVar2.M2());
            dj0.d dVarM = c8g.a.m(aVar2.M2());
            long j2 = dVarM.f115082a;
            this.u = accountWrapperR;
            this.v = accountWrapperT;
            this.f213416w = dVarM;
            this.f213417x = 1;
            Object objD = h2.d(10000L, new s0(aVar2, accountWrapperR, accountWrapperT, j2, null), this);
            if (objD == aVar) {
                return aVar;
            }
            dVar = dVarM;
            obj2 = objD;
            targetAccount = accountWrapperT;
            sourceAccount = accountWrapperR;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.f213416w;
            AccountWrapper accountWrapper = this.v;
            AccountWrapper accountWrapper2 = this.u;
            yhm.o.b(obj2);
            targetAccount = accountWrapper;
            sourceAccount = accountWrapper2;
        }
        OrderQuote orderQuote = (OrderQuote) obj2;
        if (orderQuote == null) {
            return aVar2.O2();
        }
        w5i.d dVar2 = aVar2.E;
        long j3 = dVar.f115082a;
        boolean z = aVar2.L == j8l.d.SELL;
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        j8l.a aVar3 = sourceAccount.f97224a;
        j8l.a aVar4 = j8l.a.CREDIT_CARD;
        return aVar2.C1(zh9.u0.c(((c8i.z) dVar2).b(sourceAccount, targetAccount, j3, z, orderQuote, (aVar3 == aVar4 || targetAccount.f97224a == aVar4) ? c4i.a.CREDIT_CARD : m6i.y.b(sourceAccount), new OrderMode.Market(null))));
    }
}
