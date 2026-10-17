package au6;

import com.revolut.data.model.Data;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f9539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k1 f9540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f9541y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(k1 k1Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9540x = k1Var;
        this.f9541y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i1 i1Var = new i1(this.f9540x, this.f9541y, continuation, 0);
                i1Var.f9539w = obj2;
                return i1Var;
            default:
                i1 i1Var2 = new i1(this.f9540x, this.f9541y, continuation, 1);
                i1Var2.f9539w = obj2;
                return i1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i1) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.f9539w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    efm.d0<ResponseBody> invoiceEmailHtml = this.f9540x.f9546a.getInvoiceEmailHtml(this.f9541y);
                    a0.b bVar = new a0.b(new au0.j0(22), 18);
                    invoiceEmailHtml.getClass();
                    ufm.i iVar = new ufm.i(invoiceEmailHtml, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.n nVarI0 = te0.w.i0(iVar);
                    this.f9539w = flowCollector;
                    this.v = 1;
                    obj2 = nim.a.b(nVarI0, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Data data = new Data((String) obj2, null, false, 6, null);
                this.f9539w = null;
                this.v = 2;
                if (flowCollector.emit(data, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                FlowCollector flowCollector2 = (FlowCollector) this.f9539w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarB = this.f9540x.b(this.f9541y);
                    this.f9539w = flowCollector2;
                    this.v = 1;
                    obj2 = nim.a.b(nVarB, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Data data2 = new Data((File) obj2, null, false, 6, null);
                this.f9539w = null;
                this.v = 2;
                if (flowCollector2.emit(data2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
