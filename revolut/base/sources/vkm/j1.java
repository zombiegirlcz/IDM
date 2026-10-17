package vkm;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import yhm.m;

/* JADX INFO: loaded from: classes14.dex */
public final class j1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Flow f290052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ skm.r f290053x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Flow flow, skm.r rVar, Continuation continuation) {
        super(2, continuation);
        this.f290052w = flow;
        this.f290053x = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j1 j1Var = new j1(this.f290052w, this.f290053x, continuation);
        j1Var.v = obj2;
        return j1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Ref$ObjectRef ref$ObjectRef;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        skm.r rVar = this.f290053x;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                Flow flow = this.f290052w;
                i1 i1Var = new i1(ref$ObjectRef2, coroutineScope, rVar);
                this.v = ref$ObjectRef2;
                this.u = 1;
                if (flow.collect(i1Var, this) == aVar) {
                    return aVar;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef = (Ref$ObjectRef) this.v;
                yhm.o.b(obj2);
            }
            if (ref$ObjectRef.f186409a == null) {
                m.Companion companion = yhm.m.INSTANCE;
                rVar.U(new yhm.m(yhm.o.a(new NoSuchElementException("Flow is empty"))));
            }
            return Unit.f186387a;
        } catch (Throwable th10) {
            rVar.h0(th10);
            throw th10;
        }
    }
}
