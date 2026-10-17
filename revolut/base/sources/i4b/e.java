package i4b;

import aw0.n6;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CfdOrderReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CfdOrderReviewScreen cfdOrderReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cfdOrderReviewScreen;
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
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        MarginQuote marginQuoteA;
        int i = this.u;
        CfdOrderReviewScreen cfdOrderReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((g0) ((q) cfdOrderReviewScreen.f82275h0.getValue())).u2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0 g0Var = (g0) ((q) cfdOrderReviewScreen.f82275h0.getValue());
                a2 a2Var = g0Var.E;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                m mVar = (m) ((n) g0Var.t2()).f158357a.getContent();
                if (mVar != null && (marginQuoteA = mVar.a()) != null) {
                    g0Var.n2(new i44.a(g0Var, marginQuoteA, null, 2), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
