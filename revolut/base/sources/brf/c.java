package brf;

import bq5.o0;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.transfer.core.impl.ui.troubleshooter.TransferTroubleshooterScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ TransferTroubleshooterScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TransferTroubleshooterScreen transferTroubleshooterScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transferTroubleshooterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.u.Z.getValue();
        fVar.x2(new o0(24));
        fVar.y2();
        return Unit.f186387a;
    }
}
