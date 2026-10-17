package qdk;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MonthlyDrawHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(MonthlyDrawHubScreen monthlyDrawHubScreen, Continuation continuation) {
        super(2, continuation);
        this.v = monthlyDrawHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.v, continuation);
        wVar.u = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((BigTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xck.i iVar;
        BigTileDelegate.Model model = (BigTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q0 q0VarE3 = this.v.d();
        Intrinsics.h(model);
        w0 w0Var = (w0) q0VarE3;
        w0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51742s;
        n0 n0Var = obj3 instanceof n0 ? (n0) obj3 : null;
        if (n0Var != null && (iVar = n0Var.f244976a) != null) {
            w0Var.C2(new d0(iVar.e));
        }
        return Unit.f186387a;
    }
}
