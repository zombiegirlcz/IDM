package q23;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressSuggestion;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.h2;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b f241502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Address f241503x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar, Address address, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241502w = bVar;
        this.f241503x = address;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f241502w, this.f241503x, continuation, 0);
            case 1:
                return new i(this.f241502w, this.f241503x, continuation, 1);
            default:
                return new i(this.f241502w, this.f241503x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar = this.f241502w;
                u23.a aVar = bVar.f65152t;
                j60.a aVar2 = bVar.u;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Address address = this.f241503x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.I2(bVar, address, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                AddressSuggestion addressSuggestion = (AddressSuggestion) obj2;
                Address address2 = addressSuggestion.getAddress();
                if (address2 != null && !m33.a.d(address, address2)) {
                    bVar.H2(bVar.B, new avj.p(address2, 20));
                    aVar.getClass();
                    aVar2.x(u23.a.c(address, address2, address2));
                    return Unit.f186387a;
                }
                if (address2 != null || addressSuggestion.getVerified()) {
                    com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b.O2(bVar, address);
                    return Unit.f186387a;
                }
                aVar.getClass();
                aVar2.x(u23.a.b(address));
                return Unit.f186387a;
            case 1:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                rfm.m mVar = new rfm.m(((z39.b) this.f241502w.f65149q).d(this.f241503x), new q09.c(10, new q09.a(26)), 1);
                ufm.b bVarM = d0.m(new Data(null, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                rfm.l lVarL = mVar.l(bVarM);
                Intrinsics.checkNotNullExpressionValue(lVarL, "switchIfEmpty(...)");
                this.v = 1;
                Object objB = nim.a.b(lVarL, this);
                return objB == aVar4 ? aVar4 : objB;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.card_order_new.impl.kompot.screen.address_verification.b bVar2 = this.f241502w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    i iVar = new i(bVar2, this.f241503x, null, 1);
                    this.v = 1;
                    obj2 = h2.d(5000L, iVar, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Data data = (Data) obj2;
                if (data == null) {
                    data = new Data(null, null, false, 3, null);
                }
                bVar2.H2(bVar2.B, new pvk.b(data, 13));
                return Unit.f186387a;
        }
    }
}
