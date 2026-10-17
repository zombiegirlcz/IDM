package yw9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f317370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f317371x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(w wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317371x = wVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f317371x, continuation, 0);
                pVar.f317370w = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f317371x, continuation, 1);
                pVar2.f317370w = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = (String) this.f317370w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.f317370w = str;
                    this.v = 1;
                    if (k0.b(500L, this) != aVar) {
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.f317370w = null;
                this.v = 2;
                Object objI2 = w.I2(this.f317371x, str, this);
                if (objI2 != aVar) {
                    return objI2;
                }
                return aVar;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.f317370w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                w wVar = this.f317371x;
                u uVar = new u(wVar, coroutineScope, null, 1);
                this.f317370w = null;
                this.v = 1;
                Object objT = do3.q.t(wVar, uVar, this);
                return objT == aVar2 ? aVar2 : objT;
        }
    }
}
