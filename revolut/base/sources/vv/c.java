package vv;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProducerScope;
import okl.l1;
import pqg.b0;
import qu4.s;
import s56.d0;
import vdl.c1;
import vkm.q;
import vkm.q0;
import vkm.t0;
import vkm.t1;
import vq5.w;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f292424w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f292424w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f292424w, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f186409a = g.f292430a;
            d dVar = this.f292424w;
            t1 t1VarA = dVar.f292426b.a();
            Continuation continuation = null;
            vrl.d action = new vrl.d(producerScope, ref$BooleanRef, continuation, 5);
            Intrinsics.checkNotNullParameter(t1VarA, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            q.G(new q0(new l1(new q0(new t0(t1VarA, 2), new s(action, continuation, 3), 1), 4), new d0(16, ref$ObjectRef, this.f292424w, producerScope, ref$BooleanRef, (Continuation) null), 1), producerScope);
            q.G(new q0(dVar.f292425a.f(), new b0(producerScope, null, 1), 1), producerScope);
            q.G(new q0(q.Q(dVar.f, new c1(continuation, dVar, 23)), new w(ref$ObjectRef, producerScope, continuation, 9), 1), producerScope);
            androidx.core.view.b bVar = new androidx.core.view.b(ref$ObjectRef, 2, producerScope, dVar);
            dVar.f292427c.getLifecycle().addObserver(bVar);
            vqd.b bVar2 = new vqd.b(dVar, bVar, 13);
            this.v = null;
            this.u = 1;
            if (com.bumptech.glide.d.d(producerScope, bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
