package g26;

import gim.i;
import i26.f;
import i26.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.d;
import vkm.q;
import vkm.v1;
import w4l.k;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function3 {
    public final /* synthetic */ k A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f139908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f139909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f139910y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Continuation continuation, b bVar, String str, k kVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f139910y = bVar;
        this.z = str;
        this.A = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a aVar = new a(continuation, this.f139910y, this.z, this.A, 0);
                aVar.f139908w = flowCollector;
                aVar.f139909x = obj3;
                return aVar.invokeSuspend(Unit.f186387a);
            default:
                a aVar2 = new a(continuation, this.f139910y, this.z, this.A, 1);
                aVar2.f139908w = flowCollector;
                aVar2.f139909x = obj3;
                return aVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f139908w;
                    xi0.b bVar = (xi0.b) this.f139909x;
                    d dVarA = this.f139910y.f139911a.a(this.z, bVar.f306286a, this.A);
                    this.f139908w = null;
                    this.f139909x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f139908w;
                    xi0.b bVar2 = (xi0.b) this.f139909x;
                    i26.k kVar = this.f139910y.f139911a;
                    String fiatCurrency = bVar2.f306286a;
                    kVar.getClass();
                    String assetId = this.z;
                    Intrinsics.checkNotNullParameter(assetId, "assetId");
                    Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
                    k loadingStrategy = this.A;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    v1 v1VarR = q.R(qe0.o.a(kVar.f, new f(assetId, fiatCurrency), 3L, loadingStrategy, false, j.f, 8), new hr4.b(3, 1, null));
                    this.f139908w = null;
                    this.f139909x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, v1VarR, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
