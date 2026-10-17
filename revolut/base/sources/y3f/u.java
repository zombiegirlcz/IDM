package y3f;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.m;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public j2 u;
    public j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f310725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j2 f310726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ v f310727y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(j2 j2Var, v vVar, Continuation continuation) {
        super(2, continuation);
        this.f310726x = j2Var;
        this.f310727y = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.f310726x, this.f310727y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j2 j2Var;
        Throwable th10;
        j2 j2Var2;
        yhm.m mVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f310725w;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                j2 j2Var3 = this.f310726x;
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    d4f.q qVar = this.f310727y.f310732h;
                    this.u = j2Var3;
                    this.v = j2Var3;
                    this.f310725w = 1;
                    if (((t3f.o) qVar).h(this) == aVar) {
                        return aVar;
                    }
                    j2Var2 = j2Var3;
                    j2Var = j2Var2;
                } catch (Throwable th11) {
                    j2Var = j2Var3;
                    th10 = th11;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    mVar = new yhm.m(yhm.o.a(th10));
                    j2Var2 = j2Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2Var2 = this.v;
                j2Var = this.u;
                try {
                    yhm.o.b(obj2);
                } catch (Throwable th12) {
                    th10 = th12;
                    m.Companion companion22 = yhm.m.INSTANCE;
                    mVar = new yhm.m(yhm.o.a(th10));
                    j2Var2 = j2Var;
                }
            }
            mVar = new yhm.m(Unit.f186387a);
            j2Var2.setValue(mVar);
            return Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
