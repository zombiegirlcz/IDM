package xjl;

import akl.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f306578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f306579x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f306578w = rVar;
        this.f306579x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f306578w, this.f306579x, continuation, 0);
            default:
                return new p(this.f306578w, this.f306579x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        r rVar = this.f306578w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n0 n0Var = rVar.f306581a;
                    cjl.n nVar = cjl.n.QrPersonal;
                    this.v = 1;
                    p0 p0Var = p0.f264001a;
                    if (e0.J(elm.f.f127540b, new a1a.c(10, n0Var, nVar, this.f306579x, (Object) null, (Continuation) null), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    n0 n0Var2 = rVar.f306581a;
                    cjl.n nVar2 = cjl.n.QrPersonal;
                    this.v = 1;
                    p0 p0Var2 = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, new a1a.b(n0Var2, nVar2, this.f306579x, null, 27), this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
