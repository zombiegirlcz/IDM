package a5i;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransactionPriceDescriptionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TransactionPriceDescriptionScreen transactionPriceDescriptionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transactionPriceDescriptionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVar = (o) this.v.V.getValue();
        Object obj3 = model.o;
        p pVar = (p) oVar;
        pVar.getClass();
        if (obj3 instanceof l) {
            l lVar = (l) obj3;
            pVar.C2(new i(lVar.f1424a, lVar.f1425b));
        } else if (obj3 instanceof m) {
            m mVar = (m) obj3;
            pVar.C2(new j(mVar.f1426a, mVar.f1427b));
        } else {
            hx7.e.h(new IllegalArgumentException(a0.d.m(obj3, "Unknown parcel ")));
        }
        return Unit.f186387a;
    }
}
