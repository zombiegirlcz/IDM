package e7i;

import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyAutomationLimitScreen f123337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(MoveMoneyAutomationLimitScreen moveMoneyAutomationLimitScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f123337w = moveMoneyAutomationLimitScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f123337w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f123337w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MoveMoneyAutomationLimitScreen moveMoneyAutomationLimitScreen = this.f123337w;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = moveMoneyAutomationLimitScreen.e3();
                String text = charSequence.toString();
                q qVar = (q) nVarE3;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                qVar.H2(qVar.f123347q, new e1.b(qVar, text, 23));
                break;
            default:
                String listId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = moveMoneyAutomationLimitScreen.e3();
                Intrinsics.h(listId);
                q qVar2 = (q) nVarE32;
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "MENU_ITEM_REMOVE_LIST_ID")) {
                    qVar2.C2(k.f123341a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
