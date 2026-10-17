package wl5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.spare.change.api.models.CryptoSpareChangeState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vx9.v;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar;
        Integer num;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CryptoSpareChangeState cryptoSpareChangeState = (CryptoSpareChangeState) data.getContent();
        s sVar = this.v;
        if (cryptoSpareChangeState == null || !(cryptoSpareChangeState instanceof CryptoSpareChangeState.CryptoSpareChangeActive)) {
            xi0.b bVarA = sVar.f298433w.f70997a;
            if (bVarA == null) {
                xi0.b.Companion.getClass();
                bVarA = xi0.a.a("BTC");
            }
            bVar = bVarA;
            num = null;
        } else {
            CryptoSpareChangeState.CryptoSpareChangeActive cryptoSpareChangeActive = (CryptoSpareChangeState.CryptoSpareChangeActive) cryptoSpareChangeState;
            bVar = cryptoSpareChangeActive.f70993a;
            num = new Integer(cryptoSpareChangeActive.f70994b);
        }
        sVar.x2(new v(data, 19, num, bVar));
        return Unit.f186387a;
    }
}
