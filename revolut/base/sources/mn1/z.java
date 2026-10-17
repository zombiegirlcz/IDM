package mn1;

import com.revolut.feature.apm.bills.core.api.model.BillTransferScheduleData;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import java.time.format.DateTimeFormatter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f207357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BillSearchBoletoResult f207358x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, BillSearchBoletoResult billSearchBoletoResult, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f207357w = b0Var;
        this.f207358x = billSearchBoletoResult;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f207357w, this.f207358x, continuation, 0);
            case 1:
                return new z(this.f207357w, this.f207358x, continuation, 1);
            case 2:
                return new z(this.f207357w, this.f207358x, continuation, 2);
            case 3:
                return new z(this.f207357w, this.f207358x, continuation, 3);
            default:
                return new z(this.f207357w, this.f207358x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        BillSearchBoletoResult billSearchBoletoResult = this.f207358x;
        b0 b0Var = this.f207357w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mh1.d dVar = new mh1.d(b0Var, billSearchBoletoResult, (Continuation) null, 2);
                this.v = 1;
                Object objT = do3.q.t(b0Var, dVar, this);
                return objT == aVar ? aVar : objT;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z zVar = new z(b0Var, billSearchBoletoResult, continuation, 0);
                this.v = 1;
                Object objB0 = u0.b0(b0Var.X(), "SUBMIT_BUTTON_TAG", zVar, this);
                return objB0 == aVar2 ? aVar2 : objB0;
            case 2:
                cli.y yVar = b0Var.f207334w;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    wo1.b bVar = b0Var.f207329p;
                    String str = billSearchBoletoResult.o;
                    if (str == null) {
                        str = "";
                    }
                    BillTransferScheduleData billTransferScheduleData = new BillTransferScheduleData(str, billSearchBoletoResult.f61428a, billSearchBoletoResult.f61436n, billSearchBoletoResult.f61429b, oc.c.I(((h) ((j2) yVar.f22677a).getValue()).f207336b.f104285a).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), ((h) ((j2) yVar.f22677a).getValue()).d, billSearchBoletoResult.v);
                    this.v = 1;
                    rm6.c cVar = new rm6.c(((vp1.c) bVar).f291042a, billTransferScheduleData, null, 11);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, cVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                pfm.a aVarV = ue0.e.v(((yua.q) b0Var.f207330q).t(true));
                this.v = 2;
                if (nim.a.a(aVarV, this) == obj3) {
                    return obj3;
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    z zVar2 = new z(b0Var, billSearchBoletoResult, continuation, i2);
                    this.v = 1;
                    if (do3.q.t(b0Var, zVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    z zVar3 = new z(b0Var, billSearchBoletoResult, continuation, 3);
                    this.v = 1;
                    if (u0.b0(b0Var.X(), "SUBMIT_BUTTON_TAG", zVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
