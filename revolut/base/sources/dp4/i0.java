package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardMsiService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f116653w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(k0 k0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f116653w = k0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new i0(this.f116653w, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
            default:
                return new i0(this.f116653w, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    CreditCardMsiService creditCardMsiService = this.f116653w.f116659a;
                    this.v = 1;
                    obj2 = creditCardMsiService.getCreditCardMsiOffers(20, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return fo4.b.a((List) obj2);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CreditCardMsiService creditCardMsiService2 = this.f116653w.f116659a;
                    this.v = 1;
                    obj2 = creditCardMsiService2.getCreditCardMsiWidgetOffers(20, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return i2b.a.C((List) obj2);
        }
    }
}
