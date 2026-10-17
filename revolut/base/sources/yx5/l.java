package yx5;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m9d.w0;
import ny5.v;
import ox5.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b f317567w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317567w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f317567w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            default:
                l lVar2 = new l(this.f317567w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar = this.f317567w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new w0((Data) pair.f186385a, (Data) pair.f186386b, 29));
                break;
            default:
                v vVar = (v) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.u, new n0(vVar, 1));
                break;
        }
        return Unit.f186387a;
    }
}
