package tm8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreen;
import com.revolut.feature.junior_rewards.impl.ui.list.JuniorRewardsListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ggc.g0;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorRewardsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JuniorRewardsListScreen juniorRewardsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorRewardsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Q.getValue();
        Intrinsics.h(item);
        com.revolut.feature.junior_rewards.impl.ui.list.a aVar2 = (com.revolut.feature.junior_rewards.impl.ui.list.a) gVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = item.u;
        g0 g0Var = obj3 instanceof g0 ? (g0) obj3 : null;
        if (g0Var == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj3, "Parcel should be RewardsPreview but was "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        } else {
            oki.h.v2(aVar2.v, new JuniorRewardsListScreenContract$ModalStep.JuniorRewardDetails(aVar2.o.f77234a, g0Var.a().f143631a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
