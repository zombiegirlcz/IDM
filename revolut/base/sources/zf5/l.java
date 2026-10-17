package zf5;

import aii.q;
import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.exchange.fees.impl.ui.c f321879w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f321879w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f321879w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f321879w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((hha.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((pd5.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.crypto.exchange.fees.impl.ui.c cVar = this.f321879w;
        switch (i) {
            case 0:
                hha.d dVar = (hha.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = cVar.v;
                if (((g) ((j2) yVar.f22677a).getValue()).f.length() == 0) {
                    cVar.H2(yVar, new clk.a(dVar, 19));
                } else if (!Intrinsics.f(((g) ((j2) yVar.f22677a).getValue()).f, dVar.f152287a)) {
                    cVar.C2(q.f5292a);
                }
                break;
            default:
                pd5.d dVar2 = (pd5.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.v, new ag5.f(dVar2, 2));
                break;
        }
        return Unit.f186387a;
    }
}
