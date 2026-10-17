package bg9;

import com.revolut.feature.pay_bills_taxes.impl.ui.screen.PayBillsAndTaxesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PayBillsAndTaxesScreen f15147w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PayBillsAndTaxesScreen payBillsAndTaxesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f15147w = payBillsAndTaxesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f15147w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f15147w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayBillsAndTaxesScreen payBillsAndTaxesScreen = this.f15147w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE3 = payBillsAndTaxesScreen.e3();
                Intrinsics.h(clickData);
                r rVar = (r) bVarE3;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                xf9.a aVarI2 = rVar.I2();
                if (aVarI2 != null) {
                    aVarI2.h3(clickData);
                }
                break;
            default:
                String id10 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarE32 = payBillsAndTaxesScreen.e3();
                Intrinsics.h(id10);
                r rVar2 = (r) bVarE32;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                xf9.a aVarI22 = rVar2.I2();
                if (aVarI22 != null) {
                    aVarI22.d(id10);
                }
                break;
        }
        return Unit.f186387a;
    }
}
