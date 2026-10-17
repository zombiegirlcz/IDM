package ajh;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ FullScreenStateDelegate.Model u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FullScreenStateDelegate.Model model, l lVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!Intrinsics.f(this.u.f52373a, "ERROR_STATE_ID")) {
            return Unit.f186387a;
        }
        l lVar = this.v;
        return lVar.n2(new a07.d(lVar, null, 26), new whi.b(6));
    }
}
