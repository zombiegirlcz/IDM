package wv2;

import a82.s;
import com.revolut.data.model.Data;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f300278w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300278w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f300278w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f300278w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = this.f300278w;
                nVar.H2(nVar.f300285q, new wug.i(data, 9));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar2 = this.f300278w;
                nVar2.H2(nVar2.f300285q, new wug.i(data2, 10));
                if (data2.getContent() != null && !data2.getLoading()) {
                    r<Long> rVarIntervalRange = r.intervalRange(1L, 7L, 0L, 1L, TimeUnit.SECONDS);
                    Intrinsics.checkNotNullExpressionValue(rVarIntervalRange, "intervalRange(...)");
                    int i = 29;
                    yji.l.a1(nVar2, new v0b.b(new wa3.d(rd0.e.b(rVarIntervalRange), i), nVar2, i), null, new m(nVar2, null), new s(nVar2, (Continuation) null, 16), 1);
                }
                break;
        }
        return Unit.f186387a;
    }
}
