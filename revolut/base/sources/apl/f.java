package apl;

import akb.s;
import akl.b0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rqk.k;
import rqk.m;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.revolut_id.c f8200w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.sso.impl.ui.revolut_id.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f8200w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f8200w, continuation, 0);
            case 1:
                return new f(this.f8200w, continuation, 1);
            case 2:
                return new f(this.f8200w, continuation, 2);
            default:
                return new f(this.f8200w, continuation, 3);
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
        int i2 = 2;
        Continuation continuation = null;
        com.revolut.sso.impl.ui.revolut_id.c cVar = this.f8200w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    k kVar = cVar.f106714s;
                    this.v = 1;
                    Object objC = kVar.f256589j.c(jdb.a.PERSONAL_DETAILS, this);
                    if (objC != aVar) {
                        objC = Unit.f186387a;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
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
                m mVar = cVar.f106715t;
                this.v = 1;
                Object objA = mVar.a(false, this);
                return objA == aVar2 ? aVar2 : objA;
            case 2:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    b0 b0Var = cVar.o;
                    this.v = 1;
                    b0Var.getClass();
                    s sVar = new s(b0Var, continuation, i2);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, sVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    f fVar = new f(cVar, continuation, i2);
                    this.v = 1;
                    if (cVar.p2(this, fVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
