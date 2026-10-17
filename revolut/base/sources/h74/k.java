package h74;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ DocumentsContentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DocumentsContentScreen documentsContentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = documentsContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.b) this.u.R2();
        bVar.H2(bVar.f67312t, new h5i.b(20));
        bVar.I2();
        return Unit.f186387a;
    }
}
