package wl5;

import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoSpareChangeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CryptoSpareChangeScreen cryptoSpareChangeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoSpareChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoSpareChangeScreen cryptoSpareChangeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarZ2 = cryptoSpareChangeScreen.Z2();
                if (sVarZ2.f298432t.f306937b != xl5.a.HIDDEN) {
                    sVarZ2.u2();
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarZ22 = cryptoSpareChangeScreen.Z2();
                sVarZ22.getClass();
                sVarZ22.n2(new o(sVarZ22, null, 1), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarZ23 = cryptoSpareChangeScreen.Z2();
                sVarZ23.getClass();
                sVarZ23.n2(new o(sVarZ23, null, 2), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
