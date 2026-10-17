package m84;

import akl.s1;
import c84.t;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.a f203427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ oc4.f f203428x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.a aVar, oc4.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f203427w = aVar;
        this.f203428x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f203427w, this.f203428x, continuation, 0);
            default:
                return new f(this.f203427w, this.f203428x, continuation, 1);
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
        oc4.f fVar = this.f203428x;
        com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.a aVar = this.f203427w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    d dVar = aVar.f67403q;
                    String str = ((oc4.e) fVar).f224095a;
                    this.v = 1;
                    b34.b bVar = dVar.f203423a;
                    String str2 = dVar.f203424b.f67400a.f66892b;
                    bVar.getClass();
                    s1 s1Var = new s1(str, bVar, str2, (Continuation) null);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, s1Var, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(aVar, (it3.d) obj2, this, 2) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    f fVar2 = new f(aVar, fVar, continuation, 0);
                    this.v = 1;
                    if (aVar.p2(this, fVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
