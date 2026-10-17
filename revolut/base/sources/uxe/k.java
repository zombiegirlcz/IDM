package uxe;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.BrazilStoredMethodDetailsScreenContract$OutputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ BrazilStoredMethodDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BrazilStoredMethodDetailsScreen brazilStoredMethodDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = brazilStoredMethodDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b bVar = (com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b) this.u.R2();
        so6.a aVar2 = (so6.a) ((m) ((j2) bVar.f90817q.f22677a).getValue()).f283995a.getContent();
        if (aVar2 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Consent details content was null when Brazil stored method revoke was clicked");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            bVar.C2(new BrazilStoredMethodDetailsScreenContract$OutputData.Revoke(aVar2.f264787a, aVar2.d.f73116b));
        }
        return Unit.f186387a;
    }
}
