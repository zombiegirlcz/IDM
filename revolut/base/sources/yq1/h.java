package yq1;

import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreenContract$InputData;
import do3.q;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;
import op0.o3;
import te0.w;
import ufm.n;
import yhm.o;
import ypg.l;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f315973w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f315973w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f315973w, continuation, 0);
            case 1:
                return new h(this.f315973w, continuation, 1);
            default:
                return new h(this.f315973w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    i iVar = this.f315973w;
                    uq1.a aVar2 = iVar.v;
                    String billId = iVar.u.f61492a.f61475b;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(billId, "billId");
                    oq1.b bVar = aVar2.f282069a;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(billId, "billId");
                    d0<qq1.a> d0VarAuthoriseBill = bVar.f227699a.authoriseBill(billId);
                    o3 o3Var = new o3(22, new o0(19));
                    d0VarAuthoriseBill.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarAuthoriseBill, o3Var, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    n nVarI0 = w.i0(iVar2);
                    this.v = 1;
                    obj2 = nim.a.b(nVarI0, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                String str = (String) obj2;
                Intrinsics.h(str);
                return new f(str);
            case 1:
                i iVar3 = this.f315973w;
                PagoPABillConfirmationScreenContract$InputData pagoPABillConfirmationScreenContract$InputData = iVar3.u;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    d0 d0VarR = osg.b.r(iVar3.f315974w, pagoPABillConfirmationScreenContract$InputData.f61492a.f61476c.f115083b, null, null, null, 62);
                    l lVar = new l(new ypd.i(5), 7);
                    d0VarR.getClass();
                    ufm.i iVar4 = new ufm.i(d0VarR, lVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                    this.v = 1;
                    obj2 = nim.a.b(iVar4, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return (d) obj2;
                    }
                    o.b(obj2);
                }
                long j2 = ((dj0.d) obj2).f115082a;
                dj0.d dVar = pagoPABillConfirmationScreenContract$InputData.f61492a.f61476c;
                if (j2 < dVar.f115082a) {
                    return new e(dVar);
                }
                h hVar = new h(iVar3, null, 0);
                this.v = 2;
                obj2 = q.t(iVar3, hVar, this);
                if (obj2 == aVar3) {
                    return aVar3;
                }
                return (d) obj2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                i iVar5 = this.f315973w;
                if (i3 == 0) {
                    o.b(obj2);
                    h hVar2 = new h(iVar5, null, 1);
                    this.v = 1;
                    obj2 = iVar5.p2(this, hVar2);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                iVar5.v2((d) obj2);
                return Unit.f186387a;
        }
    }
}
