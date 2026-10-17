package dwi;

import hwi.x0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f120470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f120471x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f120471x = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f120471x, continuation, 0);
                zVar.f120470w = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(this.f120471x, continuation, 1);
                zVar2.f120470w = obj2;
                return zVar2;
            default:
                z zVar3 = new z(this.f120471x, continuation, 2);
                zVar3.f120470w = obj2;
                return zVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        Object objA2;
        int i = this.u;
        Continuation continuation = null;
        a0 a0Var = this.f120471x;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        m.Companion companion = yhm.m.INSTANCE;
                        x0 x0Var = a0Var.f120408c;
                        this.f120470w = null;
                        this.v = 1;
                        x4l.c cVar = x0Var.d;
                        Object obj3 = Unit.f186387a;
                        Object objD = cVar.d(obj3, true, this);
                        if (objD == aVar) {
                            obj3 = objD;
                        }
                        if (obj3 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    objA = Unit.f186387a;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                return new yhm.m(objA);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                try {
                    if (i5 == 0) {
                        yhm.o.b(obj2);
                        m.Companion companion4 = yhm.m.INSTANCE;
                        hwi.c cVar2 = a0Var.f120407b;
                        this.f120470w = null;
                        this.v = 1;
                        x4l.c cVar3 = cVar2.d;
                        Object obj4 = Unit.f186387a;
                        Object objD2 = cVar3.d(obj4, true, this);
                        if (objD2 == aVar2) {
                            obj4 = objD2;
                        }
                        if (obj4 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    objA2 = Unit.f186387a;
                    m.Companion companion5 = yhm.m.INSTANCE;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th11) {
                    m.Companion companion6 = yhm.m.INSTANCE;
                    objA2 = yhm.o.a(th11);
                }
                return new yhm.m(objA2);
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.f120470w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                skm.g0[] g0VarArr = {skm.e0.g(coroutineScope, null, null, new z(a0Var, continuation, 0), 3), skm.e0.g(coroutineScope, null, null, new z(a0Var, continuation, i2), 3)};
                this.f120470w = null;
                this.v = 1;
                Object objI = skm.e0.i(g0VarArr, this);
                return objI == aVar3 ? aVar3 : objI;
        }
    }
}
