package fm5;

import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreen;
import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreenContract$InputData;
import fjd.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Continuation continuation) {
        super(2, continuation);
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((gm5.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        gm5.a aVar = (gm5.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (aVar == gm5.a.ACCEPTED) {
            l lVar = this.v;
            lVar.f136030q.getClass();
            yji.l.g2(lVar, new CryptoSpareChangeScreen(new CryptoSpareChangeScreenContract$InputData(null)), null, new w(lVar, 10), 1);
        }
        return Unit.f186387a;
    }
}
