package y7d;

import b6i.d0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AskAiScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AskAiScreen askAiScreen, Continuation continuation) {
        super(2, continuation);
        this.v = askAiScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarT2 = this.v.T2();
        Intrinsics.h(model);
        x xVar = (x) nVarT2;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        xVar.x2(new xf0.h(str, 25));
        xVar.B = true;
        if (xVar.u.a() == k7d.a.AiV3) {
            xVar.f311498t.Q();
        }
        a2 a2Var = xVar.z;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        xVar.z = null;
        long j2 = xVar.A + 1;
        xVar.A = j2;
        xVar.x2(new nxc.a(j2, 24));
        xVar.l2(new d0(xVar, str, continuation, 12), new yi5.b(26));
        return Unit.f186387a;
    }
}
