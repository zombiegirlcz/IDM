package yca;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y7k.g0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixTransferInputKeyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PixTransferInputKeyScreen pixTransferInputKeyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixTransferInputKeyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        String text = textData.f52598b.toString();
        t tVar = (t) mVarE3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        tVar.H2(tVar.u, new g0(text, tVar, 13));
        return Unit.f186387a;
    }
}
