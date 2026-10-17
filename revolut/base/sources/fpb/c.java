package fpb;

import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.retail.savings.impl.ui.fund_information.holdings_breakdown.HoldingsBreakdownController;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.y0;
import yhm.o;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ HoldingsBreakdownController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HoldingsBreakdownController holdingsBreakdownController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = holdingsBreakdownController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        HoldingsBreakdownController holdingsBreakdownController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                holdingsBreakdownController.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) holdingsBreakdownController.P.getValue();
                SavingsDocument savingsDocument = fVar.o.f83377a;
                if (savingsDocument != null) {
                    fVar.C1(new SavingsDocumentLauncherDestination(savingsDocument));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Fund information document is null");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    l.a1(fVar, fVar.X1(new y0(null, frg.a.a(), false, 5)), null, null, null, 7);
                }
                break;
        }
        return Unit.f186387a;
    }
}
