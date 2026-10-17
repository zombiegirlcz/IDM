package cy5;

import aw0.q0;
import bke.t;
import cul.n0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f110054w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f110054w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f110054w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f110054w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f110054w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            case 3:
                h hVar4 = new h(this.f110054w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
            default:
                h hVar5 = new h(this.f110054w, continuation, 4);
                hVar5.v = obj2;
                return hVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((h) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.f110054w;
        switch (i) {
            case 0:
                q0 q0Var = (q0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f110059t, new g(q0Var, 0));
                break;
            case 1:
                ky5.a aVar2 = (ky5.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f110059t, new n0(aVar2, 21));
                break;
            case 2:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f110059t, new t(list, 17));
                break;
            case 3:
                List list2 = (List) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f110059t, new t(list2, 18));
                break;
            default:
                List list3 = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f110059t, new t(list3, 19));
                break;
        }
        return Unit.f186387a;
    }
}
