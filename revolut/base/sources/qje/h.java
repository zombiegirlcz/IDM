package qje;

import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TabCryptoFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TabCryptoFlow tabCryptoFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tabCryptoFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            case 2:
                return new h(this.v, continuation, 2);
            case 3:
                return new h(this.v, continuation, 3);
            case 4:
                return new h(this.v, continuation, 4);
            case 5:
                return new h(this.v, continuation, 5);
            default:
                return new h(this.v, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TabCryptoFlow tabCryptoFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) tabCryptoFlow.e3()).I2().c1();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) tabCryptoFlow.e3()).I2().b3();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) tabCryptoFlow.e3()).I2().j();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) tabCryptoFlow.e3()).I2().Z2(RetailBackgroundKey.CryptoHome.f63825b);
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) tabCryptoFlow.e3()).J2().Z2();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) tabCryptoFlow.e3()).J2().b3();
                break;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) tabCryptoFlow.e3()).I2().W1();
                break;
        }
        return Unit.f186387a;
    }
}
