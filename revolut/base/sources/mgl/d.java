package mgl;

import com.revolut.shared.feature.wealth_advanced_features.domain.impl.data.network.OrderBookService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f205300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f205301x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f205301x = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d dVar = new d(this.f205301x, continuation, 0);
                dVar.f205300w = str;
                return dVar.invokeSuspend(Unit.f186387a);
            default:
                d dVar2 = new d(this.f205301x, continuation, 1);
                dVar2.f205300w = str;
                return dVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f205300w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    OrderBookService orderBookService = this.f205301x.f205303a;
                    this.f205300w = null;
                    this.v = 1;
                    obj2 = orderBookService.getAvailability(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(((lgl.a) obj2).getAvailable());
            default:
                String str2 = this.f205300w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    OrderBookService orderBookService2 = this.f205301x.f205303a;
                    this.f205300w = null;
                    this.v = 1;
                    obj2 = orderBookService2.getOrderBook(str2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return c8g.c.u((lgl.b) obj2);
        }
    }
}
