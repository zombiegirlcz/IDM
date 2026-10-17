package zba;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yui.v;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixQrRequestAddAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixQrRequestAddAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarR2 = this.v.R2();
        String descriptionString = textData.f52598b.toString();
        iVarR2.getClass();
        Intrinsics.checkNotNullParameter(descriptionString, "descriptionString");
        iVarR2.H2(iVarR2.f320863q, new v(descriptionString, 11));
        return Unit.f186387a;
    }
}
