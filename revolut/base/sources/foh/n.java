package foh;

import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreen;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TopMoversScreen f136972w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(TopMoversScreen topMoversScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136972w = topMoversScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f136972w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(this.f136972w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((w0h.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep selectFilter;
        int i = this.u;
        TopMoversScreen topMoversScreen = this.f136972w;
        switch (i) {
            case 0:
                q filter = (q) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.collection.top_movers.a aVar2 = (com.revolut.feature.wealth_discovery.impl.collection.top_movers.a) ((o) topMoversScreen.R.getValue());
                cli.y yVar = aVar2.f96148x;
                Intrinsics.checkNotNullParameter(filter, "filter");
                int i2 = u.f136983a[filter.ordinal()];
                if (i2 == 1) {
                    selectFilter = new TopMoversScreenContract$ModalStep.SelectFilter(((p) ((j2) yVar.f22677a).getValue()).d);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    selectFilter = new TopMoversScreenContract$ModalStep.SelectTimeSpan(((p) ((j2) yVar.f22677a).getValue()).f136975c);
                }
                oki.h.v2(aVar2.f96149y, selectFilter, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            default:
                w0h.c token = (w0h.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.collection.top_movers.a aVar4 = (com.revolut.feature.wealth_discovery.impl.collection.top_movers.a) ((o) topMoversScreen.R.getValue());
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(token, "token");
                aVar4.f96144r.getClass();
                aVar4.C1(new BridgeDestination(new FeatureCommand(ugh.a.a(token))));
                return Unit.f186387a;
        }
    }
}
