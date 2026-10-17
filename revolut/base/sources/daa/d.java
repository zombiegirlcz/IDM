package daa;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.PixCopyPasteCodeInputScreen;
import d7a.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixCopyPasteCodeInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixCopyPasteCodeInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVarE3 = this.v.R2();
        String newInput = textData.f52598b.toString();
        mVarE3.getClass();
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        mVarE3.H2(mVarE3.f112506r, new p(newInput, 3));
        return Unit.f186387a;
    }
}
