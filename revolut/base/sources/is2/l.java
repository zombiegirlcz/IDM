package is2;

import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b f168090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a3 f168091x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar, a3 a3Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f168090w = bVar;
        this.f168091x = a3Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f168090w, this.f168091x, continuation, 0);
            default:
                return new l(this.f168090w, this.f168091x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar = this.f168090w;
                    j60.a.v(bVar.f64271t, false, null, 3);
                    pfm.t tVarM = bVar.f64268q.a(this.f168091x.f272581b).m(new ir9.a(new k(bVar, 1), 12));
                    Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
                    this.v = 1;
                    if (nim.a.a(tVarM, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar2 = this.f168090w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    vr2.d dVar = bVar2.f64272w;
                    this.v = 1;
                    obj2 = dVar.a(this.f168091x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ParcelableDestination parcelableDestination = (ParcelableDestination) obj2;
                if (parcelableDestination == null) {
                    return Unit.f186387a;
                }
                bVar2.C1(u0.c(new KompotOverlayFeatureConfig(parcelableDestination, yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
                return Unit.f186387a;
        }
    }
}
