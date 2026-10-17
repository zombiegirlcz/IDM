package wq1;

import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import efm.d0;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ood.o0;
import op0.o3;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f299397w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f299397w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f299397w, continuation, 0);
            default:
                return new p(this.f299397w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PagoPABill pagoPABill;
        switch (this.u) {
            case 0:
                q qVar = this.f299397w;
                uq1.a aVar = qVar.u;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    int i2 = o.f299396a[((i) qVar.t2()).f299389a.ordinal()];
                    if (i2 == 1) {
                        String noticeNumber = ((i) qVar.t2()).f299390b.f299386a;
                        String fiscalCode = ((i) qVar.t2()).f299390b.f299387b;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(noticeNumber, "noticeNumber");
                        Intrinsics.checkNotNullParameter(fiscalCode, "fiscalCode");
                        oq1.b bVar = aVar.f282069a;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(noticeNumber, "noticeNumber");
                        Intrinsics.checkNotNullParameter(fiscalCode, "fiscalCode");
                        d0<qq1.d> d0VarInitialiseBill = bVar.f227699a.initialiseBill(new qq1.c(new qq1.b(noticeNumber, fiscalCode)));
                        o3 o3Var = new o3(21, new o0(18));
                        d0VarInitialiseBill.getClass();
                        ufm.i iVar = new ufm.i(d0VarInitialiseBill, o3Var, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        ufm.n nVarI0 = w.i0(iVar);
                        this.v = 1;
                        obj2 = nim.a.b(nVarI0, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        Intrinsics.h(obj2);
                        pagoPABill = (PagoPABill) obj2;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mq1.a vehicleType = ((i) qVar.t2()).f299390b.f299388c;
                        Intrinsics.h(vehicleType);
                        String licensePlate = ((i) qVar.t2()).f299390b.d.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(licensePlate, "toUpperCase(...)");
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(vehicleType, "vehicleType");
                        Intrinsics.checkNotNullParameter(licensePlate, "licensePlate");
                        oq1.b bVar2 = aVar.f282069a;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(vehicleType, "vehicleType");
                        Intrinsics.checkNotNullParameter(licensePlate, "licensePlate");
                        d0<qq1.d> d0VarInitialiseCarTaxBill = bVar2.f227699a.initialiseCarTaxBill(new qq1.f(new qq1.e(vehicleType.name(), licensePlate)));
                        o3 o3Var2 = new o3(20, new o0(17));
                        d0VarInitialiseCarTaxBill.getClass();
                        ufm.i iVar2 = new ufm.i(d0VarInitialiseCarTaxBill, o3Var2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        ufm.n nVarI02 = w.i0(iVar2);
                        this.v = 2;
                        obj2 = nim.a.b(nVarI02, this);
                        if (obj2 == aVar2) {
                            return aVar2;
                        }
                        Intrinsics.h(obj2);
                        pagoPABill = (PagoPABill) obj2;
                    }
                } else if (i == 1) {
                    yhm.o.b(obj2);
                    Intrinsics.h(obj2);
                    pagoPABill = (PagoPABill) obj2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    Intrinsics.h(obj2);
                    pagoPABill = (PagoPABill) obj2;
                }
                qVar.v2(new k(pagoPABill));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    q qVar2 = this.f299397w;
                    p pVar = new p(qVar2, null, 0);
                    this.v = 1;
                    if (qVar2.p2(this, pVar) == aVar3) {
                        return aVar3;
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
