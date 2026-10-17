package mic;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PerkDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PerkDetailsScreen perkDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = perkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f53623w;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.rewards.api.model.TrackableUserPerkData");
        cgc.p pVar = (cgc.p) obj3;
        PerkDetailsScreen perkDetailsScreen = this.v;
        PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = perkDetailsScreen.L;
        String perkId = perkDetailsFlowContract$InputData.f ? pVar.f23924a : pVar.f23925b;
        x xVarD3 = perkDetailsScreen.R2();
        boolean z = perkDetailsFlowContract$InputData.f;
        g0 g0Var = (g0) xVarD3;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(perkId, "perkId");
        g0Var.C2(new q(perkId, z));
        return Unit.f186387a;
    }
}
