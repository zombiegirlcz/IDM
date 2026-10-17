package t0e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.statements.impl.ui.tax_filing.TaxFilingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sqd.h0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ TaxFilingScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TaxFilingScreen taxFilingScreen, Continuation continuation) {
        super(2, continuation);
        this.u = taxFilingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.d();
        lVar.H2(lVar.f267014r, new szb.g(10));
        lVar.l2(new h0(lVar, null, 9), new yi5.b(26));
        return Unit.f186387a;
    }
}
