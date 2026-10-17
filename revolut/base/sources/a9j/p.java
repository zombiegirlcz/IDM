package a9j;

import aw0.r0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.lc;
import mx0.mc;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f2703w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2703w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f2703w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f2703w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            default:
                p pVar3 = new p(this.f2703w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((mc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((qta.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f2703w;
        switch (i) {
            case 0:
                mc mcVar = (mc) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = ((lc) mcVar).f209806a;
                if (str.equals("CHART_TAB_ACTION_TYPE_SWITCH_ID")) {
                    ((g) uVar.f2711n).e();
                } else if (str.equals("CHART_TAB_ACTION_ADVANCED_CHART_ID")) {
                    uVar.f2714r.c3(uVar.f2709l.f99962a);
                }
                break;
            case 1:
                qta.f duration = (qta.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar = (g) uVar.f2711n;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(duration, "duration");
                a8j.a aVar3 = gVar.f2680g;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(duration, "duration");
                j2 j2Var = aVar3.f2266b;
                od0.i.Companion.getClass();
                j2Var.g(null, od0.h.a(duration));
                break;
            default:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVar5 = uVar.f2711n;
                r0 r0Var = (r0) iVar.f224257a;
                j2 j2Var2 = ((g) aVar5).f2680g.f2267c;
                od0.i.Companion.getClass();
                j2Var2.g(null, od0.h.a(r0Var));
                break;
        }
        return Unit.f186387a;
    }
}
