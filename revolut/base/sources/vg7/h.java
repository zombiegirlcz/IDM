package vg7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import uv1.c0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f288790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f288791x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Object obj2, a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f288790w = obj2;
        this.f288791x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f288790w, this.f288791x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        i iVar = this.v;
        c0 c0Var = new c0(iVar, this.f288790w, this.f288791x, (Continuation) null, 4);
        this.u = 1;
        Object objP2 = iVar.p2(this, c0Var);
        return objP2 == aVar ? aVar : objP2;
    }
}
