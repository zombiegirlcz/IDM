package i4h;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.lc;
import mx0.mc;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f158453w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158453w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f158453w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f158453w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((mc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation;
        Object next;
        int i = this.u;
        n nVar = this.f158453w;
        switch (i) {
            case 0:
                String chartPeriodId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p0 p0Var = nVar.d;
                Intrinsics.h(chartPeriodId);
                Intrinsics.checkNotNullParameter(chartPeriodId, "chartPeriodId");
                Iterator it8 = p0Var.f158468l.f122286b.iterator();
                while (true) {
                    continuation = null;
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((eel.c) next).getId(), chartPeriodId)) {
                        }
                    } else {
                        next = null;
                    }
                }
                eel.c cVar = (eel.c) next;
                if (cVar != null) {
                    p0Var.X2(p0Var.f158478y, new p(cVar, 0));
                    p0Var.V2(new i44.a(p0Var, cVar, continuation, 4), new yi5.b(29));
                }
                break;
            default:
                p0 p0Var2 = nVar.d;
                mc mcVar = (mc) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = ((lc) mcVar).f209806a;
                if (str.equals("SWITCH_CHART_TYPE_ACTION_ID")) {
                    p0Var2.f3();
                } else if (str.equals("OPEN_ADVANCED_CHART_ACTION_ID")) {
                    p0Var2.d3();
                }
                break;
        }
        return Unit.f186387a;
    }
}
