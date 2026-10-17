package yca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixTransferInputKeyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PixTransferInputKeyScreen pixTransferInputKeyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixTransferInputKeyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous cpfOrBrazilianLocalPhoneAmbiguous;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f53228a;
        boolean zF = Intrinsics.f(str, "CPF_TYPE_ID");
        PixTransferInputKeyScreen pixTransferInputKeyScreen = this.v;
        if (zF) {
            t tVar = (t) pixTransferInputKeyScreen.R2();
            PixIdentifiedType pixIdentifiedType = ((h) ((j2) tVar.u.f22677a).getValue()).f312581a.f312586b;
            cpfOrBrazilianLocalPhoneAmbiguous = pixIdentifiedType instanceof PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous ? (PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) pixIdentifiedType : null;
            if (cpfOrBrazilianLocalPhoneAmbiguous != null) {
                tVar.I2(new PixIdentifiedType.Valid.Cpf(cpfOrBrazilianLocalPhoneAmbiguous.f50351b));
            }
        } else if (Intrinsics.f(str, "PHONE_TYPE_ID")) {
            t tVar2 = (t) pixTransferInputKeyScreen.R2();
            PixIdentifiedType pixIdentifiedType2 = ((h) ((j2) tVar2.u.f22677a).getValue()).f312581a.f312586b;
            cpfOrBrazilianLocalPhoneAmbiguous = pixIdentifiedType2 instanceof PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous ? (PixIdentifiedType.CpfOrBrazilianLocalPhoneAmbiguous) pixIdentifiedType2 : null;
            if (cpfOrBrazilianLocalPhoneAmbiguous != null) {
                tVar2.I2(new PixIdentifiedType.Valid.Phone(cpfOrBrazilianLocalPhoneAmbiguous.f50350a, false));
            }
        }
        return Unit.f186387a;
    }
}
