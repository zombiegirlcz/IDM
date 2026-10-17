package vkm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 extends gim.i implements oim.n {
    public int u;
    public /* synthetic */ Throwable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ long f290002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f290003x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ gim.i f290004y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(long j2, Function2 function2, Continuation continuation) {
        super(4, continuation);
        this.f290003x = j2;
        this.f290004y = (gim.i) function2;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        long jLongValue = ((Number) obj4).longValue();
        c0 c0Var = new c0(this.f290003x, this.f290004y, (Continuation) obj5);
        c0Var.v = (Throwable) obj3;
        c0Var.f290002w = jLongValue;
        return c0Var.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Throwable th10 = this.v;
            if (this.f290002w < this.f290003x) {
                this.u = 1;
                obj2 = this.f290004y.invoke(th10, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        boolean z = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z);
    }
}
