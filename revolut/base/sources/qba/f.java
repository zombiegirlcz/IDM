package qba;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pig.y;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixQrCodeTransactionAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixQrCodeTransactionAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarE3 = this.v.R2();
        String note = textData.f52598b.toString();
        n nVar = (n) jVarE3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(note, "note");
        nVar.H2(nVar.f244170r, new y(note, 29));
        return Unit.f186387a;
    }
}
