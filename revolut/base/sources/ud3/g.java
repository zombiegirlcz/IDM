package ud3;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ YourCashbackHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(YourCashbackHomeScreen yourCashbackHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = yourCashbackHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0Var = (e0) this.u.T2();
        e0Var.f279095q.f143048a.G(Boolean.TRUE, "STORAGE_KEY_UPGRADE_CARD", wim.z.d(o0.b(Boolean.TYPE)));
        e0Var.x2(new m(2));
        return Unit.f186387a;
    }
}
