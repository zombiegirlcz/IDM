package rg4;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Flow flowE = bVar.f68232r.e(w4l.h.f294642c);
            this.u = 1;
            obj2 = yh5.b.n(flowE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return bVar.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, (xi0.b) obj2, null, null, null, 30)));
    }
}
