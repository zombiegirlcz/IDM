package yca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixTransferInputKeyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PixTransferInputKeyScreen pixTransferInputKeyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixTransferInputKeyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PixTransferInputKeyScreen pixTransferInputKeyScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pixTransferInputKeyScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) pixTransferInputKeyScreen.R2();
                PixIdentifiedType pixIdentifiedType = ((h) ((j2) tVar.u.f22677a).getValue()).f312581a.f312586b;
                if (pixIdentifiedType instanceof PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) {
                    j60.a aVar3 = tVar.o;
                    tVar.f312594p.getClass();
                    aVar3.x(o.b((PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) pixIdentifiedType));
                } else if (pixIdentifiedType instanceof PixIdentifiedType.Valid) {
                    tVar.I2((PixIdentifiedType.Valid) pixIdentifiedType);
                } else if (pixIdentifiedType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
