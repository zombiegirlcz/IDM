package gq4;

import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ CreditCardModelAction.Contextual u;
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CreditCardModelAction.Contextual contextual, r rVar, Continuation continuation) {
        super(2, continuation);
        this.u = contextual;
        this.v = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVarH;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        tl4.b bVar = this.u.f68847a;
        int i = m.f145556a[bVar.ordinal()];
        r rVar = this.v;
        if (i == 1) {
            rVar.n2(new o(rVar, null, 1), new whi.b(6));
        } else if (i == 2) {
            h hVar = (h) ((i) ((j2) rVar.f145563t.f22677a).getValue()).f145552c.getContent();
            if (hVar != null && (dVarH = pyd.c.H(z92.f.j(hVar.f145548a), hVar.f145549b)) != null) {
                rVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVarH.a(), null, pte.a.NESTED_TOP_UP, 22)));
            }
        } else if (i != 3) {
            IllegalStateException illegalStateException = new IllegalStateException("Unsupported ContextualValue: " + bVar);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            rVar.I2();
        }
        return Unit.f186387a;
    }
}
