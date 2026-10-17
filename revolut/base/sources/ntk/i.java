package ntk;

import ael.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pfm.r;
import te0.w;
import v3e.t;
import vdl.y;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a f219155w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219155w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f219155w, continuation, 0);
            default:
                return new i(this.f219155w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar2 = this.f219155w;
                    mtd.e eVar = new mtd.e(aVar2, null, 17);
                    this.v = 1;
                    if (aVar2.p2(this, eVar) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a aVar4 = this.f219155w;
                    d0 d0Var = aVar4.f103835s;
                    String ref2 = aVar4.o.f219146a.f103736a;
                    d0Var.getClass();
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    y yVar = (y) d0Var.f3604a;
                    yVar.getClass();
                    Intrinsics.checkNotNullParameter(ref2, "ref");
                    pfm.a aVar5 = new pfm.a(new pfm.h(new t(yVar, ref2, 6), 2), mfm.f.f205044g, 1);
                    Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorComplete(...)");
                    r rVarG0 = w.g0(aVar5);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar3) {
                        return aVar3;
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
