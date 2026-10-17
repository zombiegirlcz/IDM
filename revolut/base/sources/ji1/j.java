package ji1;

import c5a.m0;
import com.revolut.feature.address.models.AddressAutocomplete;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.feature.address.models.AddressSearchListResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.address.common.impl.flow.screen.find.b f174331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f174332x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.feature.address.common.impl.flow.screen.find.b bVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f174331w = bVar;
        this.f174332x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f174331w, this.f174332x, continuation, 0);
            default:
                return new j(this.f174331w, this.f174332x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.address.common.impl.flow.screen.find.b bVar = this.f174331w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    rh1.b bVar2 = bVar.o;
                    AddressFormat addressFormat = bVar.f61017q.d;
                    String strI2 = bVar.I2();
                    this.v = 1;
                    cj1.c cVar = ((lj1.a) bVar2).f195590b.f322493b;
                    cVar.getClass();
                    m0 m0Var = new m0(10, cVar, this.f174332x, addressFormat, strI2, null);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, m0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                AddressAutocomplete addressAutocomplete = (AddressAutocomplete) obj2;
                bVar.C2(new th1.c(addressAutocomplete.getAddress(), addressAutocomplete.getDetailedAddressSuggestion(), this.f174332x));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    rh1.b bVar3 = bVar.o;
                    String strI22 = bVar.I2();
                    this.v = 1;
                    cj1.c cVar2 = ((lj1.a) bVar3).f195590b.f322493b;
                    cVar2.getClass();
                    c34.d dVar = new c34.d(22, cVar2, strI22, this.f174332x, (Continuation) null);
                    p0 p0Var2 = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, dVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar.H2(bVar.u, new jeg.g((AddressSearchListResult) obj2, 18));
                return Unit.f186387a;
        }
    }
}
