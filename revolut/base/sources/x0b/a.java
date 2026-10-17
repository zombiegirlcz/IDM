package x0b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s01.m;
import s01.n;
import s01.p;
import s01.q;
import s01.r;
import s01.s;
import s01.t;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f301539w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f301539w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f301539w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f301539w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b bVar = this.f301539w;
        switch (i) {
            case 0:
                g0b.d dVar = bVar.e;
                t tVar = (t) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (tVar instanceof s01.k) {
                    dVar.b3(((s01.k) tVar).f258796a);
                } else if (tVar instanceof m) {
                    dVar.e3(((m) tVar).f258799a);
                } else if (tVar instanceof s01.l) {
                    s01.l lVar = (s01.l) tVar;
                    dVar.d3(lVar.f258797a, lVar.f258798b);
                } else if (tVar instanceof n) {
                    dVar.f3();
                } else if (tVar instanceof s01.o) {
                    s01.o oVar = (s01.o) tVar;
                    dVar.h3(oVar.f258801a, oVar.f258802b);
                } else if (tVar instanceof p) {
                    p pVar = (p) tVar;
                    dVar.i3(pVar.f258803a, pVar.f258804b);
                } else if (tVar instanceof q) {
                    dVar.j3(((q) tVar).f258805a);
                } else if (tVar instanceof s) {
                    dVar.l3();
                } else {
                    if (!(tVar instanceof r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.k3();
                }
                return Unit.f186387a;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g0b.d dVar2 = bVar.e;
                Intrinsics.h(str);
                dVar2.g3(str);
                return Unit.f186387a;
        }
    }
}
