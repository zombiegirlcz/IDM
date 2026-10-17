package b4c;

import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.feature.revolut_shop.ui.screen.dashboard.IppShopDashboardScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IppShopDashboardScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IppShopDashboardScreen ippShopDashboardScreen, Continuation continuation) {
        super(2, continuation);
        this.v = ippShopDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ProgressStepVerticalV2Delegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProgressStepVerticalV2Delegate.Model model = (ProgressStepVerticalV2Delegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        String listId = model.f53008a;
        Object obj3 = model.f53016n;
        u uVar = (u) nVarE3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        uVar.f12283r.Z2(obj3, listId);
        return Unit.f186387a;
    }
}
