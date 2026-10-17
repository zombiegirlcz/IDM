package cc7;

import ip0.u80;
import ip0.y;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f22954w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f22954w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f22954w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f22954w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((u80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.f22954w;
        switch (i) {
            case 0:
                u80 u80Var = (u80) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sb7.b bVar = (sb7.b) lVar.f22957n;
                Intrinsics.h(u80Var);
                ((h) bVar).d3(u80Var);
                break;
            default:
                y clickData = (y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sb7.b bVar2 = (sb7.b) lVar.f22957n;
                Intrinsics.h(clickData);
                h hVar = (h) bVar2;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.f167226b.f58324n;
                zb7.a aVar3 = obj3 instanceof zb7.a ? (zb7.a) obj3 : null;
                if (aVar3 != null) {
                    Set setH1 = d0.h1(((d) ((od0.i) hVar.f22950m.f22964c.get()).c()).f22945b);
                    if (!setH1.remove(aVar3)) {
                        setH1.add(aVar3);
                    }
                    hVar.f3(new a83.d0(9, setH1));
                }
                break;
        }
        return Unit.f186387a;
    }
}
