package vg7;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share.LotteryShareController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LotteryShareController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LotteryShareController lotteryShareController, Continuation continuation) {
        super(2, continuation);
        this.v = lotteryShareController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ActionsView.Item button = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        LotteryShareController lotteryShareController = this.v;
        e eVar = (e) lotteryShareController.O.getValue();
        Intrinsics.h(button);
        a imageFactory = new a(lotteryShareController, 3);
        i iVar = (i) eVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(imageFactory, "imageFactory");
        Object obj3 = button.f58324n;
        if (obj3 instanceof kad.a) {
            iVar.l2(new h(iVar, obj3, imageFactory, null), new yi5.b(26));
        } else {
            hx7.e.n(new IllegalArgumentException(a0.d.m(obj3, "Unknown ")));
        }
        return Unit.f186387a;
    }
}
