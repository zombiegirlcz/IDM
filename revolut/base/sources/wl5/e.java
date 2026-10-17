package wl5;

import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreen;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSpareChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoSpareChangeScreen cryptoSpareChangeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSpareChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarT2 = this.v.T2();
        Object obj3 = yVar.f167226b.f58324n;
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        sVarT2.getClass();
        sVarT2.x2(new ai7.a(4, num));
        return Unit.f186387a;
    }
}
