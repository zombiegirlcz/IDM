package ood;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f227058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(q0 q0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f227058w = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l0 l0Var = new l0(this.f227058w, continuation, 0);
                l0Var.v = obj2;
                return l0Var;
            default:
                l0 l0Var2 = new l0(this.f227058w, continuation, 1);
                l0Var2.v = obj2;
                return l0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l0) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        amd.i iVar;
        int i = this.u;
        q0 q0Var = this.f227058w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                h0 h0Var = (h0) data.getContent();
                cli.y yVar = q0Var.C;
                a aVar2 = (a) ((j2) yVar.f22677a).getValue();
                Data data3 = new Data(h0Var != null ? h0Var.f227045a : null, data.getError(), data.getLoading());
                if (h0Var == null || (iVar = h0Var.f227046b) == null) {
                    iVar = ((a) ((j2) yVar.f22677a).getValue()).f227030c;
                }
                return a.a(aVar2, data3, data2, iVar, false, false, null, 56);
            default:
                a aVar3 = (a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q0Var.H2(q0Var.C, new ok7.c(aVar3, 16));
                return Unit.f186387a;
        }
    }
}
