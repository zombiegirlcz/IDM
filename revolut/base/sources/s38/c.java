package s38;

import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f259450w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259450w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f259450w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f259450w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h hVar = this.f259450w;
        switch (i) {
            case 0:
                um0 um0Var = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(um0Var.f166695a, "deactivate_pocket_options") || Intrinsics.f(um0Var.f166695a, "hide_pocket_options")) {
                    j60.a.v(hVar.f259457n, true, null, 2);
                    Object obj3 = um0Var.d;
                    io3.d dVar = obj3 instanceof io3.d ? (io3.d) obj3 : null;
                    if (dVar != null) {
                        hVar.T2(new b(dVar, hVar, null), new yi5.b(27));
                    }
                }
                break;
            default:
                um0 um0Var2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String str = um0Var2.f166695a;
                if (Intrinsics.f(str, "deactivate_pocket_options") || Intrinsics.f(str, "hide_pocket_options")) {
                    j60.a.v(hVar.f259457n, true, null, 2);
                }
                break;
        }
        return Unit.f186387a;
    }
}
