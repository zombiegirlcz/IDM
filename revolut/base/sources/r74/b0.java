package r74;

import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.MediaHeaderCreditPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MediaHeaderCreditPromptScreen f251986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251986w = mediaHeaderCreditPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f251986w, continuation, 0);
                b0Var.v = obj2;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f251986w, continuation, 1);
                b0Var2.v = obj2;
                return b0Var2;
            case 2:
                b0 b0Var3 = new b0(this.f251986w, continuation, 2);
                b0Var3.v = obj2;
                return b0Var3;
            default:
                b0 b0Var4 = new b0(this.f251986w, continuation, 3);
                b0Var4.v = obj2;
                return b0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        MediaHeaderCreditPromptScreen mediaHeaderCreditPromptScreen = this.f251986w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = mediaHeaderCreditPromptScreen.e3();
                Intrinsics.h(aVar);
                ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) lVarE3).J2(aVar);
                break;
            case 1:
                ht3.a action = (ht3.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) mediaHeaderCreditPromptScreen.e3();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                bVar.C2(new k(ht3.d.ITEM_BUTTON, action));
                break;
            case 2:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = mediaHeaderCreditPromptScreen.e3();
                Intrinsics.h(aVar4);
                ((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) lVarE32).J2(aVar4);
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE33 = mediaHeaderCreditPromptScreen.e3();
                Intrinsics.h(clickData);
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) lVarE33;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                bVar2.n2(new s(bVar2, clickData, null, 0), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
