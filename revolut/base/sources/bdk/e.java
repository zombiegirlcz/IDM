package bdk;

import adk.y0;
import com.revolut.retail.feature.plan_rewards.impl.data.service.MonthlyDrawsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import xck.n;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f14611w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14611w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f14611w, continuation, 0);
            case 1:
                return new e(this.f14611w, continuation, 1);
            default:
                return new e(this.f14611w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n nVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    MonthlyDrawsService monthlyDrawsService = this.f14611w.f14612a;
                    this.v = 1;
                    obj2 = monthlyDrawsService.getOptInStatus(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                y0 y0Var = (y0) obj2;
                Intrinsics.checkNotNullParameter(y0Var, "<this>");
                String str = y0Var.f3457a;
                n[] nVarArrValues = n.values();
                int length = nVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        n nVar2 = nVarArrValues[i2];
                        if (a0.z(nVar2.name(), str, true)) {
                            nVar = nVar2;
                        } else {
                            i2++;
                        }
                    } else {
                        nVar = null;
                    }
                }
                return nVar == null ? n.UNKNOWN : nVar;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    MonthlyDrawsService monthlyDrawsService2 = this.f14611w.f14612a;
                    this.v = 1;
                    if (monthlyDrawsService2.optInToMonthlyDraws(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    MonthlyDrawsService monthlyDrawsService3 = this.f14611w.f14612a;
                    this.v = 1;
                    if (monthlyDrawsService3.optOutFromMonthlyDraws(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
