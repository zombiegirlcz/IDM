package ya2;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.payid.impl.screen.send.input.InputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputScreen inputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inputScreen;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((m) this.v.O.getValue()).I2(new h(textData.f52598b.toString()));
        return Unit.f186387a;
    }
}
