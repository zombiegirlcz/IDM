package kkk;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import ka2.b0;
import kjk.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f185119w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, t tVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f185119w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(0, this.f185119w, continuation);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(1, this.f185119w, continuation);
                rVar2.v = obj2;
                return rVar2;
            default:
                r rVar3 = new r(2, this.f185119w, continuation);
                rVar3.v = obj2;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String planId;
        String str;
        int i = this.u;
        t tVar = this.f185119w;
        switch (i) {
            case 0:
                lha.j jVar = (lha.j) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lha.g gVar = jVar.f195214a;
                lha.f fVar = gVar.d;
                boolean z = gVar.f195207h;
                if (z) {
                    planId = gVar.f195205c;
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    planId = fVar != null ? fVar.f195202a : null;
                    if (planId == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (z) {
                    str = gVar.f195204b;
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str2 = fVar != null ? fVar.f195202a : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    str = str2;
                }
                wik.n nVar = (wik.n) tVar.f185123p;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(planId, "planId");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                f0 f0Var = (f0) nVar.f297927c;
                f0Var.getClass();
                Intrinsics.checkNotNullParameter(planId, "planId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(u0.i(nim.a.y(f0Var.f184442p.b(planId, loadingStrategy), new kjk.x(29)), rd0.e.b(tVar.o.r(str)), rd0.e.b(yoj.b.s(si7.a.d(tVar.f185127t, planId), InsuranceDocumentsAvailability.Unavailable.f74931a))), new ke7.v(jVar, 17));
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.H2(tVar.f185128w, new b0(data, 15));
                return Unit.f186387a;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tVar.H2(tVar.f185128w, new b0(data2, 16));
                return Unit.f186387a;
        }
    }
}
