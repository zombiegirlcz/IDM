package jec;

import jec.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u6c.k f173266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, u6c.k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
        this.f173266w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, this.f173266w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            if (k0.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        this.v.C2(new d.a(this.f173266w));
        return Unit.f186387a;
    }
}
