package xpe;

import com.revolut.feature.tax_residency.impl.v2.models.Requirements;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import vkm.q;
import xng.l;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a f307939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f307939w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f307939w, continuation, 0);
            case 1:
                return new e(this.f307939w, continuation, 1);
            default:
                return new e(this.f307939w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar = this.f307939w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                jpe.d dVar = aVar.f90302p;
                TaxResidencyFlowContext taxResidencyFlowContext = aVar.o.f90290b;
                this.v = 1;
                joe.o oVar = (joe.o) dVar.f177266a;
                oVar.getClass();
                joe.i iVar = new joe.i(oVar, taxResidencyFlowContext, null);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, iVar, this);
                return objJ == aVar2 ? aVar2 : objJ;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                int i5 = 0;
                if (i3 == 0) {
                    o.b(obj2);
                    e eVar = new e(aVar, continuation, i5);
                    this.v = 1;
                    obj2 = aVar.p2(this, eVar);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar.H2(aVar.f90306t, new l((Requirements) obj2, 10));
                oki.h.r2(aVar.u);
                com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a.M2(aVar, 0, 1);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                jpe.d dVar2 = aVar.f90302p;
                TaxResidencyFlowContext flowContext = aVar.o.f90290b;
                this.v = 1;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                joe.o oVar2 = (joe.o) dVar2.f177266a;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(flowContext, "flowContext");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                Object objX = q.x(mo3.a.g(new jij.d(oVar2.i.b(flowContext, loadingStrategy), 5), null, null, 3), this);
                return objX == aVar4 ? aVar4 : objX;
        }
    }
}
