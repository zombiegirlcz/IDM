package uak;

import com.revolut.data.network.models.threedstransactions.ThreeDSTransactionDto;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import efm.d0;
import gim.i;
import h0l.g;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pfm.z;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f278676w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278676w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f278676w, continuation, 0);
            case 1:
                return new c(this.f278676w, continuation, 1);
            case 2:
                return new c(this.f278676w, continuation, 2);
            default:
                return new c(this.f278676w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                tz1.b bVar = this.f278676w.f278683c;
                this.v = 1;
                Object objB = bVar.f275731a.b(ApmBizum.f61808c, this);
                return objB == aVar ? aVar : objB;
            case 1:
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
                tz1.b bVar2 = this.f278676w.f278683c;
                ApmBlik apmBlik = ApmBlik.f61809c;
                this.v = 1;
                Object objA = bVar2.a(apmBlik, this);
                return objA == aVar2 ? aVar2 : objA;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                tz1.b bVar3 = this.f278676w.f278683c;
                ApmMultibanco apmMultibanco = ApmMultibanco.f61815c;
                this.v = 1;
                Object objA2 = bVar3.a(apmMultibanco, this);
                return objA2 == aVar3 ? aVar3 : objA2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                d0<List<ThreeDSTransactionDto>> threeDSTransactions = this.f278676w.f278681a.f149584a.f110897a.getThreeDSTransactions();
                d2i.a aVar5 = new d2i.a(new d27.d0(13), 9);
                threeDSTransactions.getClass();
                ufm.i iVar = new ufm.i(threeDSTransactions, aVar5, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                ufm.i iVar2 = new ufm.i(w.i0(iVar), new g(new h5i.b(9), 19), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                Boolean bool = Boolean.FALSE;
                z zVarF = ue0.e.F(ue0.e.F(iVar2, bool), bool);
                this.v = 1;
                Object objB2 = nim.a.b(zVarF, this);
                return objB2 == aVar4 ? aVar4 : objB2;
        }
    }
}
