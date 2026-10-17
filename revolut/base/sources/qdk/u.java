package qdk;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ MonthlyDrawHubScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(MonthlyDrawHubScreen monthlyDrawHubScreen, Continuation continuation) {
        super(2, continuation);
        this.u = monthlyDrawHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w0 w0Var = (w0) this.u.d();
        cli.y yVar = w0Var.f244990r;
        xck.m mVar = (xck.m) ((x) ((j2) yVar.f22677a).getValue()).f244992b.getContent();
        if (mVar != null) {
            switch (t0.f244985a[mVar.e.ordinal()]) {
                case 1:
                    w0Var.C2(new j0(((x) ((j2) yVar.f22677a).getValue()).f244991a));
                    break;
                case 2:
                case 3:
                    w0Var.C2(f0.f244963a);
                    break;
                case 4:
                    w0Var.C2(h0.f244966a);
                    break;
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f186387a;
    }
}
