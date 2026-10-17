package aj6;

import com.revolut.data.model.Data;
import com.revolut.kompot.navigable.utils.single_task.IllegalConcurrentAccessException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Throwable v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Throwable th10 = (Throwable) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(3, 0, continuation);
                uVar.v = th10;
                return uVar.invokeSuspend(Unit.f186387a);
            case 1:
                u uVar2 = new u(3, 1, continuation);
                uVar2.v = th10;
                return uVar2.invokeSuspend(Unit.f186387a);
            case 2:
                u uVar3 = new u(3, 2, continuation);
                uVar3.v = th10;
                return uVar3.invokeSuspend(Unit.f186387a);
            case 3:
                u uVar4 = new u(3, 3, continuation);
                uVar4.v = th10;
                return uVar4.invokeSuspend(Unit.f186387a);
            case 4:
                u uVar5 = new u(3, 4, continuation);
                uVar5.v = th10;
                return uVar5.invokeSuspend(Unit.f186387a);
            case 5:
                u uVar6 = new u(3, 5, continuation);
                uVar6.v = th10;
                return uVar6.invokeSuspend(Unit.f186387a);
            default:
                u uVar7 = new u(3, 6, continuation);
                uVar7.v = th10;
                return uVar7.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                Throwable th10 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data accountsData = new Data(null, th10, false, 5, null);
                Map toBaseCurrencyRatesMap = r0.g();
                Intrinsics.checkNotNullParameter(accountsData, "accountsData");
                Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
                return Unit.f186387a;
            case 1:
                Throwable th11 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                new Data(null, th11, false, 5, null);
                return Unit.f186387a;
            case 2:
                Throwable th12 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (th12 instanceof IllegalConcurrentAccessException) {
                    return Unit.f186387a;
                }
                throw th12;
            case 3:
                Throwable th13 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CreditDataMonitoringFacade", null, th13, h0Var);
                return Unit.f186387a;
            case 4:
                Throwable th14 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (th14 instanceof CancellationException) {
                    throw th14;
                }
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th14, h0Var2);
                return Unit.f186387a;
            case 5:
                Throwable th15 = this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zi0.c.O(th15);
                return Unit.f186387a;
            default:
                Throwable th16 = this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data accountsData2 = new Data(null, th16, false, 5, null);
                Map toBaseCurrencyRatesMap2 = r0.g();
                Intrinsics.checkNotNullParameter(accountsData2, "accountsData");
                Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap2, "toBaseCurrencyRatesMap");
                return Unit.f186387a;
        }
    }
}
