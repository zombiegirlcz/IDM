package jfc;

import com.revolut.feature.revpro.card_reader.order.impl.data.service.CardReaderOrdersService;
import ifc.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ya1.e f173862w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ya1.e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f173862w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f173862w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        CardReaderOrdersService cardReaderOrdersService = this.v.f173864b;
        ya1.e eVar = this.f173862w;
        String str = eVar.f311891a;
        d.a aVar2 = new d.a(eVar.f311892b);
        this.u = 1;
        Object objPayForCardReaders = cardReaderOrdersService.payForCardReaders(str, aVar2, this);
        return objPayForCardReaders == aVar ? aVar : objPayForCardReaders;
    }
}
