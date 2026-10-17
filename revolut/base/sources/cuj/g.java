package cuj;

import com.revolut.core.ui_kit.delegates.lh;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RewardsHubCollectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RewardsHubCollectionScreen rewardsHubCollectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rewardsHubCollectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((lh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        lh model = (lh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Intrinsics.h(model);
        y yVar = (y) oVarE3;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        h hVar = model.e;
        if (hVar != null) {
            int i = r.f109053a[hVar.f109038c.f.f110432a.ordinal()];
            if (i == 1) {
                yVar.l2(new v(yVar, hVar, null), new yi5.b(26));
            } else if (i == 2) {
                yVar.l2(new w(yVar, hVar, null), new yi5.b(26));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Unit unit = Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }
}
