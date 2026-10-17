package jfc;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.revpro.card_reader.order.impl.data.service.CardReaderOrdersService;
import ifc.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ya1.a f173860w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, ya1.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f173860w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f173860w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        h hVar = this.v;
        CardReaderOrdersService cardReaderOrdersService = hVar.f173864b;
        ((hfc.b) hVar.f173865c).getClass();
        ya1.a model = this.f173860w;
        Intrinsics.checkNotNullParameter(model, "model");
        ifc.h hVarA = hfc.b.a(model.d);
        Address address = model.f311886a;
        ifc.a aVar2 = new ifc.a(address.getStreetLine1(), address.getStreetLine2(), address.getRegion(), address.getCity(), address.getPostcode(), address.getCountry(), address.getFullAddress());
        int i2 = model.f311887b;
        dj0.d dVar = model.f311888c;
        b.a aVar3 = new b.a(aVar2, i2, new jo3.a(dVar.f115082a, dVar.f115083b.f306286a), ifc.e.REVOLUT_WALLET, hVarA.f160998a, hVarA.f160999b, model.f);
        this.u = 1;
        Object objOrderCardReaders = cardReaderOrdersService.orderCardReaders(aVar3, this);
        return objOrderCardReaders == aVar ? aVar : objOrderCardReaders;
    }
}
