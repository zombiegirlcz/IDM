package daa;

import com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.PixCopyPasteCodeInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixCopyPasteCodeInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixCopyPasteCodeInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pixCopyPasteCodeInputScreen.R2().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVarE3 = pixCopyPasteCodeInputScreen.R2();
                mVarE3.getClass();
                mVarE3.n2(new cq6.k(mVarE3, null, 12), new cn7.c(1, mVarE3, m.class, "showDecodeErrorDialog", "showDecodeErrorDialog(Ljava/lang/Throwable;)Z", 0, 23));
                break;
        }
        return Unit.f186387a;
    }
}
