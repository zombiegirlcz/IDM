package sw2;

import cli.y;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rfm.w;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objI;
        h hVar = this.v;
        y yVar = hVar.f266077q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            LocationMismatch locationMismatch = ((j) ((j2) yVar.f22677a).getValue()).f266080c;
            String str = locationMismatch.f65540b;
            if (locationMismatch.f65541c == null && str != null) {
                w39.b bVar = hVar.f266076p;
                Address empty = Address.INSTANCE.getEMPTY();
                w wVarD = ((z39.b) bVar).d(empty.copy((32704 & 1) != 0 ? empty.streetLine1 : null, (32704 & 2) != 0 ? empty.streetLine2 : null, (32704 & 4) != 0 ? empty.region : null, (32704 & 8) != 0 ? empty.city : null, (32704 & 16) != 0 ? empty.postcode : null, (32704 & 32) != 0 ? empty.country : str, (32704 & 64) != 0 ? empty.fullAddress : null, (32704 & 128) != 0 ? empty.streetType : null, (32704 & 256) != 0 ? empty.street : null, (32704 & 512) != 0 ? empty.houseNumber : null, (32704 & 1024) != 0 ? empty.flat : null, (32704 & 2048) != 0 ? empty.neighborhood : null, (32704 & 4096) != 0 ? empty.houseName : null, (32704 & 8192) != 0 ? empty.type : null, (32704 & 16384) != 0 ? empty.landmark : null));
                this.u = 1;
                objI = nim.a.i(wVarD, this);
                if (objI == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        objI = obj2;
        LocationDomain locationDomain = (LocationDomain) objI;
        if (locationDomain != null) {
            hVar.H2(yVar, new ch1.f(locationDomain, 2));
        }
        return Unit.f186387a;
    }
}
