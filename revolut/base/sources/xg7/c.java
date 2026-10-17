package xg7;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.incentive_reward.impl.ui.lottery.enrollment.screen.LotteryEnrollmentController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LotteryEnrollmentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LotteryEnrollmentController lotteryEnrollmentController, Continuation continuation) {
        super(2, continuation);
        this.v = lotteryEnrollmentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        PromptMarketingContentDelegate.Model model = (PromptMarketingContentDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.O.getValue();
        Object obj3 = model.f53090n;
        i iVar = (i) eVar;
        iVar.getClass();
        if (Intrinsics.f(obj3, "LOTTERY_ENROLLMENT_ACTION_RELOAD_CONTENT")) {
            iVar.f305621r.a();
        } else if (Intrinsics.f(obj3, "LOTTERY_ENROLLMENT_ACTION_UPDATE_ENROLLMENT_STATE")) {
            iVar.I2();
        } else {
            hx7.e.n(new IllegalArgumentException(a0.d.m(obj3, "Unknown parcel ")));
        }
        return Unit.f186387a;
    }
}
