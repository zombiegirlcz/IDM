package ble;

import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tab.invest.impl.ui.home.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthAction f16554w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.revolut.feature.tab.invest.impl.ui.home.f fVar, WealthAction wealthAction, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f16554w = wealthAction;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a1(this.v, this.f16554w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.tab.invest.impl.ui.home.f fVar = this.v;
            b94.s sVar = new b94.s(fVar, this.f16554w, null, 13);
            this.u = 1;
            if (fVar.p2(this, sVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
