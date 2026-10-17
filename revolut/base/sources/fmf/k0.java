package fmf;

import ip0.gn;
import ip0.gu;
import ip0.pb0;
import ip0.s7;
import ip0.v4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f136399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(n0 n0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136399w = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k0 k0Var = new k0(this.f136399w, continuation, 0);
                k0Var.v = obj2;
                return k0Var;
            case 1:
                k0 k0Var2 = new k0(this.f136399w, continuation, 1);
                k0Var2.v = obj2;
                return k0Var2;
            default:
                k0 k0Var3 = new k0(this.f136399w, continuation, 2);
                k0Var3.v = obj2;
                return k0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((k0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n0 n0Var = this.f136399w;
        switch (i) {
            case 0:
                cmf.g gVar = (cmf.g) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.u, new fjd.w(gVar, 12));
                break;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.u, new do2.o(list, 26));
                break;
            default:
                List items = (List) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n0Var.H2(n0Var.u, new do2.o(items, 28));
                dmf.d dVar = n0Var.f136402q;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                if (dVar.f116130t) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : items) {
                        koi.j jVar = (koi.j) obj3;
                        if (!(jVar instanceof pb0) && !(jVar instanceof s7) && !(jVar instanceof gu) && !(jVar instanceof v4) && !(jVar instanceof gn)) {
                            arrayList.add(obj3);
                        }
                    }
                    int size = arrayList.size();
                    if (size != dVar.f116129s) {
                        dVar.f116129s = size;
                        dVar.Z2();
                    }
                    dVar.f116128r = size < items.size();
                }
                break;
        }
        return Unit.f186387a;
    }
}
