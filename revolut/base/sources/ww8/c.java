package ww8;

import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreen;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddressConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AddressConfirmationScreen addressConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addressConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddressConfirmationScreen addressConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.kyc.impl.screens.addressconfirmation.a aVar2 = (com.revolut.feature.kyc.impl.screens.addressconfirmation.a) ((i) addressConfirmationScreen.O.getValue());
                AddressConfirmationScreenContract$InputData addressConfirmationScreenContract$InputData = aVar2.o;
                aVar2.C2(new g(addressConfirmationScreenContract$InputData.f77847a, addressConfirmationScreenContract$InputData.f77848b));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                addressConfirmationScreen.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
