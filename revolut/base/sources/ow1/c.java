package ow1;

import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreen;
import ip0.an0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BrebQrRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BrebQrRequestScreen brebQrRequestScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = brebQrRequestScreen;
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
        return ((c) create((an0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BrebQrRequestScreen brebQrRequestScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                brebQrRequestScreen.d3().B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                brebQrRequestScreen.d3().I2("RESET_QR_ID");
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                brebQrRequestScreen.d3().I2("SHARE_QR_ID");
                break;
        }
        return Unit.f186387a;
    }
}
