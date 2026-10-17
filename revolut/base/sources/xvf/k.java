package xvf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.transport.impl.ui.help.contact.TransportHelpContactScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ TransportHelpContactScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TransportHelpContactScreen transportHelpContactScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transportHelpContactScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        m mVar = (m) ((h) this.u.T.getValue());
        mVar.getClass();
        mVar.H2(mVar.f309257r, new xpe.c(new Data(null, null, true, 3, null), mVar, 19));
        mVar.l2(new xb4.e(mVar, null, 13), new yi5.b(26));
        return Unit.f186387a;
    }
}
