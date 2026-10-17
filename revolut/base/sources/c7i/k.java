package c7i;

import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$Clickable;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyAutomationScreen f22011w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(MoveMoneyAutomationScreen moveMoneyAutomationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22011w = moveMoneyAutomationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f22011w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f22011w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((ConditionalAmountDelegate$ConditionalAmountItem$Clickable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar;
        int i = this.u;
        MoveMoneyAutomationScreen moveMoneyAutomationScreen = this.f22011w;
        switch (i) {
            case 0:
                ConditionalAmountDelegate$ConditionalAmountItem$Clickable conditionalAmountDelegate$ConditionalAmountItem$Clickable = (ConditionalAmountDelegate$ConditionalAmountItem$Clickable) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarD = moveMoneyAutomationScreen.d();
                String listId = conditionalAmountDelegate$ConditionalAmountItem$Clickable.getF52120a();
                com.revolut.feature_move_money.impl.automation.screen.c cVar = (com.revolut.feature_move_money.impl.automation.screen.c) uVarD;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                int iHashCode = listId.hashCode();
                if (iHashCode != -2016621245) {
                    if (iHashCode != 3512060) {
                        if (iHashCode == 691367961 && listId.equals("bottom_account")) {
                            cVar.J2(q.Bottom);
                        }
                    } else if (listId.equals("rule")) {
                        cli.y yVar = cVar.D;
                        int i2 = z.f22036a[((r) ((j2) yVar.f22677a).getValue()).d.ordinal()];
                        if (i2 == 1) {
                            fVar = f.Exceeds;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fVar = f.DropsBelow;
                        }
                        cVar.H2(yVar, new c69.v(fVar, 7));
                    }
                } else if (listId.equals("top_account")) {
                    cVar.J2(q.Top);
                }
                return Unit.f186387a;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarD2 = moveMoneyAutomationScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature_move_money.impl.automation.screen.c cVar2 = (com.revolut.feature_move_money.impl.automation.screen.c) uVarD2;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ((g6i.i) cVar2.B).d3(clickData);
                return Unit.f186387a;
        }
    }
}
