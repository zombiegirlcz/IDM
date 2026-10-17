package su4;

import a41.j1;
import dp4.q0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.a4;
import om4.z3;
import skm.e0;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a f265664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f265665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f265666y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar, String str, h hVar, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f265664w = aVar;
        this.f265665x = str;
        this.f265666y = hVar;
        this.z = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f265664w, this.f265665x, this.f265666y, this.z, continuation, 0);
            default:
                return new t(this.f265664w, this.f265665x, this.f265666y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        xm4.c cVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar2 = this.f265664w;
                z3 z3Var = aVar2.f69618p;
                String str = aVar2.o.f69614a;
                h hVar = this.f265666y;
                dj0.d dVar = hVar.f265641a;
                xm4.a aVar3 = hVar.f265648m;
                if (aVar3 == null || aVar3.f307072a.f115082a == 0) {
                    cVar = null;
                } else {
                    long j2 = 0;
                    List list = hVar.f265647l;
                    xm4.f fVar = hVar.f265642b;
                    if (fVar != null) {
                        j2 = fVar.f307085a;
                    }
                    cVar = new xm4.c(aVar3, list, j2, fVar != null ? fVar.f307087c : null);
                }
                this.v = 1;
                q0 q0Var = ((a4) z3Var).f226518b;
                q0Var.getClass();
                j1 j1Var = new j1(q0Var, this.z, str, this.f265665x, dVar, cVar, (Continuation) null, 3);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, j1Var, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar5 = this.f265664w;
                t tVar = new t(aVar5, this.f265665x, this.f265666y, this.z, null, 0);
                this.v = 1;
                Object objB0 = u0.b0(aVar5.X(), "credit_card_repay_loading_tag", tVar, this);
                return objB0 == aVar4 ? aVar4 : objB0;
        }
    }
}
