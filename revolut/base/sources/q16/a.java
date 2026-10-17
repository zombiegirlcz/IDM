package q16;

import ek2.p;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import l16.e;
import vkm.q;
import vkm.v1;
import w4l.k;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function3 {
    public final /* synthetic */ String A;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f241386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f241387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k18.c f241388y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Continuation continuation, k18.c cVar, String str, k kVar) {
        super(3, continuation);
        this.f241388y = cVar;
        this.A = str;
        this.z = kVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                a aVar = new a(continuation, this.f241388y, this.A, this.z);
                aVar.f241386w = flowCollector;
                aVar.f241387x = obj3;
                return aVar.invokeSuspend(Unit.f186387a);
            default:
                a aVar2 = new a(continuation, this.f241388y, this.z, this.A);
                aVar2.f241386w = flowCollector;
                aVar2.f241387x = obj3;
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
                    FlowCollector flowCollector = this.f241386w;
                    xi0.b fiatCurrency = (xi0.b) this.f241387x;
                    f16.b bVar = (f16.b) this.f241388y.f180140b;
                    Intrinsics.h(fiatCurrency);
                    e eVar = (e) bVar;
                    eVar.getClass();
                    String accountId = this.A;
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
                    k loadingStrategy = this.z;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = eVar.e.b(new l16.c(accountId, fiatCurrency), loadingStrategy);
                    this.f241386w = null;
                    this.f241387x = null;
                    this.v = 1;
                    if (q.u(flowCollector, dVarB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f241386w;
                    xi0.b fiatCurrency2 = (xi0.b) this.f241387x;
                    k18.c cVar = this.f241388y;
                    f16.b bVar2 = (f16.b) cVar.f180140b;
                    Intrinsics.h(fiatCurrency2);
                    e eVar2 = (e) bVar2;
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(fiatCurrency2, "fiatCurrency");
                    k loadingStrategy2 = this.z;
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    v1 v1Var = new v1(new a9j.o((Object) nim.a.v(eVar2.f.b(fiatCurrency2, loadingStrategy2), new p(this.A, 2)), (Object) fiatCurrency2, (Object) cVar, true, (Continuation) null, 3));
                    this.f241386w = null;
                    this.f241387x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, v1Var, this) == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Continuation continuation, k18.c cVar, k kVar, String str) {
        super(3, continuation);
        this.f241388y = cVar;
        this.z = kVar;
        this.A = str;
    }
}
