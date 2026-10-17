package elf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t4;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f127307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a3 f127308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f127309y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, a3 a3Var, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f127307w = eVar;
        this.f127308x = a3Var;
        this.f127309y = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f127308x, this.f127307w, this.f127309y, continuation);
            default:
                return new d(this.f127307w, this.f127308x, this.f127309y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                e eVar = this.f127307w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    a3 a3Var = this.f127308x;
                    String id10 = a3Var.f272584c;
                    if (id10 == null) {
                        throw new IllegalStateException("wallet id is null");
                    }
                    Intrinsics.checkNotNullParameter(id10, "id");
                    pfm.a aVarB = eVar.f127316n.b(a3Var.f272624y.f273143a, id10, k71.k.M0(a3Var), a3Var.f272581b, this.f127309y, !Intrinsics.f(a3Var.u, t4.f273086a), null);
                    this.v = 1;
                    if (nim.a.a(aVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return eVar.L2(((wsi.a) eVar.f127315m).a(this.f127309y));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                boolean z = this.f127309y;
                a3 a3Var2 = this.f127308x;
                e eVar2 = this.f127307w;
                d dVar = new d(a3Var2, eVar2, z, (Continuation) null);
                this.v = 1;
                Object objY2 = eVar2.Y2(this, dVar);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a3 a3Var, e eVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f127308x = a3Var;
        this.f127307w = eVar;
        this.f127309y = z;
    }
}
