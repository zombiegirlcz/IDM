package fuk;

import ip0.gl;
import ip0.i3;
import ip0.t3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f138248w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138248w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f138248w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f138248w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.f138248w;
        switch (i) {
            case 0:
                v vVar = (v) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = lVar.f138249c;
                b chart = vVar.f138274a;
                Intrinsics.checkNotNullParameter(chart, "chart");
                tVar.X2(tVar.f138272p, new fs2.k(chart, 8));
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gl glVar = (gl) pair.f186385a;
                t3 t3Var = (t3) pair.f186386b;
                t tVar2 = lVar.f138249c;
                b chart2 = ((u) glVar.i).f138273a;
                i3 i3Var = t3Var.f166426a;
                Integer num = i3Var != null ? new Integer(i3Var.f164633a) : null;
                Intrinsics.checkNotNullParameter(chart2, "chart");
                tVar2.X2(tVar2.f138272p, new fpk.b(num, chart2, 10));
                break;
        }
        return Unit.f186387a;
    }
}
