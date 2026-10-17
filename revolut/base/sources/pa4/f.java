package pa4;

import do3.q;
import hw3.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p24.p;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c f234337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f234337w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f234337w, continuation, 0);
            case 1:
                return new f(this.f234337w, continuation, 1);
            default:
                return new f(this.f234337w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar = this.f234337w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                k kVar = cVar.f67633s;
                String str = cVar.f67630p.f67623b.f66892b;
                this.v = 1;
                p pVar = kVar.f156078b;
                pVar.getClass();
                p24.f fVar = new p24.f(pVar, str, continuation, i2);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, fVar, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                k kVar2 = cVar.f67633s;
                String str2 = cVar.f67637y;
                String str3 = cVar.f67630p.f67623b.f66892b;
                this.v = 1;
                Object objA = kVar2.a(str2, str3, this);
                return objA == aVar2 ? aVar2 : objA;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                f fVar2 = new f(cVar, continuation, i2);
                this.v = 1;
                Object objT = q.t(cVar, fVar2, this);
                return objT == aVar3 ? aVar3 : objT;
        }
    }
}
