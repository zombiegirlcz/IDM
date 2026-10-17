package cuj;

import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RewardsHubCollectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RewardsHubCollectionScreen rewardsHubCollectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rewardsHubCollectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((StreakStepVerticalDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StreakStepVerticalDelegate.Model model = (StreakStepVerticalDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Intrinsics.h(model);
        y yVar = (y) oVarE3;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53476n;
        if (obj3 instanceof h) {
            h hVar = (h) obj3;
            d0j.v vVar = hVar.f109038c;
            int i = r.f109053a[vVar.f.f110432a.ordinal()];
            if (i == 1) {
                yVar.C2(new m(hVar.f109036a, vVar.f110436a, vVar.f110437b, false));
            } else if (i == 2) {
                yVar.C2(new l(vVar.f110436a, vVar.f110437b));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                r6.b.D("Unknown action type");
            }
        }
        return Unit.f186387a;
    }
}
