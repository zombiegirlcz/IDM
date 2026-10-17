package uq5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.limitsdialog.CryptoSendLimitsDialogController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ CryptoSendLimitsDialogController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CryptoSendLimitsDialogController cryptoSendLimitsDialogController, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoSendLimitsDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) ((e) this.u.R.getValue());
        fVar.getClass();
        fVar.n2(new u83.f(fVar, null, 21), new whi.b(6));
        return Unit.f186387a;
    }
}
