package ud3;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ YourCashbackHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(YourCashbackHomeScreen yourCashbackHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = yourCashbackHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BannerDelegate.Model model = (BannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarT2 = this.v.T2();
        Intrinsics.h(model);
        e0 e0Var = (e0) kVarT2;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51700a, "ID_UPGRADE")) {
            e0Var.l2(new u2i.g(e0Var, null, 11), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
