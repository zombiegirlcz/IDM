package nqf;

import com.revolut.feature.transfer.core.impl.ui.reason.goods.ReasonForTransferGoodsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ReasonForTransferGoodsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ReasonForTransferGoodsScreen reasonForTransferGoodsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = reasonForTransferGoodsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ReasonForTransferGoodsScreen reasonForTransferGoodsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p) reasonForTransferGoodsScreen.h3()).v2(i.f218442a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) reasonForTransferGoodsScreen.h3();
                krf.c eVar = ((h) pVar.t2()).f218439a;
                if (!(eVar instanceof krf.d)) {
                    if (!(eVar instanceof krf.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    krf.e eVar2 = (krf.e) eVar;
                    String str = ((h) pVar.t2()).f218440b;
                    wi0.b bVar = ((h) pVar.t2()).d;
                    if (bVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String str2 = bVar.f297794a;
                    wi0.b bVar2 = ((h) pVar.t2()).e;
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    mrf.a aVar3 = new mrf.a(str, str2, ((h) pVar.t2()).f218441c, bVar2.f297794a);
                    String code = eVar2.f188861a;
                    String description = eVar2.f188862b;
                    Intrinsics.checkNotNullParameter(code, "code");
                    Intrinsics.checkNotNullParameter(description, "description");
                    eVar = new krf.e(code, description, aVar3);
                }
                pVar.v2(new j(eVar));
                return Unit.f186387a;
        }
    }
}
