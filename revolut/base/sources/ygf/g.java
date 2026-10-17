package ygf;

import ahf.c0;
import aii.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qua.p;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public i u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f313652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f313653x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f313652w = iVar;
        this.f313653x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f313652w, this.f313653x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            i iVar2 = this.f313652w;
            c0 c0Var = iVar2.f313656q;
            p pVar = (p) this.f313653x;
            this.u = iVar2;
            this.v = 1;
            Object objA = c0Var.a(pVar, this);
            if (objA == aVar) {
                return aVar;
            }
            iVar = iVar2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = this.u;
            o.b(obj2);
        }
        return iVar.C1((u) obj2);
    }
}
