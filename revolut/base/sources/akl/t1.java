package akl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import skm.h2;

/* JADX INFO: loaded from: classes12.dex */
public final class t1 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ a61.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f6096w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(a61.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f6096w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t1(this.v, this.f6096w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t1) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        b.Companion companion = kotlin.time.b.INSTANCE;
        long jG = kotlin.time.c.g(10, pkm.e.SECONDS);
        s1 s1Var = new s1(this.v, this.f6096w, (Continuation) null, 0);
        this.u = 1;
        Object objC = h2.c(jG, s1Var, this);
        return objC == aVar ? aVar : objC;
    }
}
