package ab4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.documents.ESignDocumentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ ESignDocumentsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ESignDocumentsScreen eSignDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = eSignDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.u.R2();
        sVarE3.H2(sVarE3.f2889r, new a9h.b(14));
        sVarE3.I2();
        return Unit.f186387a;
    }
}
